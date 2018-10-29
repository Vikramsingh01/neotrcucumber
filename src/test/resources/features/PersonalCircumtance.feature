#Author: yogesh.sonar@meganexus.com
@Sprint-14 @PersonalCircumtance 
Feature: Personal Circumtance Page Testing 

Background: 
    Given As a Case Manager I want to login to neo_tr with valid credentials
    And I select specific offender with name "" or crnNo and clicked on goto button for required offender from Service user page
    When I navigate to Personal Circumstance Tab

#IC-119 As a System User I want to view a list of personal circumstances so that I can see all the records of the Service users education, employment and health
@viewPersCircumList @regression 
Scenario: View Personal Circumtance Structure list
	Then I validate personalCircumtance list and one personalCircumtance should be present on ui
	And I click on back button on Personal Circumstance Tab 

#IC-120 As a System User I want to view a personal circumstance so that I can see the detail of the Service users education, employment and health
@viewPersCircumDetails @regression 
Scenario: View Personal Circumtance structure from inbound xml 
	And I view PersonalCircumtance details
	#Validate using inboundXML 
	Then I validate PersonalCircumtance record should be on ui  
	And I click on back button on view personalCircumtance screen 

#IC-36 As a System User I want to edit the Service Users Personal Circumstances so that I can update the information on health, education and employment
@editPersonalCircumtanceStructureValidations 
Scenario: Verify all business rules and validations applied on Edit Personal Circumtance screen
	When I view edit PersonalCircumtance screen and verify all labels 
	And I enter invalid PersonalCircumtance values in all the inputs 
	Then I verify all the PersonalCircumtance validation messages on ui

##IC-36 As a System User I want to edit the Service Users Personal Circumstances so that I can update the information on health, education and employment	
@editPersCircum @regression
Scenario: Edit Personal Circumtamce and verify it on list & validate UPD Outbound XML
	And I edit PersonalCircumtance details 
	And I view PersonalCircumtance details 
	Then I validate PersonalCircumtance record should be on ui 
	#And I validate PersonalCircumtanceUPD outboundXML
#
##IC-51 As a System User I want to add a personal circumstance so that I can keep a record of the Service users education, employment and health
##@addPersonalCircumtanceStructureValidations
##Scenario: Verify all business rules and validations applied on Add Personal Circumtance screen
##	When I view add PersonalCircumtance screen and verify all labels 
##	And I enter invalid PersonalCircumtance values in all the inputs 
##	Then I verify all the PersonalCircumtance validation messages on ui 
#
##IC-51 As a System User I want to add a personal circumstance so that I can keep a record of the Service users education, employment and health
#@addPersCircum @regression
#Scenario: Add Personal Circumtance and validate it on UI & with INS Outbound XML 
#	And I add PersonalCircumtance to corresponding offender
#	And I view PersonalCircumtance details 
#	Then I validate PersonalCircumtance record should be on ui 
#	#And I validate PersonalCircumtanceINS outboundXML	

#As a System Administrator I want to delete a Service Users Personal Circumstance so that I can remove erroneous
@deletePersCircum @regression
Scenario: Delete Personal Circumtance and validate it on list & with DEL Outbound XML 
	Given As a Case Manager I want to login to neo_tr with valid credentials
	When I delete PersonalCircumtance details 
	Then I validate PersonalCircumtance record should be delete on ui 
	#And  I validate PersonalCircumtanceDEL outboundXML
