package com.meganexus.pageObjectLib;

import com.meganexus.genericLib.ReadXMLData;

import junit.framework.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class DrugTestProfilePage extends NeoTR_Page{

	
	@FindBy(xpath = "//a[contains(text(),'Referral')]")
	public WebElementFacade lnk_referral;
	@FindBy(xpath = "//h2[text()='Add Drug Test Profile']")
	public WebElementFacade hdr_drugTestProfile;
	@FindBy(xpath = "//a[contains(text(),'Drug Test Profile')]")
	public WebElementFacade lnk_drugTestProfile;
    @FindBy(xpath = ".//*[@id='drugTestProfile_addButton']")
	public WebElementFacade btn_addDrugTestProfile;
    @FindBy(xpath = ".//*[@id='drugTestProfile_editButton']")
	public WebElementFacade btn_editDrugTestProfile;
    
    //Buttons locators
    @FindBy(xpath = ".//*[@id='cancelButton']")
	private WebElementFacade btn_cancel;
	@FindBy(xpath = ".//*[@id='saveButton']")
	private WebElementFacade btn_submit;
	@FindBy(xpath = ".//*[@id='addToListButton']")
	private WebElementFacade btn_addToList;
	@FindBy(xpath = "(//button[contains(text(),'Remove')])[1]")
	private WebElementFacade btn_remove;
    
	public void clickAddDrugTestProfileBtn() {
		btn_addDrugTestProfile.click();
		waitABit(1000);
	}
	public void clickEditDrugTestProfileBtn() {
		btn_editDrugTestProfile.click();
		waitABit(1000);
	}

	//Add Page Labels Locators
		
			@FindBy(xpath = "//label[@for='dateAssessed']")
			private WebElementFacade lbl_dateAssessed;
			@FindBy(xpath = "//label[@for='crcId']")
			private WebElementFacade lbl_crc;
			@FindBy(xpath = "//label[@for='teamId']")
			private WebElementFacade lbl_team;
			@FindBy(xpath = "//label[@for='officerId']")
			private WebElementFacade lbl_officerId;
			@FindBy(xpath = "//label[@for='mainDrugId']")
			private WebElementFacade lbl_mainDrug;
			@FindBy(xpath = "//label[@for='addMainDrugYesNoId']")
			private WebElementFacade lbl_addMainDrugYesNo;
			@FindBy(xpath = "//label[@for='estimatedWeekelyCost']")
			private WebElementFacade lbl_estimatedWeekelyCost;
			@FindBy(xpath = "//label[@for='notes']")
			private WebElementFacade lbl_notes;
			@FindBy(xpath = "//label[@for='drugToBeTestedForId']")
			private WebElementFacade lbl_drugToBeTestedFor;
			
			  @SuppressWarnings("deprecation")
			public void drugTestProfilePageLabelVerification(){
					
					waitABit(4000);
					Assert.assertTrue("Date Assessed label is not available ", lbl_dateAssessed.getText().trim().equals("DATE ASSESSED *"));
					Assert.assertTrue("Crc label is not available ", lbl_crc.getText().trim().equals("CRC *"));
                    Assert.assertTrue("Team label is not available ", lbl_team.getText().trim().equals("TEAM *"));
                    Assert.assertTrue("Officer is not available ", lbl_officerId.getText().trim().equals("OFFICER *"));

					Assert.assertTrue("Notes label is not available ", lbl_notes.getText().trim().equals("NOTES"));
					Assert.assertTrue("Main Drug label is not available ", lbl_mainDrug.getText().trim().equals("MAIN DRUG *"));
					Assert.assertTrue("Add Main Drug to test list label is not available ", lbl_addMainDrugYesNo.getText().trim().equals("ADD MAIN DRUG TO TEST LIST? *"));

					Assert.assertTrue("Estimated weekly cost of habit label is not available ", lbl_estimatedWeekelyCost.getText().trim().equals("ESTIMATED WEEKLY COST OF HABIT (£) *"));
					Assert.assertTrue("Drug(s) To Be Tested For label is not available ", lbl_drugToBeTestedFor.getText().trim().equals("DRUG(S) TO BE TESTED FOR"));

				}
			
			
			
			//Add Page Field values Locators
			
			@FindBy(xpath = ".//*[@id='dateAssessed']")
			private WebElementFacade value_dateAssessed;
			@FindBy(xpath = ".//*[@id='teamId']")
			private WebElementFacade value_crc;
			@FindBy(xpath = ".//*[@id='officeTeamId']")
			private WebElementFacade value_team;
			@FindBy(xpath = ".//*[@id='officerId']")
			private WebElementFacade value_officer;
			@FindBy(xpath = ".//*[@id='mainDrugId']")
			private WebElementFacade value_mainDrug;
			@FindBy(xpath = ".//*[@id='addMainDrugYesNoId']")
			private WebElementFacade value_addMainDrugYesNo;
			@FindBy(xpath = ".//*[@id='estimatedWeekelyCost']")
			private WebElementFacade value_estimatedWeekelyCost;
			@FindBy(xpath = ".//*[@id='notes']")
			private WebElementFacade value_notes;
			@FindBy(xpath = ".//*[@id='drugToBeTestedForId']")
			private WebElementFacade value_drugToBeTestedFor;
	
	
			public void addDrugTestProfileValidDetails() {
                
				waitABit(2000);
				value_crc.selectByVisibleText(ReadXMLData.getXMLData("TestData.xml", "//DrugTestProfile_ADD", "./Crc"));	
                value_officer.selectByVisibleText(ReadXMLData.getXMLData("TestData.xml", "//DrugTestProfile_ADD", "./Officer"));	
				value_dateAssessed.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//DrugTestProfile_ADD", "./DateAssessed"));
				value_team.selectByVisibleText(ReadXMLData.getXMLData("TestData.xml", "//DrugTestProfile_ADD", "./Team"));
				value_mainDrug.selectByVisibleText(ReadXMLData.getXMLData("TestData.xml", "//DrugTestProfile_ADD", "./MainDrug"));
				value_addMainDrugYesNo.selectByVisibleText(ReadXMLData.getXMLData("TestData.xml", "//DrugTestProfile_ADD", "./AddMainDrugtoTestList"));
                value_notes.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//DrugTestProfile_ADD", "./Notes"));
				value_estimatedWeekelyCost.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//DrugTestProfile_ADD", "./EstimatedWeeklyCostofHabit"));
				value_drugToBeTestedFor.selectByVisibleText(ReadXMLData.getXMLData("TestData.xml", "//DrugTestProfile_ADD", "./DrugsToBeTestedFor"));
				
				waitABit(2000);
				if (btn_addToList.isCurrentlyVisible()) {
					btn_addToList.click();
					waitABit(3000);

				} else
					System.out.println("Add To List button is not available");
				waitABit(4000);
		
				if (btn_submit.isCurrentlyVisible()) {
					btn_submit.click();
					waitABit(3000);

				} else
					System.out.println("Submit button is not available");
				waitABit(2000);
			}
	
          public void editDrugTestProfileValidDetails() {
                
				waitABit(2000);
				
				value_mainDrug.selectByVisibleText(ReadXMLData.getXMLData("TestData.xml", "//DrugTestProfile_EDIT", "./MainDrug"));
				value_addMainDrugYesNo.selectByVisibleText(ReadXMLData.getXMLData("TestData.xml", "//DrugTestProfile_EDIT", "./AddMainDrugtoTestList"));
                value_notes.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//DrugTestProfile_EDIT", "./Notes"));
                value_drugToBeTestedFor.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//DrugTestProfile_EDIT", "./DrugsToBeTestedFor"));
				
				waitABit(2000);
				if (btn_addToList.isCurrentlyVisible()) {
					btn_addToList.click();
					waitABit(3000);

				} else
					System.out.println("Add To List button is not available");
				waitABit(4000);
		
				if (btn_submit.isCurrentlyVisible()) {
					btn_submit.click();
					waitABit(3000);

				} else
					System.out.println("Submit button is not available");
				waitABit(2000);
			}
	
	//Add Invalid scenario
          public void addDrugTestProfileInvalidDetails() {
              
				waitABit(2000);
				
				if(btn_submit.isCurrentlyVisible()) {
					btn_submit.click();
					waitABit(3000);

				} else
					System.out.println("Submit button is not available");
				waitABit(2000);
			}
	
        //Edit Invalid scenario
          public void editDrugTestProfileInvalidDetails() {
              
				waitABit(2000);
				value_estimatedWeekelyCost.clear();
		        waitABit(1000);
				value_estimatedWeekelyCost.sendKeys(ReadXMLData.getXMLData("TestData.xml", "//DrugTestProfile_EDITInvalid", "./EstimatedWeeklyCostofHabit"));
			
				if(btn_submit.isCurrentlyVisible()) {
					btn_submit.click();
					waitABit(3000);

				} else
					System.out.println("Submit button is not available");
				waitABit(2000);
			}
          
	//Error message locators
        
	       @FindBy(xpath = "//label[@for='dateAssessed']/following-sibling::control-messages//div[@class='error-msg']")
			private WebElementFacade errmsg_dateAssessed;
			@FindBy(xpath = "//label[@for='crcId']/following-sibling::control-messages//div[@class='error-msg']")
			private WebElementFacade errmsg_crc;
			@FindBy(xpath = "//label[@for='teamId']/following-sibling::control-messages//div[@class='error-msg']")
			private WebElementFacade errmsg_team;
			@FindBy(xpath = "//label[@for='officerId']/following-sibling::control-messages//div[@class='error-msg']")
			private WebElementFacade errmsg_officer;
			@FindBy(xpath = "//label[@for='mainDrugId']/following-sibling::control-messages//div[@class='error-msg']")
			private WebElementFacade errmsg_mainDrug;
			@FindBy(xpath = "//label[@for='addMainDrugYesNoId']/following-sibling::control-messages//div[@class='error-msg']")
			private WebElementFacade errmsg_addMainDrugYesNo;
			@FindBy(xpath = "//label[@for='estimatedWeekelyCost']/following-sibling::control-messages//div[@class='error-msg']")
			private WebElementFacade errmsg_weeklyCost;
			
          @SuppressWarnings("deprecation")
		public void addDrugTestProfileErrorMessageValidation(){
                
				Assert.assertTrue("Date Assessed field label is not present", errmsg_dateAssessed.getText().trim().equals("Required field"));
				Assert.assertTrue("Crc field label is not present", errmsg_crc.getText().trim().equals("Required field"));
				Assert.assertTrue("Team field label is not present", errmsg_team.getText().trim().equals("Required field"));
				Assert.assertTrue("Officer label is not present", errmsg_officer.getText().trim().equals("Required field"));
				Assert.assertTrue("Main Drug field label is not present", errmsg_mainDrug.getText().trim().equals("Required field"));
				Assert.assertTrue("Add Main Drug to test list field label is not present", errmsg_addMainDrugYesNo.getText().trim().equals("Required field"));
				Assert.assertTrue("Estimated weekly cost of habit field label is not present", errmsg_weeklyCost.getText().trim().equals("Required field"));

			    waitABit(3000);
				
			}
	 
          @SuppressWarnings("deprecation")
		public void editDrugTestProfileErrorMessageValidation(){
                
				Assert.assertTrue("Estimated weekly cost of habit field value entered is incorrect", errmsg_weeklyCost.getText().trim().equals("Invalid format- This must be whole numbers only with no decimals"));
	            waitABit(2000);
				
			}
	
	@Override
	public WebElementFacade getUniqueElement() {
		return lnk_referral;
	}
	

	
}
