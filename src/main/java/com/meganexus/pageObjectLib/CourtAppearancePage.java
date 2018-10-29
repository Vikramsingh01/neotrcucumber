package com.meganexus.pageObjectLib;

import com.meganexus.genericLib.DateFormatter;
import com.meganexus.genericLib.GetSRD_or_NSRDValue;
import com.meganexus.genericLib.ReadXMLData;

import junit.framework.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

@SuppressWarnings("deprecation")
public class CourtAppearancePage extends NeoTR_Page{
		
	//*************List View label validation**************
	@FindBy(xpath="//th[@id='courtId']")
	private WebElementFacade lbl_court ;
	@FindBy(xpath="//th[@id='courtAppearanceTypeId']")
	private WebElementFacade lbl_appearanceType;
	@FindBy(xpath="//th[@id='courtDate']")
	private WebElementFacade lbl_appearanceDate ;
	@FindBy(xpath="//th[@id='outcomeId']")
	private WebElementFacade lbl_outcome ;
		
	public void verifyCourtAppearanceViewListLabel()
	{
		Assert.assertTrue("Court not displayed", lbl_court.getText().trim().contains("COURT")); 
		Assert.assertTrue("Appearance Type not displayed", lbl_appearanceType.getText().trim().contains("APPEARANCE TYPE")); 
		Assert.assertTrue("Appearance Date not displayed ", lbl_appearanceDate.getText().trim().contains("APPEARANCE DATE"));
		Assert.assertTrue("Outcome not displayed ", lbl_outcome.getText().trim().contains("OUTCOME"));
	}
	
	// Verify list of Court Appearance
		@FindBy(xpath = "//tbody/tr[1]")
		private WebElementFacade firstRowReq;

		public void verifyFirstRowReq() {
			if (firstRowReq.isVisible())
				System.out.println("Court Appearance is available for this service user");
			else
				System.out.println("Court Appearance is not available for this service user");
		}
		
	//For label Value validation with XML
	@FindBy(xpath="//th[@id='courtId']/following::td[1]")
	private WebElementFacade value_court ;
	@FindBy(xpath="//th[@id='courtAppearanceTypeId']/following::td[2]")
	private WebElementFacade value_AppearanceType ;
	@FindBy(xpath="//th[@id='courtDate']/following::td[3]")
	private WebElementFacade value_appearanceDate ;
	@FindBy(xpath="//th[@id='outcomeId']/following::td[4]")
	private WebElementFacade value_outcome ;
		
	public void verifyCourtappearanceListValues() {
								
		Assert.assertTrue("Court value does not match with IB Xml and ui",
				value_court.getText().trim().contains(GetSRD_or_NSRDValue.getUIValue_from_NSRD20("COURT",
						ReadXMLData.getXMLData("inboundXML/AE.xml", "//CourtAppearance", "./Court"))));
		Assert.assertTrue("Appearance Type value does not match with IB Xml and ui",
				value_AppearanceType.getText().trim().contains(GetSRD_or_NSRDValue.getUIValue_from_SRD20("COURT APPEARANCE TYPE",
						ReadXMLData.getXMLData("inboundXML/AE.xml", "//CourtAppearance", "./CourtAppearanceType"))));
		Assert.assertTrue("Appearance Date Value not matched",
				value_appearanceDate.getText().trim().equals(DateFormatter.changeDateFormat(ReadXMLData
						.getXMLData("inboundXML/AE.xml", "//CourtAppearance", "./CourtDate")))); 
		
		Assert.assertTrue("Outcome field value does not match with IB Xml and ui",
				value_outcome.getText().trim().contains(GetSRD_or_NSRDValue.getUIValue_from_NSRD20("DISPOSAL TYPE",
						ReadXMLData.getXMLData("inboundXML/AE.xml", "//CourtAppearance", "./Outcome"))));
		
	}
	
	
	@FindBy(xpath = "//button[@id='courtAppearance_view0']")
	private WebElementFacade btn_view;
	
	public void clickOnView_btn()
	{
		if(btn_view.isVisible())
		{
		waitABit(2000);
		if (btn_view.isCurrentlyVisible()) {
			btn_view.click();
			System.out.println("Clicked");
			waitABit(2000);
	} else
		System.out.println("View Button is not available for Court Appearances Screen");
		}
		
	}
	
	
	//**************View Court Appearance****************
	
	@FindBy(xpath="//div[@id='label_courtDate']")
	private WebElementFacade lbl_appearancedate;
	@FindBy(xpath="//div[@id='label_courtAppearanceTypeId']")
	private WebElementFacade lbl_appearancetype;
	@FindBy(xpath="//div[@id='label_pleaId']")
	private WebElementFacade lbl_plea;
	@FindBy(xpath="//div[@id='label_outcomeId']")
	private WebElementFacade lbl_Outcome;
	@FindBy(xpath="//div[@id='label_remandStatusId']")
	private WebElementFacade lbl_remandStatus;
	@FindBy(xpath="//div[@id='label_courtId']")
	private WebElementFacade lbl_Court;
	@FindBy(xpath="//div[@id='label_note']")
	private WebElementFacade lbl_notes;
	
