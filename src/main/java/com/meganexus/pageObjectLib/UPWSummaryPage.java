package com.meganexus.pageObjectLib;
import com.meganexus.genericLib.GetSRD_or_NSRDValue;
import com.meganexus.genericLib.ReadXMLData;

import junit.framework.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

@SuppressWarnings("deprecation")
public class UPWSummaryPage  extends NeoTR_Page {
	
	@FindBy(xpath="//h2[text()='Overview']")
	private WebElementFacade lbl_overview;
	@FindBy(xpath="//div[@class='sum-det-inner-div']/div[1]")
	private WebElementFacade lbl_totalHrsOrdered;
	@FindBy(xpath="//div[@class='sum-det-inner-div']/div[2]")
	private WebElementFacade lbl_adjustmentAmount;
	@FindBy(xpath="//div[@class='sum-det-inner-div']/div[3]")
	private WebElementFacade lbl_totalHrsWorked;
	@FindBy(xpath="//div[@class='sum-det-inner-div']/div[4]")
	private WebElementFacade lbl_totalHrsLeft;
	
	
	@FindBy(xpath="//h2[text()='Notes']")
	private WebElementFacade lbl_notes;
	
	
	public void validateUPWSummaryLabels() {
		
		System.out.println(lbl_overview.getText());
		Assert.assertTrue("Overviewlabel is not displayed", lbl_overview.getText().equals("OVERVIEW"));
		Assert.assertTrue("Total Hours Ordered label is not displayed" , lbl_totalHrsOrdered.getText().contains("Total Hours Ordered:"));
		Assert.assertTrue("Adjustment Amount label is not displayed" , lbl_adjustmentAmount.getText().contains("Adjustment Amount:"));
		Assert.assertTrue("Total Hours Worked label is not displayed" , lbl_totalHrsWorked.getText().contains("Total Hours Worked:"));
		Assert.assertTrue("Total Hours Left label is not displayed" , lbl_totalHrsLeft.getText().contains("Total Hours Left:"));
		Assert.assertTrue("Notes label is not displayed" , lbl_notes.getText().equals("NOTES"));
	}
	
	@FindBy(xpath="//a[contains(text(),'Upw Detail')]")
	private WebElementFacade lnkHdr_upwDetail;
	@FindBy(xpath="//th/span[contains(text(),'Event ID')]")
	private WebElementFacade tblHdr_eventId;
	@FindBy(xpath="//th/span[contains(text(),'Event Type')]")
	private WebElementFacade tblHdr_eventType;
	@FindBy(xpath="//th/span[contains(text(),'Hours Ordered')]")
	private WebElementFacade tblHdr_hrsOrderd;
	@FindBy(xpath="//th/span[contains(text(),'Status')]")
	private WebElementFacade tblHdr_status;
	@FindBy(xpath="//th/span[text()='Adjustment']")
	private WebElementFacade tblHdr_adjustment;
	@FindBy(xpath="//th/span[text()='Adjustment Date']")
	private WebElementFacade tblHdr_adjustmentDate;
	@FindBy(xpath="(//th[text()='View'])[1]")
	private WebElementFacade tblHdr_view;
	@FindBy(xpath="(//th[text()='Edit'])[1]")
	private WebElementFacade tblHdr_edit;
	

	public void validateUPWDetailListLabel(){
		System.out.println(lnkHdr_upwDetail.getText());
		Assert.assertTrue("UPW Details link header is not correct" , lnkHdr_upwDetail.getText().trim().equals("UPW DETAILS"));
		Assert.assertTrue("Event ID header label is not correct" , tblHdr_eventId.getText().equals("EVENT ID"));
		Assert.assertTrue("Event Type header label is not correct" , tblHdr_eventType.getText().equals("EVENT TYPE"));
		Assert.assertTrue("HOURS ORDERED header label is not correct" , tblHdr_hrsOrderd.getText().equals("HOURS ORDERED"));
		Assert.assertTrue("STATUS header label is not correct" , tblHdr_status.getText().equals("STATUS"));
		Assert.assertTrue("ADJUSTMENT header label is not correct" , tblHdr_adjustment.getText().equals("ADJUSTMENT"));
		Assert.assertTrue("ADJUSTMENT DATE header label is not correct" , tblHdr_adjustmentDate.getText().equals("ADJUSTMENT DATE"));
		Assert.assertTrue("VIEW header label is not correct" , tblHdr_view.getText().equals("VIEW"));
		Assert.assertTrue("EDIT header label is not correct" , tblHdr_edit.getText().equals("EDIT"));
	}
	
