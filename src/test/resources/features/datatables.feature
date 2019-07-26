@datatables
Feature: Testing datatables website
  Scenario: Testing adding new employee to the table

    Given User is on the data tables homepage
    And User clicks to New Button
    Then User should see Create New Entry Box
    And User should enter first name
    And User should enter last name
    And User should enter position
    And User should enter office
    And User should enter extension
    And User should enter start date
    And User should enter salary
    Then User should click to Create button
    And User enters first name to search box
    Then User should see first name is inserted in the table




