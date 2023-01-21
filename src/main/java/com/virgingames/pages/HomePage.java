package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(className = "dialog_button")
    WebElement acceptcookies;

    public void acceptCookies() {
        clickOnElement(acceptcookies);
    }

    @CacheLookup
    @FindBy(linkText = "Login")
    WebElement loginLink;

    public void clickOnLoginLink() {
        clickOnElement(loginLink);
        log.info("Clicking on login link : " + loginLink.toString());
    }

    @CacheLookup
    @FindBy(id = "dialog_accept_all")
    WebElement acceptall;

    public void acceptAll() {
        clickOnElement(acceptall);
    }

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Online Bingo')]")
    WebElement clickonOnlineBingo;

    public void clickonOnlineBingo() {
        clickOnElement(clickonOnlineBingo);
    }
}
