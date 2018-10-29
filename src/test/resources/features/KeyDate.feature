#Author: vikram.singh@meganexus.com
@keyDate @sprint18
Feature: KeyDate page testing

  Background:
  Given As a Case Manager I want to login to neo_tr with valid credentials
  And I select specific offender with name "" or crnNo and clicked on goto button for required offender from Service user page
  And I view Event details page
  
  @addKeyDate
  Scenario: Verify Case Co-ordinator able to Add KeyDate by inserting all the mandatory field
    Given I navigate to throughcare page
    And I navigate to KeyDate page
    When I add KeyDate with all the mandatory fields
    And I validate KeyDate records should be on ui

  @listViewKeyDate
  Scenario: Verify User able to see Details view page of KeyDate.
    When I view list of KeyDate

  @editKeyDate
  Scenario: Verify Edit KeyDate
    When I edit KeyDate
    And I view list of KeyDate record after update

  @deletKeyDate
  Scenario: Verify User able to delete KeyDate
    When I delete KeyDate
    And I validate KeyDate records should not be on ui
