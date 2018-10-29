package com.meganexus.pageObjectLib;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;

import com.meganexus.genericLib.DateFormatter;
import com.meganexus.genericLib.GetSRD_or_NSRDValue;
import com.meganexus.genericLib.ReadXMLData;

import junit.framework.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class CommunityRequirementPage extends NeoTR_Page{
		
	@FindBy(xpath="//h2[text()='Requirement Details']")
	private WebElementFacade title_requirementDetails;
	@SuppressWarnings("deprecation")
	public void verifyRequirementTitle(){
		/*String a= title_viewCaseManager.getText();
		 System.out.println(a);*/
			Assert.assertTrue("View Case Manager title not displayed", title_requirementDetails.getText().trim().contains("REQUIREMENT DETAILS"));
	}
	
	//label validation
	@FindBy(xpath="//a[@id='Requirement Details']")
	private WebElementFacade lbl_requirementDetails;
	
	@FindBy(xpath="//div[@id='label_requirementTypeMainCategoryId']")
	private WebElementFacade lbl_requirementTypeMainCategory ;
	@FindBy(xpath="//div[@id='label_requirementTypeSubCategoryId']")
	private WebElementFacade lbl_requirementTypeSubCategory ;
	@FindBy(xpath="//div[@id='label_imposedDate']")
	private WebElementFacade lbl_imposedDate ;
	@FindBy(xpath="//div[@id='label_length']")
	private WebElementFacade lbl_length ;
	@FindBy(xpath="//div[@id='label_expectedStartDate']")
	private WebElementFacade lbl_expectedStartDate ;
	@FindBy(xpath="//div[@id='label_actualStartDate']")
	private WebElementFacade lbl_actualStartDate ;
	@FindBy(xpath="//div[@id='label_expectedEndDate']")
	private WebElementFacade lbl_expectedEndDate ;
	@FindBy(xpath="//div[@id='label_note']")
	private WebElementFacade lbl_note ;
	
	@SuppressWarnings("deprecation")
	public void verifyRequirementDetailsLabel()
	{
		Assert.assertTrue("Requirement Details Header not displayed", lbl_requirementDetails.getText().trim().contains("REQUIREMENT DETAILS")); 
		Assert.assertTrue("Requirement Type Main Category not displayed", lbl_requirementTypeMainCategory.getText().trim().contains("Requirement Type Main Category")); 
		Assert.assertTrue("Requirement Type Sub Category not displayed ", lbl_requirementTypeSubCategory.getText().trim().contains("Requirement Type Sub Category"));
		Assert.assertTrue("Imposed(Sentence) Date not displayed ", lbl_imposedDate.getText().trim().contains("Imposed(Sentence) Date"));
		Assert.assertTrue("Length not displayed ", lbl_length.getText().trim().contains("Length"));
		Assert.assertTrue("Expected Start Date not displayed ", lbl_expectedStartDate.getText().trim().contains("Expected Start Date"));
		Assert.assertTrue("Actual Start Date not displayed ", lbl_actualStartDate.getText().trim().contains("Actual Start Date"));
		Assert.assertTrue("Expected End Date not displayed ", lbl_expectedEndDate.getText().trim().contains("Expected End Date"));
		Assert.assertTrue("Notes not displayed ", lbl_note.getText().trim().contains("Notes"));
	}
	
	//For label Value validation with XML
	@FindBy(xpath="//div[@id='label_requirementTypeMainCategoryId']/following::tr-list-label[1]")
	private WebElementFacade value_requirementTypeMainCategory ;
	@FindBy(xpath="//div[@id='label_requirementTypeSubCategoryId']/following::tr-list-label[1]")
	private WebElementFacade value_requirementTypeSubCategory ;
	@FindBy(xpath="//div[@id='label_imposedDate']/following::p[1]")
	private WebElementFacade value_imposedDate ;
	@FindBy(xpath="//div[@id='label_expectedStartDate']/following::p[1]")
	private WebElementFacade value_expectedStartDate ;
	@FindBy(xpath="//div[@id='label_actualStartDate']/following::p[1]")
	private WebElementFacade value_actualStartDate ;
	@FindBy(xpath="//div[@id='label_expectedEndDate']/following::p[1]")
	private WebElementFacade value_expectedEndDate ;
	@FindBy(xpath="//div[@id='label_note']/following::p[1]")
	private WebElementFacade value_note ;
	
	@SuppressWarnings("deprecation")
	public void verifyRequirementValues() {
								
		Assert.assertTrue("RequirementTypeMainCategory value does not match with IB Xml and ui",
				value_requirementTypeMainCategory.getText().trim().contains(GetSRD_or_NSRDValue.getUIValue_from_NSRD20("REQUIREMENT MAIN TYPE",
						ReadXMLData.getXMLData("inboundXML/AE.xml", "//CommunityRequirement", "./RequirementTypeMainCategory"))));
		Assert.assertTrue("requirementTypeSubCategory value does not match with IB Xml and ui",
				value_requirementTypeSubCategory.getText().trim().contains(GetSRD_or_NSRDValue.getUIValue_from_SRD20("REQUIREMENT SUB CATEGORY",
						ReadXMLData.getXMLData("inboundXML/AE.xml", "//CommunityRequirement", "./RequirementTypeSubCategory"))));
		Assert.assertTrue("Imposed(Sentence)Date Value not matched",
				value_imposedDate.getText().trim().equals(DateFormatter.changeDateFormat(ReadXMLData
						.getXMLData("inboundXML/AE.xml", "//CommunityRequirement", "./ImposedDate")))); 
		
		Assert.assertTrue("Expected Start Date Date Value not matched",
				value_expectedStartDate.getText().trim().equals(DateFormatter.changeDateFormat(ReadXMLData
						.getXMLData("inboundXML/AE.xml", "//CommunityRequirement", "./ExpectedStartDate")))); 
		Assert.assertTrue("Actual Start Date Date Value not matched",
				value_actualStartDate.getText().trim().equals(DateFormatter.changeDateFormat(ReadXMLData
						.getXMLData("inboundXML/AE.xml", "//CommunityRequirement", "./ActualStartDate")))); 	
		/*Assert.assertTrue("Expected End Date Value not matched",
				value_actualStartDate.getText().trim().equals(DateFormatter.changeDateFormat(ReadXMLData
						.getXMLData("inboundXML/AE.xml", "//CommunityRequirement", "./ExpectedEndDate")))); */
		//Expected End Date is not present in AE
		Assert.assertTrue("Notes Value not matched",
				value_note.getText().trim().contains(ReadXMLData.getXMLData("inboundXML/AE.xml","//CommunityRequirement", "./Notes")));
		
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
		System.out.println("Back Button is not available for Requirement Details Screen");
		}
		
	}
	
	
	//*******Terminate Requirement*****************
	
	@FindBy(xpath="//a[@id='Terminate Requirement']")
	private WebElementFacade hdr_terminateRequirement;
	@FindBy(xpath="//label[@id='label_actualEndDate']")
	private WebElementFacade lbl_terminationDate;
	@FindBy(xpath="//label[@id='label_terminationReasonId']")
	private WebElementFacade lbl_terminationReason;
	@FindBy(xpath="//label[@id='label_attendanceCount']")
	private WebElementFacade lbl_attendanceCount;
	@FindBy(xpath="//label[@id='label_terminationNote']")
	private WebElementFacade lbl_notes;
	
	@SuppressWarnings("deprecation")
	public void verifyTerminateRequirementLabels(){
		waitABit(1000);
		hdr_terminateRequirement.click();
		waitABit(1000);
		Assert.assertTrue("Terminate Requirement Header not displayed", hdr_terminateRequirement.getText().trim().contains("TERMINATE REQUIREMENT"));
		System.out.println(lbl_terminationDate.getText());
		System.out.println(lbl_terminationReason.getText());
		System.out.println(lbl_attendanceCount.getText());
		Assert.assertTrue("Termination Date is not displayed", lbl_terminationDate.getText().trim().contains("TERMINATION DATE *"));
		Assert.assertTrue("Termination Reason is not displayed", lbl_terminationReason.getText().trim().contains("TERMINATION REASON *"));
		Assert.assertTrue("Note is not displayed", lbl_notes.getText().trim().contains("NOTES"));
		
		if(lbl_attendanceCount.isVisible())
		{
		waitABit(2000);
		if (lbl_attendanceCount.isCurrentlyVisible()) {
			Assert.assertTrue("Attendance Count is not displayed", lbl_attendanceCount.getText().trim().contains("ATTENDANCE COUNT *"));
			waitABit(2000);
	} else
		System.out.println("Attendance Count is not available for this Requirement.");
		}
		
	}
	
	@FindBy(xpath="//label[@id='label_actualEndDate']/following::input[1]")
	private WebElementFacade txt_terminationDate;
	@FindBy(xpath="//label[@id='label_terminationReasonId']/following::select[1]")
	private WebElementFacade ddl_terminationReason;
	@FindBy(xpath="//label[@id='label_attendanceCount']/following::input[1]")
	private WebElementFacade txt_attendanceCount;
	@FindBy(xpath="//label[@id='label_terminationNote']/following::textarea[1]")
	private WebElementFacade txt_notes;
	@FindBy(xpath="//button[@id='saveButton']")
	private WebElementFacade btn_submit;
	@FindBy(xpath="//button[@id='cancelButton']")
	private WebElementFacade btn_clear;	
	@FindBy(xpath="//button[@class='btn button'][2]")
	private WebElementFacade btn_ok;	
	
	public void terminateRequirement(){
		btn_submit.click(); //Mandatory field
		waitABit(2000);
		txt_terminationDate.clear();
		txt_terminationDate.sendKeys("09/06/2017");
		//ddl_terminationReason.clear();
		waitABit(1000);
		ddl_terminationReason.selectByValue("86");
		
		if(lbl_attendanceCount.isVisible())
		{
		waitABit(2000);
		txt_attendanceCount.sendKeys("2");
	} else{
		System.out.println("Attendance Count is not available for this Requirement.");
		}
		
		txt_notes.sendKeys("Requirement Terminated");
		waitABit(1000);
		
		btn_clear.click();// clear function
		
		waitABit(2000);
		txt_terminationDate.clear();
		txt_terminationDate.sendKeys("09/06/2017");
		//ddl_terminationReason.clear();
		waitABit(1000);
		ddl_terminationReason.selectByValue("86");
		
		if(lbl_attendanceCount.isVisible())
		{
		waitABit(2000);
		txt_attendanceCount.sendKeys("2");
	} else{
		System.out.println("Attendance Count is not available for this Requirement.");
		}
		
		txt_notes.sendKeys("Terminating Requirement");
		waitABit(1000);
		btn_submit.click();
		
//		Alert
		btn_ok.click();
		
		waitABit(2000);
	}
	
	
	
	
	@Override
	public WebElementFacade getUniqueElement() {
		// TODO Auto-generated method stub
		return btn_submit;
	}
}
