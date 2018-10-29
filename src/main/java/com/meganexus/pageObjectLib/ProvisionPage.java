package com.meganexus.pageObjectLib;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class ProvisionPage extends NeoTR_Page {
	@FindBy(xpath = "//h2[text()='Add provision']")
	private WebElementFacade txt_addProvision;
	@FindBy(xpath = "//a[text()='provision']")
	private WebElementFacade lnk_provision;
	@FindBy(xpath = "//input[@ng-reflect-name='startDate']")
	private WebElementFacade tbx_startDate;
	@FindBy(xpath = "//input[@ng-reflect-name='endDate']")
	private WebElementFacade tbx_endDate;
	@FindBy(xpath = "//select[@ng-reflect-name='adjustmentId']")
	private WebElementFacade ddl_adjustment;
	@FindBy(xpath = "//textarea[@ng-reflect-name='note']")
	private WebElementFacade tbx_notes;
	
	
	

	@Override
	public WebElementFacade getUniqueElement() {
		// TODO Auto-generated method stub
		return lnk_provision;
	}

}
