package com.meganexus.stepsLib;

import com.meganexus.pageObjectLib.LoginPage;

import net.thucydides.core.annotations.Step;

public class LoginSteps extends NeoTR_Steps {
	LoginPage lp;
	@Step
	public void loginToApp(String username, String password) {
		lp.open();
		getDriver().manage().window().maximize();
		getImplicitWaitTimeout();
		lp.entercredentials(username, password);
		waitABit(500);
		lp.clickOnLoginBtn();
		waitABit(2000);
	}
	
	@SuppressWarnings("deprecation")
	@Step
	public void login_Review(){
		verifyBreadCrumbs("Service User");
		
		
	}

}
