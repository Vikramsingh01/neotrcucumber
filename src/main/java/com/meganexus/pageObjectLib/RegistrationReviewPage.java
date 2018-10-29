package com.meganexus.pageObjectLib;

import junit.framework.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class RegistrationReviewPage extends NeoTR_Page {
	@FindBy(xpath = "//input[@id='dateOfReview']")
	private WebElementFacade tbx_reviewDate;
	@FindBy(xpath = "//select[@id='reviewProviderId']")
	private WebElementFacade ddl_reviewProvider;
	@FindBy(xpath = "//input[@id='reviewingTeam']")
	private WebElementFacade tbx_reviewingTeam;
	@FindBy(xpath = "//input[@id='reviewingOfficer']")
	private WebElementFacade tbx_reviewingOfficer;
	
	@FindBy(xpath = "//h2[text()='VIEW Registration']")
	private WebElementFacade txt_viewRegistration;
	@FindBy(xpath = "//button[text()='Back']")
	private WebElementFacade btn_back;
	
	@SuppressWarnings("deprecation")
	public void enterRegistrationReviewDetails() {
		tbx_reviewDate.sendKeys("03/03/2010");
		waitABit(100);
		ddl_reviewProvider.selectByVisibleText("CPA Kent Surrey and Sussex");
		waitABit(100);
		tbx_reviewingTeam.sendKeys("Diary Team");
		waitABit(100);
		tbx_reviewingOfficer.sendKeys("Officer Kent");
		waitABit(100);
	}
	
	@SuppressWarnings("deprecation")
	public void editRegistrationReviewDetails() {
		tbx_reviewDate.clear();
		waitABit(100);
		tbx_reviewDate.sendKeys("03/03/2010");
		waitABit(100);
		ddl_reviewProvider.selectByVisibleText("CPA Hampshire and Isle of Wight");
		waitABit(100);
		tbx_reviewingTeam.clear();
		waitABit(100);
		tbx_reviewingTeam.sendKeys("Diary Team");
		waitABit(100);
		tbx_reviewingOfficer.clear();
		waitABit(100);
		tbx_reviewingOfficer.sendKeys("Officer Kent");
		waitABit(100);
	}
	
	@SuppressWarnings("deprecation")
	public void addRegistrationReviewVerification() {
		Assert.assertTrue("view rate card intervention text is not available",
				txt_viewRegistration.getText().trim().equals("VIEW Registration"));
		Assert.assertTrue("back button is not available", btn_back.getText().trim().equals("BACK"));
	}
	
	@SuppressWarnings("deprecation")
	public void editRegistrationReviewVerification(){
		Assert.assertTrue("view rate card intervention text is not available",
				txt_viewRegistration.getText().trim().equals("VIEW Registration"));
		Assert.assertTrue("back button is not available", btn_back.getText().trim().equals("BACK"));
	}
	
	@Override
	public WebElementFacade getUniqueElement() {
		return tbx_reviewDate;
	}

	
	
}
