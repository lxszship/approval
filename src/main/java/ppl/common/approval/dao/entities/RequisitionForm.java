package ppl.common.approval.dao.entities;

import ppl.common.approval.base.UserId;
import ppl.common.approval.enums.RequisitionFormStatus;

import java.util.Date;
import java.util.Map;

public class RequisitionForm {
    private Long id;
    private UserId userId;
    private String action;
    private Map<String, Object> attributes;
    private String description;
    private RequisitionFormStatus status;
    private Long approvalFlowId;
    private Long approvalFlowVersion;
    private Boolean shouldInvalid;
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

    public UserId getUserId() {
        return userId;
    }

    public void setUserId(UserId userId) {
        this.userId = userId;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Map<String, Object> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, Object> attributes) {
        this.attributes = attributes;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public RequisitionFormStatus getStatus() {
        return status;
    }

    public void setStatus(RequisitionFormStatus status) {
        this.status = status;
    }

    public Long getApprovalFlowId() {
        return approvalFlowId;
    }

    public void setApprovalFlowId(Long approvalFlowId) {
        this.approvalFlowId = approvalFlowId;
    }

    public Long getApprovalFlowVersion() {
        return approvalFlowVersion;
    }

    public void setApprovalFlowVersion(Long approvalFlowVersion) {
        this.approvalFlowVersion = approvalFlowVersion;
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

    public Long getDeleted() {
        return deleted;
    }

    public void setDeleted(Long deleted) {
        this.deleted = deleted;
    }
}
