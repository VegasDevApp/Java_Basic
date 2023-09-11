package stam.incupsulation;

public class UserTest {
    public static void main(String[] args) {

        final String green = "\u001B[32m";
        final String red = "\u001B[31m";
        final String regular = "\u001B[0m";

        final String userName1 = "Vincent Vega";
        final String userPass1 = "ModestyBlaise";
        final String userName2 = "John Travolta";
        final String userPass2 = "PulpFiction";
        final String dummy = "asfasfd";

        User myUser = new User();

        myUser.login(dummy, dummy);
        if (myUser.isLoggedIn()) {
            System.out.printf("%sTest fail: User should not be logged in with user name %s and password %s%s\n\r",
                    red, dummy, dummy, regular);
        } else {
            System.out.printf("%sTest pass: User should not be logged in with user name %s and password %s%s\n\r",
                    green, dummy, dummy, regular);
        }

        myUser.setUserName(userName1);
        myUser.login(userName1, dummy);
        if (myUser.isLoggedIn()) {
            System.out.printf("%sTest fail: User should not be logged in with user name %s and password %s%s\n\r",
                    red, userName1, dummy, regular);
        } else {
            System.out.printf("%sTest pass: User should not be logged in with user name %s and password %s%s\n\r",
                    green, userName1, dummy, regular);
        }

        myUser.setUserPassword(userPass1);
        myUser.login(userName1, userPass1);
        if (myUser.isLoggedIn()) {
            System.out.printf("%sTest pass: User should be logged in with user name %s and password %s%s\n\r",
                    green, userName1, userPass1, regular);
        } else {
            System.out.printf("%sTest fail: User should be logged in with user name %s and password %s%s\n\r",
                    red, userName1, userPass1, regular);
        }

        myUser = new User();

        myUser.login(dummy, dummy);
        if (myUser.isLoggedIn()) {
            System.out.printf("%sTest fail: User should not be logged in with user name %s and password %s%s\n\r",
                    red, dummy, dummy, regular);
        } else {
            System.out.printf("%sTest pass: User should not be logged in with user name %s and password %s%s\n\r",
                    green, dummy, dummy, regular);
        }


        myUser.setUserPassword(userPass1);
        myUser.login(dummy, userPass1);
        if (myUser.isLoggedIn()) {
            System.out.printf("%sTest fail: User should not be logged in with user name %s and password %s%s\n\r",
                    red, userName1, dummy, regular);
        } else {
            System.out.printf("%sTest pass: User should not be logged in with user name %s and password %s%s\n\r",
                    green, userName1, dummy, regular);
        }

        myUser.setUserName(userName1);
        myUser.login(userName1, userPass1);
        if (myUser.isLoggedIn()) {
            System.out.printf("%sTest pass: User should be logged in with user name %s and password %s%s\n\r",
                    green, userName1, userPass1, regular);
        } else {
            System.out.printf("%sTest fail: User should be logged in with user name %s and password %s%s\n\r",
                    red, userName1, userPass1, regular);
        }

        myUser.logout();
        if (myUser.isLoggedIn()) {
            System.out.printf("%sTest fail: User should not be logged in%s\n\r", red, regular);
        } else {
            System.out.printf("%sTest pass: User should not be logged in%s\n\r", green, regular);
        }
        myUser.login(userName1, userPass1);
        myUser.setUserName(userName2);
        myUser.logout();
        myUser.login(userName2, userPass1);
        if (myUser.isLoggedIn()) {
            System.out.printf("%sTest pass: User should not be logged in with user name %s and password %s%s\n\r",
                    green, userName2, userPass1, regular);
        } else {
            System.out.printf("%sTest fail: User should not be logged in with user name %s and password %s%s\n\r",
                    red, userName2, userPass1, regular);
        }

        myUser.login(userName2, userPass1);
        myUser.setUserPassword(userPass2);
        myUser.logout();
        myUser.login(userName2, userPass2);
        if (myUser.isLoggedIn()) {
            System.out.printf("%sTest pass: User should be logged in with user name %s and password %s%s\n\r",
                    green, userName2, userPass2, regular);
        } else {
            System.out.printf("%sTest fail: User should be logged in with user name %s and password %s%s\n\r",
                    red, userName2, userPass2, regular);
        }

    }

}
