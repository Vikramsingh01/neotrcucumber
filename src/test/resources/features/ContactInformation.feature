#Author: Vikram.Singh@meganexus.com
@contact @sprint16
Feature: Crud Operation for contact Testing

  Background: 
    Given As a Case Manager I want to login to neo_tr with valid credentials
    And I select specific offender with name "" or crnNo and clicked on goto button for required offender from Service user page
    And I navigate to view Contact Information Page

  #IC-50 As a System User I want to view the Service User's Contact Information so that I can view the contact details of that Service User
  @viewContact
  Scenario: view contact information structure
    Then I validate Details view for Contact Information with Inbound XML
    And I click on back button on view Contact Information page

  #Negative scenario: for error message in Edit page
  #IC-91 As a System User I want to edit Contact Information so I can update the information
  @ErrorMsgEditContactinformation
  Scenario: Verifying error message edit Contact Information
    When I clicked on edit button for Contact Information
    Then I inserted invalid values for contact information
    And verify field labels and error messages displayed on edit Contact Information UI
    And I click on Cancel button

  #IC-91 As a System User I want to edit Contact Information so I can update the information
  @EditContactinformation
  Scenario: edit contact information
    When I clicked on edit button for Contact Information
    And I update field values for Contact Information
    Then I validate updated values in View Contact Information Page

  #IC-35 As a System User I want to Add the Service User's 'Contact Information' so that I can create contact details of that service user
  @AddContactinformation
  Scenario: Add Contact Information  Structure List
    When I click on Add button for Contact Information
    And I inserted field values for Contact Information
    Then I validate inserted values in View Contact Information Page with Outbound XML
