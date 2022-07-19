Feature: Facebook Login

  @SmokeScenario
  Scenario Outline: Verify Facebook Invalid Login
    Given user on facebook page
    When user enters invalid username as <username>
    And user enters invalid password as <password>
    And user clicks on loginButton
    Then Error Message should be displayed

    Examples: 
      | username | password |
      | raghav   | abcd     |
      | abc123   | abcd     |
      |    12345 | abcd     |
      | abc&%    | abcd     |
