#Author: yogesh.sonar@meganexus.com
@registrationReview
Feature: Registration Review Testing

  @addRegistrationReview
  Scenario: Add Registration Review
    Given As a user I want to login to neo_tr with valid credentials
      | Fields   | Value     |
      | UserName | neo_admin |
      | Password | neo_admin |
    And I select offender with name "" or crnNo "T012396" and selected offender from Service user
	And I view registrationStructure details
    When I add registrationReviewStructure to corresponding offender
    And I view registrationReviewStructure details
    Then I validate registrationReviewStructure record should be present on ui

  @viewRegistrationReview
  Scenario: View Registration Review
    Given As a user I want to login to neo_tr with valid credentials
      | Fields   | Value     |
      | UserName | neo_admin |
      | Password | neo_admin |
    And I select offender with name " " or crnNo "T012396" and selected offender from Service user
	And I view registrationStructure details
    When I view registrationReviewStructure details
    Then I validate registrationReviewStructure record should be present on ui

  @editRegistrationReview
  Scenario: Edit Registration
    Given As a user I want to login to neo_tr with valid credentials
      | Fields   | Value     |
      | UserName | neo_admin |
      | Password | neo_admin |
    And I select offender with name "" or crnNo "T012396" and selected offender from Service user
	And I view registrationStructure details
    When I edit registrationReviewStructure details
    And I view registrationReviewStructure details
    Then I validate registrationReviewStructure record should be present on ui

  @deleteRegistrationReview
  Scenario: Delete Registration
    Given As a user I want to login to neo_tr with valid credentials
      | Fields   | Value     |
      | UserName | neo_admin |
      | Password | neo_admin |
    And I select offender with name "" or crnNo "T012396" and selected offender from Service user
	And I view registrationStructure details
    When I delete registrationReviewStructure details
    Then I validate registrationReviewStructure record should be deleted from ui