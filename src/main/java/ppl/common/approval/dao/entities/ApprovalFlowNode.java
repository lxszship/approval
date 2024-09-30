package ppl.common.approval.dao.entities;

import ppl.common.approval.enums.NodeType;

import java.util.Date;
import java.util.List;

public class ApprovalFlowNode {
    private Long id;
    private Long approvalFlowId;
    private Integer number;
    private NodeType type;
    private List<Long> approvalUsers;
    private Date gmtCreate;
    private Date gmtModified;
    private Long createUserId;
    private Long modifyUserId;
    private Long deleted;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getApprovalFlowId() {
        return approvalFlowId;
    }

    public void setApprovalFlowId(Long approvalFlowId) {
        this.approvalFlowId = approvalFlowId;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public NodeType getType() {
        return type;
    }

    public void setType(NodeType type) {
        this.type = type;
    }

    public List<Long> getApprovalUsers() {
        return approvalUsers;
    }

    public void setApprovalUsers(List<Long> approvalUsers) {
        this.approvalUsers = approvalUsers;
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

    public Long getDeleted() {
        return deleted;
    }

    public void setDeleted(Long deleted) {
        this.deleted = deleted;
    }
}
