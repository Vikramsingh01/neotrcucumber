#Author: amardeep.patil@meganexus.com
@licenseCondition @smoke
Feature: Crud operation for License Condition Testing

    Background: 
    Given As a Case Manager I want to login to neo_tr with valid credentials
    And I select specific offender with name "" or crnNo and clicked on goto button for required offender from Service user page
    And I navigate to view Contact Information Page
     
  @addLicenseCondition
   Scenario: Add Lincese Condition 
   When I add LicenseCondition to corresponding offender
   And I view LicenseCondition details
   Then I validate LicenseCondition record should be on ui

   @viewLicenseCondition
   Scenario: View Lincese Condition     
   When I clicked on event tab and view the event details, if event is availavble on UI
   And I view LicenseCondition details
   Then I validate LicenseCondition record should be on ui

    @editLicenseCondition
    Scenario: Edit Lincese Condition 
    When I edit LicenseCondition details
    And I view LicenseCondition details
    Then I validate LicenseCondition record should be on ui

    @deleteLicenseCondition
    Scenario: Delete Lincese Condition
    When I delete LicenseCondition details
    Then I validate LicenseCondition record should be delete on ui
