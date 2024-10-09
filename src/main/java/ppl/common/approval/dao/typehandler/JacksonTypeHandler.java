package ppl.common.approval.dao.typehandler;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JacksonTypeHandler extends BaseTypeHandler<JsonNode> {

    private static final ObjectMapper OBJECT_MAPPER;

    static {
        ObjectMapper mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        OBJECT_MAPPER = mapper;
    }

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, JsonNode parameter, JdbcType jdbcType) throws SQLException {
        try {
            ps.setString(i, OBJECT_MAPPER.writeValueAsString(parameter));
        } catch (JsonProcessingException e) {
            throw new SQLException("Json serialization error.", e);
        }
    }

    @Override
    public JsonNode getNullableResult(ResultSet rs, String columnName) throws SQLException {
        String json = rs.wasNull() ? null : rs.getString(columnName);
        return toJacksonNode(json);
    }

    @Override
    public JsonNode getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        String json = rs.wasNull() ? null : rs.getString(columnIndex);
        return toJacksonNode(json);
    }

    @Override
    public JsonNode getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        String json = cs.wasNull() ? null : cs.getString(columnIndex);
        return toJacksonNode(json);
    }

    private JsonNode toJacksonNode(String json) throws SQLException {
        if (json == null) {
            return null;
        }

        try {
            return OBJECT_MAPPER.reader().readTree(json);
        } catch (JsonProcessingException e) {
            throw new SQLException("Invalid json." ,e);
        }
    }
}
