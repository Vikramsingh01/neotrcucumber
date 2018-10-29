#Author: tapan.sahoo@meganexus.com
@pendingTP 
Feature: Pending Transfer page testing

  #@pendView
  #Scenario: Verifying field value for pending transfer page
  #Given As a Case Manager I want to login to neo_tr with valid credentials
  #| Fields   | Value            |
  #| UserName | mer_case_manager |
  #| Password | neo_admin        |
  #When I navigate to pending transfer page
  #Then I validate OM Transfer Request field value
  #And I validate OS Transfer Request field value
  #And I validate RQ Transfer Request field value
  #And I validate LC Transfer Request field value
  #And I validate PSS Transfer Request field value
  #And I validate NSI Transfer Request field value
  #And I validate CR Transfer Request field value
  #And I validate IR Transfer Request field value
  @accept @regression
  Scenario: accept an offender from pending transfer page
    Given As a PSC_Admin I want to login to neo_tr with valid credentials
    When I navigate to pending transfer page
    And I verify list view of Pending Transfer
    And I accept offender from pending transfer page
    Then I validate Offender should be Accepted
  #@reject
  #Scenario: reject an offender from pending transfer page
    #Given As a user I want to login to neo_tr with valid credentials
    #When I reject offender from pending transfer page
    #Then I validate Offender should be rejected
