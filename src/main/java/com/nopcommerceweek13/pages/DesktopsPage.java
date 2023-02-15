package com.nopcommerceweek13.pages;

import com.nopcommerceweek13.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DesktopsPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public DesktopsPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='page category-page']//h1[contains(text(),'Desktops')]")
    WebElement Desktoptext;

    @FindBy(xpath = "//div[@class='product-selectors']/div[2]/span[contains(text(),'Sort by')]")
    WebElement Sortbytext;

    @FindBy(xpath = "//div[@class='product-selectors']/div[3]/span[contains(text(),'Display')]")
    WebElement Displaytext;

    public String getDisplaytext() {
        log.info("Getting text from "+Desktoptext.toString());
        return getTextFromElement(Desktoptext);
    }

    public String getSortbytext() {
        log.info("Getting text from "+Sortbytext.toString());
        return getTextFromElement(Sortbytext);
    }

    public String displaytext() {
        log.info("Getting text from "+Displaytext.toString());
        return getTextFromElement(Displaytext);
    }

}
