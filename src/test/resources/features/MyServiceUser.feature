# #Author: Vikram.boinapalli@meganexus.com 
@MyServiceUsers  @smoke
Feature:  My Service Users page  Testing

	@viewMyserviceUsersList
	Scenario: View My Service Users list
    	Given As a Case Manager I want to login to neo_tr with valid credentials
      		| Fields   | Value     |
      		| UserName | mer_case_manager |
      		| Password | neo_admin |
      		
    	When I select offender with name "" or crnNo "B974109" 
    	Then I validate MyserviceusersList 
    	#And  all the serviceUSers need to assign to me 