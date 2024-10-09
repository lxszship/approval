package ppl.common.approval.enums;

public enum RequisitionFormStatus {
    /** 审批中 */ IN_APPROVAL,
    /** 已通过 */ PASSED,
    /** 已拒绝 */ REJECTED,
    /** 已撤回 */ REVOKED,
    /** 已打回 */ RETURNED,
    /** 已失效(流程变更且流程变更后未完成的申请单应该失效) */ INVALIDITY
}
