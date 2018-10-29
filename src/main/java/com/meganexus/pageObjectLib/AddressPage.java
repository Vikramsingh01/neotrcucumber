package com.meganexus.pageObjectLib;

import com.meganexus.genericLib.DateFormatter;
import com.meganexus.genericLib.GetSRD_or_NSRDValue;
import com.meganexus.genericLib.ReadXMLData;

import junit.framework.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

@SuppressWarnings("deprecation")
public class AddressPage extends NeoTR_Page {
	@FindBy(xpath = "//h2[contains(text(),'Address')]")
	private WebElementFacade hdr_Address;
	@FindBy(xpath = "//a[contains(text(),'ADDRESS')]")
	private WebElementFacade lnk_Address;
	@FindBy(xpath = "//select[@ng-reflect-name='addressStatusId']")
	private WebElementFacade ddl_AddStatus;
	@FindBy(xpath = "//input[@ng-reflect-name='startDate']")
	private WebElementFacade tbx_MoveInDate;
	@FindBy(xpath = "//input[@ng-reflect-name='endDate']")
	private WebElementFacade tbx_MoveOutDate;
	@FindBy(xpath = "//input[@ng-reflect-name='buildingName']")
	private WebElementFacade tbx_buildingName;
	@FindBy(xpath = "//input[@ng-reflect-name='houseNumber']")
	private WebElementFacade tbx_houseNumber;
	@FindBy(xpath = "//input[@ng-reflect-name='streetName']")
	private WebElementFacade tbx_streetName;
	@FindBy(xpath = "//input[@ng-reflect-name='district']")
	private WebElementFacade tbx_district;
	@FindBy(xpath = "//input[@ng-reflect-name='townCity']")
	private WebElementFacade tbx_townCity;
	@FindBy(xpath = "//input[@ng-reflect-name='county']")
	private WebElementFacade tbx_county;
	@FindBy(xpath = "//input[@ng-reflect-name='postcode']")
	private WebElementFacade tbx_PostCode;
	@FindBy(xpath = "//input[@ng-reflect-name='telephoneNumber']")
	private WebElementFacade tbx_telephoneNumber;
	@FindBy(xpath = "//select[@ng-reflect-name='noFixedAbodeYesNoId']")
	private WebElementFacade ddl_noFixedAbodeYesNoId;
	@FindBy(xpath = "//textarea[@ng-reflect-name='note']")
	private WebElementFacade tbx_Notes;
	@FindBy(xpath = "//button[text()='Ok']")
	private WebElementFacade btn_Ok;
	  @FindBy(xpath = "(.//*[@id='myModal']/div/div/div[2]/p)[2]") 
		WebElementFacade txt_popup;

	public void clickOKBtn() {
		if (btn_Ok.isCurrentlyVisible()) {
			btn_Ok.click();
			waitABit(1000);
		}
	}

	public void insertAddressDetails() {
		ddl_AddStatus.selectByIndex(4);
		waitABit(200);
		tbx_MoveInDate.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//Address_ADD", "./StartDate"));
		waitABit(200);
		tbx_MoveOutDate.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//Address_ADD", "./EndDate"));
		waitABit(200);
		tbx_buildingName.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//Address_ADD", "./BuildingName"));
		waitABit(200);
		tbx_houseNumber.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//Address_ADD", "./HouseNumber"));
		waitABit(200);
		tbx_streetName.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//Address_ADD", "./StreetName"));
		waitABit(200);
		tbx_district.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//Address_ADD", "./District"));
		waitABit(200);
		tbx_townCity.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//Address_ADD", "./TownCity"));
		waitABit(200);
		tbx_county.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//Address_ADD", "./County"));
		waitABit(200);
		tbx_PostCode.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//Address_ADD", "./Postcode"));
		waitABit(200);
		tbx_telephoneNumber.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//Address_ADD", "./TelephoneNumber"));
		waitABit(200);
		ddl_noFixedAbodeYesNoId.selectByIndex(1);
		tbx_Notes.sendKeys("Addrerss added");
		waitABit(200);

	}

