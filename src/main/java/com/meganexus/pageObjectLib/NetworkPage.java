package com.meganexus.pageObjectLib;

import com.meganexus.genericLib.GetSRD_or_NSRDValue;
import com.meganexus.genericLib.ReadXMLData;

import junit.framework.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

@SuppressWarnings("deprecation")
public class NetworkPage extends NeoTR_Page {
	@FindBy(xpath = "//a[contains(text(),'Network')]")
	private WebElementFacade lnk_Network;

	@FindBy(xpath = "//select[@ng-reflect-name='titleId']")
	private WebElementFacade ddl_title;

	@FindBy(xpath = "//input[@ng-reflect-name='firstName']")
	private WebElementFacade tbx_FirstName;

	@FindBy(xpath = "//input[@ng-reflect-name='familyName']")
	private WebElementFacade tbx_FamilyName;

	@FindBy(xpath = "//input[@ng-reflect-name='relationshipToOffenderId']")
	private WebElementFacade tbx_RelToSU;

	@FindBy(xpath = "//select[@ng-reflect-name='relationshipId']")
	private WebElementFacade ddl_RelType;

	@FindBy(xpath = "//input[@ng-reflect-name='buildingName']")
	private WebElementFacade tbx_BuildingName;

	@FindBy(xpath = "//input[@ng-reflect-name='townCity']")
	private WebElementFacade tbx_City;

	@FindBy(xpath = "//textarea[@ng-reflect-name='note']")
	private WebElementFacade tbx_notes;
	@FindBy(xpath = "//select[@ng-reflect-name='genderId']")
	private WebElementFacade ddl_gender;
	@FindBy(xpath = "//input[@ng-reflect-name='otherName']")
	private WebElementFacade tbx_OtherName;
	@FindBy(xpath = "//input[@ng-reflect-name='previousSurname']")
	private WebElementFacade tbx_previousSurname;
	@FindBy(xpath = "//input[@ng-reflect-name='houseNumber']")
	private WebElementFacade tbx_houseNumber;
	@FindBy(xpath = "//input[@ng-reflect-name='streetName']")
	private WebElementFacade tbx_streetName;
	@FindBy(xpath = "//input[@ng-reflect-name='district']")
	private WebElementFacade tbx_district;
	@FindBy(xpath = "//input[@ng-reflect-name='county']")
	private WebElementFacade tbx_county;
	@FindBy(xpath = "//input[@ng-reflect-name='postCode']")
	private WebElementFacade tbx_postCode;
	@FindBy(xpath = "//input[@ng-reflect-name='mobileNumber']")
	private WebElementFacade tbx_mobileNumber;
	@FindBy(xpath = "//input[@ng-reflect-name='telephoneNumber']")
	private WebElementFacade tbx_telephoneNumber;
	@FindBy(xpath = "//input[@ng-reflect-name='startDate']")
	private WebElementFacade tbx_startDate;
	@FindBy(xpath = "//input[@ng-reflect-name='endDate']")
	private WebElementFacade tbx_endDate;
	@FindBy(xpath = "//input[@ng-reflect-name='emailAddress']")
	private WebElementFacade tbx_emailAddress;