	//Validate value from Inbound xml
	@FindBy(xpath="//div[@class='sum-det-inner-div']/div[1]/strong")
	private WebElementFacade value_totalHoursOrdered;
	@FindBy(xpath="//div[@class='sum-det-inner-div']/div[2]/strong")
	private WebElementFacade value_adjustmentAmount;
	@FindBy(xpath="//div[@class='sum-det-inner-div']/div[3]/strong")
	private WebElementFacade value_totalHrsWorked;
	@FindBy(xpath="//div[@class='sum-det-inner-div']/div[4]/strong")
	private WebElementFacade value_totalHrsLeft;
	@FindBy(xpath="//tr[1]/td[1]")
	private WebElementFacade firstRowValue_event;
	@FindBy(xpath="//tr[1]/td[2]")
	private WebElementFacade firstRowValue_eventType;
	@FindBy(xpath="//tr[1]/td[3]")
	private WebElementFacade firstRowValue_hoursOrdered;
	@FindBy(xpath="//tr[1]/td[4]")
	private WebElementFacade firstRowValue_status;
	@FindBy(xpath="//tr[1]/td[5]")
	private WebElementFacade firstRowValue_adjustment;
	@FindBy(xpath="//tr[1]/td[6]")
	private WebElementFacade firstRowValue_adjustmentDate;
	
	
	//Verify List of UPW details

	@FindBy(xpath = "//tbody/tr[1]")
	private WebElementFacade firstRowUPWDetail;

	public void verifyFirstRowUPWDetail() {
		if (firstRowUPWDetail.isVisible())
			System.out.println("UPW Detail list is available in list");
		else
			System.out.println("UPW Detail is not available");
	}

	public String minutesToHourConvertor(int min)
	{
		String startTime = "00:00";
	    int minutes = min;
	    int h = minutes / 60 + Integer.parseInt(startTime.substring(0,1));
	    int m = minutes % 60 + Integer.parseInt(startTime.substring(3,4));
	    String newtime = h+":"+m;
	    return newtime;
	}
	//Validate the value present with Inbound xml
	public void validateUpwSummaryWithInboundXML() {
		
		Assert.assertTrue("Total hours value not matched",value_totalHoursOrdered.getText().trim().equals(ReadXMLData.getXMLData("inboundXML/AE.xml", "//CommunityRequirement", "./Length")));
		Assert.assertTrue("Adjustment Amount value not matched",value_adjustmentAmount.getText().trim().equals(minutesToHourConvertor(Integer.parseInt(ReadXMLData.getXMLData("inboundXML/AE.xml", "//UPWAdjustment", "./AdjustmentAmount")))));
		Assert.assertTrue("Total hours worked value not matched",value_totalHrsWorked.getText().trim().equals(minutesToHourConvertor(Integer.parseInt(ReadXMLData.getXMLData("inboundXML/AE.xml", "//UPWAppointment", "./MinutesCredited")))));
		Assert.assertTrue("Total hours left value not matched",value_totalHrsLeft.getText().trim().equals(""));
		
		Assert.assertTrue("Event No value not matched",firstRowValue_event.getText().trim().equals(ReadXMLData.getXMLData("inboundXML/AE.xml", "//Event", "./EventNumber")));
		Assert.assertTrue("Event type value not matched",firstRowValue_eventType.getText().trim().equals(ReadXMLData.getXMLData("inboundXML/AE.xml", "//Event", "./OrderType")));
		Assert.assertTrue("Hours Ordered value not matched",firstRowValue_hoursOrdered.getText().trim().equals(ReadXMLData.getXMLData("inboundXML/AE.xml", "//CommunityRequirement", "./Length")));
		Assert.assertTrue("Status value not matched",firstRowValue_status.getText().trim().equals(GetSRD_or_NSRDValue.getUIValue_from_SRD20("UPW STATUS",ReadXMLData.getXMLData("inboundXML/AE.xml", "//UPWDetails", "./UPWStatus"))));
		Assert.assertTrue("Adjustment value not matched",firstRowValue_adjustment.getText().trim().equals(minutesToHourConvertor(Integer.parseInt(ReadXMLData.getXMLData("inboundXML/AE.xml", "//UPWAdjustment", "./AdjustmentAmount")))));
		Assert.assertTrue("Adjustment date value not matched",firstRowValue_adjustmentDate.getText().trim().equals(ReadXMLData.getXMLData("inboundXML/AE.xml", "//UPWAdjustment", "./AdjustmentDate")));
	}
	
	
	//For clicking on view UPW detail button
	@FindBy(xpath="//button[@id='upw_detail_view0']")
	private WebElementFacade btn_viewUPWDetail;
	@FindBy(xpath="//button[@id='upw_detail_edit0']")
	private WebElementFacade btn_editUPWDetail;
	
