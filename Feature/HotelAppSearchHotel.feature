Feature: HotelApp Search Hotel

Description : This test is to check the search functionality of the HotelApp.

Background: User is logged in
Given User is on HotelApp Homepage
When User enters username
And User enters password
And User clicks on login button

Scenario: Search Hotel
And User selects location from drop down
And User clicks on Search button
Then List of hotels is displayed

Scenario: Select Hotel
And User selects location from drop down
And User clicks on Search button
And User select a radio button
And User clicks on continue button
Then Book a Hotel is displayed