	public void inserDataForNetwork() {
		//System.out.println(ddl_title.getSelectOptions());
		ddl_title.selectByVisibleText(ReadXMLData.getXMLData("TestData.xml", "//Network_ADD", "./Title"));
		waitABit(500);
		tbx_FirstName.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//Network_ADD", "./FirstName"));
		waitABit(500);
		tbx_OtherName.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//Network_ADD", "./OtherNames"));
		waitABit(500);
		tbx_previousSurname.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//Network_ADD", "./PreviousSurname"));
		waitABit(500);
		tbx_FamilyName.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//Network_ADD", "./FamilyName"));
		waitABit(500);
		ddl_RelType.selectByVisibleText(ReadXMLData.getXMLData("TestData.xml", "//Network_ADD", "./RelationshipType"));
		waitABit(500);
		tbx_RelToSU.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//Network_ADD", "./RelationshipToOffender"));
		waitABit(500);
		ddl_gender.selectByVisibleText(ReadXMLData.getXMLData("TestData.xml", "//Network_ADD", "./Gender"));
		waitABit(500);
		tbx_BuildingName.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//Network_ADD", "./BuildingName"));
		waitABit(500);
		tbx_houseNumber.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//Network_ADD", "./HouseNumber"));
		waitABit(500);
		tbx_streetName.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//Network_ADD", "./StreetName"));
		waitABit(500);
		tbx_district.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//Network_ADD", "./District"));
		waitABit(500);
		tbx_City.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//Network_ADD", "./TownCity"));
		waitABit(500);
		tbx_county.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//Network_ADD", "./County"));
		waitABit(500);
		tbx_postCode.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//Network_ADD", "./Postcode"));
		waitABit(500);
		tbx_mobileNumber.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//Network_ADD", "./MobileNumber"));
		waitABit(500);
		tbx_telephoneNumber.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//Network_ADD", "./TelephoneNumber"));
		waitABit(500);
		tbx_startDate.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//Network_ADD", "./StartDate"));
		waitABit(500);
		tbx_endDate.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//Network_ADD", "./EndDate"));
		waitABit(500);
		tbx_emailAddress.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//Network_ADD", "./EmailAddress"));
		tbx_notes.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//Network_ADD", "./Notes"));
		waitABit(500);

	}

	public void updateNetwork() {
		ddl_title.selectByVisibleText(ReadXMLData.getXMLData("TestData.xml", "//Network_UPD", "./Title"));
		waitABit(100);
		tbx_FirstName.clear();
		waitABit(100);
		tbx_FirstName.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//Network_UPD", "./FirstName"));
		waitABit(100);
		tbx_FamilyName.clear();
		waitABit(100);
		tbx_FamilyName.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//Network_UPD", "./FamilyName"));
		waitABit(500);
		ddl_RelType.selectByVisibleText(ReadXMLData.getXMLData("TestData.xml", "//Network_UPD", "./RelationshipType"));
		waitABit(100);
		tbx_RelToSU.clear();
		waitABit(100);
		tbx_RelToSU.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//Network_UPD", "./RelationshipToOffender"));
		waitABit(500);
		ddl_gender.selectByVisibleText(ReadXMLData.getXMLData("TestData.xml", "//Network_UPD", "./Gender"));
		waitABit(500);
		tbx_notes.sendKeys("Contact updated");
		waitABit(200);
		tbx_endDate.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//Network_UPD", "./EndDate"));
		waitABit(500);

	}

	@FindBy(xpath = "//button[text()='Back']")
	private WebElementFacade btn_back;

	@FindBy(xpath = "//div[contains(text(), 'title ')]/following-sibling::div[1]")
	private WebElementFacade txt_title;

	@FindBy(xpath = "//div[contains(text(), 'first')]/following-sibling::div[1]")
	private WebElementFacade txt_firstName;

	@FindBy(xpath = "//div[contains(text(), 'family Name')]/following-sibling::div[1]")
	private WebElementFacade txt_FamilyName;

	@FindBy(xpath = "//div[contains(text(), 'relationship type')]/following-sibling::div[1]")
	private WebElementFacade txt_RelType;

	@FindBy(xpath = "//div[contains(text(), 'relationship To SU ')]/following-sibling::div[1]")
	private WebElementFacade txt_RelToSU;

	@FindBy(xpath = "//div[contains(text(), 'building Name')]/following-sibling::div[1]")
	private WebElementFacade txt_Building;

	@FindBy(xpath = "//div[contains(text(), 'town/City')]/following-sibling::div[1]")
	private WebElementFacade txt_Town;

	@FindBy(xpath = "//div[contains(text(), 'notes')]/following-sibling::div[1]")
	private WebElementFacade txt_Notes;

