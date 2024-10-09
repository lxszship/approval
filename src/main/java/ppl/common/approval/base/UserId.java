package ppl.common.approval.base;

public class UserId {
    private Long userId;
    private String userVersion;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserVersion() {
        return userVersion;
    }

    public void setUserVersion(String userVersion) {
        this.userVersion = userVersion;
    }
}
