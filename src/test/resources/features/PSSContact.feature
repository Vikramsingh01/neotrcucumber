@pssContact @smoke
Feature:  pssContact Page  Testing

@pssContactList
Scenario: View pssContact list
    Given As a user I want to login to neo_tr with valid credentials
      | Fields   | Value     |
      | UserName | neo_admin |
      | Password | neo_admin |
    And I select offender with name "" or crnNo "B974109" and selected offender from Service user
    When I clicked on event tab and view the event details, if event is availavble on UI
    Then I validate pssContact list on ui
    
    
 @viewpssContact
  Scenario: View pssContact Detail and validate with Inbound XML
      Given As a user I want to login to neo_tr with valid credentials
      | Fields   | Value     |
      | UserName | neo_admin |
      | Password | neo_admin |
    And I select offender with name "" or crnNo "B974109" and selected offender from Service user
    When I clicked on event tab and view the event details, if event is availavble on UI
    When I view pssContact to corresponding offender
    Then I validate pssContact record details on ui with Inbound XML
    And I click on back button on view pssContact screen
     #Navigation Testing
