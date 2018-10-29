#Author: amardeep.patil@meganexus.com
#@sprint19
Feature: View listing of document on Pending Transfer Screen.

Background: 
  Given As a PSC_Admin I want to login to neo_tr with valid credentials
  When I navigate to pending transfer page 
  Then I navigate to document page
  
  #IC-3529 As a PSC Administrator I want to view a list of documents so that I can see the documents associated with a Service User before engagement has commenced
  @ViewListDocumentsPendingTransfer  
  Scenario: View list of document structure.   
  #When I click on document button on main navigation of service user.    
  Then I validate all list field on document structure.

  #IC-3529 As a PSC Administrator I want filter a document using field entity type.
  @DocumentfilterentitytypePendingTransfer
  Scenario: filter a document using entity field.
  When I click on entity type & select a value from filter field.
  Then I click on search button on document structure.
  And validate the record on document listing page. 

  #IC-3529 As a PSC Administrator I want filter a document using field linked_to
  @DocumentfilterlinkedPendingTransfer
  Scenario: Verify filter a document using linked_to field.
  When I click on linked_to & select a value from filter field.
  Then I click on search button on document structure.
  And validate the record on document listing page. 
  
  #IC-3529 As a PSC Administrator I want filter a document using field Document Type
  @DocumentfilterDocumentTypePendingTransfer
  Scenario: Verify filter a document using document_type field.
  When I click on documentType and select a value from filter field.
  Then I click on search button on document structure.
  And validate the record on document listing page.

  #IC-3530 As a PSC Administrator I want to view a document so that I can review information about the Service User before accepting them
  @DownloadDocumentPendingTransfer
  Scenario: Verify Download document using download link.
  When I click on entity type & select a value from filter field.
  Then I click on search button on document structure.
  And click on download link on document listing structure.

  #IC-3529 As a PSC Administrator I want verify a reset button on document listing page.
  @ResetbuttonPendingTransfer
  Scenario:Verify Reset button on document listing.
  When I click on linked_to & select a value from filter field.
  When I click on entity type & select a value from filter field.
  Then I click Reset button on document listing structure. 
  
  