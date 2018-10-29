#Author: vartika.varma@meganexus.com
@release
Feature: Release testing

  @viewRelease
  Scenario: View release
    Given As a user I want to login to neo_tr with valid credentials
      | Fields   | Value     |
      | UserName | neo_admin |
      | Password | neo_admin |
    And I select offender with name "Dravid 1" or crnNo "V090101" and selected offender from Service user
    When I view release details
    Then I validate release record should be on ui


