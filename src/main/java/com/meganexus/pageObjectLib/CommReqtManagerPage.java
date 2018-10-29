package com.meganexus.pageObjectLib;

import org.openqa.selenium.support.FindBy;

import com.meganexus.genericLib.GetSRD_or_NSRDValue;
import com.meganexus.genericLib.ReadXMLData;

import junit.framework.Assert;
import net.serenitybdd.core.pages.WebElementFacade;

@SuppressWarnings("deprecation")
public class CommReqtManagerPage extends EventViewPage{

	//Locators for field values
	 @FindBy(xpath = "//div[contains(text(),'allocation Date')]//following-sibling::*")
	   private WebElementFacade value_allocationDate;
		
	   @FindBy(xpath = "//div[contains(text(),'provider')]//following-sibling::*")
	   private WebElementFacade value_Provider;
	   
	   @FindBy(xpath = "//div[contains(text(),'responsible Team')]//following-sibling::*")
	   private WebElementFacade value_responsibleTeam;
	   
	   @FindBy(xpath = "//div[contains(text(),'responsible Officer')]//following-sibling::*")
	   private WebElementFacade value_responsibleOfficer;
	   
	   @FindBy(xpath = "//div[contains(text(),'allocation Reason')]//following-sibling::*")
	   private WebElementFacade value_allocationReason;
	   
	   @FindBy(xpath = "//div[contains(text(),'end Date')]//following-sibling::*")
	   private WebElementFacade value_endDate;
	   
	 
	 
		//View Page Locators
		@FindBy(xpath = "//h2[text()='VIEW community Requirement Manager']")
		private WebElementFacade txt_CommReqtManager;
	    @FindBy(xpath = "//a[contains(text(),'Community requirement Manager')]")
	private WebElementFacade lnk_CommReqtManager;
	   @FindBy(xpath = "//div[contains(text(),'allocation Date')]")
	   private WebElementFacade lbl_allocationDate;
		
	   @FindBy(xpath = "//div[contains(text(),'provider')]")
	   private WebElementFacade lbl_Provider;
	   
	   @FindBy(xpath = "//div[contains(text(),'responsible Team')]")
	   private WebElementFacade lbl_responsibleTeam;
	   
	   @FindBy(xpath = "//div[contains(text(),'responsible Officer')]")
	   private WebElementFacade lbl_responsibleOfficer;
	   
	   @FindBy(xpath = "//div[contains(text(),'allocation Reason')]")
	   private WebElementFacade lbl_allocationReason;
	   
	   @FindBy(xpath = "//div[contains(text(),'end Date')]")
	   private WebElementFacade lbl_endDate;
	
	   public void CommReqtManagerViewFieldVerification() {
			Assert.assertTrue("View additional Identifier text is not available", txt_CommReqtManager.getText().trim().equals("VIEW community Requirement"));
			
			Assert.assertTrue("allocation Date label did not match", lbl_allocationDate.getText().trim().equals("allocation Date"));
			Assert.assertTrue("allocation Date Field value did not match", value_allocationDate.getText().trim().equals(ReadXMLData.getXMLData("inboundXML/AE.xml", "//CommReqtManager", "./AllocationDate")));
			

			Assert.assertTrue("responsible Team Field label did not match", lbl_responsibleTeam.getText().trim().equals("responsible Team"));
			Assert.assertTrue("responsible Team Field value did not match", value_responsibleTeam.getText().trim().equals(ReadXMLData.getXMLData("inboundXML/AE.xml","//CommReqtManager", "./ResponsibleTeam")));

			Assert.assertTrue("responsible Officer Field label did not match", lbl_responsibleOfficer.getText().trim().equals("responsible Officer"));
			Assert.assertTrue("responsible Officer Field value did not match", value_responsibleOfficer.getText().trim().equals(ReadXMLData.getXMLData("inboundXML/AE.xml", "//CommReqtManager", "./ResponsibleOfficer")));

			Assert.assertTrue("End Date Field label did not match", lbl_endDate.getText().trim().equals("end Date"));
			Assert.assertTrue("End Date Field value did not match", value_endDate.getText().trim().equals(ReadXMLData.getXMLData("inboundXML/AE.xml", "//CommReqtManager", "./EndDate")));

			Assert.assertTrue("allocation Reason Field label did not match", lbl_allocationReason.getText().trim().equals("allocation Reason"));
			Assert.assertTrue("allocation Reason Field value did not match", value_allocationReason.getText().trim().equals(ReadXMLData.getXMLData("inboundXML/AE.xml", "//CommReqtManager", "./AllocationReason")));

			Assert.assertTrue("Provider Field label did not match", lbl_Provider.getText().trim().equals("provider"));
			Assert.assertTrue("Provider Field value did not match", value_Provider.getText().trim().equals(GetSRD_or_NSRDValue.getUIValue_from_SRD20("PROVIDER",
					ReadXMLData.getXMLData("inboundXML/AE.xml", "//CommReqtManager", "./Provider"))));
	   }
	   @Override
		public WebElementFacade getUniqueElement() {
			// TODO Auto-generated method stub
			return txt_CommReqtManager;
		}
}
