Feature: HotelApp login2

Description : This test is to check the login functionality of the HotelApp.

Scenario: Login Sucessful
Given User is on HotelApp Homepage
When User enters Username  "vasuvespag"
And User enters Password  "vasu1234"
And User clicks on login button
Then Login is successful