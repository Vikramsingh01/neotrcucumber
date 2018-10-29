#Author: anuranjan.kumar@meganexus.com
@UpwProjectDiary @Sprint18
Feature: UpwPrjectDiary Page Testing

  Background: 
		Given As a Case Manager I want to login to neo_tr with valid credentials
		And I navigate to UNPAID WORK tab

  #IC-2801: As a PSC Case Coordinator I want to view a list of UPW Appointments on a specific day so that I can view, edit and add outcomes
  @UpwProjectDiaryList
  Scenario: View UPW Prject Diary Page
	  When I click on UPW Prject Diary collapsible link
	  Then I validate the Search filter and search the appointment list
	  And I validate the labels of UPW Prject Diary
	  And I validate list of UPW Appointments
 
  #IC-2354: As a Case Coordinator I want to view a Project Session Attendance list so that I can print it for the Supervisor.
  @ProjectAttendancelist
  Scenario: View Project Attendance list 
    When I navigate to project diary page 
    Then I validate the Search filter and search the appointment list
    And I select one appointment and click on View button
    And I validate labels on Project Attendance list Page
    And I validate Project Attendance list
    
  #IC-2447: As a PSC Case Coordinator I want to add an UPW Project Session Outcome for multiple Service Users so I can record attendance and compliance
  @UpwProjectBulkUpdate   @Sprint20
   Scenario: View UPW Prject Diary Page
	  When I click on UPW Prject Diary collapsible link
	  Then I validate the Search filter and search the appointment list
	  And I select one appointment and click on Edit button
	  And I validate the labels on UPW Project Session Outcome page
	  And I update the details and click on Bulk Update button 
  
  
  