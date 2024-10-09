package ppl.common.approval.dao.entities;

import ppl.common.approval.base.UserId;
import ppl.common.approval.enums.ApprovalFormStatus;
import ppl.common.approval.enums.SignType;

import java.util.Date;

public class ApprovalForm {
    private Long id;
    private UserId userId;
    private ApprovalFormStatus status;
    private String description;
    private Integer phase;
    private SignType signType;
    private Long requisitionFormId;
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

    public ApprovalFormStatus getStatus() {
        return status;
    }

    public void setStatus(ApprovalFormStatus status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPhase() {
        return phase;
    }

    public void setPhase(Integer phase) {
        this.phase = phase;
    }

    public SignType getSignType() {
        return signType;
    }

    public void setSignType(SignType signType) {
        this.signType = signType;
    }

    public Long getRequisitionFormId() {
        return requisitionFormId;
    }

    public void setRequisitionFormId(Long requisitionFormId) {
        this.requisitionFormId = requisitionFormId;
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
