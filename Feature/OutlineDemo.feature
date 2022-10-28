Feature: HotelApp login outline demo
Description : This test is to check the login functionality of the HotelApp.
Scenario Outline: Login Sucessful
Given User is on HotelApp Homepage
When User enters username as <"<username>"> 
And User enters password as <"<password>"> 
And User clicks on login button
Then Login is successful

Examples:
| username | password |
| vasuvespag | vasu1234 |
| aryan1207 | Aryan@120799 |
 