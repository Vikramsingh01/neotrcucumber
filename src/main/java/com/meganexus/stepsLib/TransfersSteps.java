package com.meganexus.stepsLib;

import com.meganexus.pageObjectLib.TransfersPage;
import com.meganexus.pageObjectLib.TransferOutPage;

import net.thucydides.core.annotations.Step;

public class TransfersSteps {
	TransfersPage  transfersPage;
	TransferOutPage transferOutPage;
	
	@Step	
 public void clickOnTransferOutLink(){
	 transfersPage.clickOnTransferOutReqLink();
		
	}
	
	@Step
	public void transferCaseComponents(){
		transfersPage.TransferCaseComponents();
		transfersPage.verifyPendingStatus();
	}
	@Step
	public void navigateToEditWithdrawTransferRequest(){
		transfersPage.navigateToEditWithdrawTransferRequest();
	}
	@Step
 public void verifyTransferOutRequestListView(){
		transfersPage.verifyTransferRequestListView();
	 
	 
 }
	@Step
	public void navigateToTransfersTab(){
		transfersPage.clickTansfersTab();
	}
	
	@Step
	public void transfers()
	{
		transfersPage.clickOnTransfers();
	}
	
	@Step
	public void clickonTransferOutHistory()
	{
		transfersPage.clickOnTransferOutHistory();
	}
	
	@Step
	public void listViewTransferOutHistoryListview()
	{
		transfersPage.clickOnTransferOutHistory();
	}

	
	@Step
	public void verifyTransferOuHistoryListViw() {
		transfersPage.verifyTransferOutHistoryListview();
	}
	@Step
	public void verifyPendingStatusOnTransferOut() {
		transferOutPage.verifyPendingStatusOnTransferOut();
	
	}
	@Step
	public void amendTransferReason() {
		transfersPage.verifyEditWithdrawTransferRequest();
		transfersPage.amendTransferReason();
	
	}
	@Step
	public void withdrawTransferOutRequest() {
		transfersPage.verifyEditWithdrawTransferRequest();
		transfersPage.withdrawTransferOutRequest();
	
	}

	
}
