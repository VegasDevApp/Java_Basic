package stam.incupsulation;

public class User {
    private String userName;
    private String userPassword;

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    private boolean isLoggedIn = false;

    public void setUserName(String userName) {
        if (this.isLoggedIn || this.userName == null)
            this.userName = userName;
    }

    public void setUserPassword(String userPassword) {
        if (this.isLoggedIn || this.userPassword == null)
            this.userPassword = userPassword;
    }

    public boolean login(String userName, String userPassword) {
        if (this.userPassword != null
                && this.userName != null
                && this.userPassword.equals(userPassword)
                && this.userName.equals(userName)) {
            this.isLoggedIn = true;
        }
        return this.isLoggedIn;
    }

    public void logout() {
        this.isLoggedIn = false;
    }
}
