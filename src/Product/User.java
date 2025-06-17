package src.Product;

public class User {
    private Long userId;
    private String userName;
    private String drivingLicense;

    public User(Long userId, String userName, String drivingLicense) {
        this.userId = userId;
        this.userName = userName;
        this.drivingLicense = drivingLicense;
    }

    public Long getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getDrivingLicense() {
        return drivingLicense;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setDrivingLicense(String drivingLicense) {
        this.drivingLicense = drivingLicense;
    }
}