	public void clickOnView(){
		btn_viewUPWDetail.click();
	}
	//For clicking on Edit UPW detail button
	public void clickOnEdit(){
		btn_editUPWDetail.click();
	}
	//==============For Edit UPW Details (Edit Summary)page====================================
	
	@FindBy(xpath="//a[@id='UPW Summary']")
	private WebElementFacade lnkHdrUPWSummary;
	
	@FindBy(xpath="////label[@for='eventNumber']")
	private WebElementFacade lblEd_event;
	@FindBy(xpath="//label[@for='agreedTravelFare']")
	private WebElementFacade lblEd_agreedTravelFare;
	@FindBy(xpath="//label[@for='workedIntensivelyYesNoId']")
	private WebElementFacade lblEd_workedIntesively;
	@FindBy(xpath="//label[@for='upwStatusId']")
	private WebElementFacade lblEd_upwStatus;
	@FindBy(xpath="//label[@for='totalHoursOrdered']")
	private WebElementFacade lblEd_totalHrsOrdered;
	@FindBy(xpath="//label[@for='adjustment']")
	private WebElementFacade lblEd_adjustment;
	@FindBy(xpath="//label[@for='totalHoursWorked']")
	private WebElementFacade lblEd_totalHrsWorked;
	@FindBy(xpath="//label[@for='totalHoursLeft']")
	private WebElementFacade lblEd_totalHrsLeft;
	
	
	public void validateLabelOnEditUPWDetail()  //For Edit UPW Summary Page
	{
		System.out.println(lblEd_agreedTravelFare.getText());
		Assert.assertTrue("Edit UPW Summary header label did not display" , lnkHdrUPWSummary.getText().equals("UPW SUMMARY"));
		Assert.assertTrue("Agreed Travel Fare label did not display" , lblEd_agreedTravelFare.getText().trim().equals("AGREED TRAVEL FARE (£)"));
		Assert.assertTrue("Worked Intesively label did not display" , lblEd_workedIntesively.getText().equals("WORKED INTENSIVELY"));
		Assert.assertTrue("Status label did not display" , lblEd_upwStatus.getText().contains("STATUS"));
		Assert.assertTrue("Total Hours Ordered label did not display" , lblEd_totalHrsOrdered.getText().contains("TOTAL HOURS ORDERED"));
		Assert.assertTrue("Adjustment label did not display" , lblEd_adjustment.getText().contains("ADJUSTMENT"));
		Assert.assertTrue("Total Hours Worked label did not display" , lblEd_totalHrsWorked.getText().contains("TOTAL HOURS WORKED"));
		Assert.assertTrue("Total Hours Left label did not display" , lblEd_totalHrsLeft.getText().contains("TOTAL HOURS LEFT"));
		
	}
	//Enter details in Edit UPW Details page
	
	@FindBy(xpath="//input[@id='upwLengthInMinutes']")
	private WebElementFacade tbx_upwLength;  //May be hours ordered
	@FindBy(xpath="//input[@id='agreedTravelFare']")
	private WebElementFacade tbx_agreedTravelFare;
	@FindBy(xpath="//select[@id='workedIntensivelyYesNoId']")
	private WebElementFacade ddl_workdedIntesively;
	@FindBy(xpath="//select[@id='upwStatusId']")
	private WebElementFacade ddl_upwStatus;
	
	
	public void enterValueInEditUPWDetail(){
		tbx_agreedTravelFare.clear();
		tbx_agreedTravelFare.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//Edit_UPWDetails", "./AgreedTravelFare"));
	}
	 
	@FindBy(xpath="//div[text()='Agreed Travel Fare']/following-sibling::p")
	private WebElementFacade value_agreedTravelFare;
	
	public void validateEditedUPWDetails(){
		System.out.println(value_agreedTravelFare.getText());
		Assert.assertTrue("Agreed travel fare did not match with Outbound xml" , value_agreedTravelFare.getText().trim().
				equals(ReadXMLData.getXMLData("TestData.xml", "//Edit_UPWDetails", "./AgreedTravelFare")));
		
	}
	//Click on Submit button
	@FindBy(xpath="//button[text()='Submit']")
	private WebElementFacade btn_submit;
	
	public void clickOnSubmit(){
		btn_submit.click();
	}
	
	
	
	@Override
	public WebElementFacade getUniqueElement() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}