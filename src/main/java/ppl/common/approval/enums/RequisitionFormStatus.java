package ppl.common.approval.enums;

public enum RequisitionFormStatus {
    /** 审批中 */ IN_APPROVAL,
    /** 已通过 */ PASSED,
    /** 已拒绝 */ REJECTED,
    /** 已撤回 */ REVOKED,
    /** 已打回 */ RETURNED,
    /** 已失效(申请人从702离调职，应用删除，流程变更，申请有效期已过) */ INVALIDITY
}
