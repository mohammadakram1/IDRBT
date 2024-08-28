package com.AHF.pages;

import com.AHF.utils.ElementUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginVerificationPage {
    private WebDriver driver;
    private ElementUtils elementUtils;


    @FindBy(xpath = "//*[text()='Login']")
    private WebElement LoginLink;

    @FindBy(css = "[type=submit]")
    private WebElement sendOTPButton;

    @FindBy(css = "[name='mobileNumber']")
    private WebElement mobileNumberField;

    @FindBy(css = "[name='otp']")
    private WebElement OTPField;

    @FindBy(xpath = "//*[text()='Mobile number is required']")
    private WebElement errorMessage;

    @FindBy(css = "[type='submit']")
    private WebElement LoginButton;



    public LoginVerificationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        elementUtils = new ElementUtils(driver);
    }



    public void enterMobileNumber(String mobilenumber) {
        try {
            elementUtils.clearAndSendKeys(mobileNumberField, mobilenumber);
            elementUtils.clickElement(sendOTPButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterOTP() {
        try {
            elementUtils.clearAndSendKeys(OTPField, "123456");
            elementUtils.clickElement(LoginButton);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }




    public void clickElementLogin() {
        try {
            elementUtils.clickElement(LoginLink);
            }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isHomePageDisplayed() {
        try {
            return elementUtils.isElementDisplayed(errorMessage);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isErrorMessageDisplayed() {
        try {
            return elementUtils.isElementDisplayed(errorMessage);
        }
        catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void clickButton(String sendOTP) throws InterruptedException {
        if(sendOTP.equals("Send OTP")){
            elementUtils.clickElement(sendOTPButton);

        }
    }
}