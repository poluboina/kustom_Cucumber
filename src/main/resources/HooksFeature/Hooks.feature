Feature: Customer Creation

  Scenario: Verify Customer is Created
    Given user on customer page
    When user enters customer data
    And clicks create button
    Then customer should be created

  Scenario: Verify Edit Customer
    Given user on customer page
    When user enters customer data
    And clicks create button
    Then customer should be created
