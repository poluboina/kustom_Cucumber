Feature: Login Feature

  Background: 
    Given user is on login page
    When user enter username
    And user enter password

  Scenario: Verify FB login
    Then FB home page should be displayed

  Scenario: Verify Insta Login
    Then Insta home page should be displayed
