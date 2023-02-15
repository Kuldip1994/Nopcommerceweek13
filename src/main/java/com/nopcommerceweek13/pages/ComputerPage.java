package com.nopcommerceweek13.pages;

import com.nopcommerceweek13.utility.Utility;
import lombok.experimental.FieldDefaults;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputerPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public ComputerPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li//a[@href='/computers']")
    WebElement computertab;

    @FindBy(xpath = "//div[@class='center-2']//h1[contains(text(),'Computers')]")
    WebElement computertext;

    @FindBy(xpath = "//h2[@class='title']//a[@href='/desktops']")
    WebElement desktoplink;

    @FindBy(xpath = "//div[@class='center-2']//h1[contains(text(),'Desktops')]")
    WebElement desktotext;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[@href='/notebooks']")
    WebElement notebookLink;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[@href='/software']")
    WebElement softwareLink;

    public void clickonComputertab() {
        clickOnElement(computertab);
        log.info("Click on computer tab" + computertab.toString());
    }

    public String getcomputerText() {
        log.info("getting text from" + computertext.toString());
        return getTextFromElement(computertext);
    }

    public void clickondesktoplink() {
        clickOnElement(desktoplink);
        log.info("Click on desktop link" + desktoplink.toString());
    }

    public String getdesktoptext() {
        log.info("getting text from " + desktotext.toString());
        return getTextFromElement(desktotext);
    }

    public void clickOnNotebook() {
        clickOnElement(notebookLink);
        log.info("Click on notebooklink" + notebookLink.toString());
    }

    public void clickOnsoftwareLink() {
        clickOnElement(softwareLink);
        log.info("click on software link" + softwareLink.toString());
    }


}
