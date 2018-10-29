#Author: Anuja.divalkar@meganexus.com
#@sprint17
Feature: view listing of document.

  Given As a Case Manager I want to login to neo_tr with valid credentials  
  And I select specific offender with name "" or crnNo and clicked on goto button for required offender from Service user page   
  And I navigate to document button of main navigation of service user page.     
 

  #IC-2279 As a Case Manager I want to view a list of documents so that I can see the documents associated with a Service User  
  #@ViewListDocuments  
  Scenario: View list of document structure.   
  When I click on document button on main navigation of service user.    
  Then I validate all list field on document structure.


  #IC-4315 As a System User I want filter a document using field entity type.
  #@Documentfilterentitytype
  Scenario: filter a document using entity field.
  When I click on entity type & select a value from filter field.
  Then I click on search button on document structure.
  And validate the record on document listing page. 

  #IC-4379
  #As a System User I want filter a document using field linked_to
  #@Documentfilterlinked
  Scenario: Verify filter a document using linked_to field.
  When I click on linked_to & select a value from filter field.
  Then I click on search button on document structure.
  And validate the record on document listing page. 
  
  #IC-4383 As a System User I want filter a document using field reletes_to
  #@Documentfilterreletes
  Scenario: Verify filter a document using reletes_to field.
  When I click on reletes_to & select a value filter filter field.
  Then I click on search button on document structure.
  And validate the record on document listing page.

  #IC-4392 As a System User I want to download a document.
  #@DownloadDocument.
  Scenario: Verify Download document using download link.
  When I click on entity type & select a value from filter field.
  Then I click on search button on document structure.
  And click on download link on document listing structure.

  #IC-4385 As a System User I want verify a reset button on document listing page.
  #@Resetbutton
  Scenario:Verify Reset button on document listing.
  when I click on linked_to & select a value from filter field.
  And I click on reletes_to & select a value filter filter field.
  Then I click Reset button on document listing structure. 

  #IC-114 As a System User I want to delete a document.
  #@DeleteDocument @regression  
  Scenario: View list Document structure  
  When I clicked delete button of document listing page 
  Then I validate that document record should removed from document list.
  And I validate document record with Inbound xml
     
   
  #@DBTesting
  #Scenario: Verify deleted address record should be deleted from DB    
  When I delete document on listing page
  Then I verify deleted record of document should be deleted from Database
