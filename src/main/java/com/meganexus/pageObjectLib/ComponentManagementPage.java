package com.meganexus.pageObjectLib;
import junit.framework.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;


public class ComponentManagementPage extends NeoTR_Page {

	
	@FindBy(xpath = "//button[contains(text(),'Component Management')]")
	private WebElementFacade btn_ComponentManagement;
	
	@FindBy(xpath = "//label[@for='officeTeamId']")
	private WebElementFacade lbl_Team;
	
	@FindBy(xpath = "//select[@ng-reflect-name='officeTeamId']")
	private WebElementFacade ddl_Team;
	
	
	
	@FindBy(xpath = "//select[@formcontrolname='officerId']")
	private WebElementFacade ddl_Officer;
	
	@FindBy(xpath = "//label[@for='officerId']")
	private WebElementFacade lbl_Officer;
	
	@FindBy(xpath = "//th[@id='type']/span")
	private WebElementFacade tblHdr_Type;
	
	@FindBy(xpath = "//th[@id='startDate']/span")
	private WebElementFacade tblHdr_StartDate;
	
	@FindBy(xpath = "//th[@id='descriptionId']/span")
	private WebElementFacade tblHdr_Description;
	
	@FindBy(xpath = "//th[@id='toProvider']/span")
	private WebElementFacade tblHdr_Provider;
	
	@FindBy(xpath = "//th[@id='officeTeamId']/span")
	private WebElementFacade tblHdr_Team;
	
	@FindBy(xpath = "//th[@id='officerId']/span")
	private WebElementFacade tblHdr_Officer;
	
	@FindBy(xpath = "//th[@id='transferReasonId']/span")
	private WebElementFacade tblHdr_Reason;
	
	@FindBy(xpath = "(//select[@id='transferReasonId'])[1]")
	private WebElementFacade ddl_Reason;
	
	@FindBy(xpath = "//button[@id='saveButton']")
	private WebElementFacade btn_Submit;
	
	@FindBy(xpath = "//button[@id='cancelButton']")
	private WebElementFacade btn_Cancel;
	
	@FindBy(xpath= "(//div[contains(text(),'Required field ')])[1]")
	private WebElementFacade errorMsg_Team;
	@FindBy(xpath= "(//div[contains(text(),'Required field ')])[2]")
	private WebElementFacade errorMsg_Officer;
	
	
	//button[@id='saveButton']
	
	public void clickonComponentManagement()
	
	{
		btn_ComponentManagement.click();
	}
	
@SuppressWarnings("deprecation")
public void verifyfieldListViewOfCompManagement()
	
	{
	
	
	 System.out.println(lbl_Team.getText());
	System.out.println(lbl_Officer.getText());
	System.out.println(tblHdr_Type.getText());
	System.out.println(tblHdr_Description.getText());
	System.out.println(tblHdr_StartDate.getText());
	System.out.println(tblHdr_Provider.getText());
	System.out.println(tblHdr_Team.getText());
	System.out.println(tblHdr_Officer.getText());
	System.out.println(tblHdr_Reason.getText());
	
	Assert.assertTrue("Team lable header is not present",lbl_Team.getText().trim().equals("Team*"));
	Assert.assertTrue("Officer label header is not present",lbl_Officer.getText().trim().equals("Officer*"));
	Assert.assertTrue("Type table header is not present",tblHdr_Type.getText().trim().equals("TYPE"));
	Assert.assertTrue("Description table header is not present",tblHdr_Description.getText().trim().equals("DESCRIPTION"));
	Assert.assertTrue("Start date table header is not present",tblHdr_StartDate.getText().trim().equals("START DATE"));
	Assert.assertTrue("Start date table header is not present",tblHdr_Team.getText().trim().equals("TEAM"));
	Assert.assertTrue("Officer table header is not present",tblHdr_Officer.getText().trim().equals("OFFICER"));
	
	Assert.assertTrue("Start date table header is not present",tblHdr_Reason.getText().trim().equals("REASON"));
	

	
	
	btn_Submit.click();
	waitABit(3000);
	System.out.println(errorMsg_Team.getText());
	System.out.println(errorMsg_Officer.getText());
	Assert.assertTrue("Error messasge is not displaying ",errorMsg_Team.getText().trim().equals("Required field"));	
	Assert.assertTrue("Error messasge is not displaying ",errorMsg_Officer.getText().trim().equals("Required field"));	
	
	}
	
public void verifyReallocationofComponents()
{
	btn_Cancel.click();
	waitABit(2000);
	btn_ComponentManagement.click();
	ddl_Team.selectByVisibleText("Flex Team 1");
	ddl_Officer.selectByIndex(0);
	ddl_Reason.selectByIndex(1);
	btn_Submit.click();
	
}
	
	@Override
	public WebElementFacade getUniqueElement() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	
}
