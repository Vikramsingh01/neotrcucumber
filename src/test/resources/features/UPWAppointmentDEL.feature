#Author: anuranjan.kumar@meganexus.com
@UpwAppointmentDelete @Sprint19
Feature: UpwAppointment Delete Testing

  Background: 
		Given As a Case Manager I want to login to neo_tr with valid credentials
		And I navigate to UNPAID WORK tab
		
		#IC-3646: As a Case Co-Ordinator I want to delete an UPW Appointment so that I can remove it from the service users Plan
		@AppointmentDelete
		Scenario: Delete an UPW appointment from Project Attendence list
		  When I click on UPW Prject Diary collapsible link
		  Then I validate the Search filter and search the appointment list
			And I select one appointment and click on View button
		  And I click on delete button and click on Ok pop-up
	  
		