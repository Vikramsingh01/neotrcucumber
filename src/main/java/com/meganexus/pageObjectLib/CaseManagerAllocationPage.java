package com.meganexus.pageObjectLib;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class CaseManagerAllocationPage extends NeoTR_Page {
	@FindBy(xpath = "//select[@ng-reflect-name='team']")
	private WebElementFacade ddl_team;
	@FindBy(xpath = "//select[@ng-reflect-name='user']")
	private WebElementFacade ddl_user;
	@FindBy(xpath = "//button[text()='Save']")
	private WebElementFacade btn_Save;
	String caseMngerUserName = null;

	public void caseManagerAllocation() {
		try {
			ddl_team.selectByVisibleText("Flex Team 2");
			waitABit(1000);
			ddl_user.selectByIndex(1);
			waitABit(1000);
			caseMngerUserName = ddl_user.getSelectedVisibleTextValue();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("team and user is not selected");
		}
	}

	@Override
	public WebElementFacade getUniqueElement() {
		// TODO Auto-generated method stub
		return ddl_team;
	}

}
