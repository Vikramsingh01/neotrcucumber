Feature: Profile tab Page  Testing 

@viewprofile
Scenario: View Profile tab
	Given As a Case Manager I want to login to neo_tr with valid credentials 
		| Fields   | Value            |
		| UserName | mer_case_manager |
		| Password | neo_admin        |
	When I select offender with name "" or crnNo "B973113" and clicked on goto button for required offender from Service user page 
	And I navigate to Profiles tab
	Then I validate Title fields should be present on ui 
	Then I validate Identifiers fields should present on UI