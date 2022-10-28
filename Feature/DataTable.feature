Feature: HotelApp login data table

Description : This test is to check the login functionality of the HotelApp.

Scenario: Login Sucessful
Given User is on HotelApp Homepage
When User enters username and password 
| username | password |
| vasuvespag | vasu1234 |
| aryan1207 | Aryan@120799 |
And User clicks on login button
Then Login is successful