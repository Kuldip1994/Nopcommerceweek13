package com.nopcommerceweek13.testsuite;

import com.nopcommerceweek13.pages.*;
import com.nopcommerceweek13.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import testdata.TestData;

public class ComputerPageTest extends TestBase {
    HomePage homepage;
    LoginPage loginPage;
    RegisterPage registerPage;
    DesktopsPage desktopsPage;
    ComputerPage computerPage;
    BuildYourOwnComputerPage buildYourOwnComputerPage;

    @BeforeMethod
    public void inIt() {
        homepage = new HomePage();
        loginPage = new LoginPage();
        registerPage = new RegisterPage();
        desktopsPage = new DesktopsPage();
        computerPage = new ComputerPage();
        buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    }


    @Test
    public void verifyUserShouldNavigateToComputerPageSuccessfully() {

        computerPage.clickonComputertab();
        String actualmsg = computerPage.getcomputerText();
        String expectedmsg = "Computers";
        Assert.assertEquals(actualmsg, expectedmsg, "Computer text verified");

    }

    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        computerPage.clickonComputertab();
        computerPage.clickondesktoplink();

        String actualmsg = computerPage.getdesktoptext();
        String expectedmsg = "Desktops";
        Assert.assertEquals(actualmsg, expectedmsg, "Desktops text verified");

    }

    @Test(dataProvider = "processor", dataProviderClass = TestData.class)
    public void doLogin(String processor, String ram, String hdd, String os, String software) {

        computerPage.clickonComputertab();
        computerPage.clickondesktoplink();
        buildYourOwnComputerPage.clickOnBuildyourcomputer();
        buildYourOwnComputerPage.makeyourown(processor, ram, hdd, os, software);
        buildYourOwnComputerPage.addtocartbutton();
        String actualMSG = buildYourOwnComputerPage.addedtoshoppingChart();
        String expectedMSG = "The product has been added to your shopping cart";
        Assert.assertEquals(actualMSG, expectedMSG, "Product added to your is verified");

    }
}


