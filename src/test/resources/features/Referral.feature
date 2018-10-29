#Author: amardeep.patil@meganexus.com
@Sprint-16 @Referral 
Feature: Referral Page Testing 

Background: 

    Given As a Case Manager I want to login to neo_tr with valid credentials
    And I select specific offender with name " " or crnNo and clicked on goto button for required offender from Service user page
    And I navigate to Referral page
    

    #IC-2398 As a Case Manager I want to view a list of referrals so that I can select a referal to view, edit or delete.
    @viewReferralList @regression 
    Scenario: View Referral Structure list
	  Then I validate referral list and one referral should be present on ui
    #And I click on back button on referral Tab 

    #IC-2397 As a Case Manager I want to view a referral so that I can see the request for an assessment for a SU
    @viewReferralDetails @regression 
    Scenario: View referral structure from inbound xml 
	  When I view referral details
#	  # I validate using inboundXML 
	  Then I validate referral record should be on ui  
#	  And I click on back button on view referral screen 

   
    #IC-2395 As a Case Manager I want to add a referral so that I can ask a provider to assess a service user.
    #@addReferral @regression
    #Scenario: Add Referral Structure List
    #When I click on add button for Referral
    #And  I verify field labels 
    #And I add field values for Referral and submit
    #Then I verify navigation to Referral list page
    #
#
#	  #IC-2395 As a Case Manager I want to add a referral so that I can ask a provider to assess a service user.
    #Negative scenario: for error message in add page
    #@errorMsgReferralAdd
    #Scenario: Verifying error message in Add Referral Structure List
    #When I click on add button for Referral
    #Then I add invalid values and submit
    #And verify error messages displayed on add ReferralUI
    #And I click on Cancel button
#	  Then I verify navigation to Referral list page
#	  
#	  #IC-2396 As a Case Manager I want to edit a referral so that I can update the request for a service provider to assess a service user
    #@editReferral @regression
    #Scenario: Edit Referral Structure List
    #When I click on edit button for Referral
    #And  I verify field labels 
    #And I edit field values for Referral and submit
    #Then I verify navigation to Referral list page
#	 
   # Negative scenario: for error message in Edit page
    #IC-2396 As a Case Manager I want to edit a referral so that I can update the request for a service provider to assess a service user
    #@errorMsgReferralEdit
    #Scenario: Verifying error message in Edit Referral Structure List
    #When I click on edit button for Referral
    #Then I edit invalid values and submit
    #And verify error messages displayed on edit ReferralUI
    #And I click on Cancel button
    #Then I verify navigation to Referral list page
    #
    # IC-2400 As a Case Cordinator I want to delete a referral so that I can remove incorrect information
     #@deleteReferral
     #Scenario: Delete Referral and validate it on list & with DEL Outbound XML 
     #Given As a Case Manager I want to login to neo_tr with valid credentials
     #When I delete referral details 
     #Then I validate referral record should be delete on ui 
   #	# And  I validate referralDel outboundXML
 