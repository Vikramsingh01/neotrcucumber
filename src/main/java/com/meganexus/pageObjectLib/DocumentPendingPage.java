package com.meganexus.pageObjectLib;

import junit.framework.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class DocumentPendingPage extends NeoTR_Page{

	
	@FindBy(xpath = "//button[contains(.,'Document')]")
	public WebElementFacade tab_documentLink;
	@FindBy(xpath = "//a[@id='Documents']")
	public WebElementFacade lnk_document;
	@FindBy(xpath = "//a[@id='filter']")
	public WebElementFacade lnk_filter;
	@FindBy(xpath = "//select[@id='entityType']")
	public WebElementFacade ddl_EntityTypefltr;
	@FindBy(xpath = "//select[@id='docType']")
	public WebElementFacade ddl_documentTypefltr;
	@FindBy(xpath = "//input[@id='createdDate']")
	public WebElementFacade txt_DateFrom;
	@FindBy(xpath = "//input[@id='lastModifiedDate']")
	public WebElementFacade txt_DateTo;
	@FindBy(xpath = "//button[contains(.,'Search')]")
	public WebElementFacade btn_search;
	@FindBy(xpath = "//button[contains(.,'Reset')]")
	public WebElementFacade btn_reset;
    
	// Column Xpath
	@FindBy(xpath = ".//*[@id='alfrescoDocId']")
	public WebElementFacade col_ID;
	@FindBy(xpath = "//th[@id='docType']")
	public WebElementFacade col_DocType;
	@FindBy(xpath = "//th[@id='documentName']")
	public WebElementFacade col_name;
	@FindBy(xpath = "//th[@id='entityType']")
	public WebElementFacade col_entityType;
	@FindBy(xpath = "//th[@id='author']")
	public WebElementFacade col_author;
	@FindBy(xpath = "//th[@id='lastModifiedDate']")
	public WebElementFacade col_updatedDate;
	
	public void clickOnDocumentTab() {
		
		waitABit(2000);
		tab_documentLink.click();
		waitABit(1000);

	}
	
	public void clickOnDocumentExpand() {
		
		waitABit(2000);
		lnk_document.click();
		waitABit(1000);

	}
	
	public void selectEntityTypeFilter() {
		clickOnDocumentExpand();
		waitABit(2000);
		ddl_EntityTypefltr.selectByVisibleText("");
		waitABit(1000);

	}
	
	public void verifyDocumentTypeFilter() {
		
		waitABit(2000);
		tab_documentLink.click();
		waitABit(1000);

	}
	
	public void verifydateFrom() {
		
		waitABit(2000);
		tab_documentLink.click();
		waitABit(1000);

	}
	
   public void verifydateTo() {
		
		waitABit(2000);
		tab_documentLink.click();
		waitABit(1000);

	}
   public void clickSearchButton() {
		
		waitABit(2000);
		btn_search.click();
		waitABit(1000);

	}
   public void clickResetButton() {
		
		waitABit(2000);
		btn_reset.click();
		waitABit(1000);

	}
   
   @SuppressWarnings("deprecation")
public void validateDocumentList() {
		
	
	   if (col_ID.isCurrentlyVisible()) 
			Assert.assertTrue("Table header for Document Id does not match", col_DocType.getText().trim().equals("ID"));
		if (col_DocType.isCurrentlyVisible()) 
			Assert.assertTrue("Table header for Document Type does not match", col_DocType.getText().trim().equals("DOCUMENT TYPE"));
		if (col_name.isCurrentlyVisible())
			Assert.assertTrue("Table header for Name does not match", col_name.getText().trim().equals("NAME"));
		if (col_entityType.isCurrentlyVisible())
			Assert.assertTrue("Table header for Entity Type does not match", col_entityType.getText().trim().equals("ENTITY TYPE"));

		if (col_author.isCurrentlyVisible()) 
			Assert.assertTrue("Table header for Author does not match", col_author.getText().trim().equals("AUTHOR"));
		if (col_updatedDate.isCurrentlyVisible())
			Assert.assertTrue("Table header for Updated Date does not match", col_updatedDate.getText().trim().equals("UPDATED DATE"));
		
   }
   
   //Download functionality
   @FindBy(xpath = ".//*[@id='542ad7dd-e258-4a64-b3b4-1001a1f830ca']")
  	public WebElementFacade btn_download;
   
   public void clickDownloadButton() {	
 		waitABit(2000);
 		btn_download.click();
 		waitABit(1000);

 	}
   
  
	@Override
	public WebElementFacade getUniqueElement() {
		
		return lnk_document;
	}

}
