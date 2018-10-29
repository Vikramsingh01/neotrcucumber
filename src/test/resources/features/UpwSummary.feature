#Author: ankita.sogani@meganexus.com
@UpwSummary @Sprint17
Feature: UpwSummary Page Testing

  Background: 
   Given As a Case Manager I want to login to neo_tr with valid credentials
    And I select specific offender with name "" or crnNo and clicked on goto button for required offender from Service user page
    And I navigate to Plan tab
    And I navigate to UPW tab
    

  #IC-2518: As a Case Manager I want to view a summary of the UPW ordered so that I can track the progress of UPW activities in the plan
  #IC-3676: As a Case Manager I want to view a list of UPW Details so that I can see what current events have UPW requirement(s) they have to complete.
  @UpwSummary
  Scenario: View UPW Summary Page
  When I validate the labels of UPW Summary
  Then I validate list of UPW Details
  And I validate the value present with inbound xml
 
 #IC-3190: As a Case Manager I want to edit the summary of the UPW ordered so that I can track the progress of UPW activities in the plan
 #Sprint18 #IC-5349: As a Case Manager I want to keep the UPW Details up to date so that I can keep up to date information about the UPW Order
  @EditUPWDetails
  Scenario: Edit UPW Summary(UPW detail) and validate it with Outbound XML
    When I click edit UPW Summary button
    And I validate labels on Edit UPW Summary Page
    And I edit details of UPW Summary Page
    And I click on Submit button
    And I click on View button for last edited UPW Summary
    And I validate the edited record on UI with OUTBOUND XML of UPW details
   
 
#IC-3636: As a Case Manager I want to view UPW Details so that I have full information about the hours the SU has to complete.
 @ViewUPWDetailsWithInboundXML
  Scenario: View UPW Summary(UPW detail) and validate it with Inbound XML
  When I click on View UPW Summary button
  And I validate labels on View UPW Summary Page
  And I validate details with Inbound XMLs
  

  