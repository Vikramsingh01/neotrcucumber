#Author: yogesh.sonar@meganexus.com
@Sprint-16 @Sprint-17 @Plan 
Feature: Plan Page Testing 

Background: 
    Given As a Case Manager I want to login to neo_tr with valid credentials
    And I select specific offender with name "" or crnNo and clicked on goto button for required offender from Service user page
    When I navigate to Plan Tab

#IC-85 As a Case Manager I want to view the list of activities on a Service User's plan so that I can see all activities assigned to that Service User
@viewPlanList @regression 
Scenario: View Plan Structure list
	Then I validate plan list and one plan should be present on ui
	And I click on back button on Plan Tab
	
#IC-86 As a Case Manager I want to view an activity from the list of activities so that I can see further details of the Service User's scheduled activity
@viewPlanDetails @regression
Scenario: View Plan Structure Details and validate data with Inbound XML
	When I view plan details of corresponding offender
	Then I validate all labels and fields for plan details
	Then I validate planStructure values with the inboundXML 
	And I click on back button on view plan screen
	
@addPlanStructureValidations
Scenario: Verify all business rules and validations applied on Add Plan screen
	When I view add Plan screen and verify all labels 
	And I enter invalid Plan values in all the inputs 
	Then I verify all the Plan validation messages on ui 
	
#IC-3701 Part 2 - As a Case Manager I want to add activities so that I can keep a record of the Service User's required attendance to an action
@addPlan @regression
Scenario: Add Plan Entry and validate it on UI & with INS Outbound XML 
	And I add Plan to corresponding offender
	Then I validate Plan record should be on ui 
	And I validate PlanINS outboundXML