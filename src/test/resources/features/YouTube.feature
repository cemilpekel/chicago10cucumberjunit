@youtube
Feature: Youtube search feature

  Background: User is on the homepage and is able to see search box and search button
  Given User is on the youtube search homepage
  And User is able to see the search box
  And User is able to see the search button


  Scenario: Testing youtube search

    When User searches for funny cat videos
    Then User should see results related to funny cat videos

  Scenario: Testing youtube search

    When User searches for funny dog videos
    Then User should see results related to funny dog videos

  Scenario: Testing youtube search

    When User searches for funny pet videos
    Then User should see results related to funny pet videos
