#Author: vartika.varma@meganexus.com
@Sprint-16 @DrugTestProfile 
Feature: DrugTestProfile Page Testing 

Background: 

    Given As a Case Manager I want to login to neo_tr with valid credentials
    And I select specific offender with name " " or crnNo and clicked on goto button for required offender from Service user page
    And I navigate to Drug Test Profile page
    
    #IC-2407 As a Case Manager I want to add a drug test profile so that I can record what drugs a service user is to be tested for.
    #Negative scenario: for error message in add page
    @addDrugTestProfile @regression 
    Scenario: Verifying error message in Add Drug Test Profile Structure 
	  When I click on add button for Drug Test Profile
	  Then I add invalid values and submit for Drug Test Profile
    And I verify error messages displayed on add Drug Test Profile UI
    And I click on Cancel button
    
    
    #IC-2407 As a Case Manager I want to add a drug test profile so that I can record what drugs a service user is to be tested for.
    @addDrugTestProfile @regression 
    Scenario: Add DrugTestProfile Structure 
	  When I click on add button for Drug Test Profile
    Then  I verify field labels for Drug Test Profile
    And I add field values for Drug Test Profile and submit
   
   
    #IC-2408 As a Case Manager I want to edit a drug test profile so that I can amend the information about the test
   @editDrugTestProfile @regression 
    Scenario: Edit DrugTestProfile Structure
	   When I click on edit button for Drug Test Profile
     Then I edit field values for Drug Test Profile and submit
     
     #IC-2408 As a Case Manager I want to edit a drug test profile so that I can amend the information about the test
     #Negative scenario: for error message in add page
    @addDrugTestProfile @regression 
    Scenario: Verifying error message in add Drug Test Profile Structure 
    When I click on edit button for Drug Test Profile
	  Then I edit invalid values and submit for Drug Test Profile
    And I verify error messages displayed on edit Drug Test Profile UI
    And I click on Cancel button
   
    