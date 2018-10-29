#@rateCardIntervention @smoke
#Feature: Rate Card Intervention Page Testing
#
#	@viewRateCardList
#	Scenario: View Rate Card Intervention list
#	 Given As a user I want to login to neo_tr with valid credentials
      #| Fields   | Value     |
      #| UserName | neo_admin |
      #| Password | neo_admin |
    #When I select offender with name "" or crnNo "X012396" and selected offender from Service user
    #Then I validate rateCardList and one rateCardRecord should be present on ui
#
  #@viewRateCardDetails
  #Scenario: View Rate Card Detail and validate with Inbound XML
    #Given As a user I want to login to neo_tr with valid credentials
      #| Fields   | Value     |
      #| UserName | neo_admin |
      #| Password | neo_admin |
    #And I select offender with name "" or crnNo "X012396" and selected offender from Service user
    #When I view ratecard details to corresponding offender
    #Then I validate ratecard structure values with the inboundXML
#		 #Validate with inbound XML
    #And I click on back button on view rate card screen
    # Navigation Testing
#
  #@editRateCardStructure
  #Scenario: Edit Ratecard details and verify it on list & validate DEL Outbound XML
    #Given As a user I want to login to neo_tr with valid credentials
      #| Fields   | Value     |
      #| UserName | neo_admin |
      #| Password | neo_admin |
    #And I select offender with name "" or crnNo "X012396" and selected offender from Service user
    #When I update rate card structure on UI
    #Then I validate rateCardRecord with updated data should be on ui
    #when I Validate update data is reflected on UI
    #And  I validate rateCardUPD outboundXML
  #
  #@deleteRateCardStructure
  #Scenario: Delete Ratecard Record and validate it on list & with UPD Outbound XML
    #Given As a user I want to login to neo_tr with valid credentials
      #| Fields   | Value     |
      #| UserName | neo_admin |
      #| Password | neo_admin |
    #And I select offender with name "" or crnNo "X012396" and selected offender from Service user
    #When I delete rateCardRecord from UI
    #Then I verify whether rateCardRecord is deleted from rate card list 
    #And  I validate rateCard DEL outbound xml
#
    #@addRateCard
#	  Scenario: Add Rate card structure and validate it on UI & with INS Outbound XML
#	  Given As a user I want to login to neo_tr with valid credentials
#		  | Fields   | Value       |
#		  | UserName | WYSuperUser |
#		  | Password | neo_admin   |
#	  And I select offender with name "" or crnNo "X012396" and selected offender from Service user
#	  When I add ratecard to corresponding offender
#	  And I view ratecard details to corresponding offender
#	  Then I validate newly added ratecardRecord should be on ui
#	  And I validate ratecardINS outbound xml
#
# Negative testing scenarios
#	@addRateCardStructureValidations
  #	Scenario: Verify all business rules and validations applied on Add Rate Card screen
  #	  	Given As a user I want to login to neo_tr with valid credentials
  #			| Fields   | Value       |
  #			| UserName | WYSuperUser |
  #			| Password | neo_admin   |
  #		And I select offender with name "" or crnNo "X012396" and selected offender from Service user
  #		When I view add Rate card screen
  #		And I enter invalid values in all the inputs
  #		Then I verify all the validation messages on ui
  #
#@editRatecardStructureValidations
  #	@Scenario: Verify all business rules and validations applied on Add Ratecard screen
  #	  	Given As a user I want to login to neo_tr with valid credentials
  #			| Fields   | Value       |
  #			| UserName | WYSuperUser |
  #			| Password | neo_admin   |
  #		And I select offender with name "" or crnNo "B974109" and selected offender from Service user
  #		When I view edit Ratecard screen and verify all labels
  #		And I enter invalid values in all the inputs
  #		Then I verify all the validation messages on ui