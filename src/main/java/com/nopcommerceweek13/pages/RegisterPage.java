package com.nopcommerceweek13.pages;

import com.nopcommerceweek13.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.bouncycastle.jcajce.provider.asymmetric.X509;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement registerText;

    @FindBy(xpath = "//div[@class='gender']//input[@id='gender-male']")
    WebElement maleradio;

    @FindBy(xpath = "//div[@class='gender']//input[@id='gender-female']")
    WebElement femaleradio;

    @FindBy(id = "FirstName")
    WebElement firstname;

    @FindBy(id = "LastName")
    WebElement lastname;

    @FindBy(xpath = "//div[@class='inputs date-of-birth']//select[@name='DateOfBirthDay']")
    WebElement DayofBirthday;

    @FindBy(xpath = "//div[@class='inputs date-of-birth']//select[@name='DateOfBirthMonth']")
    WebElement MonthofBirth;

    @FindBy(xpath = "//div[@class='inputs date-of-birth']//select[@name='DateOfBirthYear']")
    WebElement DayofYear;

    @FindBy(id = "Email")
    WebElement emailAddress;

    @FindBy(name = "Password")
    WebElement Password;

    @FindBy(name = "ConfirmPassword")
    WebElement confirmPassword;

    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButton;

    @FindBy(xpath = "//div[@class='page-body']//div[contains(text(),'Your registration completed')]")
    WebElement registercomplete;

    @FindBy(xpath = "//div[@class='page-body']/div[2]//a[contains(text(),'Continue')]")
    WebElement continuebutton;

    @FindBy(xpath = "//span[contains(text(),'First name is required.')]")
    WebElement Firstnameverify;

    @FindBy(xpath = "//span[contains(text(),'Last name is required.')]")
    WebElement Lastnameverify;

    @FindBy(xpath = "//span[contains(text(),'Email is required.')]")
    WebElement emailaddressverify;

    @FindBy(xpath = "//div[@class='inputs']//span[@id='Password-error']")
    WebElement passwordverify;

    @FindBy(xpath = "//span[@data-valmsg-for='ConfirmPassword']/span[contains(text(),'Password is required.')]")
    WebElement confirmpasswordverify;

    public String RegisterText() {
        log.info("Click on build your computer link" + registerText.toString());
        return getTextFromElement(registerText);
    }

    public void maleradio() {
        clickOnElement(maleradio);
        log.info("Click on male radio button" + maleradio.toString());
    }

    public void femaleRadio() {
        clickOnElement(femaleradio);
        log.info("Click on female radio button" + femaleradio.toString());
    }

    public void Firstname(String Firstname) {
        sendTextToElement(firstname, Firstname);
        log.info("Enter your firstname" + firstname.toString());
    }

    public void Lastname(String Lastname) {
        sendTextToElement(lastname, Lastname);
        log.info("Enter your lastname" + lastname.toString());
    }

    public void DayofBirthdaydrop(String Day) {
        sendTextToElement(DayofBirthday, Day);
        log.info("select your day of birth" + DayofBirthday.toString());
    }

    public void Monthofbirth(String Month) {
        sendTextToElement(MonthofBirth, Month);
        log.info("Select the month which you was born" + MonthofBirth.toString());
    }

    public void YearofBorn(String Year) {
        sendTextToElement(DayofYear, Year);
        log.info("Select the year you was born in" + DayofYear.toString());
    }

    public void emailAddress(String email) {
        sendTextToElement(emailAddress, email);
        log.info("Enter your email" + emailAddress.toString());
    }

    public void password(String password) {
        sendTextToElement(Password, password);
        log.info("Enter your password" + Password.toString());
    }

    public void confirmpassword(String Confirmpass) {
        sendTextToElement(confirmPassword, Confirmpass);
        log.info("Confirm your password" + confirmPassword.toString());
    }

    public void RegisterButton() {
        clickOnElement(registerButton);
        log.info("Click on register button");
    }

    public String FirstnamerequiredError() {
        log.info("Getting error from " + Firstnameverify.toString());
        return getTextFromElement(Firstnameverify);
    }

    public String LastnamerequiredError() {
        log.info("Getting error from " + Lastnameverify.toString());
        return getTextFromElement(Lastnameverify);
    }

    public String EmailadressRequired() {
        log.info("Getting error from " + emailaddressverify.toString());
        return getTextFromElement(emailaddressverify);
    }

    public String passwordrequired() {
        log.info("Getting error from " + passwordverify.toString());
        return getTextFromElement(passwordverify);
    }

    public String Confirmpassword() {
        log.info("Getting error from " + confirmpasswordverify.toString());
        return getTextFromElement(passwordverify);

    }

    public String registercomplete(){
        log.info("Getting link from " + registercomplete.toString());
        return getTextFromElement(registercomplete);
    }

    public void continueButton (){
        clickOnElement(continuebutton);
        log.info("Click on continue "+continuebutton.toString());
    }


}
