package ppl.common.approval.dao.entities;

import com.fasterxml.jackson.databind.JsonNode;
import ppl.common.approval.enums.ApprovalFlowStatus;

import java.util.Date;
import java.util.Map;

public class ApprovalFlow {
    private Long id;
    private String name;
    private String action;
    private JsonNode selector;
    private ApprovalFlowStatus status;
    private Boolean shouldInvalid;
    private Date gmtCreate;
    private Date gmtModified;
    private Long createUserId;
    private Long modifyUserId;
    private Long version;
    private Long deleted;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public JsonNode getSelector() {
        return selector;
    }

    public void setSelector(JsonNode selector) {
        this.selector = selector;
    }

    public ApprovalFlowStatus getStatus() {
        return status;
    }

    public void setStatus(ApprovalFlowStatus status) {
        this.status = status;
    }

    public Boolean getShouldInvalid() {
        return shouldInvalid;
    }

    public void setShouldInvalid(Boolean shouldInvalid) {
        this.shouldInvalid = shouldInvalid;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    public Long getModifyUserId() {
        return modifyUserId;
    }

    public void setModifyUserId(Long modifyUserId) {
        this.modifyUserId = modifyUserId;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public Long getDeleted() {
        return deleted;
    }

    public void setDeleted(Long deleted) {
        this.deleted = deleted;
    }
}
