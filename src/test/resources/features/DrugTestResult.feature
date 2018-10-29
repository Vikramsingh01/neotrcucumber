#Author: amardeep.patil@meganexus.com
@Sprint-17 @DrugTestResult
Feature: Drug Test Result Page Testing 

Background: 

    Given As a Case Manager I want to login to neo_tr with valid credentials
    And I select specific offender with name " " or crnNo and clicked on goto button for required offender from Service user page
    And I navigate to Drug Test Result page
    
    #IC-2412 As a Case Manager I want to view a list of drug test result so that I can navigate to the result I want
    @viewDrugTestResultList @regression 
    Scenario: View Drug Test Result list
	  Then I validate Drug Test Result list and one Drug Test Result should be present on ui
    #And I click on back button on Drug Test Result Tab 

    #IC-2411 As a Case Manager I want to view a drug test result so that I can see the information about the outcome of a drug test
    @viewDrugTestResultDetails @regression 
    Scenario: View Drug Test Result structure from inbound xml 
	  When I view Drug Test Result details
	  #I validate using inboundXML 
	  Then I validate Drug Test Result record should be on ui  
	  And I click on back button on view Drug Test Result screen 

    #IC-2410 As a Case Manager I want to add a drug test result so that I can record the outcome for the individual substances tested for in a drug test
    @addDrugTestResult @regression
    Scenario: Add Drug Test Result Structure List
    When I click on add button for Drug Test Result
    And  I verify field labels for Add Drug Test Result screen
    And I add field values for Drug Test Result and submit
    And I click on add button for Drug Test Result
    And I add drug test using future date
    Then I verify navigation to Drug Test Result list page
    
	  #IC-2410 As a Case Manager I want to add a drug test result so that I can record the outcome for the individual substances tested for in a drug test
    #Negative scenario: for error message in add page
    @errorMsgDrugTestResultAdd
    Scenario: Verifying error message in add drug test result Structure List
    When I click on add button for Drug Test Result
    Then I verify mandatory fields for Drug Test and submit
    And I add invalid values and submit for Drug Test Result
    And I add Drug Future date with SU Complied value and submit
    And I click on Cancel button on add Drug Test Screen
    Then I verify navigation to Drug Test Result list page
	  
	  #IC-3293 As a Case Manager I want to edit a drug test result so that I can record the outcome for the individual substances tested for in a drug test
    @editDrugTestResult @regression
    Scenario: Edit Drug test result Structure List
    When I click on edit button for drug test result
    And  I verify field labels for Add Drug Test Result screen
    And I edit field values for drug test result and submit
    Then I verify navigation to Drug Test Result list page
	   
    #IC-3294 As a Case Cordinator I want to delete a drug test result so that I can remove incorrect information
    @deleteDrugTestResult
    Scenario: Delete drug test result and validate it on list & with DEL Outbound XML 
    When I delete drug test result details 
    #Then I validate drug test result record should be delete on ui 
    #And  I validate drugTestResultDel outboundXML
 