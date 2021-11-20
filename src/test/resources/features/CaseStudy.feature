Feature: Case Study Test Scenarios

  Background:
    Given Homepage is open
    And Window should be maximize
    And Close the pop up

  @regression   @smoke
  Scenario: Product Search Verification
    And Homepage should open
    When Search for "drone" keyword
    Then Search result should show "drone"


  @regression   @smoke
  Scenario: Sign in With Username Password
    And Navigate to Sign in page under the "Account" menu
    When Fill the login form with user informations
    And Submit login form
    Then Verify login is successful


  @regression
  Scenario: Sign in With Google
    And Navigate to Sign in page under the "Account" menu
    And Sign in with google
    And Verify login is successful
    When Open a new browser tab
    And Navigate to homepage
    Then User should be login in new tab

  @regression
  Scenario: Verify Saved Product Function
    And Click on the "Wireless Headphones" button at Menu,"Audio", "Headphones"
    And Select "Philips" brand
    And Navigate to 2rd product
    When Click save button
    And  Navigate to "Saved Items" menu
    Then Verify items have saved product







