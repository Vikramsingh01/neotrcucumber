#Author: Sanket.Biraje@Meganexus.com
#Sprint16

@communityRequirement
Feature: Community Requirement testing

Background: 
    Given As a Case Manager I want to login to neo_tr with valid credentials
    And I select specific offender with name "" or crnNo and clicked on goto button for required offender from Service user page

  #IC-125 As a Case Manager I want to view Order Requirement so that I can view information about the sentence component of a community order 
  @viewcommunityRequirement @regression
  Scenario: View Community Requirement 
    When I view Community Requirement page
    Then I validate Community Requirement details 
    And I validate Back for Community Requirement page

  #IC-126 Terminate Requirement
  @terminatecommunityRequirement @regression
  Scenario: Terminate Community Requirement 
    When I view Terminate Requirement page
    Then I terminate Community Requirement details 
    And I validate Termination of Community Requirement	
    
  #IC-127 Terminate Event
  @terminateEvent @regression
  Scenario: Terminate Event 
    When I view Terminate Event 
    Then I terminate Event  
    And I validate Termination of Event  
    
    