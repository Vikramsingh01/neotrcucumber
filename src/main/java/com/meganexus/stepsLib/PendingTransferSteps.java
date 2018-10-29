package com.meganexus.stepsLib;

import com.meganexus.pageObjectLib.CaseManagerAllocationPage;
import com.meganexus.pageObjectLib.InductionLetterPage;
import com.meganexus.pageObjectLib.PendingTransferPage;
import com.meganexus.pageObjectLib.PendingTransferViewPage;

import net.thucydides.core.annotations.Step;

@SuppressWarnings("serial")
public class PendingTransferSteps extends NeoTR_Steps {
	PendingTransferPage pendingTransfer;
	PendingTransferViewPage ptvPage;
	CaseManagerAllocationPage casemanagAlloc;
	InductionLetterPage inductioLetter;

	@Step
	public void navigateToPendingTransferPage() throws InterruptedException {
		pendingTransfer.clickOnPendingTransferLink();
		Thread.sleep(500);
		try {
			pendingTransfer.viewOffenderWithCrnNO();
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	
	@Step
	public void verifyPendingTransferListViw() throws InterruptedException {
		pendingTransfer.clickOnPendingTransferLink();
		Thread.sleep(500);
		try {
			pendingTransfer.verifyPendingTransferListViw();
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	@Step
	public void acceptOffender() throws InterruptedException {

		ptvPage.clickOnOMTransferRequest();
		ptvPage.clickSaveBtn();
		waitABit(1000);
		casemanagAlloc.caseManagerAllocation();
		ptvPage.clickSaveBtn();
		waitABit(1000);
		inductioLetter.enetrDataInductionLetter();

	}

	@Step
	public void rejectOffender() throws InterruptedException {
		pendingTransfer.clickOnPendingTransferLink();

		ptvPage.clickOnOMTransferRequest();
		ptvPage.reject();

	}

	@Step
	public void validateOMTransfer() throws InterruptedException {
		// pendingTransfer.clickOnPendingTransferLink();
		// pendingTransfer.clickOnViewOffenderBtn();
		ptvPage.clickOnOMTransferRequest();
		ptvPage.validateOMTransferRequest();

	}

	@Step
	public void validateLCTransfer() throws InterruptedException {
		// pendingTransfer.clickOnPendingTransferLink();
		// pendingTransfer.clickOnViewOffenderBtn();
		ptvPage.clickOnLCTransferRequest();
		ptvPage.validateLCTransferRequest();

	}

	@Step
	public void validateRQTransfer() throws InterruptedException {
		// pendingTransfer.clickOnPendingTransferLink();
		// pendingTransfer.clickOnViewOffenderBtn();
		ptvPage.clickOnRQTransferRequest();
		ptvPage.validateRQTransferRequest();

	}

	@Step
	public void validateIRTransfer() throws InterruptedException {
		// pendingTransfer.clickOnPendingTransferLink();
		// pendingTransfer.clickOnViewOffenderBtn();
		ptvPage.clickOnIRTransferRequest();
		ptvPage.validateIRTransferRequest();

	}
}
