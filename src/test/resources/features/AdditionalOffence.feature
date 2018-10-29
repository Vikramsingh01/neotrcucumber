#Ankita
@AdditionalOffence @smoke @regression
Feature: AdditionalOffence Page  Testing
	
@viewAdditionalOffence
Scenario: view AdditionalOffence structure
    Given As a user I want to login to neo_tr with valid credentials
      | Fields   | Value     |
      | UserName | neo_admin |
      | Password | neo_admin |
    And I select offender with name "" or crnNo "B974109" and selected offender from Service user
    And I clicked on event tab and view the event details, if event is availavble on UI
    When I view AdditionalOffence to corresponding event
    Then I validate AdditionalOffence record should be on ui
    And I click back button on AdditionalOffence screen

