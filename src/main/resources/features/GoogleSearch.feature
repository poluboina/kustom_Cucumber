Feature: Google Search TextBox

@SmokeScenario
  Scenario: Verify Google Search TextBox
    Given user on google page
    When user enters data
    And press enter key
    Then user should navigate to search results
