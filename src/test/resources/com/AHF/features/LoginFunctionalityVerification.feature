@feature_login_verification

Feature: Login Verification


@valid-login
Scenario Outline: User Login with Valid Credentials
Given the user is on the Login Page
When the user enters "<email>" into the Email Address field
And the user enters "<password>" into the Password field
And the user clicks the Login button
Then the user should be redirected to the Home Page

Examples:
| email                  | password    |
| akramsaii715@gmail.com | Admin@567 |


@invalid-login
Scenario Outline: User Login with Invalid Credentials
Given the user is on the Login Page
When the user enters "<email>" into the Email Address field
And the user enters "<password>" into the Password field
And the user clicks the Login button
Then an error message should be displayed

Examples:
| email                 | password         |
| invalidemail@gmail.com | Admin@567        |
| akramsaii715@gmail.com | invalidpassword  |
| invalidemail@gmail.com | invalidpassword |