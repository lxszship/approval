package ppl.common.approval.dao.entities;

import ppl.common.approval.base.UserId;
import ppl.common.approval.enums.SignType;

import java.util.Date;
import java.util.List;

public class ApprovalFlowTemplateNode {
    private Long id;
    private Long approvalFlowTemplateId;
    private Integer phase;
    private SignType type;
    private List<UserId> approvalUsers;
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

    public Long getApprovalFlowTemplateId() {
        return approvalFlowTemplateId;
    }

    public void setApprovalFlowTemplateId(Long approvalFlowTemplateId) {
        this.approvalFlowTemplateId = approvalFlowTemplateId;
    }

    public Integer getPhase() {
        return phase;
    }

    public void setPhase(Integer phase) {
        this.phase = phase;
    }

    public SignType getType() {
        return type;
    }

    public void setType(SignType type) {
        this.type = type;
    }

    public List<UserId> getApprovalUsers() {
        return approvalUsers;
    }

    public void setApprovalUsers(List<UserId> approvalUsers) {
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
