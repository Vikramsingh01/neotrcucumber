#Author: tapan.sahoo@meganexus.com
@AddressAssessment @sprint16
Feature: Address Assessment Page Testing

  Background: 
    Given As a Case Manager I want to login to neo_tr with valid credentials
    And I select specific offender with name "" or crnNo and clicked on goto button for required offender from Service user page
    And I navigate to view Contact Information Page
    When I expand Address Structure
    And I clicked view button for Address structure

  #As a System User I want to list view the address assessment so that I can review the details
  @listViewAddrAssess
  Scenario: List View of Address Assessment Structure
    When I Expand Address Assessment Link
    Then I validate Address Assessment list view page

  #As a System User I want to detail view the address assessment so that I can review the details
  @viewAddrAssess
  Scenario: Details View the Address Assessment Structure
    When I Expand Address Assessment Link
    And I clicked view button for Address Assessment Structure
    Then I validate Address Assessment record with Inbound xml
    And I vaildate back button is working for Address Assessment Strucure

  #As a System User I want to edit the Service Users address assessment so that I can update the information on the suitability of an address
  @errorMsgAddressAssesment
  Scenario: Verifying error message for Edit Address Assessment Structure
    When I Expand Address Assessment Link
    And I clicked on edit button for Address Assessment Structure
    Then I updated invalid value and verified labels and error message is showing on edit Address Assessment Page

  # As a System User I want to edit the Service Users address assessment so that I can update the information on the suitability of an address
  @editAddressAssessment @regression
  Scenario: Updating Address Assessment Structure
    When I Expand Address Assessment Link
    And I clicked on edit button for Address Assessment Structure
    And I updated field value for Address Assessment Structure with valid data
    Then I validate Update Value in Edit Address Assessment Page with outbound xml

  #As a System User I want to add an Address Assessment so that I can keep a record of the suitability of a Service Users place of residency
  @errorMsgAddressAssesmnt
  Scenario: Verifying error message for Add Address Structure List
    When I clicked on add button for Address Assessment Structure
    Then I insert invalid value and verified labels and error message is showing on add Address Assessment Structure

  #As a System User I want to add an Address Assessment so that I can keep a record of the suitability of a Service Users place of residency
  @addAddressAssessment @regression
  Scenario: Inserting new Record for Address Assessment Structure
    When I clicked on add button for Address Assessment Structure
    And I insert field value for Address Assessment Structure with valid data.
    Then I validate insert record for Add Address Assessment structure with outbound xml
    
  #As a System Administrator I want to delete a Service Users Address Assessment so that I can remove erroneous data  
  @DeleteAddressAssessment @regression
  Scenario: Delete Address Assessment Record and validate it on list & with DEL Outbound XML
    When I delete Address Assessment details
    And I verify whether Address Assessment is deleted from AssessmentList
    Then I validate AddressAssessmentDEL outboundXML 
