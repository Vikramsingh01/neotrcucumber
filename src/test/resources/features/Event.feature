#Author: tapan.sahoo@meganexus.com
#@event  @smoke
#Feature: Event Page Testing
#
  #@regression
  #Scenario:  View Event
    #Given As a user I want to login to neo_tr with valid credentials
      #| Fields   | Value       |
      #| UserName | WYSuperUser |
      #| Password | neo_admin   |
    #And I select offender with name "Testing" or crnNo "" and selected offender from Service user
    #When I clicked on event tab and view the event details, if event is availavble on UI
    #Then I should view the event details
    #Then I Validate field lables and field value in Event Page with reference to xml.
    
#Sprint-15
@Event
Feature: Event Page Testing

  Background: 
    Given As a Case Manager I want to login to neo_tr with valid credentials
    And I select specific offender with name "" or crnNo and clicked on goto button for required offender from Service user page
    And I navigate to view List of Events table
    
 #IC-122 As a Case Manager I want to view an individual Event and list of requirements so that 
 #I can view up to date information about the Service User
  @listViewEvent @regression
  Scenario: List View Event
    When I view Event details page
    Then I validate Event details 
    And I validate Back navigation
    
 #IC-124 As a Case Manager I want to view a list of Requirements so that 
 #I can view up to date Requirement information about the Service User
  @listViewRequirement @regression
  Scenario: List View Requirements
    When I view List of Requirements page
    Then I validate List of Requirements
  
  
  
  