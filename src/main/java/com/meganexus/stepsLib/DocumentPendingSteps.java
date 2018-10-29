package com.meganexus.stepsLib;

import com.meganexus.pageObjectLib.DocumentPendingPage;

import net.thucydides.core.annotations.Step;

public class DocumentPendingSteps {
	
	DocumentPendingPage docPendingPage;
	
	@Step
	public void clickDocumentTab() {
		docPendingPage.clickOnDocumentTab();

	}
	@Step
	public void validateDocumentList() {
		docPendingPage.validateDocumentList();
		
	}
	@Step
	public void selectEntityTypeFilter() {
		docPendingPage.selectEntityTypeFilter();
		
		
	}
	@Step
	public void selectLinkedToFilter() {
		docPendingPage.selectEntityTypeFilter();
		
		
	}
	@Step
	public void selectDocumentTypeFilter() {
		docPendingPage.verifyDocumentTypeFilter();
		
		
	}
	@Step
	public void clickSearchBtn() {
		
		docPendingPage.clickSearchButton();
		
	}
	@Step
	public void clickResetBtn() {
		
		docPendingPage.clickResetButton();
		
	}
	@Step
	public void clickDownloadBtn() {
		
		docPendingPage.clickDownloadButton();
		
	}
}
