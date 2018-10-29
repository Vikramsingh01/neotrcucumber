#Author: vartika.varma@meganexus.com
@communityRequirementManager
Feature: Community Requirement Manager testing

  @viewCommunityRequirement
  Scenario: View community requirement manager
    Given As a user I want to login to neo_tr with valid credentials
      | Fields   | Value     |
      | UserName | neo_admin |
      | Password | neo_admin |
    And I select offender with name "Dravid 1" or crnNo "V090101" and selected offender from Service user
    And I view communityRequirement details
    When I view CommunityRequirementManager details
    Then I validate CommunityRequirementManager record should be on ui