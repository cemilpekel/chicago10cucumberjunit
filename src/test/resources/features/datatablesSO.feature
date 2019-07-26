@datatables3
Feature: Testing datatables website
  Scenario Outline: Testing adding new employee to the table

    Given User is on the data tables homepage
    And User clicks to New Button
    Then User should see Create New Entry Box
    And User should enter first name "<firstName>"
    And User should enter last name  "<lastName>"
    And User should enter position   "<position>"
    And User should enter office "<office>"
    And User should enter extension "<extension>"
    And User should enter start date "<startDate>"
    And User should enter salary  "<salary>"
    Then User should click to Create button
    And User enters first name "<firstName>" to search box
    Then User should see first name "<firstName>" is inserted in the table

    Examples: Test data for datatables
    |firstName  |lastName |position |office      |extension   |startDate    |salary  |
    |Ahmet      |Deer     |retired  |London      |314         |2019-12-12   |65000   |
    |Joe        |Wong     |working  |Chicago     |312         |2019-11-01   |150000  |
   # |Adam       |Sandler  |actor    |Cali        |310         |2019-10-10   |250000  |
   # |Kristen    |Sandler  |teacher  |Ohio        |310         |2019-10-10   |250000  |
   # |Daughter   |Sandler  |nurse    |washington  |310         |2019-10-10   |250000  |



