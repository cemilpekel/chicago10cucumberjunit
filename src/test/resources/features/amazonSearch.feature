@amazonSearch
Feature: Amazon Search

  Scenario: Amazon search test
    Given user is on the amazon homepage
    When user enters headphones keyword
    And user clicks to amazon search button
    Then user should see homepage in results

