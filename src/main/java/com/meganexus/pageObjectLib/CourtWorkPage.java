package com.meganexus.pageObjectLib;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class CourtWorkPage extends NeoTR_Page {
	// Created by Tapan
	@FindBy(xpath = "//a[@id='Court Work Request']")
	private WebElementFacade lnk_CourtWorkRequest;
	@FindBy(xpath = "(//select[@id='processTypeId'])[1]")
	private WebElementFacade ddl_RequestType;
	@FindBy(xpath = "(//select[@id='processTypeId'])[2]")
	private WebElementFacade ddl_RequestTypeF;
	@FindBy(xpath = "//select[@ng-reflect-name='processSubTypeId']")
	private WebElementFacade ddl_RequestSubType;
	@FindBy(xpath = "//input[@id='processRefDate']")
	private WebElementFacade tbx_ReferralDate;
	@FindBy(xpath = "//button[contains(text(),'Send Request')]")
	private WebElementFacade btn_SendRequest;

	public void sentCourtWorkRequest() {
		ddl_RequestType.selectByIndex(1);
		waitABit(200);
		ddl_RequestSubType.selectByIndex(1);
		waitABit(200);
		tbx_ReferralDate.sendKeys("11/06/2017");
		waitABit(200);
		btn_SendRequest.click();
		waitABit(1000);
	}

	@FindBy(xpath = "//a[@id='filter']")
	private WebElementFacade lnk_filter;
	@FindBy(xpath = "(//label[contains(text(),'Request Type')])[1]")
	private WebElementFacade lbl_RequestType;
	@FindBy(xpath = "(//label[contains(text(),'Request Type')])[2]")
	private WebElementFacade lbl_RequestTypeF;
	@FindBy(xpath = "//label[contains(text(),'Status')]")
	private WebElementFacade lbl_Status;
	@FindBy(xpath = "//button[text()='Search']")
	private WebElementFacade btn_Search;
	@FindBy(xpath = "//a[@id='Court Work Log']")
	private WebElementFacade lnk_CourtWorkLog;
	@FindBy(xpath = "//select[@id='processStageId']")
	private WebElementFacade ddl_Status;

	public void filterCourtWorkRequest() {
		if (!lbl_RequestTypeF.isCurrentlyVisible()) {
			lnk_filter.click();
			waitABit(200);
		}
		if (lbl_RequestTypeF.isPresent() && lbl_Status.isPresent()) {
			try {
				ddl_RequestTypeF.selectByIndex(1);
				waitABit(200);
				ddl_Status.selectByIndex(1);
				waitABit(200);
				btn_Search.click();
				waitABit(1000);
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Request sub type or status Element not available");
			}

		} else if (ddl_RequestType.isPresent()) {
			try {
				ddl_RequestType.selectByIndex(1);
				btn_Search.click();
				waitABit(200);

			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Request type or Seach element is not available");
			}
		}

	}

	@Override
	public WebElementFacade getUniqueElement() {

		return lnk_CourtWorkRequest;
	}

}
