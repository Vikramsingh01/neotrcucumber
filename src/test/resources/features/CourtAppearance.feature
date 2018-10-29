#Author: Sanket.Biraje@Meganexus.com
#Sprint17

@courtAppearance
Feature: Court Appearance testing

Background: 
    Given As a Case Manager I want to login to neo_tr with valid credentials
    And I select specific offender with name "" or crnNo and clicked on goto button for required offender from Service user page

	#IC-121 As a Case Manager I want to view list of Court Appearances
  #IC-123 As a Case Manager I want to view an individual Court Appearance
  @viewCourtAppearance @regression
  Scenario: View Court Appearance
    When I view Court Appearance page
    Then I validate list view of Court Appearances
    And I validate detailed view of individual Court Appearance