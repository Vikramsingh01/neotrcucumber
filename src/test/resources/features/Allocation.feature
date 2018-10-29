#Author: pavan.sharma@meganexus.com

@alloct
Feature: Component Allocation page testing 
Background: 
Given As a PSC_Admin I want to login to neo_tr with valid credentials
#When I navigate to pending transfer page


#IC-17 - As a PSC Administrator I want to allocate Service User(s) to System Users so that I can start the process of Case Management
@listAllocation
 Scenario: List View Pending Transfer 
 #When I verify list view of Pending Transfer
 And I navigate to Allocation tab on Components to Allocate page
 And  I verify Address Registration and Component section
 Then I navigate to Componet Allocation page
 And I Accept Component
 And I Reject Component

