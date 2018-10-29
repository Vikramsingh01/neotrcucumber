 #Author: ankita.sogani@meganexus.com
@UpwSummary @Sprint17
 Feature: UpwAppointment Page Testing
 
  Background: 
   Given As a Case Manager I want to login to neo_tr with valid credentials
    And I select specific offender with name "" or crnNo and clicked on goto button for required offender from Service user page
    And I navigate to Plan tab
    And I navigate to UPW tab

 #IC-3264: As a Case Manager I want to schedule a single UPW Appointment so that I can manage the Service Users UPW Requirement for past date
  @ScheduleADDSingleUPWAppointment
   Scenario: Schedule UPW Appointment and Validate on UI and Outbound XML
    When I click on view UPW Summary
    Then I click on Add Single button
    And I validate the labels of Add Single Schedule UPW Appointment Page
    And I add details of Add Single Schedule UPW Appointment Page for Attended Complied outcome
    And I click on Add Single Save button
    And I click on View button for last added Appointment
    And I validate the appointment record on UI
   # And I validate the OUTBOUND XML of ADD Single UPW Appointment
    
    
#  IC-2759: As a Case Manager I want to schedule Recurring UPW Appointments so that I can manage the Service Users UPW Requirement
  @ScheduleRecurringUPWAppointment
   Scenario: Schedule Recurring UPW Appointment and Validate on UI and Outbound XML
    When I click on Add Recurring button
    Then I validate the labels of Schedule Recurring UPW Appointment Page
    And I add details of Schedule Recurring UPW Appointment Page
    And I click on View button for last added Appointment
    And I validate the record on UI
 #   And I validate the OUTBOUND XML of UPW Appointment

 # IC-2787: As a Case manager I want to see a list of UPW Appointments for a service user so that I can select an entry to view or edit.
  @ListOfUpwAppointment
   Scenario: view List of Appointments
    When I verify the UPW Appointment filters
    And I click On search button
    Then I verify the UPW Appointment columns
    And I verify the UPW Appointment with inbound XML
    
    #IC-3647: As a Case Manager I want to Edit an UPW Appointment so I can amend the outcome of an appointment 
   @EditUPWAppointment  @Sprint18
   Scenario: Edit UPW Appointment and Validate on UI and Outbound XML
    When I click on Edit button
    Then I validate the labels of Edit UPW Appointment Page
    And I edit details of UPW Appointment Page
    And I click on Submit button
    And I click on View button for last updated Appointment
    And I validate the edited record on UI 
    And I validate the OUTBOUND XML of Edit UPW Appointment