	public void updateAddressDetails() {

		ddl_AddStatus.selectByVisibleText(ReadXMLData.getXMLData("TestData.xml", "//Address_UPD", "./Status"));
		waitABit(200);
		tbx_MoveInDate.clear();
		waitABit(200);
		tbx_MoveInDate.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//Address_UPD", "./StartDate"));
		waitABit(200);
		tbx_PostCode.clear();
		waitABit(200);
		tbx_PostCode.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//Address_UPD", "./Postcode"));
		waitABit(200);
		tbx_Notes.clear();
		waitABit(200);
		tbx_Notes.sendKeys("Addrerss updated");
		waitABit(200);

	}

	@FindBy(xpath = "//div[contains(text(),'Address Status')]/following-sibling::p")
	private WebElementFacade txt_AddStatus;
	@FindBy(xpath = "//div[contains(text(),'Move In Date')]/following-sibling::p")
	private WebElementFacade txt_moveInDate;
	@FindBy(xpath = "//div[contains(text(),'Move Out Date')]/following-sibling::p")
	private WebElementFacade txt_moveOutDate;
	@FindBy(xpath = "//div[contains(text(),'Building Name')]/following-sibling::p")
	private WebElementFacade txt_buildingName;
	@FindBy(xpath = "//div[contains(text(),'House Number')]/following-sibling::p")
	private WebElementFacade txt_HouseNumber;
	@FindBy(xpath = "//div[contains(text(),'Street Name')]/following-sibling::p")
	private WebElementFacade txt_StreetName;
	@FindBy(xpath = "//div[contains(text(),'District')]/following-sibling::p")
	private WebElementFacade txt_District;
	@FindBy(xpath = "//div[contains(text(),'Town City')]/following-sibling::p")
	private WebElementFacade txt_TownCity;
	@FindBy(xpath = "//div[contains(text(),'County')]/following-sibling::p")
	private WebElementFacade txt_County;
	@FindBy(xpath = "//div[contains(text(),'Post Code')]/following-sibling::p")
	private WebElementFacade txt_PostCode;
	@FindBy(xpath = "//div[contains(text(),'Telephone Number')]/following-sibling::p")
	private WebElementFacade txt_TelephoneNumber;
	@FindBy(xpath = "//div[contains(text(),'No Fixed Abode')]/following-sibling::p")
	private WebElementFacade txt_NoFixedAbode;
	@FindBy(xpath = "//div[contains(text(),'Notes')]/following-sibling::p")
	private WebElementFacade txt_Notes;

