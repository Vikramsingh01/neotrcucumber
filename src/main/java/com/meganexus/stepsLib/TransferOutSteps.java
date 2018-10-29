package com.meganexus.stepsLib;

import com.meganexus.pageObjectLib.TransferOutPage;

import net.thucydides.core.annotations.Step;

public class TransferOutSteps {
	TransferOutPage  transferOutRequestPage;
	
	@Step
	public void TransfersButtonOnServiceUsers() {
		transferOutRequestPage.clickOnTransfersButtonOnServiceUsers();
	}
	@Step
	public void transferOut()
	{
		transferOutRequestPage.clickOnTransferOut();
	}
	@Step
	public void verifySearchTransferOut()
	{
		transferOutRequestPage.verifySearchTransferOut();
	}
  
  @Step
	public void verifyListViewTransferOutRequest() {
	  transferOutRequestPage.verifylistViewTransferOutRequest();
	  transferOutRequestPage.verifyPendingStatusOnTransferOut();
  }		
//  @Step
//	public void verifyTextboxOnTransferOutRequest() {
//	  transferOutRequestPage.listViewTransferOutRequest();
//  }		 
//  @Step
//	public void verifySearchButtonOnTransferOutRequest() {
//transferOutRequestPage.enterSearchDetailsForTransferOutRequest();
//transferOutRequestPage.clickOnSearchButtonOnTransferOutRequest();
 //}
  
}
