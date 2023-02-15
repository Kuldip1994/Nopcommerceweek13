package com.nopcommerceweek13.pages;


import com.nopcommerceweek13.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.nopcommerceweek13.driverfactory.ManageDriver.driver;


public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());


    public LoginPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;
   // By welcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");

    @FindBy(id = "Email")
     WebElement emailField;
    //By emailField = By.id("Email");

    @FindBy(name = "Password")
    WebElement passwordField;
    //By passwordField = By.name("Password");

    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;
   // By loginButton = By.xpath("//button[contains(text(),'Log in')]");

    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage;
    //By errorMessage = By.xpath("//div[@class='message-error validation-summary-errors']");

    public String getWelcomeText() {
        log.info("getting text from : "+welcomeText.toString());
        return getTextFromElement(welcomeText);
    }

    public void enterEmailId(String email) {
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public String getErrorMessage() {
        return getTextFromElement(errorMessage);
    }
}
