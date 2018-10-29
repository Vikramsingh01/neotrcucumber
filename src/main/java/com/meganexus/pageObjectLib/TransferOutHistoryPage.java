package com.meganexus.pageObjectLib;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public  class TransferOutHistoryPage extends NeoTR_Page  {

	
	//click on Transfer Out History 
	@FindBy(xpath = "//a[@id='Transfer Out History' and contains(text(),'Transfer Out History') ]")
	public WebElementFacade lnk_TransferOutHistory;
	
	// Transfer Out History  table fields 
	
	@FindBy(xpath = "//th[@id='familyName']")
	public WebElementFacade toh_hdr_SurName;
	
	@FindBy(xpath = "//th[@id='firstName']")
	public WebElementFacade toh_hdr_FirstName;
	

	@FindBy(xpath = "(//th[@id='type'])[2]")
	public WebElementFacade toh_hdr_Type;
	
	@FindBy(xpath = "//th[@id='description']")
	public WebElementFacade toh_hdr_Description;
	
	@FindBy(xpath = "//th[@id='requestDate']")
	public WebElementFacade toh_hdr_RequestDate;
	@FindBy(xpath = "//th[@id='transferFromProviderId']")
	public WebElementFacade toh_hdr_FromProvider;
	@FindBy(xpath = "//th[@id='transferToProviderId']")
	public WebElementFacade toh_hdr_ToProvider;
	
	@FindBy(xpath = "//th[@id='transferReasonId']")
	public WebElementFacade toh_hdr_TransferReason;
	
	@FindBy(xpath = "//th[@id='status']")
	public WebElementFacade toh_hdr_Status;
	
	@FindBy(xpath = "//button[text()='Transfers']")
	public WebElementFacade btn_Transfers;
	
	@Override
	public WebElementFacade getUniqueElement() {
		
		return null;
	}

//	public void clickOnTransfers() {
//		btn_Transfers.click();
//		waitABit(1000);
//}
}
