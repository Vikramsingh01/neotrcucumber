#Author: vartika.varma@meganexus.com
@custodyLocation
Feature: Custody Location testing

  @viewCustodyLocation
  Scenario: View custody location
    Given As a user I want to login to neo_tr with valid credentials
      | Fields   | Value     |
      | UserName | neo_admin |
      | Password | neo_admin |
    And I select offender with name "Dravid 1" or crnNo "V090101" and selected offender from Service user
    When I view custodyLocation details
    Then I validate custodyLocation record should be on ui


  @UpdateCustodyLocation
  Scenario: Delete custody location
    Given As a user I want to login to neo_tr with valid credentials
      | Fields   | Value     |
      | UserName | neo_admin |
      | Password | neo_admin |
    And I select offender with name "Dravid 1" or crnNo "V090101" and selected offender from Service user
    When I update custodyLocation details
    Then I validate custodyLocation record should be updated on ui
