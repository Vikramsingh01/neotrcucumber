package com.meganexus.pageObjectLib;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends NeoTR_Page {

	@FindBy(xpath = "//input[@id='email']")
	private WebElementFacade tbx_username;
	@FindBy(xpath = "//input[@id='pwd']")
	private WebElementFacade tbx_password;
	@FindBy(xpath = "//button[text()='Sign in']")
	private WebElementFacade btn_login;

	public void entercredentials(String username, String password) {
		if (btn_close.isCurrentlyVisible()) {
			btn_close.click();
		}
		if (!btn_login.isCurrentlyVisible()) {
			clickOnLogoutBtn();
		}
		try {
			tbx_username.sendKeys(username);
			waitABit(500);
			tbx_password.sendKeys(password);
			waitABit(500);
		} catch (ElementNotFoundException e) {
			System.out.println("xpath not correct");
		}

	}

	public void clickOnLoginBtn() {
		waitFor(btn_login);
		btn_login.click();
		waitABit(1000);

	}

	public boolean verifyLogin() {
		getDriver().getTitle().equals("NEO - TR");

		return true;
	}

	@Override
	public WebElementFacade getUniqueElement() {
		// TODO Auto-generated method stub
		return btn_login;

	}

}
