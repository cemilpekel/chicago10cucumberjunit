Feature: This is my first Feature
  # this is a comment sign in feauture file
  @test
  Scenario: Google search scenario
    When user goes to google application
    Then user searches for apple
    And user should be apple related results
    And user tests something