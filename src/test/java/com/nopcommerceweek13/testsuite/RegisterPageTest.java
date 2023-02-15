package com.nopcommerceweek13.testsuite;

import com.nopcommerceweek13.pages.HomePage;
import com.nopcommerceweek13.pages.RegisterPage;
import com.nopcommerceweek13.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterPageTest extends TestBase {
    HomePage homepage;
    RegisterPage registerPage;

    @BeforeMethod
    public void inIt(){
        homepage = new HomePage();
        registerPage = new RegisterPage();

    }

    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully(){
        homepage.clickOnRegisterLink();
        String actualmsg = registerPage.RegisterText();
        String expectedmsg ="Register";
        Assert.assertEquals(actualmsg,expectedmsg,"RegisterText verified");

    }
    @Test
    public void verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory(){
        homepage.clickOnRegisterLink();
        registerPage.RegisterButton();
        String actualMsg= registerPage.FirstnamerequiredError();
        String expectedMsg = "First name is required.";
        Assert.assertEquals(actualMsg,expectedMsg,"Firstname is required");

        String actualMsg1 = registerPage.LastnamerequiredError();
        String expectedMsg1 = "Last name is required.";
        Assert.assertEquals(actualMsg1,expectedMsg1,"Lastname is required");

        String actualMsg2 = registerPage.EmailadressRequired();
        String expectedMsg2 = "Email is required.";
        Assert.assertEquals(actualMsg2,expectedMsg2,"Email is required");

        String actualMsg3 = registerPage.passwordrequired();
        String expectedMsg3 = "Password is required.";
        Assert.assertEquals(actualMsg3,expectedMsg3,"Password is required");

        String actualMsg4 = registerPage.Confirmpassword();
        String expectedMsg4 ="Password is required.";
        Assert.assertEquals(actualMsg4,expectedMsg4,"Password is required.");
    }
    @Test
    public void verifyThatUserShouldCreateAccountSuccessfully(){
        homepage.clickOnRegisterLink();
        registerPage.femaleRadio();
        registerPage.Firstname("Jason");
        registerPage.Lastname("Jones");
        registerPage.DayofBirthdaydrop("15");
        registerPage.Monthofbirth("June");
        registerPage.YearofBorn("1988");
        registerPage.emailAddress("Jason12@gmail.com");
        registerPage.password("123456");
        registerPage.confirmpassword("123456");
        registerPage.RegisterButton();

        String actualMsg = registerPage.registercomplete();
        String expectedMsg = "Your registration completed";
        Assert.assertEquals(actualMsg,expectedMsg,"register complete verified");



    }



}
