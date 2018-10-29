#Author: tapan.sahoo@meganexus.com
#Sprint-15
@Address @sprint15
Feature: Address  Page  Testing

  Background: 
    Given As a Case Manager I want to login to neo_tr with valid credentials
    And I select specific offender with name "" or crnNo and clicked on goto button for required offender from Service user page
    And I navigate to view Contact Information Page
     
  #IC-113 As a System User I want to view a list of Addresss so that I can see the details of all persons who have contact with the Service User
  #@listViewAddress 
  #Scenario: List View of Address Structure
    #When I expand Address Structure
    #Then I vaildate list details of Address Structure
#
  #IC-114 As a System User I want to view Address so that I can review the details of a person who has contact with the Service User
  #@viewAddress @regression
  #Scenario: View of Address Structure
    #When I expand Address Structure
    #And I clicked view button for Address structure
    #Then I validate Address record with Inbound xml
    #And I vaildate back button is working for Address Strucure
#
  #IC-115 As a System User I want to edit a Address so that I update the details of any persons who have a role with the Service User
  #Negetive scenario: for error message in edit page
  #@errorMsgAddress
  #Scenario: Verifying error message for Edit Address Structure
    #When I expand Address Structure
    #And I clicked on edit button for Address Structure
    #Then I updated invalid value and verified labels and error message is showing on edit Address Page
#
  #IC-115 As a System User I want to edit a Address so that I update the details of any persons who have a role with the Service User
  #@editAddress @regression
  #Scenario: Updating Address Structure
    #When I expand Address Structure
    #And I clicked on edit button for Address Structure
    #And I updated field value for Address Structure with valid data
    #Then I validate Update Value in Edit Address Page with outbound xml
#
  #Negetive scenario: for error message in Add page
  #IC-112 As a System User I want to add a Address so that I can keep a record the details of any persons who have a role with the Service User
  #@errorMsgAddress
  #Scenario: Verifying error message for Add Address Structure List
    #When I clicked on add button for Address Structure
    #Then I insert invalid value and verified labels and error message is showing on add Address Structure
#
  #IC-112 As a System User I want to add a Address so that I can keep a record the details of any persons who have a role with the Service User
  #@addAddress @regression
  #Scenario: Inserting new Record for Address Structure
    #When I clicked on add button for Address Structure
    #And I insert field value for Address Structure with valid data.
    #Then I validate insert record for Add Address structure with outbound xml
    #
  #As a System Administrator I want to delete a Service Users Address record so that I can remove erroneous address information       
  #@DeleteAddress @regression
  #Scenario: Delete Address Record and validate it on list & with DEL Outbound XML
    #When I delete Address details
    #And I verify whether AddressRecord is deleted from aliasList 
    #Then I validate AddressDEL outboundXML
    #
  #As a System Administrator I want to verify deleted record should delete from DB as well.       
  #@DBTesting
  #Scenario: Verify deleted address record shouls be deleted from DB
    #When I delete Address details
    #And I verify deleted record of Address should be deleted from Database
    
     #IC-1168 As a System Administrator I want to delete a Service Users Address record so that I can remove erroneous address information       
    Scenario: Verify Error pop-up box is displayed when user tries to delete address of Type Main
    When I expand Address Structure
    And I click on delete button of Address type Main
    Then I verify pop-up box displayed to user with Close button 
