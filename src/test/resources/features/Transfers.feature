#Author: pavan.sharma@meganexus.com
Feature: Transfer Out Request page testing
Background: 
Given As a Case Manager I want to login to neo_tr with valid credentials
And I select specific offender with name "" or crnNo and clicked on goto button for required offender from Service user page

#IC-2330 - Create or send Transfer Out Request
@listViewTransferOut
 Scenario: List View Transfer Request
 When I navigate to Transfers page
 And  I expand Transfer Out Request
 Then I verify list view of TransferOut Request
 And Transfer case component from Transfer Out Request list
   
#IC-2743 Amend Transfer Reason for Pending Transfer Out Request
@AmendTransferOutReason
Scenario: Verify Amend Transfer Out Request 
When I navigate to Transfers page
And  I expand Transfer Out Request
Then I navigate to Edit Withdraw TransferRequest
Then Amend Transfer Out Request reason  


#IC-2344 -Withdraw Pending Transfer Out Request
@WithdrawTransferOut
Scenario: Verify Withdraw Transfer Out Request 
When I navigate to Transfers page
And  I expand Transfer Out Request
Then I navigate to Edit Withdraw TransferRequest
And Withdraw Transfer Out Request 


#IC-2328 - Transfer Out History
@TransferOutHistory
Scenario: Verify Transfer Out History page
When I navigate to Transfers page
Given I expand Transfer Out History
Then I verify list view of Transfer Out History


