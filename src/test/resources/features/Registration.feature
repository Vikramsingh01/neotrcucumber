#Author: yogesh.sonar@meganexus.com
@registration
Feature: Registration Testing

  #Background: 
    #Given As a Case Manager I want to login to neo_tr with valid credentials
    #And I select specific offender with name "" or crnNo and clicked on goto button for required offender from Service user page
    #And I navigate to view Contact Information Page
     
  @addRegistration
  Scenario: Add Registration
    #When I click on R button
    Then I click on Add Regsitration button
    And  I add RegistrationStructure to corresponding offender  

   #@viewRegistrationTable
  #Scenario: View Registration
    #When I click on R button
    #Then I click on Registration link
    #And I validate the Registration listing Table 
#
  #@editRegistration
  #Scenario: Edit Registration
    #Given As a user I want to login to neo_tr with valid credentials
      #| Fields   | Value     |
      #| UserName | neo_admin |
      #| Password | neo_admin |
    #And I select offender with name "" or crnNo "T012396" and selected offender from Service user
    #When I edit registrationStructure details
    #And I view registrationStructure details
    #Then I validate registrationStructure record should be present on ui
#
  #@deleteRegistration
  #Scenario: Delete Registration
    #Given As a user I want to login to neo_tr with valid credentials
      #| Fields   | Value     |
      #| UserName | neo_admin |
      #| Password | neo_admin |
    #And I select offender with name "" or crnNo "T012396" and selected offender from Service user
    #When I delete registrationStructure details
    #Then I validate registrationStructure record should be deleted from ui