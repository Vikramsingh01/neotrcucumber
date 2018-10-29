package com.meganexus.pageObjectLib;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class ServiceUserPage extends NeoTR_Page {
	@FindBy(xpath = "//span[text()='Service Users']")
	private WebElementFacade lnk_serviceUser;

	public void clickonServiceUserLink() {
		waitForPresenceOf("//span[text()='Service Users']");
		lnk_serviceUser.click();
		waitABit(1000);
	}

	@FindBy(xpath = "//input[@id='firstName']")
	private WebElementFacade tbx_firstName;
	@FindBy(xpath = "//input[@id='caseReferenceNumber']")
	private WebElementFacade tbx_crnNo;
	@FindBy(xpath = "//button[text()='Search']")
	private WebElementFacade btn_search;
	@FindBy(xpath = "(//button[@class='btn btn-default btn-small'])[1]")
	private WebElementFacade btn_viewOffender;
	@FindBy(xpath = "//a[text()='filter']")
	private WebElementFacade lnk_filter;

	public void searchOffenderWithName(String offenderName) {
		if (btn_close.isCurrentlyVisible()) {
			btn_close.click();
		}
		waitForPresenceOf("//a[text()='filter']");
		if (!tbx_firstName.isCurrentlyVisible()) {

			lnk_filter.click();
			waitABit(1000);
		}

		if (tbx_firstName.isCurrentlyVisible()) {
			tbx_firstName.sendKeys(offenderName);
			waitABit(1000);
			btn_search.click();
			waitABit(1000);
		}
	}

	public void searchOffenderWithCrnNO(String crnNo) {
		if (btn_close.isCurrentlyVisible()) {
			btn_close.click();
		}

		waitForPresenceOf("//a[text()='filter']");
		if (!tbx_crnNo.isCurrentlyVisible()) {
			lnk_filter.click();
			waitABit(1000);
		}
		try {
			if (tbx_crnNo.isCurrentlyVisible()) {
				tbx_crnNo.sendKeys(crnNo);
				waitABit(1000);
				btn_search.click();
				waitABit(1000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void clickOnViewOffender() {
		if (btn_close.isCurrentlyVisible()) {
			btn_close.click();
		}
		try {
			btn_viewOffender.click();
			waitABit(1000);
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("offender is not available");
		}

	}

	@Override
	public WebElementFacade getUniqueElement() {
		// TODO Auto-generated method stub
		return btn_viewOffender;
	}

}
