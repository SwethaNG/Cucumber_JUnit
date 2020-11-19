#One feature is broken down to multiple scenarios
@tag
Feature: Validating Login feature
Scenario: Validate Successfull login with Valid date

Given User should be logged into application
When Valid detailed entered
And Clicked on Login
Then Home screen should be displayed
