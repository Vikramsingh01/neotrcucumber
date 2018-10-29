package com.meganexus.neotrRunner;

import com.meganexus.stepsLib.NeoTR_Steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook extends NeoTR_Steps {

	/*@Before
	public void maximizeScreen() {
		
		  getDriver().manage().window().maximize(); getImplicitWaitTimeout();
		 
	}*/

	@After
	public void logOutFromCMS() {
		logOutFromCMSApps();

	}

}
