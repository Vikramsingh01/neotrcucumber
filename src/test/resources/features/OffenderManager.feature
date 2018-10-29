#Author: mamu.dutta@meganexus.com
@OffenderManager
Feature: Offender Manager Page Testing

@viewOffManager
  Scenario: View Offender Manager
    Given As a user I want to login to neo_tr with valid credentials
      | Fields   | Value     |
      | UserName | neo_admin |
      | Password | neo_admin |
    And I select offender with name " " or crnNo "T012396" and selected offender from Service user
    When I view OffenderManager details
    Then I validate OffenderManager record should be on ui