	public void networkViewFieldVerificationWithIB_XML() {
		Assert.assertTrue("Title not matched",
				txt_title.getText().trim().equals(GetSRD_or_NSRDValue.getUIValue_from_SRD20("TITLE",
						ReadXMLData.getXMLData("inboundXML/Ao.xml", "//PersonalContact", "./Title"))));
		Assert.assertTrue("first name not matched", txt_firstName.getText().trim()
				.equals(ReadXMLData.getXMLData("inboundXML/Ao.xml", "//PersonalContact", "./FirstName")));
		Assert.assertTrue("Family name not matched", txt_FamilyName.getText().trim()
				.equals(ReadXMLData.getXMLData("inboundXML/Ao.xml", "//PersonalContact", "./FamilyName")));
		Assert.assertTrue("Relationship to SU not matched", txt_RelToSU.getText().trim()
				.equals(ReadXMLData.getXMLData("inboundXML/Ao.xml", "//PersonalContact", "./RelationshipToOffender")));
		Assert.assertTrue("Relationship Type does not matched",
				txt_title.getText().trim().equals(GetSRD_or_NSRDValue.getUIValue_from_SRD20(
						"PERSONAL CONTACT - RELATIONSHIP TYPE", ReadXMLData.getXMLData("inboundXML/Ao.xml",
								"//PersonalContact", "./RelationshipType"))));
		Assert.assertTrue("Building Name not matched", txt_Building.getText().trim()
				.equals(ReadXMLData.getXMLData("inboundXML/Ao.xml", "//PersonalContact", "./BuildingName")));
		Assert.assertTrue("Town/City not matched", txt_Town.getText().trim()
				.equals(ReadXMLData.getXMLData("inboundXML/Ao.xml", "//PersonalContact", "./TownCity")));
		Assert.assertTrue("Notes not matched", txt_Notes.getText().trim()
				.equals(ReadXMLData.getXMLData("inboundXML/Ao.xml", "//PersonalContact", "./Notes")));

	}

	@Override
	public WebElementFacade getUniqueElement() {
		return lnk_Network;
	}

	public void fieldValueVerificationAddNetwork() {
		//verifyBreadCrumbs("Service User Summary Contact Information Add Network");
	}

	public void fieldValueVerificationEditNetwork() {
		//verifyBreadCrumbs("Service User Summary Contact Information Edit Network");
	}

	public void invalidValueForNetwork() {
		System.out.println(ReadXMLData.getXMLData("TestData.xml", "//Network_UPD", "./Title"));
		ddl_title.selectByVisibleText(ReadXMLData.getXMLData("TestData.xml", "//Network_UPD", "./Title"));
		waitABit(100);
		tbx_FirstName.clear();
		waitABit(100);
		tbx_FirstName.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//Network_UPD", "./FirstName"));
		waitABit(100);
		tbx_FamilyName.clear();
		waitABit(100);
		tbx_FamilyName.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//Network_UPD", "./FamilyName"));
		waitABit(500);
		ddl_RelType.selectByVisibleText(ReadXMLData.getXMLData("TestData.xml", "//Network_UPD", "./RelationshipType"));
		waitABit(100);
		tbx_RelToSU.clear();
		waitABit(100);
		tbx_RelToSU.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//Network_UPD", "./RelationshipToOffender"));
		waitABit(500);
		ddl_gender.selectByVisibleText(ReadXMLData.getXMLData("TestData.xml", "//Network_UPD", "./Gender"));
		waitABit(500);
		tbx_mobileNumber.clear();
		tbx_mobileNumber.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//Network_ADD", "./InvalidMobileNumber"));
		waitABit(500);
		tbx_telephoneNumber.clear();
		waitABit(500);
		tbx_telephoneNumber
				.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//Network_ADD", "./InvalidTelephoneNumber"));
		waitABit(500);
		tbx_startDate.clear();
		waitABit(500);
		tbx_startDate.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//Network_ADD", "./InvalidStartDate"));
		waitABit(500);
		tbx_endDate.clear();
		tbx_endDate.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//Network_UPD", "./InvalidEndDate"));
		waitABit(200);

	}

}
