#Author: tapan.sahoo@meganexus.com
#Sprint-15
@network @sprint15
Feature: Network  Page  Testing

  Background: 
    Given As a Case Manager I want to login to neo_tr with valid credentials
    And I select specific offender with name "" or crnNo and clicked on goto button for required offender from Service user page
    When I navigate to view Contact Information Page

  #IC-113 As a System User I want to view a list of Networks so that I can see the details of all persons who have contact with the Service User
  @listViewNetwork 
  Scenario: List View of Network Structure
    When I expand Network Structure
    Then I vaildate list details of Network Structure

  #IC-114 As a System User I want to view Network so that I can review the details of a person who has contact with the Service User
  @viewNetwork @regression
  Scenario: View of Network Structure
    When I expand Network Structure
    And I clicked view button for Network structure
    Then I validate Network record with Inbound xml
    And I vaildate back button is working for Network Strucure

  #IC-115 As a System User I want to edit a Network so that I update the details of any persons who have a role with the Service User
  #Negetive scenario: for error message in edit page
  @errorMsgNetwork
  Scenario: Verifying error message for Edit Network Structure
    When I expand Network Structure
    And I clicked on edit button for Network Structure
    And I update invalid value for Network Structure
    Then I verified labels and error message is showing on edit Network Page

  #IC-115 As a System User I want to edit a Network so that I update the details of any persons who have a role with the Service User
  @editNetwork @regression
  Scenario: Updating Network Structure
    When I expand Network Structure
    And I clicked on edit button for Network Structure
    And I updated field value for Network Structure with valid data
    Then I validate Update Value in Edit Network Page with outbound xml

  #Negetive scenario: for error message in Add Network page
  #IC-112 As a System User I want to add a Network so that I can keep a record the details of any persons who have a role with the Service User
  @errorMsgNetwork
  Scenario: Verifying error message for Add Network Structure List
    When I clicked on add button for Network Structure
    And I insert invalid value for Network Structure
    Then I verified labels and error message is showing on add Network Structure

  #IC-112 As a System User I want to add a Network so that I can keep a record the details of any persons who have a role with the Service User
  @addNetwork @regression
  Scenario: Inserting new Record for Network Structure
    When I clicked on add button for Network Structure
    And I insert field value for Network Structure with valid data.
    Then I validate insert record for Add Network structure with outbound xml
   
   #As a System Administrator I want to delete a Service Users Network record so that I can remove erroneous data 
   @DeleteNetwork @regression
  Scenario: Delete Network Record and validate it on list & with DEL Outbound XML
	When I delete NetworkRecord from UI 
	And I verify whether NetworkRecord is deleted from aliasList 
 #	Then  I validate NetworkDEL outboundXML  
    
