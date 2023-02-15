package com.nopcommerceweek13.testsuite;


import com.nopcommerceweek13.pages.HomePage;
import com.nopcommerceweek13.pages.LoginPage;
import com.nopcommerceweek13.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class LoginPageTest extends TestBase {

    HomePage homePage;
    LoginPage loginPage;

    @BeforeMethod
    public void inIt(){
        homePage = new HomePage();
        loginPage = new LoginPage();
    }

    @Test
    public void verifyUserShouldNavigateToLoginPage() {
        homePage.clickOnLoginLink();
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = loginPage.getWelcomeText();
        Assert.assertEquals(actualMessage, expectedMessage, "Login page not displayed");
    }

    @Test
    public void verifyErrorMessageWithInvalidCredentials() {
        homePage.clickOnLoginLink();
        loginPage.enterEmailId("John123@gmail.com");
        loginPage.enterPassword("123456");
        loginPage.clickOnLoginButton();
        String actualErrorMessage = loginPage.getErrorMessage();
        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n"
                + "No customer account found";
        Assert.assertEquals(actualErrorMessage,expectedErrorMessage, "error message with invalid credentials");
    }

    @Test
    public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials(){
        homePage.clickOnLoginLink();
        loginPage.enterEmailId("james123@gmail.com");
        loginPage.enterPassword("123456");
        loginPage.clickOnLoginButton();
        homePage.verifylogoutext();
    }
    @Test
    public void VerifyThatUserShouldLogOutSuccessFully(){
        homePage.clickOnLoginLink();
        loginPage.enterEmailId("james123@gmail.com");
        loginPage.enterPassword("123456");
        loginPage.clickOnLoginButton();
        homePage.logoOutLink();
        homePage.verifyLoginLink();

    }

}
