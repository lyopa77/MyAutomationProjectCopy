Feature: Login feature
  As a user I want to login because otherwise how do I use this app?
  Scenario: Basic Login
    Given User is on the landing page
    When user enters credentials
    And user clicks login button
    Then user is supposed to see the Welcome Message