	public void verifyCOurtAppearanceDetailsLabels(){
		waitABit(1000);
		
		Assert.assertTrue("Appearance date is not displayed", lbl_appearancedate.getText().trim().contains("APPEARANCE DATE"));
		/*System.out.println(lbl_terminationDate.getText());
		System.out.println(lbl_terminationReason.getText());
		System.out.println(lbl_attendanceCount.getText());*/
		Assert.assertTrue("Appearance Type is not displayed", lbl_appearancetype.getText().trim().contains("APPEARANCE TYPE"));
		Assert.assertTrue("Plea is not displayed", lbl_plea.getText().trim().contains("PLEA"));
		Assert.assertTrue("Outcome is not displayed", lbl_Outcome.getText().trim().contains("OUTCOME"));
		Assert.assertTrue("Remand Status is not displayed", lbl_remandStatus.getText().trim().contains("REMAND STATUS"));	
		Assert.assertTrue("Court is not displayed", lbl_Court.getText().trim().contains("COURT"));	
		Assert.assertTrue("Note is not displayed", lbl_notes.getText().trim().contains("NOTES"));
		
		
	}
	
	@FindBy(xpath="//div[@id='label_courtDate']/following::p[1]")
	private WebElementFacade value_appearancedate;
	@FindBy(xpath="//div[@id='label_courtAppearanceTypeId']/following::p[1]")
	private WebElementFacade value_appearancetype;
	@FindBy(xpath="//div[@id='label_pleaId']/following::p[1]")
	private WebElementFacade value_plea;
	@FindBy(xpath="//div[@id='label_outcomeId']/following::p[1]")
	private WebElementFacade value_Outcome;
	@FindBy(xpath="//div[@id='label_remandStatusId']/following::p[1]")
	private WebElementFacade value_remandStatus;
	@FindBy(xpath="//div[@id='label_courtId']/following::p[1]")
	private WebElementFacade value_Court;
	@FindBy(xpath="//div[@id='label_note']/following::p[1]")
	private WebElementFacade value_notes;
	
	public void verifyCourtAppearanceValues() {
		
		Assert.assertTrue("Appearance Date Value not matched",
				value_appearancedate.getText().trim().equals(DateFormatter.changeDateFormat(ReadXMLData
						.getXMLData("inboundXML/AE.xml", "//CourtAppearance", "./CourtDate")))); 
		Assert.assertTrue("Appearance Type value does not match with IB Xml and ui",
				value_appearancetype.getText().trim().contains(GetSRD_or_NSRDValue.getUIValue_from_SRD20("COURT APPEARANCE TYPE",
						ReadXMLData.getXMLData("inboundXML/AE.xml", "//CourtAppearance", "./CourtAppearanceType"))));
		Assert.assertTrue("Court value does not match with IB Xml and ui",
				value_plea.getText().trim().contains(GetSRD_or_NSRDValue.getUIValue_from_SRD20("PLEA",
						ReadXMLData.getXMLData("inboundXML/AE.xml", "//CourtAppearance", "./Court"))));
		Assert.assertTrue("Outcome field value does not match with IB Xml and ui",
				value_Outcome.getText().trim().contains(GetSRD_or_NSRDValue.getUIValue_from_NSRD20("DISPOSAL TYPE",
						ReadXMLData.getXMLData("inboundXML/AE.xml", "//CourtAppearance", "./Outcome"))));
		/*Assert.assertTrue("Outcome field value does not match with IB Xml and ui",
				value_remandStatus.getText().trim().contains(GetSRD_or_NSRDValue.getUIValue_from_NSRD20("DISPOSAL TYPE",
						ReadXMLData.getXMLData("inboundXML/AE.xml", "//CourtAppearance", "./Outcome"))));*/
		Assert.assertTrue("Court value does not match with IB Xml and ui",
				value_Court.getText().trim().contains(GetSRD_or_NSRDValue.getUIValue_from_NSRD20("COURT",
						ReadXMLData.getXMLData("inboundXML/AE.xml", "//CourtAppearance", "./Court"))));
		Assert.assertTrue("Requirement manager Value not matched",
				value_notes.getText().trim().contains(ReadXMLData.getXMLData("inboundXML/AE.xml","//CourtAppearance", "./Notes")));
		
	}
	
	
	
	
	@Override
	public WebElementFacade getUniqueElement() {
		// TODO Auto-generated method stub
		return btn_view;
	}
}
