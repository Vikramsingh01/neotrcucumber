package com.meganexus.pageObjectLib;

import com.meganexus.genericLib.DateFormatter;
import com.meganexus.genericLib.GetSRD_or_NSRDValue;
import com.meganexus.genericLib.ReadXMLData;

import gherkin.lexer.No;
import junit.framework.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

@SuppressWarnings("deprecation")
public class CaseManagerPage extends NeoTR_Page {
	
	
	//IC-110 
	//Current Case Manager
	@FindBy(xpath = "(//button[@class='btn btn-default btn-purple'])[8]")
	private WebElementFacade btn_casemanager;
	
	public void clickOnCaseManager_btn()
	{		
		if(btn_casemanager.isVisible())
			{
			waitABit(2000);
			if (btn_casemanager.isCurrentlyVisible()) {
				btn_casemanager.click();
				System.out.println("Clicked");
				waitABit(2000);
		} else
			System.out.println("Case Manager Button is not available for this offender");
			}
		
		}
	
	@FindBy(xpath="//h2[contains(text(),'View Case Manager')]")
	private WebElementFacade title_viewCaseManager;
	
	public void verifyCaseManagerTitle(){
		/*String a=  title_viewCaseManager.getText();
		 System.out.println(a);*/
			Assert.assertTrue("View Case Manager title not displayed", title_viewCaseManager.getText().trim().contains("VIEW CASE MANAGER"));
	}
	
	//label validation
	@FindBy(xpath="//a[@id='Current Case Manager']")
	private WebElementFacade tbl_currentCaseManager;
	
	@FindBy(xpath="//div[@id='label_caseManagerAllocationId']")
	private WebElementFacade lbl_currentCaseManager ;
	@FindBy(xpath="//div[@id='label_teamId']")
	private WebElementFacade lbl_team ;
	@FindBy(xpath="//div[@id='label_office']")
	private WebElementFacade lbl_office ;
	@FindBy(xpath="//div[@id='label_contactNumber']")
	private WebElementFacade lbl_contactNo ;
	@FindBy(xpath="//div[@id='label_date']")
	private WebElementFacade lbl_date ;
	
	public void verifyCaseManagerDetailsLabel()
	{
		Assert.assertTrue("Current Case Manager Header not displayed", tbl_currentCaseManager.getText().trim().contains("CURRENT CASE MANAGER")); 
		Assert.assertTrue("Current Case Manager not displayed", lbl_currentCaseManager.getText().trim().contains("Current Case Manager")); 
		Assert.assertTrue("Team not displayed ", lbl_team.getText().trim().contains("Team"));
		Assert.assertTrue("Office not displayed ", lbl_office.getText().trim().contains("Office"));
		Assert.assertTrue("Contact Number not displayed ", lbl_contactNo.getText().trim().contains("Contact Number"));
		Assert.assertTrue("Date not displayed ", lbl_date.getText().trim().contains("Date"));
	}
	
	//For label Value validation with XML
	@FindBy(xpath="(//div[@class='detail-value col-sm-7'])[1]")
	private WebElementFacade value_currentCaseManager ;
	@FindBy(xpath="(//div[@class='detail-value col-sm-7'])[2]")
	private WebElementFacade value_team ;
	@FindBy(xpath="(//div[@class='detail-value col-sm-7'])[3]")
	private WebElementFacade value_office ;
	@FindBy(xpath="(//div[@class='detail-value col-sm-7'])[4]")
	private WebElementFacade value_contactNo ;
	@FindBy(xpath="(//div[@class='detail-value col-sm-7'])[5]")
	private WebElementFacade value_date ;
	
		
	public void verifyCaseManagerValues(String username) {
		System.out.println(username);
		Assert.assertTrue("Current Case Manager value not match", value_currentCaseManager.getText().trim().contains(username));
		Assert.assertTrue("Team value not match", value_team.getText().trim().contains("Flex Team 1"));
		/*Assert.assertTrue("Office value not match", value_office.getText().trim().contains("Merseyside_office"));
		Assert.assertTrue("Contact Number value not match", value_contactNo.getText().trim().contains("0"));
		Assert.assertTrue("Date value not match", value_date.getText().trim().contains("24/05/2017"));
		*/
	}
	
	
	//Case Manager History
	
