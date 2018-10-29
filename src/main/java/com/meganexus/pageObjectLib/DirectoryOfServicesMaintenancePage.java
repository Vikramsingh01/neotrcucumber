package com.meganexus.pageObjectLib;

import com.meganexus.genericLib.ReadXMLData;

import junit.framework.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class DirectoryOfServicesMaintenancePage extends NeoTR_Page{

	@FindBy(xpath = "//span[text()='Directory of Services Maintenance']")
	private WebElementFacade lnk_DirOfServiceMaintenence;
	@FindBy(xpath = "//a[contains(.,'Service Provider')]")
	private WebElementFacade lnk_serviceProvider;
	@FindBy(xpath = "html/body/tr-root/div[2]/div/div[2]/tr-service-provider/div/h2")
	private WebElementFacade hdr_ServiceProviderTitle;
	@FindBy(xpath = "//a[contains(text(),'Service Provider')]")
	private WebElementFacade lnk_ServiceProvider;
 
	public void clickonDirOfServiceMaintenenceLink() {
		waitForPresenceOf("//span[text()='Directory of Services Maintenance']");
		lnk_DirOfServiceMaintenence.click();
		waitABit(2000);
	}

	@FindBy(xpath = "//a[@id='filter']")
	private WebElementFacade lnk_filter;
	@FindBy(xpath = "//input[@id='serviceProviderName']")
	private WebElementFacade tbx_SeriviceProviderNameFilter;
	@FindBy(xpath = "//select[@id='status']")
	private WebElementFacade ddl_status;
	
	@FindBy(xpath = "//button[contains(text(),'Search')]")
	private WebElementFacade btn_search;
	@FindBy(xpath = "//button[contains(text(),'Reset')]")
	public WebElementFacade btn_reset;
	
	@FindBy(xpath = "(//button[@class='btn btn-default btn-small'])[1]")
	private WebElementFacade btn_viewSerivceProvider;
	@FindBy(xpath = "html/body/tr-root/div[2]/div/div[2]/tr-service-provider-edit/div/div[2]/tr-accordion/div/tr-accordiontab/div[2]/div/form/fieldset/div/div[12]/a/button")
    private WebElementFacade btn_cancel;

	  @FindBy(xpath = ".//*[@id='myModal']/div/div/div[2]/p") 
	  WebElementFacade txt_popup;
	  @FindBy(xpath = "//button[contains(text(),'Ok')]") 
	  WebElementFacade btn_ok;

	@FindBy(xpath = ".//*[@id='itemsPerPage']")
	public WebElementFacade itemPerPage;

	@FindBy(xpath = "//button[contains(.,'Add')]")
	public WebElementFacade btn_add;

	@FindBy(xpath = "(//button[@class='btn btn-default btn-small'])[2]")
	public WebElementFacade btn_edit;
	@FindBy(xpath = "html/body/tr-root/div[2]/div/div[2]/tr-service-provider-detail/div/div[1]/div/div/a/button")
	private WebElementFacade btn_back;
	
	// Search with Service Provider name

	public void searchOffenderWithName() {
		  //lnk_serviceProvider.click();
		  //lnk_serviceProvider.click();
		  waitForPresenceOf("//a[text()='filter']");
		  if (!tbx_SeriviceProviderNameFilter.isCurrentlyVisible()) {
		   lnk_filter.click();
		   waitABit(2000);
		  }

		  if (tbx_SeriviceProviderNameFilter.isCurrentlyVisible()) {
		   //lnk_serviceProvider.click();
		   tbx_SeriviceProviderNameFilter.sendKeys(ReadXMLData.getXMLData("DosTestData.xml", "//ServiceProvider_ADDValid", "./serviceProviderName"));
		   waitABit(2000);
		   btn_search.click();
		   waitABit(3000);
		  }
		 }

	// Search with Status

	public void searchOffenderWithStatus() {
		waitForPresenceOf("//a[text()='filter']");
		if (!ddl_status.isCurrentlyVisible()) {
			lnk_filter.click();
			waitABit(1000);
		}

		if (ddl_status.isCurrentlyVisible()) {
			ddl_status.sendKeys(ReadXMLData.getXMLData("DosTestData.xml", "//ServiceProvider_ADDValid", "./status"));
			waitABit(2000);
			btn_search.click();
			waitABit(3000);
		}
	}

	// Verify Reset 

	public void resetSearchOffender() {
		waitForPresenceOf("//a[text()='filter']");
		if (!btn_reset.isCurrentlyVisible()) {
			lnk_filter.click();
			waitABit(2000);
		}

		if (btn_reset.isCurrentlyVisible()) {
			btn_reset.sendKeys();
			waitABit(1000);
			btn_reset.click();
			waitABit(2000);
		}
	}

	// Add Button 

	public void clickOnAddServiceProviderBtn(){


		//itemPerPage.selectByVisibleText("50");
		if (btn_add.isCurrentlyVisible()) {
			waitForTextToAppear(lnk_filter.getText(), 20000);
			btn_add.click();
			waitABit(2000);
		} else
			System.out.println("Service Provider add button is not available");

	}

	//Edit button

	public void clickOnEditServiceProviderBtn()  {


		//itemPerPage.selectByVisibleText("50");
		if (btn_edit.isCurrentlyVisible()) {
			//waitForTextToAppear(lnk_filter.getText(), 20000);
			btn_edit.click();
      		waitABit(4000);	
		} else
			System.out.println("Service Provider edit button is not available");

	}
	// View button
	public void clickOnViewServiceProviderBtn() {


		//itemPerPage.selectByVisibleText("50");
		if (btn_viewSerivceProvider.isCurrentlyVisible()) {
			//waitForTextToAppear(lnk_filter.getText(), 20000);
			waitABit(2000);
			btn_viewSerivceProvider.click();
			waitABit(2000);	
		} else
			System.out.println("Service Provider view button is not available");

	}
	//Back button
	public void clickOnBackServiceProviderBtn() {


		//itemPerPage.selectByVisibleText("50");
		if (btn_back.isCurrentlyVisible()) {
		
			waitABit(2000);
			btn_back.click();
			waitABit(2000);	
		} else
			System.out.println("Service Provider back button is not available");

	}
	
public void CancelBtnFunctionality(){
		
		if (btn_cancel.isCurrentlyVisible()) {
			//waitABit(4000);
	        btn_cancel.click();
	    
			waitABit(4000);
			Assert.assertTrue("Message in Confirm Pop-up box not available",txt_popup.getText().trim().equals("Do you want to leave this page without saving?"));
			
			waitABit(2000);
			btn_ok.click();
			waitABit(9000);
			//Assert.assertTrue("Directory Of Services page title not available after Canceling on Add Page",hdr_ServiceProviderTitle.getText().trim().equals("Directory Of Services"));

		} else
			System.out.println("Service Provider cancel button is not available");

	}


	// Verify Lable
		@FindBy(xpath = "//div[contains(text(),'Service Provider Name')]")
		private WebElementFacade lbl_service_provider_name;
		@FindBy(xpath = "//div[contains(text(),'Selected CRCs')]")
		private WebElementFacade lbl_selected_CRC;
		@FindBy(xpath = "//div[contains(text(),'Status')]")
		private WebElementFacade lbl_status;
		@FindBy(xpath = "//div[contains(text(),'Address Line 1')]")
		private WebElementFacade lbl_address_1;
		@FindBy(xpath = "//div[contains(text(),'Address Line 2')]")
		private WebElementFacade lbl_address_2;
		@FindBy(xpath = "//div[contains(text(),'Address Line 3')]")
		private WebElementFacade lbl_address_3;
		@FindBy(xpath = "//div[contains(text(),'Active Start Date')]")
		private WebElementFacade lbl_active_start;
		@FindBy(xpath = "//div[contains(text(),'Active End Date')]")
		private WebElementFacade lbl_active_end;

		@FindBy(xpath = "//div[contains(text(),'Town')]")
		private WebElementFacade lbl_town;
		@FindBy(xpath = "//div[contains(text(),'Postcode')]")
		private WebElementFacade lbl_postcode;
		@FindBy(xpath = "//div[contains(text(),'Provision')]")
		private WebElementFacade lbl_provision;
	
	
		// Verify value

		@FindBy(xpath = "//div[contains(text(),'Service Provider Name')]/following::p[1]")
		private WebElementFacade val_service_provider_name;
		@FindBy(xpath = "//div[contains(text(),'Selected CRCs')]/following::p[1]")
		private WebElementFacade val_selected_CRC;
		@FindBy(xpath = "//div[contains(text(),'Status')]/following::p[1]")
		private WebElementFacade val_status;
		@FindBy(xpath = "//div[contains(text(),'Address Line 1')]/following::p[1]")
		private WebElementFacade val_address_1;
		@FindBy(xpath = "//div[contains(text(),'Address Line 2')]/following::p[1]")
		private WebElementFacade val_address_2;
		@FindBy(xpath = "//div[contains(text(),'Address Line 3')]/following::p[1]")
		private WebElementFacade val_address_3;
		@FindBy(xpath = "//div[contains(text(),'Active Start Date')]/following::p[1]")
		private WebElementFacade val_active_start;
		@FindBy(xpath = "//div[contains(text(),'Active End Date')]/following::p[1]")
		private WebElementFacade val_active_end;

		@FindBy(xpath = "//div[contains(text(),'Town')]/following::p[1]")
		private WebElementFacade val_town;
		@FindBy(xpath = "//div[contains(text(),'Postcode')]/following::p[1]")
		private WebElementFacade val_postcode;
		@FindBy(xpath = "//div[contains(text(),'Provision')]/following::p[1]")
		private WebElementFacade val_provision;
		@FindBy(xpath = "//button[@role='button']")
		private WebElementFacade lnk_serviceProviderBreadScrum;
	@SuppressWarnings("deprecation")
	public void validateAddedServiceProviderDetails(){

		Assert.assertTrue("Service Provider Name label not matched",
				lbl_service_provider_name.getText().trim().equals("Service Provider Name"));
		Assert.assertTrue("Selected CRC label not matched",
				lbl_selected_CRC.getText().trim().equals("Selected CRCs"));
		Assert.assertTrue("Status label not matched",
				lbl_status.getText().trim().equals("Status"));
		Assert.assertTrue("Address Line 1 label not matched",
				lbl_address_1.getText().trim().equals("Address Line 1"));
		Assert.assertTrue("Address Line 2 label not matched",
				lbl_address_2.getText().trim().equals("Address Line 2"));
		Assert.assertTrue("Address Line 2 label not matched",
				lbl_address_3.getText().trim().equals("Address Line 3"));
		Assert.assertTrue("Active Start date label not matched",
				lbl_active_start.getText().trim().equals("Active Start Date"));
		Assert.assertTrue("Active End date label not matched",
				lbl_active_end.getText().trim().equals("Active End Date"));
		Assert.assertTrue("Town label not matched",
				lbl_town.getText().trim().equals("Town"));
		Assert.assertTrue("Postcode label not matched",
				lbl_postcode.getText().trim().equals("Postcode"));
		Assert.assertTrue("provision label not matched",
				lbl_provision.getText().trim().equals("Provision"));

		Assert.assertTrue("Service Provider Name Value not matched",
				val_service_provider_name.getText().trim().equals(ReadXMLData.getXMLData("DosTestData.xml", "//ServiceProvider_ADDValid", "./serviceProviderName")));
		//	Assert.assertTrue("Selected CRC Value not matched",
		//		val_selected_CRC.getText().trim().equals(ReadXMLData.getXMLData("DosTestData.xml", "//ServiceProvider_ADDValid", "./CRC")));
		Assert.assertTrue("Status Value not matched",
				val_status.getText().trim().equals(ReadXMLData.getXMLData("DosTestData.xml", "//ServiceProvider_ADDValid", "./status")));
		Assert.assertTrue("Address Line 1 Value not matched",
				val_address_1.getText().trim().equals(ReadXMLData.getXMLData("DosTestData.xml", "//ServiceProvider_ADDValid", "./addressLine1")));
		Assert.assertTrue("Address Line 2 Value not matched",
				val_address_2.getText().trim().equals(ReadXMLData.getXMLData("DosTestData.xml", "//ServiceProvider_ADDValid", "./addressLine2")));
		Assert.assertTrue("Active Start date Value not matched",
				val_active_start.getText().trim().equals(ReadXMLData.getXMLData("DosTestData.xml", "//ServiceProvider_ADDValid", "./startDate")));
		Assert.assertTrue("Active End date Value not matched",
				val_active_end.getText().trim().equals(ReadXMLData.getXMLData("DosTestData.xml", "//ServiceProvider_ADDValid", "./endDate")));
		Assert.assertTrue("Town Value not matched",
				val_town.getText().trim().equals(ReadXMLData.getXMLData("DosTestData.xml", "//ServiceProvider_ADDValid", "./town")));
		Assert.assertTrue("Postcode Value not matched",
				val_postcode.getText().trim().equals(ReadXMLData.getXMLData("DosTestData.xml", "//ServiceProvider_ADDValid", "./postcode")));
		Assert.assertTrue("provision Value not matched",
				val_provision.getText().trim().equals(ReadXMLData.getXMLData("DosTestData.xml", "//ServiceProvider_ADDValid", "./provision")));
		lnk_serviceProviderBreadScrum.click();
		//btn_back.click();
		waitABit(2000);
	}
	
	@SuppressWarnings("deprecation")
	public void validateUpdatedServiceProviderDetails(){

		System.out.println(lbl_service_provider_name.getText());
		Assert.assertTrue("Service Provider Name label not matched",
				lbl_service_provider_name.getText().trim().equals("Service Provider Name"));
		Assert.assertTrue("Selected CRC label not matched",
				lbl_selected_CRC.getText().trim().equals("Selected CRCs"));
		Assert.assertTrue("Status label not matched",
				lbl_status.getText().trim().equals("Status"));
		Assert.assertTrue("Address Line 1 label not matched",
				lbl_address_1.getText().trim().equals("Address Line 1"));
		Assert.assertTrue("Address Line 2 label not matched",
				lbl_address_2.getText().trim().equals("Address Line 2"));
		Assert.assertTrue("Address Line 2 label not matched",
				lbl_address_3.getText().trim().equals("Address Line 3"));
		Assert.assertTrue("Active Start date label not matched",
				lbl_active_start.getText().trim().equals("Active Start Date"));
		Assert.assertTrue("Active End date label not matched",
				lbl_active_end.getText().trim().equals("Active End Date"));
		Assert.assertTrue("Town label not matched",
				lbl_town.getText().trim().equals("Town"));
		Assert.assertTrue("Postcode label not matched",
				lbl_postcode.getText().trim().equals("Postcode"));
		Assert.assertTrue("provision label not matched",
				lbl_provision.getText().trim().equals("Provision"));

		Assert.assertTrue("Service Provider Name Value not matched",
				val_service_provider_name.getText().trim().equals(ReadXMLData.getXMLData("DosTestData.xml", "//ServiceProvider_EDITValid", "./serviceProviderName")));
		//Assert.assertTrue("Selected CRC Value not matched",
		//	val_selected_CRC.getText().trim().equals(ReadXMLData.getXMLData("DosTestData.xml", "//ServiceProvider_EDITValid", "./CRC")));
		Assert.assertTrue("Status Value not matched",
				val_status.getText().trim().equals(ReadXMLData.getXMLData("DosTestData.xml", "//ServiceProvider_EDITValid", "./status")));
		Assert.assertTrue("Address Line 1 Value not matched",
				val_address_1.getText().trim().equals(ReadXMLData.getXMLData("DosTestData.xml", "//ServiceProvider_EDITValid", "./addressLine1")));
		Assert.assertTrue("Address Line 2 Value not matched",
				val_address_2.getText().trim().equals(ReadXMLData.getXMLData("DosTestData.xml", "//ServiceProvider_EDITValid", "./addressLine2")));
		Assert.assertTrue("Active Start date Value not matched",
				val_active_start.getText().trim().equals(ReadXMLData.getXMLData("DosTestData.xml", "//ServiceProvider_EDITValid", "./startDate")));
		Assert.assertTrue("Active End date Value not matched",
				val_active_end.getText().trim().equals(ReadXMLData.getXMLData("DosTestData.xml", "//ServiceProvider_EDITValid", "./endDate")));
		Assert.assertTrue("Town Value not matched",
				val_town.getText().trim().equals(ReadXMLData.getXMLData("DosTestData.xml", "//ServiceProvider_EDITValid", "./town")));
		Assert.assertTrue("Postcode Value not matched",
				val_postcode.getText().trim().equals(ReadXMLData.getXMLData("DosTestData.xml", "//ServiceProvider_EDITValid", "./postcode")));
		Assert.assertTrue("provision Value not matched",
				val_provision.getText().trim().equals(ReadXMLData.getXMLData("DosTestData.xml", "//ServiceProvider_EDITValid", "./provision")));
		waitABit(2000);
	}

	
	
	
	@Override
	public WebElementFacade getUniqueElement() {

		return lnk_ServiceProvider;
	}

}
