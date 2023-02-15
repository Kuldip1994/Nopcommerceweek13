package com.nopcommerceweek13.pages;

import com.nopcommerceweek13.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuildYourOwnComputerPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public BuildYourOwnComputerPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='products-container']/div[2]/div/div/div[1]/div/div[2]/h2/a")
    WebElement buildyourowncomputerLink;

    @FindBy(xpath = "//div[@class='master-wrapper-content']/div[1]/div[2]/div/div/form/div[2]/div/div[2]/div/h1[contains(text(),'Build your own computer')]")
    WebElement buildyourownText;

    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement processorDropdown;

    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement Ramdropdown;

    @FindBy(xpath = "//input[@id='product_attribute_3_6']")
    WebElement HDDradioclick;

    @FindBy(xpath = "//input[@id='product_attribute_4_8']")
    WebElement osradiolink;

    @FindBy(xpath = "//input[@id='product_attribute_5_10']")
    WebElement softwarecheckBox;

    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement Addtocartbutton;

    @FindBy(xpath = "//div[@class='bar-notification success']/p")
    WebElement addedtoshoppingchart;

    public String buildyourOwnText() {
        log.info("Getting link from " + buildyourownText.toString());
        return getTextFromElement(buildyourownText);
    }

    public void clickOnBuildyourcomputer() {
        clickOnElement(buildyourowncomputerLink);
        log.info("Click on build your computer link" + buildyourowncomputerLink.toString());
    }

    public void processbyDrop(String value) {
        selectByVisibleTextFromDropDown(processorDropdown, value);
        log.info("Click on the processor from drop down" + processorDropdown.toString());
    }

    public void Ramdropdown(String value) {
        selectByVisibleTextFromDropDown(Ramdropdown, value);
        log.info("Select ram from drop down" + Ramdropdown.toString());
    }

    public void Hddradioclick(String hdd) {
        clickOnElement(HDDradioclick);
        log.info("click on HDD radio button" + HDDradioclick.toString());
    }

    public void Osradiobutton(String os) {
        clickOnElement(osradiolink);
        log.info("Click on OS software which you would like " + osradiolink);
    }

    public void checkboxsoftware(String software) {
        clickOnElement((softwarecheckBox));
        log.info("tick on software check box on which you would like " + softwarecheckBox.toString());

    }

    public void addtocartbutton() {
        clickOnElement(Addtocartbutton);
        log.info("click on add to card button" + Addtocartbutton.toString());
    }

    public String addedtoshoppingChart() {
        log.info("Getting link from " + addedtoshoppingchart.toString());
        return getTextFromElement(addedtoshoppingchart);

    }

    public void makeyourown(String processor,String ram, String hdd, String os, String software){

        processbyDrop(processor);
        Ramdropdown(ram);
        Hddradioclick(hdd);
        Osradiobutton(os);
        checkboxsoftware(software);


    }


}
