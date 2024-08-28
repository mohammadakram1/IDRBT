package com.AHF.pages;

import com.AHF.utils.ElementUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginFunctionalityVerificationPage {
    private WebDriver driver;
    private ElementUtils elementUtils;

    @FindBy(id = "emailAddress")
    private WebElement emailAddressField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement loginButton;

    @FindBy(xpath = "//h1[text()='Dashboard']")
    private WebElement homePage;

    @FindBy(xpath = "//div[@class='alert alert-danger']")
    private WebElement errorMessage;

    public LoginFunctionalityVerificationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        elementUtils = new ElementUtils(driver);
    }

    public void enterEmailAddress(String email) {
        try {
            elementUtils.clearAndSendKeys(emailAddressField, email);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterPassword(String password) {
        try {
            elementUtils.clearAndSendKeys(passwordField, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickElementLoginButton() {
        try {
            elementUtils.clickElement(loginButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isHomePageDisplayed() {
        try {
            return elementUtils.isElementDisplayed(homePage);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isErrorMessageDisplayed() {
        try {
            return elementUtils.isElementDisplayed(errorMessage);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
public void navigateToLoginPage() {
        try {
            driver.get("https://ahfqa.walkingtree.tech/#/signin");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}