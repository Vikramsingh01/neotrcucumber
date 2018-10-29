#Author: tapan.sahoo@meganexus.com
#Sprint-14
@acceProvision @sprint14
Feature: Accessibilty Provision  Page  Testing

  Background: 
    Given As a Case Manager I want to login to neo_tr with valid credentials
    And I select specific offender with name "" or crnNo and clicked on goto button for required offender from Service user page
    And I navigate to Accessibility page
    When I navigate to view Accessibilty Page

  #IC-104 As a System User I want to view a list of provisions so that I can see all of the provisions for a Service User
  @listViewProvision 
  Scenario: List View Accessibilty Provision
    When I expand Accessibility Provision
    Then I vaildate list details of Accessibilty Provision

  #IC-103 As a System User I want to view a provision so that I can see the detail of any aids put in place to assist with the Service Users disabliity
  @viewProvision @regression
  Scenario: View Accessibilty Provision Structure
    When I expand Accessibility Provision
    And I navigate to view Accessibilty Provision Page
    Then I validate View Accessibilty Provision Page For Inbound xml
    And I vaildate back button is working for Accessibilty Provision

  #IC-34 As a System User I want to edit the Service Users provision so that I can update the information on any aids that can be put in place to assist the Service Users disabilities
  #Negetive scenario: for error message in edit page
  @errorMsgProvisionEdit
  Scenario: Verifying error message in Edit Accessibilty Provision Structure List
    When I expand Accessibility Provision
    And I clicked on edit button for Accessibilty Provision
    Then I updated invalid value and verified labels and error message is showing on edit Accessibilty ProvisionUI

  #IC-34 As a System User I want to edit the Service Users provision so that I can update the information on any aids that can be put in place to assist the Service Users disabilities
  @editProvision @regression
  Scenario: Edit Accessibilty Provision Structure List
    When I expand Accessibility Provision
    And I clicked on edit button for Accessibilty Provision
    And I updated field value for Accessibilty Provision
    Then I validate Update Value in Edit Accessibilty Provision Page

  #Negetive scenario: for error message in Add page
  #IC-49 As a System User I want to add a provision so that I can keep a record of the aids put in place to assist with the Service Users disabliity
  @errorMsgProvisionAdd
  Scenario: Verifying error message Add Accessibilty Provision Structure List
    When I clicked on add button for Accessibilty Provision
    Then I insert invalid value and verified labels and error message is showing on edit Accessibilty ProvisionUI

  #IC-49 As a System User I want to add a provision so that I can keep a record of the aids put in place to assist with the Service Users disabliity
  @addProvision @regression
  Scenario: Add Accessibilty Provision Structure List
    When I clicked on add button for Accessibilty Provision
    And I insert field value for Accessibilty Provision
    Then I validate insert record for Add Accessibilty Provision Page with outbound xml
    
 #As a System Administrator I want to delete a Service Users Provision so that I can remove erroneous data   
 @DeleteAccessibiltyProvision @regression
  Scenario: Delete Accessibilty Provision Record and validate it on list & with DEL Outbound XML
    When I delete Accessibilty Provision details
    And I verify whether Accessibilty Provision Record is deleted from accessibiltyProvisionList 
    Then I validate AccessibiltyProvisionDEL outboundXML
