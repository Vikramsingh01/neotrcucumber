@alias @sprint14
Feature: Alias Page Testing 

Background: 
    Given As a Case Manager I want to login to neo_tr with valid credentials
    And I select specific offender with name "" or crnNo and clicked on goto button for required offender from Service user page
    And I navigate to Profiles tab

#@viewAliasList @regression
  Scenario: View Alias Structure list
	Then I validate aliasList and one aliasRecord should be present on ui 
	
#@viewAliasDetails @regression
Scenario: View Alias Structure Details and validate data with Inbound XML
	When I view alias details of corresponding offender 
	Then I validate aliasStructure values with the inboundXML 
	And I click on back button on view alias screen 
	
#@editAliasStructure @regression
Scenario: Edit Alias structure and verify it on list & validate UPD Outbound XML
	When I update aliasStructure on UI 
	And I view alias details of corresponding offender 
	Then I validate aliasRecord with updated data should be on ui 
	And  I validate aliasUPD outboundXML
	
@deleteAliasStructure @regression
Scenario: Delete Alias Record and validate it on list & with DEL Outbound XML 
	When I delete aliasRecord from UI 
	Then I verify whether aliasRecord is deleted from aliasList 
 	And  I validate aliasDEL outboundXML
	
@addAliasStructure
Scenario: Add Alias structure and validate it on UI & with INS Outbound XML 
	When I add aliasStructure to corresponding offender 
	And I view alias details of corresponding offender 
	Then I validate newly added aliasRecord should be on ui 
	And I validate aliasINS outboundXML	
	
#Negative testing scenarios
#@addAliasStructureValidations 
Scenario: Verify all business rules and validations applied on Add Alias screen 
	When I view add Alias screen and verify all labels 
	And I enter invalid values in all the inputs 
	Then I verify all the validation messages on ui 

#@editAliasStructureValidations 
Scenario: Verify all business rules and validations applied on Add Alias screen
	When I view edit Alias screen and verify all labels 
	And I enter invalid values in all the inputs 
	Then I verify all the validation messages on ui