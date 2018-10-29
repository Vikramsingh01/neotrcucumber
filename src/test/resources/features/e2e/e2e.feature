@tag
Feature: End to End Testing

  @e2e
  Scenario: Add all structure
    Given As a user I want to login to neo_tr with valid credentials
      | Fields   | Value     |
      | UserName | neo_admin |
      | Password | neo_admin |
    And I select offender with name "testing" or crnNo "X912380" and selected offender from Service user
    