	public void verifyViewAddedSUAddress() {
		Assert.assertTrue("INS xml should generate", ReadXMLData
				.getXMLData("outboundXML/ADD_Address.xml", "//SPGMessageHeader", "./MessageType").equals("INS"));
		Assert.assertTrue("Address Status is not available",
				txt_AddStatus.getText().trim().equals(GetSRD_or_NSRDValue.getUIValue_from_SRD20("ADDRESS STATUS",
						ReadXMLData.getXMLData("outboundXML/ADD_Address.xml", "//OffenderAddress", "./Status"))));
		Assert.assertTrue("Move In Date is not available",
				txt_moveInDate.getText().trim().equals(DateFormatter.changeDateFormat(
						ReadXMLData.getXMLData("outboundXML/ADD_Address.xml", "//OffenderAddress", "./StartDate"))));
		Assert.assertTrue("Move out Date is not available",
				txt_moveOutDate.getText().trim().equals(DateFormatter.changeDateFormat(
						ReadXMLData.getXMLData("outboundXML/ADD_Address.xml", "//OffenderAddress", "./EndDate"))));
		Assert.assertTrue("Building Name is not available", txt_buildingName.getText()
				.equals(ReadXMLData.getXMLData("outboundXML/ADD_Address.xml", "//OffenderAddress", "./BuildingName")));
		Assert.assertTrue("House Number is not available", txt_HouseNumber.getText()
				.equals(ReadXMLData.getXMLData("outboundXML/ADD_Address.xml", "//OffenderAddress", "./HouseNumber")));
		Assert.assertTrue("Street Name is not available", txt_StreetName.getText()
				.equals(ReadXMLData.getXMLData("outboundXML/ADD_Address.xml", "//OffenderAddress", "./StreetName")));
		Assert.assertTrue("District is not available", txt_District.getText()
				.equals(ReadXMLData.getXMLData("outboundXML/ADD_Address.xml", "//OffenderAddress", "./District")));
		Assert.assertTrue("Town/City is not available", txt_TownCity.getText()
				.equals(ReadXMLData.getXMLData("outboundXML/ADD_Address.xml", "//OffenderAddress", "./TownCity")));
		Assert.assertTrue("County is not available", txt_County.getText()
				.equals(ReadXMLData.getXMLData("outboundXML/ADD_Address.xml", "//OffenderAddress", "./County")));
		Assert.assertTrue("Post code is not available", txt_PostCode.getText()
				.equals(ReadXMLData.getXMLData("outboundXML/ADD_Address.xml", "//OffenderAddress", "./Postcode")));
		Assert.assertTrue("Telephone no is not available", txt_TelephoneNumber.getText().equals(
				ReadXMLData.getXMLData("outboundXML/ADD_Address.xml", "//OffenderAddress", "./TelephoneNumber")));
		/*
		 * Assert.assertTrue("No fixed Adobe is not available",
		 * txt_NoFixedAbode.getText().equals(GetSRD_or_NSRDValue.
		 * getUIValue_from_SRD20(" ",
		 * ReadXMLData.getXMLData("outboundXML/ADD_Address.xml",
		 * "//OffenderAddress", "./NoFixedAbode"))));
		 */
		Assert.assertTrue("notes is not available", txt_Notes.getText()
				.equals(ReadXMLData.getXMLData("outboundXML/ADD_Address.xml", "//OffenderAddress", "./Notes")));
	}

	public void verifyViewEditedSUAdd() {

		// Assert.assertTrue("Address Status not
		// matched",txt_AddStatus.getText().trim().equals(GetSRD_or_NSRDValue.getUIValue_from_SRD20("ADDRESS
		// STATUS",
		// ReadXMLData.getXMLData("inboundXML/Ao.xml", "//Address",
		// "./Status"))));
		// Assert.assertTrue("Move In Date does not matched",
		// txt_moveInDate.getText().trim()
		// .equals(ReadXMLData.getXMLData("inboundXML/Ao.xml", "//Address",
		// "./StartDate")));
		Assert.assertTrue("PostCode does not matched", txt_PostCode.getText().trim()
				.equals(ReadXMLData.getXMLData("inboundXML/Ao.xml", "//Address", "./Postcode")));
		Assert.assertTrue("notes does not matched",
				txt_Notes.getText().trim().equals(ReadXMLData.getXMLData("inboundXML/Ao.xml", "//Address", "./Notes")));

	}

	// ---------------------For Address
	// Assessment----------------------------------------------------------
	@FindBy(xpath = "//h2[text()='Address Assessment']")
	private WebElementFacade hdr_AddressAssessment;
	@FindBy(xpath = "//a[contains(text(),'Address Assessment')]")
	private WebElementFacade lnk_AddressAssessment;

	@FindBy(xpath = "//button[text()='Add']")
	private WebElementFacade btn_AddAssessment;
	@FindBy(xpath = "//span[contains(text(),'Date')]")
	private WebElementFacade lbl_Date;
	@FindBy(xpath = "//span[contains(text(),'Address Assessment Provider')]")
	private WebElementFacade lbl_AddresAssessmentProvider;
	@FindBy(xpath = "//th[contains(text(),'View')]")
	private WebElementFacade lbl_View;
	@FindBy(xpath = "//th[contains(text(),'Edit')]")
	private WebElementFacade lbl_Edit;
	@FindBy(xpath = "//th[contains(text(),'Delete')]")
	private WebElementFacade lbl_Delete;

