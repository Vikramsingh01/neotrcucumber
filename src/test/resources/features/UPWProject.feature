#Author: ankita.sogani@meganexus.com
@UPWProject @Sprint16
Feature: UPWProject Page Testing

	Background: 
		Given As a Case Manager I want to login to neo_tr with valid credentials
		And I navigate to UNPAID WORK tab

#IC-2444: As a Project CoOrdinator, I want to be able to view a list of UPW Projects so I can select one to see if the information is up to date.	
	@UPWProjectFilterAndList @regression
	Scenario: View UPWProject Filter
		When I check for the UPWFilters
		Then I verify the validation for each filter
		And  I validate UPWProjectList

#IC-2298: As a Project Coordinator, I want to add an UPW project so that a Service User can attend an UPW session	
#IC-2443: As a Project CoOrdinator I want to view UPW Project so that I can see the information about the project	
	@UPWProjectAdd @regression
	Scenario: Add new UPWProject and validate it on UI
		When I click on Add New Project
		And I validate labels on Add UPW PROJECT Page
		And I add details for UPW Project
		And I click on Save button
		Then I search for newly added Project
		And I click on View button
		And I validate the newly added record

		
# IC-2319: As a Project Coordinator I want to edit an UPW project so that I can update the UPW project information	
	@UPWProjectEdit
	Scenario: Update last added UPWProject and validate it on UI
		When I search for last added Project
		And I click on Update button
		And  Update the Project 
		Then I search for update Project
		And I validate the searched record value
		And I click on View button
		And I validate the Updated record
