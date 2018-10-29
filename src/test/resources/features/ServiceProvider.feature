#Author: Spiral Sprint14
@serviceprovider
Feature: Service Provider Structure Testing

#Negative testing scenarios
    @addServiceProviderErrorValidations
  	Scenario: Add Service Provider structure with invalid data and validate error messages on UI 
  	Given As a Case Manager I want to login to neo_tr with valid credentials
  		| Fields   | Value       |
  		 | UserName | neo_admin |
  	  | Password | neo_admin   |
  		And I click on Directory of Services Maintenance tab	
  		When I click on Add button on Service Provider Page.
  		And I try to add a Service Provider Structure to Service Providers Page by providing invalid data
  		Then I verify Error Messages displayed on Add ui
  		And I click on Cancel button	
  		
  	#Positive testing scenarios
    @addServiceProviderRecord
  	Scenario: Add Service Provider structure and validate it on UI 
  		Given As a Case Manager I want to login to neo_tr with valid credentials
  			| Fields   | Value       |
  			| UserName | neo_admin |
  			| Password | neo_admin   |
  		And I click on Directory of Services Maintenance tab	
  		When I click on Add button on Service Provider Page.
  	  And I validate all fields labels on add service provider page.
  		Then I add a Service Provider Structure by providing valid data
  		And I validate Service provider details displayed on ui

  		
  		#Negative testing scenarios
    @editServiceProviderErrorValidations
  	Scenario: Edit Service Provider structure with invalid data and validate error messages on UI 
  		Given As a Case Manager I want to login to neo_tr with valid credentials
  		  | Fields   | Value       |
  			| UserName | neo_admin |
  			| Password | neo_admin   |
     	And I click on Directory of Services Maintenance tab
  		When I search a service provider by name	
  		And I try to edit a Service Provider Structure by providing invalid data
  	#	Then I verify Error Messages displayed on Edit ui
  		And I click on Cancel button
  		
  		
  	#Positive testing scenarios
    @editServiceProviderRecord
  	Scenario: Edit Service Provider structure and validate it on UI 
  	Given As a Case Manager I want to login to neo_tr with valid credentials
  			| Fields   | Value       |
  			| UserName | neo_admin |
  			| Password | neo_admin   |
  		And I click on Directory of Services Maintenance tab
  		When I search a service provider by name
  		Then I validate all fields labels on edit service provider page
  		And I edit the required Service Provider record by providing valid data
  	#	And I validate Edited Service provider details displayed on ui
    #	And I click on back button on List of Service Provider screen