	//label validation
	@FindBy(xpath="//a[@id='Case Manager History']")
	private WebElementFacade tbl_CaseManagerHistory;
	
	@FindBy(xpath="//span[@id='label_transferFromProviderId']")
	private WebElementFacade lbl_fromProvider ;
	@FindBy(xpath="//span[@id='label_transferToResponsibleOfficer']")
	private WebElementFacade lbl_caseManager ;
	@FindBy(xpath="//span[@id='label_allocationDate']")
	private WebElementFacade lbl_historyDate ;
	@FindBy(xpath="//span[@id='label_transferReasonId']")
	private WebElementFacade lbl_transferForReason ;
	@FindBy(xpath="//span[@id='label_transferToProviderId']")
	private WebElementFacade lbl_toProvider ;
	
	public void verifyCaseManagerHistoryDetailsLabel()
	{
		String aa= lbl_fromProvider.getText();
		System.out.println(aa);
		Assert.assertTrue("Case Manager History Header not displayed", tbl_CaseManagerHistory.getText().trim().contains("CASE MANAGER HISTORY")); 
		Assert.assertTrue("From Provider Label not displayed", lbl_fromProvider.getText().trim().contains("FROM PROVIDER")); 
		Assert.assertTrue("Case Manager Label not displayed ", lbl_caseManager.getText().trim().contains("CASE MANAGER"));
		Assert.assertTrue("Date label not displayed ", lbl_historyDate.getText().trim().contains("DATE"));
		Assert.assertTrue("Transfer for Reason Label not displayed ", lbl_transferForReason.getText().trim().contains("TRANSFER FOR REASON"));
		Assert.assertTrue("To Provider Label not displayed ", lbl_toProvider.getText().trim().contains("TO PROVIDER"));
	}
	
	//For label Value validation with XML
	@FindBy(xpath="//span[@id='label_transferFromProviderId']/following::td[1]")
	private WebElementFacade value_fromProvider;
	@FindBy(xpath="//span[@id='label_transferFromProviderId']/following::td[2]")
	private WebElementFacade value_caseManager ;
	@FindBy(xpath="//span[@id='label_transferFromProviderId']/following::td[3]")
	private WebElementFacade value_historyDate ;
	@FindBy(xpath="//span[@id='label_transferFromProviderId']/following::td[4]")
	private WebElementFacade value_transferForReason ;
	@FindBy(xpath="//span[@id='label_transferFromProviderId']/following::td[5]")
	private WebElementFacade value_toProvider ;

		
	public void verifyCaseManagerHistoryValues(String username )
	{
		System.out.println(username);
		Assert.assertTrue("Case Manager value not match", value_caseManager.getText().trim().contains(username));
		/*Assert.assertTrue("Date value not match", value_historyDate.getText().trim().contains("24/05/2017"));
		
		Assert.assertTrue("From Provider Field value did not match", value_fromProvider.getText().trim().equals(GetSRD_or_NSRDValue.getUIValue_from_SRD20("CR AREA TRANSFER REJECTION REASON",
				ReadXMLData.getXMLData("inboundXML/ctr.xml", "//OMTransferRequest", "./OMTransferReason"))));
*/
		
		
		
		
		
			
	}
	
	@FindBy(xpath = "//button[@id='backButton']")
	private  WebElementFacade btn_back;
	
	public void clickOnBack_btn()
	{
		if(btn_back.isVisible())
		{
		waitABit(2000);
		if (btn_back.isCurrentlyVisible()) {
			btn_back.click();
			System.out.println("Clicked");
			waitABit(2000);
	} else
		System.out.println("Back Button is not available for Case Manager Screen");
		}
		
	}
	
	
	
	@Override
	public WebElementFacade getUniqueElement() {
		// TODO Auto-generated method stub
		return btn_back;
	}
}
