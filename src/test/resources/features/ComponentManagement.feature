#Author: pavan.sharma@meganexus.com



@componentmnt
Feature: Component Management for reallocation team and officer testing 
Background: 
Given As a Case Manager I want to login to neo_tr with valid credentials
And I select specific offender with name "" or crnNo and clicked on goto button for required offender from Service user page

#IC-5193
@Reallocation
 Scenario: List View Pending Transfer 
 When I navigate to Component Management page
 And  I verify field list of Component Management 
 Then I want verify to Reallocate components

