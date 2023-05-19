package com.automation.test;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class LoginTest extends BaseTest {
    @Test
    @Category(SecurityManager.class)
    public void verifyUserCanLogin () {
        System.out.println("Verify login successful");
    }

    @Test
    public void verifyUserCannotLoginWithInvalidCredentials () {
        System.out.println("Verify login unsuccessful for invalid credentials");
    }

    @Test
    public void verifyUserCanResetPassword () {
        System.out.println("Verify user can reset password");
    }
}
