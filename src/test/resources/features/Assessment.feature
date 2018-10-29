# Author: amardeep.patil@meganexus.com
#@Sprint-16 @Assessment 
Feature: Assessment Page Testing 

Background: 

    Given As a Case Manager I want to login to neo_tr with valid credentials
    And I select specific offender with name "" or crnNo and clicked on goto button for required offender from Service user page
    When I navigate to Assessment page
    
    #IC-2398 As a Case Manager I want to view a list of assessments so that I can select a referal to view, edit or delete.
    @viewAssessmentList @regression 
    Scenario: View Assessment Structure list
    Then I validate assessment list and one assessment should be present on ui
    #And I click on back button on assessment Tab 
#
    #IC-2397 As a Case Manager I want to view a assessment so that I can see the request for an assessment for a SU
    #@viewAssessmentDetails @regression 
    #Scenario: View assessment structure from inbound xml 
    #When I view assessment details
#	  And I validate using inboundXML 
   #	Then I validate assessment record should be on ui  
    #And I click on back button on view assessment screen 
    #And I verify assessment Header on assessment listscreen 
   
    #IC-2395 As a Case Manager I want to add a assessment so that I can ask a provider to assess a service user.
    #@addAssessment @regression
    #Scenario: Add Assessment Structure List
    #When I click on add button for Assessment
    #And  I verify field labels for Assessment
    #And I add field values for Assessment and submit
    #Then I verify navigation to Assessment list page
    #
#	
#	  #IC-2395 As a Case Manager I want to add a assessment so that I can ask a provider to assess a service user.
    #Negative scenario: for error message in add page
    #@errorMsgAssessmentAdd
    #Scenario: Verifying error message in Add Assessment Structure List
    #When I click on add button for Assessment
    #Then I add invalid values and submit for Assessment
    #And verify error messages displayed on add AssessmentUI
    #And I click on Cancel button 
#	  Then I verify navigation to Assessment list page
#	  
#	  #IC-2396 As a Case Manager I want to edit a assessment so that I can update the request for a service provider to assess a service user
    #@editAssessment @regression
    #Scenario: Edit Assessment Structure List
    #When I click on edit button for Assessment
    #And  I verify field labels 
    #And I edit field values for Assessment and submit
    #Then I verify navigation to Assessment list page
#	 
    #Negative scenario: for error message in Edit page
    #IC-2396 As a Case Manager I want to edit a assessment so that I can update the request for a service provider to assess a service user
    @errorMsgAssessmentEdit
    Scenario: Verifying error message in Edit Assessment Structure List
    When I click on edit button for Assessment
    Then I edit invalid values and submit on Edit Assessment Page 
    And verify error messages displayed on edit AssessmentUI
    And I click on Cancel button 
    Then I verify navigation to Assessment list page
    
  # IC-2405 As a Case Cordinator I want to delete a referral so that I can remove incorrect information
    @deleteAssessment
    Scenario: Delete Assessment and validate it on list & with DEL Outbound XML 
    When I delete assessment details 
    Then I validate assessment record should be delete on ui 
    
   