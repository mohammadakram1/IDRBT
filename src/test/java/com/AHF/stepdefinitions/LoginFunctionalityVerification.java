package com.AHF.stepdefinitions;
import com.AHF.utils.ElementUtils;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

// // import com.AHF.pages.LoginPage;
import com.AHF.driverfactory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginFunctionalityVerification {
       WebDriver driver;


      @Given("the user is on the Login Page")
      public void the_user_is_on_the_login_page() {
        driver = DriverFactory.getDriver();
// //         loginPage = new LoginPage(driver);
// // // //         loginPage.navigateToLoginPage();
    }

    @When("^the user enters (.+) into the Email Address field$")
    public void the_user_enters_email_into_the_email_address_field(String email) {

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
    @Given("the user enters {string} into the email address field")
    public void enterEmailAddress(String email) {
    // // // // // //     loginPage.enterEmailAddress(email);
     }


}