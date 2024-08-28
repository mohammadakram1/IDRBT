Feature: Login Verification


@valid-login
Scenario Outline: User Login with Valid Credentials
When the user clicks on the "Login" link
And user click on the "Send OTP" button without entering the mobile number
Then verify the error is displaying
Then user enters correct <Mobile Number> and click on the send OTP button
And Edit the OTP and ckick on LOGIN button
Then verify the confirmation message and user should be able to navigates on the bank details page

Examples:
| Mobile Number   |
| 7207614434      |


