@datatables2
Feature: Testing datatables website
  Scenario: Testing adding new employee to the table

    Given User is on the data tables homepage
    And User clicks to New Button
    Then User should see Create New Entry Box
    And User should enter first name "John"
    And User should enter last name  "Wick"
    And User should enter position   "Retired Assassin"
    And User should enter office "London"
    And User should enter extension "341"
    And User should enter start date "2019-02-03"
    And User should enter salary  "124000"
    Then User should click to Create button
    And User enters first name "John" to search box
    Then User should see first name "John" is inserted in the table


