#Author: tapan.sahoo@meganexus.com.com
@tag
Feature: Sent Court work to PSC_Admin

  @courtworkCM
  Scenario: Add court work by Case Manager
    Given As a Case Manager I want to login to neo_tr with valid credentials
    And I select specific offender with name "" or crnNo and clicked on goto button for required offender from Service user page
    When I view Event details page
    And I clicked on court work tab in CM Page
    And I sent request for court work to PSC_Admin
    Then I validate court work request added in list view of court work log

  @courtworkPSC
  Scenario: Validate Court work request in PSC_Admin which is sent by Case Manager
    Given As a PSC_Admin I want to login to neo_tr with valid credentials
    When I clicked on court work tab in PSC Admin Page
    Then I validate Court work request which is sent by Case Manager

  @courtworkPSC
  Scenario: Validae Court work request in PSC_Admin which is sent by Case Manager
    Given As a PSC_Admin I want to login to neo_tr with valid credentials
    When I clicked on court work tab in PSC Admin Page
    And I clicked on edit button for court work request
    And I enter required data and attached document and clickon submit button
    Then I verifed inserted data for courk work request