	@FindBy(xpath = "(//button[contains(@ng-reflect-id,'addressAssessment_view')])[1]")
	private WebElementFacade btn_ViewAssessment;

	@FindBy(xpath = "(//button[contains(@ng-reflect-router-link,'address-assessment,edit')])[1]")
	private WebElementFacade btn_EditAssessment;

	public void expandAddAssessment() {
		waitABit(100);
		lnk_AddressAssessment.click();
		waitABit(100);
	}

	public void clickOnAddAssessmentBtn() {
		btn_AddAssessment.click();
		waitABit(100);
	}

	public void clickOnViewAssessmentBtn() {
		waitABit(100);
		btn_ViewAssessment.click();
		waitABit(100);
	}

	public void clickOnEditAssessmentBtn() {
		if (btn_EditAssessment.isCurrentlyVisible()) {
			btn_EditAssessment.click();
			waitABit(100);
		} else
			System.out.println("Edit btn is not available");

	}

	@Override
	public WebElementFacade getUniqueElement() {

		return lnk_Address;
	}

	public void listViewAssesmentReview() {
		Assert.assertEquals("Address assessment header not matched", hdr_AddressAssessment.getText().trim(),
				"ADDRESS ASSESSMENT");
		Assert.assertEquals("Address assessment link not matched", lnk_AddressAssessment.getText().trim(),
				"ADDRESS ASSESSMENT");
		Assert.assertEquals("Date label not matched", lbl_Date.getText().trim(), "DATE");
		Assert.assertEquals("Address Assessment Provider not matched", lbl_AddresAssessmentProvider.getText().trim(),
				"ADDRESS ASSESSMENT PROVIDER");
		Assert.assertEquals("View label is  not matched", lbl_View.getText().trim(), "VIEW");
		Assert.assertEquals("Edit label is not matched", lbl_Edit.getText().trim(), "EDIT");
		Assert.assertEquals("DELETE label is not matched", lbl_Delete.getText().trim(), "DELETE");

	}
//-------------Delete Address Assessment----------//
	@FindBy(xpath = "(//button[@id='addressAssessment_delete0'])[1]")
	private WebElementFacade btn_deleteAddressAssessment;

	public void clickDeleteAddressAssessmentBtn() {
		if (!btn_deleteAddressAssessment.isCurrentlyVisible()) {
			lnk_AddressAssessment.click();
			waitABit(100);
		}
			if (btn_deleteAddressAssessment.isCurrentlyVisible()) {
				btn_deleteAddressAssessment.click();
				waitABit(1000);
			} else
				System.out.println("Delete btn is not available");
		
	}

	public void verfiyAddressAssessmentRecordDeleted() {
		if (!btn_deleteAddressAssessment.isCurrentlyVisible()) {
			System.out.println("Delete is working for Address Assessment");
		} else
			System.out.println("Delete is not working for Address Assessment");
	}
	
	
	//-------------Delete Main Address ----------//
		@FindBy(xpath = "//td[contains(.,'Main')]/following-sibling::td//button[@id='address_delete']")
		private WebElementFacade btn_deleteMainAddress;
		
		

		public void clickDeleteMainAddress() {
			waitABit(1000);
			btn_deleteMainAddress.click();
			waitABit(1000);
//			if (!btn_deleteMainAddress.isCurrentlyVisible()) {
//				btn_deleteMainAddress.click();
//				waitABit(1000);
//			}
//				 else
//					System.out.println("Delete btn for Main Address is not available");
			
		}
		
		@FindBy(xpath = "//button[contains(.,'Close')]")
		private WebElementFacade btn_close;
		
		
	
		public void validateMainAddressDeleteErrorMessage() {
		waitABit(2000);
		if(txt_popup.isVisible())
			//System.out.println(txt_popup.getText());
		
	      Assert.assertTrue("Message in Error Pop-up box is not available",txt_popup.getText().trim().equals("Unable to delete main address, please change the address type and try again"));
	      waitABit(1000);
	      btn_close.click();
			waitABit(1000);
		
		}
}
