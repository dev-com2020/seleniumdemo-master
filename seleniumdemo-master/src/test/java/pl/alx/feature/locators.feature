Feature: Locators Feature
  Scenario: Successful Login and Password Reset
    Given User is on Locators Practice Page
    When User enters Username "rahul" and Password "hello123"
    Then User should see error message
    When User clicks on "Forgot your password?" link
    And User enters Name "John", Email "john@rsa.com", and Phone "9864353253"
    Then User should see success message
    When User enters Username "rahul" and Password "rahulshettyacademy"
    And User clicks on the checkbox
    And User clicks on the submit button