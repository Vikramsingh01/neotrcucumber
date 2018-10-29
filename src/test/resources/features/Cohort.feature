
@Cohort @smoke @regression
Feature: Cohort Page  Testing
	
@CohortList
Scenario: View Cohort list
    Given As a user I want to login to neo_tr with valid credentials
      | Fields   | Value     |
      | UserName | neo_admin |
      | Password | neo_admin |
    And I select offender with name "" or crnNo "B974109" and selected offender from Service user
    When I clicked on event tab and view the event details, if event is availavble on UI
    Then I validate Cohort list on ui

@viewCohort
Scenario: View Cohort structure and validate with inbound XML
    Given As a user I want to login to neo_tr with valid credentials
      | Fields   | Value     |
      | UserName | neo_admin |
      | Password | neo_admin |
    And I select offender with name "" or crnNo "B974109" and selected offender from Service user
    And I clicked on event tab and view the event details, if event is availavble on UI 
    When I view cohort to corresponding offender
    Then I validate cohort record should be on ui
    Then I click on back button on View Cohort screen
    


