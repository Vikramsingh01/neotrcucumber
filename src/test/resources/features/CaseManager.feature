#Author: Sanket.Biraje@meganexus.com
#Sprint15

@CaseManager
Feature: Case Manager Page Testing

  Background: 
    Given As a Case Manager I want to login to neo_tr with valid credentials
    And I select specific offender with name "" or crnNo and clicked on goto button for required offender from Service user page
    #And I navigate to Case Manager Tab
    
 #IC-110 As a Case Manager I want to view an individual Event and list of requirements so that 
  @viewCaseManager @regression
  Scenario: View Case Manager
    When I view Case Manager page
    Then I validate Current Case Manager details 
    Then I validate Case Manager History details 
    And I validate Back for Case Manager
