@google
Feature: Google search feature
  Scenario: Making sure Google search is working as expected

    Given User is on the google homepage
    And User enters flowers
    And User clicks search button
    Then User should see result related to flowers

