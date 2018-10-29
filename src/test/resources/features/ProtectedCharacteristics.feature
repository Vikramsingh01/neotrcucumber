#Author: Abhijit.Behuria@meganexus.com
#Sprint_15
#@ProtectedCharacteristics
Feature: Protected Characteristics

  Background: 
    Given As a Case Manager I want to login to neo_tr with valid credentials
    And I select specific offender with name "" or crnNo and clicked on goto button for required offender from Service user page
    And I navigate to Protected Characteristics Tab

  #IC-106:As a System User I want to view the details of Protected Characteristics so that I can view the specified information about the user
  @ViewProtectedCharacteristics @regression
  Scenario: View Protected Characteristics Page
    Then I validate protectedCharacteristicsStructure values with the inboundXML
    And I click on back button on Protected Characteristics Tab

  #IC-107: As a System User I want to edit the Protected Characteristics so that I can update the specified information about the user
  @EditProtectedCharacteristics @regression
  Scenario: Edit Protected Characteristics
    When I edit protectedCharacteristicsStructure to corresponding offender
    Then I validate newly edited protectedCharacteristics should be on ui
    And I validate protectedCharacteristicsUPD outboundXML

  #IC-108: As a System User I want to Add the Protected Characteristics
  @AddProtectedCharacteristics
  Scenario: Add Protected Characteristics
    When I add protectedCharacteristicsStructure to corresponding offender
    Then I validate newly added protectedCharacteristics should be on ui
    And I validate protectedCharacteristicsINS outboundXML
