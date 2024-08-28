package com.AHF.stepdefinitions;
import com.AHF.utils.ElementUtils;

import org.openqa.selenium.WebDriver;
import org.junit.Assert;

// // import com.AHF.pages.LoginPage;
// // import com.AHF.pages.ProfilePage;
import com.AHF.driverfactory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Scenario;

public class VerifySSOLoginFunctionality {
    WebDriver driver;
// //     LoginPage loginPage;
// //     ProfilePage profilePage;

//     @Given("the user is on the Login Page")
//     public void the_user_is_on_the_login_page() {
//         driver = DriverFactory.getDriver();
// // //         loginPage = new LoginPage(driver);
// // // // //         loginPage.navigateToLoginPage();
//     }

    @When("the user clicks on the {string} button")
    public void the_user_clicks_on_the_button(String ssoProvider) {
        if (ssoProvider.equalsIgnoreCase("Google")) {
// // // // // //             loginPage.clickElementGoogleButton();
        } else if (ssoProvider.equalsIgnoreCase("Microsoft")) {
// // // // // //             loginPage.clickElementMicrosoftButton();
        }
    }

    @And("the user selects {string}")
    public void the_user_selects(String googleAccount) {
// // // //         loginPage.selectGoogleAccount(googleAccount);
    }

    @And("the user enters {string} and {string}")
    public void the_user_enters_and(String microsoftEmail, String microsoftPassword) {
// // // //         loginPage.enterMicrosoftEmail(microsoftEmail);
// // // //         loginPage.enterMicrosoftPassword(microsoftPassword);
    }

//     @And("the user clicks on the {string} button")
//     public void the_user_clicks_on_the_sign_in_button(String signInButton) {
// // // // //         loginPage.clickElementMicrosoftSignInButton();
//     }

    @Then("the user should be directed to the Profile Page")
    public void the_user_should_be_directed_to_the_profile_page() {
// //         profilePage = new ProfilePage(driver);
// // // //         Assert.assertTrue(profilePage.isProfilePageDisplayed());
    }

    @And("the user should be logged in with {string} SSO")
    public void the_user_should_be_logged_in_with_sso(String ssoProvider) {
        if (ssoProvider.equalsIgnoreCase("Google")) {
// // // //             Assert.assertTrue(profilePage.isGoogleSSOLoginSuccessful());
        } else if (ssoProvider.equalsIgnoreCase("Microsoft")) {
// // // //             Assert.assertTrue(profilePage.isMicrosoftSSOLoginSuccessful());
        }
    }
@Given("the user clicks on the google button")
public void clickGoogleButton() {
// // // // // //     loginPage.clickElementGoogleButton();
}

@Given("the user clicks on the sign in button")
public void clickSignInButton() {
// // // //     loginPage.clickElementSignInButton();
}

@Then("the user should be logged in with microsoft sso")
public void verifyMicrosoftSSOLogin() {
// // // //     loginPage.verifyMicrosoftSSOLogin();
}

@Then("the user should be logged in with google sso")
public void verifyGoogleSSOLogin() {
// // // //     loginPage.verifyGoogleSSOLogin();
}

@Given("the user clicks on the microsoft button")
public void clickMicrosoftButton() {
// // // // // //     loginPage.clickElementMicrosoftButton();
}
}