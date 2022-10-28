Feature: HotelApp Login1
Description : This test is to check the login functionality of the HotelApp.
Scenario: Login Sucessful
Given User is on HotelApp Homepage
When User enters username
And User enters password
And User clicks on login button
Then Login is successful