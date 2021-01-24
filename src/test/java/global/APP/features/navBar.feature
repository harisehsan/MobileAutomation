@NavBar
Feature: Check navigation bar

  Scenario: Con round
    Given open app
    And go to Member

    And go to Message
    And go to Feed
    And go to Home

  Scenario: By circle
    Given open app
    And go to Home
    And go to Feed
    And go to Message

    And go to Member

