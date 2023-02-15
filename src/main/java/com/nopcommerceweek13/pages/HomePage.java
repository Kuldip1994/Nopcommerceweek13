package com.nopcommerceweek13.pages;


import com.nopcommerceweek13.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import static com.nopcommerceweek13.driverfactory.ManageDriver.driver;


public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(linkText = "Log in")
    WebElement loginLink;
    //By loginLink = By.linkText("Log in");


    @FindBy(linkText = "Register")
    WebElement registerLink;
    // By registerLink = By.linkText("Register");

    @FindBy(linkText = "My account")
    WebElement myaccountLink;

    @FindBy(xpath = "//a[@href='/logout']")
    WebElement logoutLink;

    @FindBy(xpath = "//div[@class='header-logo']")
    WebElement Logo;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']")
    WebElement sevenmenu;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Computers ')]")
    WebElement computermenu;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Electronics ')]")
    WebElement electronicsmenu;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Apparel ')]")
    WebElement Apparelmenu;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Digital downloads ')]")
    WebElement digitaldownloadsMenu;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Books')]")
    WebElement booksmenu;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Jewelry ')]")
    WebElement jewelryMenu;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Gift Cards ')]")
    WebElement GiftcardsMenu;

    @FindBy(xpath = "//a[contains(text(),'Log in')]")
    WebElement Logintexthome;

    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logouttext;


    public void clickOnLoginLink() {
        clickOnElement(loginLink);
        log.info("clicking on login link : " + loginLink.toString());
    }

    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
        log.info("click on register link :" + registerLink.toString());
    }

    public void clickOnMyaccountLink() {
        clickOnElement(myaccountLink);
        log.info(("click on my account link" + myaccountLink.toString()));
    }

    public void logoOutLink() {
        clickOnElement(logoutLink);
        log.info("Click on logoout link" + logoutLink.toString());
    }

    public void clickOnLogo() {
        clickOnElement(Logo);
        log.info("Click on the nocommerce logo" + Logo.toString());

    }

    public void clickOnSevenmenuLink() {
        clickOnElement(sevenmenu);
        log.info("Click on any of the seven menu " + sevenmenu.toString());
    }

    public void clickOncomputer() {
        clickOnElement(computermenu);
        log.info("click on computer Tab" + computermenu.toString());
    }

    public void clickOnElectronicsmenu() {
        clickOnElement(electronicsmenu);
        log.info("Click on Electronic menu" + electronicsmenu.toString());

    }

    public void clickOnApparelmenu() {
        clickOnElement(Apparelmenu);
        log.info("Click on Apparel menu" + Apparelmenu.toString());

    }

    public void clickOndigitaldownloadsmenu() {
        clickOnElement(digitaldownloadsMenu);
        log.info("Click on Digital Download Menu" + digitaldownloadsMenu);
    }

    public void clickOnbooksMenu() {
        clickOnElement(booksmenu);
        log.info("Click on Books Menu" + booksmenu.toString());

    }

    public void clickOnjewelryMenu() {
        clickOnElement(jewelryMenu);
        log.info("Click on JewelryMenu" + jewelryMenu.toString());
    }

    public void clickOnGiftcardsMenu() {
        clickOnElement(GiftcardsMenu);
        log.info("Click on Gift Card Menu" + GiftcardsMenu.toString());
    }

    public String verifylogoutext() {
        log.info("getting text from : " + logouttext.toString());
        return getTextFromElement(logouttext);
    }

    public String verifyLoginLink() {
        log.info("getting text from "+Logintexthome.toString());
        return getTextFromElement(Logintexthome);
    }


}
