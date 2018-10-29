#Author: yogesh.sonar@meganexus.com
@UpwAdjustment @regression
Feature: UPW Adjustment Testing

  @viewUpwAdjustmentList
  Scenario: View UPW Adjustment list
    Given As a user I want to login to neo_tr with valid credentials
      | Fields   | Value     |
      | UserName | neo_admin |
      | Password | neo_admin |
    And I select offender with name " " or crnNo "B974109" and selected offender from Service user
	And I clicked on event tab and view the event details, if event is availavble on UI
    When I click on UPW tab and view UpwAdjustmentList
    Then I validate UpwAdjustmentList on ui
    

  @viewUpwAdjustmentDetails
  Scenario: Validate UPW Adjustment structure from inbound xml with the View UPW Adjustment Screen 
    Given As a user I want to login to neo_tr with valid credentials
      | Fields   | Value     |
      | UserName | neo_admin |
      | Password | neo_admin |
    And I select offender with name " " or crnNo "B974109" and selected offender from Service user
    And I clicked on event tab and view the event details, if event is availavble on UI
    When I view UpwAdjustmentStructure details  
    Then I validate UpwAdjustmentStructure with inboundXML