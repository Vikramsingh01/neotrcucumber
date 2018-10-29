#Author: your.amardeep.patil@meganexus.com
Feature: Generate Letter Page Testing 

Background: 
    Given As a Case Manager I want to login to neo_tr with valid credentials
    And I select specific offender with name "" or crnNo and clicked on goto button for required offender from Service user page
    When I navigate to Plan Tab

#IC-5466 All letters need to be accessible from the Plan Entry Structure so that they are easily available in one place
@generateLeter @regression 
Scenario: Generate Letter from Plan Entry
	When I click on Generate Letter button on Plan Entry list screen
  #And I Generate selected Letter 
  And I upload generated letter from Local machine to DRS
  Then I navigate to plan entry list screen


