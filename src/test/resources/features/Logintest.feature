#Author: tapan.sahoo@meganexus.com
@login
Feature: neo_tr: login page testing

  Scenario Outline: Login to cms application with multiple user
    Given As a Case Manager I want to login to neo_tr with valid Username"<username>" and Password "<password>"
    Then I validate user able to login to the application

    Examples: 
      | username                  | password            |
      | psc_administrator         | Pa$$w0rd@PscAdmin   |
      | merseyside.casemanager    | Pa$$w0rd@MerCM      |
      | westyorkshire.casemanager | Pa$$w0rd@WestYork   |
      | humberside.casemanager    | Pa$$w0rd@Humberside |
      | cheshire.casemanager      | Pa$$w0rd@Cheshire   |
      | hampshire.casemanager     | Pa$$w0rd@Hampshire  |
