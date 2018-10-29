#Author: Abhijit.Behuria@meganexus.com
#Sprint_14
@additionalIdentifier
Feature: Additional Identifier testing

  Background: 
    Given As a Case Manager I want to login to neo_tr with valid credentials
    And I select specific offender with name "" or crnNo and clicked on goto button for required offender from Service user page
    And I navigate to Profiles tab

  #As a System User I want to view a list of additional identifiers so that I can easily see the additional identifiers for the Service User
  @AdditionalIdentifierListView @regression
  Scenario: Additional Identifier List View
    And I expand Additional Identifier
    Then I validate Additional Identifier list and one Additional Identifier Record should be present on ui

  #As a System User I want to add an additional identifier so that I can keep a record of the Service users identifiers
  @AddAdditionalIdentifier @regression
  Scenario: Add  Additional Identifier
    And I clicked on add button for Additional Identifier
    And I insert field value for Additional Identifier
    Then I validate insert record for Add Additional Identifier Page
    Then I validate insert record for Add Additional Identifier Page with outboundXML

  #As a System User I want to view the details of an additional identifier so that I can see the details of the additional identifiers
  @ViewAdditionalIdentifier @regression
  Scenario: View additional identifier
    And I expand Additional Identifier
    And I clicked on View button for Additional Identifier.
    Then I validate View AdditionalIdentifier Page For Inbound xml
    And I vaildate back button is working for AdditionalIdentifier

  #As a System User I want to add an additional identifier so that I can keep a record of the Service users identifiers
  @errorMsgAdditionalIdentifier
  Scenario: Verifying error message Add Additional Identifier Structure List
    And I navigate to Profiles tab
    And I clicked on add button for Additional Identifier
    Then I insert invalid value and verified labels and error message is showing on Add Additional Identifier UI
    
 #As a Case Co-Ordinator I want to delete the details of an additional identifier so that I can remove erroneous data
 @DeleteAdditionalIdentifier @regression
  Scenario: Delete Additional Identifier Record and validate it on list & with DEL Outbound XML
    When I delete AdditionalIdentifier details
  Then I verify whether additionalIdentifierRecord is deleted from AdditionalIdentifierList 
    #And I validate AdditionalIdentifierDEL outboundXML