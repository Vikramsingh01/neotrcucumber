#Author: vikram.singh@meganexus.com
#sprint15
#Keywords Summary :
@Accessibility @sprint15
Feature: Accessibility page testing

  Background: 
    Given As a Case Manager I want to login to neo_tr with valid credentials
    And I select specific offender with name "" or crnNo and clicked on goto button for required offender from Service user page
    And I navigate to Accessibility page

  #IC-101 As a System User I want to view a list of accessibilities so that I can see all of the Service Users accessibilities
  #@listViewAccessibility
  Scenario: List View Accessibility
   Then I validate list view of Accessibility

  #IC-102 As a System User I want to view a accessbility so that I can see the detail of the Service User Accessibility
  #@viewAccessibility @regression
  Scenario: View Accessibility
  When I clicked on view Accessibility button
  Then I validate inserted accessibility record with inbound xml
  And I validate navigate back to privious page

  # IC-33 As a System User I want to edit the Service Users accessibility record so that I can update the information on any accessibility currently or previously suffered
  @errorMsgAccesibiltyEdit
  Scenario: Verifying error message in Edit Accessibilty Structure List
    When I expand Accessibility Provision
    And I clicked on edit button for Accessibilty Provision
    Then I updated invalid value and verified labels and error message is showing on edit Accessibilty ProvisionUI

  # IC-33 As a System User I want to edit the Service Users accessibility record so that I can update the information on any accessibility currently or previously suffered
  @editAccessibility @regression
  Scenario: View Accessibility records
    When I click on edit Accessibility button
    And I edit information for Accessibility record
    Then I validate list view of Accessibility records
    And I validate inserted accessibility record with outbound xml

  #IC-48 As a System User I want to add a accessibility so that I can keep a record of the Service Users accessibilities
  @addAccessibility @regression
  Scenario: Add Accessibility record
    When I click on add Accessibility button
    And I insert required data for Accessibility record
    Then I validate list view of Accessibility records
    And I validate inserted accessibility record with outbound xml

  #As a System Administrator I want to delete a Service Users Accessibility information so that I can remove erroneous data
  @DeleteAccessibility @InactiveProvision @regression
  Scenario: Delete Accessibility Record and validate it on list & with DEL Outbound XML
    When I delete Accessibility details with Inactive Provision Record
    And I verify whether Accessibility Record is deleted from accessibilityList
    Then I validate AccessibilityDEL outboundXML
    
    
   
