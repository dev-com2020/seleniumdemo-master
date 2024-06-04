Feature: Login Feature
  Scenario: Successful Login with Valid Credentials
    Given User is on Home Page
    When User Navigate to LogIn Page
    And User enters UserName {string} and Password {string}
    Then User should see {string} on the page