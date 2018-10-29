#Author: pavan.sharma@meganexus.com
#Sprint-16
@TransferOut
Feature: Transfer out request page testing

 Background: 
    Given As a Case Manager I want to login to neo_tr with valid credentials
    #And I select specific offender with name "" or crnNo and clicked on goto button for required offender from Service user page
    
#	IC-2329 As a PSC Case Co-ordinator I want to view a list of Transfer-out Requests so that I can monitor their status
			  
@listViewTransferOut @regression
Scenario: List view of Transfer Out
Given I navigate to Transfer Out Request view page
Then I validate list view of Tranfer Out Request
And I validate Search Tranfer Out Request

#	@SearchTransferOutRequest @regression
#	Scenario: Search Transfer Out Request
#	Given I navigate to Transfer Out Request view page
#	Then I validate Search Tranfer Out Request



