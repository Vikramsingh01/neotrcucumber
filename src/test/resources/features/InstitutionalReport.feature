#Author: tapan.sahoo@meganexus.com

@institutionalreport @sprint18
Feature: Institutional Report page testing

  Background:
  Given As a Case Manager I want to login to neo_tr with valid credentials
  And I select specific offender with name "" or crnNo and clicked on goto button for required offender from Service user page
  And I view Event details page
  
  @addInstitutionalReport
  Scenario: Verify Case Co-ordinator able to Add Institutional report by inserting all the mandatory field
    Given I navigate to throughcare page
    And I navigate to institutional report page
    When I add Institutional Report with all the mandatory fields
    And I validate Institutional Report records should be on ui

  
  @viewInstitutionalReport
  Scenario: Verify User able to see Details view page of Institutional Report.0
    When I view Institutional Report record
   # Then I validate Institutional Report details
   # And I validate Back for Institutional Report page

  @editInstitutionalReport
  Scenario: Verify Edit Institutional report
    When I edit Institutional Report
    And I view Institutional Report record after update
    #Then I validate  updated Institutional Report should be on ui
    
    @deletInstitutiaonReport
    Scenario: Verify User able to delete Institutional Report
    When I delete Institutional Report
    And I validate Institutional Report records should not be on ui