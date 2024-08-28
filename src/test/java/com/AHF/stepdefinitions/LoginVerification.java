package com.AHF.stepdefinitions;

import com.AHF.pages.LoginVerificationPage;
import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

// // import com.AHF.pages.LoginPage;
import com.AHF.driverfactory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginVerification {
       WebDriver driver;

       LoginVerificationPage login = new LoginVerificationPage(driver = DriverFactory.getDriver());

    @When("^user enters correct (.+) and click on the send OTP button")
    public void the_user_enters_email_into_the_email_address_field(String mobilenumber) {
        login.enterMobileNumber(mobilenumber);

    }

    @When("^the user enters (.+) into the Password field$")
    public void the_user_enters_password_into_the_password_field(String password) {

    }

    @When("the user clicks the Login button")
    public void the_user_clicks_the_login_button() {

    }

    @Then("the user should be redirected to the Home Page")
    public void the_user_should_be_redirected_to_the_home_page() {

    }

    @Then("an error message should be displayed")
    public void an_error_message_should_be_displayed() {

    }


    @When("the user clicks on the {string} link")
    public void theUserClicksOnTheLink(String arg0) {
        login.clickElementLogin();
    }

    @Then("verify the error is displaying")
    public void verifyTheErrorIsDisplaying() {
        Assert.assertTrue(login.isErrorMessageDisplayed());

    }

    @And("user click on the {string} button without entering the mobile number")
    public void userClickOnTheSendOTPButtonWithoutEnteringTheMobileNumber(String sendOTP) throws InterruptedException {
        login.clickButton(sendOTP);

    }

    @And("Edit the OTP and ckick on LOGIN button")
    public void editTheOTPAndCkickOnLOGINButton() {
        login.enterOTP();

    }

    @Then("verify the confirmation message and user should be able to navigates on the bank details page")
    public void verifyTheConfirmationMessageAndUserShouldBeAbleToNavigatesOnTheBanckDetailsPage() {
    }
}