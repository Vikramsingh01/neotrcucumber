#Author: Abhijit.Behuria@meganexus.com
@smoke @regression
Feature: Service User Profile Page testing

  Scenario: View Service User Profile
    Given As a user I want to login to neo_tr with valid credentials
      | Fields   | Value     |
      | UserName | neo_admin |
      | Password | neo_admin |
    When I select offender with name "" or crnNo "B972703" and selected offender from Service user
    Then I Validate fields in Service User profile Page with reference to xml.
    Then I able to Edit offender details click on edit button.
