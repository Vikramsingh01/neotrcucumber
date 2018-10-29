
package com.meganexus.pageObjectLib;

import com.meganexus.genericLib.GetSRD_or_NSRDValue;
import com.meganexus.genericLib.ReadXMLData;
import com.sun.org.apache.xerces.internal.impl.xpath.XPath;

import junit.framework.Assert;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class ProfilesPage extends NeoTR_Page {
	// for alias structure (yogesh.sonar@meganexus.com)
	@FindBy(xpath = "//h2[contains(text(),'service User profile')]")
	private WebElementFacade text_viewServiceUserProfile;

	@FindBy(xpath = "//tr-accordiontab[@header='alias']//th[1]")
	private WebElementFacade col_firstName;
	@FindBy(xpath = "//tr-accordiontab[@header='alias']//th[2]")
	private WebElementFacade col_secondName;
	@FindBy(xpath = "//tr-accordiontab[@header='alias']//th[3]")
	private WebElementFacade col_thirdName;
	@FindBy(xpath = "//tr-accordiontab[@header='alias']//th[4]")
	private WebElementFacade col_familyName;
	@FindBy(xpath = "//tr-accordiontab[@header='alias']//th[5]")
	private WebElementFacade col_dateOfBirth;
	@FindBy(xpath = "//tr-accordiontab[@header='alias']//th[6]")
	private WebElementFacade col_gender;
	@FindBy(xpath = "//tr-accordiontab[@header='alias']//th[7]")
	private WebElementFacade col_viewColumn;
	@FindBy(xpath = "//tr-accordiontab[@header='alias']//th[8]")
	private WebElementFacade col_editColumn;
	@FindBy(xpath = "//tr-accordiontab[@header='alias']//th[9]")
	private WebElementFacade col_deleteColumn;

	@FindBy(xpath = "//tr-accordiontab[@header='alias']//tbody/tr[1]")
	private WebElementFacade tr_firstRecord;

	@SuppressWarnings("deprecation")
	public void validateAliasList() {
		//pass expected breadcrumb value as a parameter to the verifyBreadCrumbs function.
		verifyBreadCrumbs("Service User Summary Profile");
		
		waitABit(500);
		lnk_Alias.click();
		//clicking on the Alias collapsible to view alias table
		System.out.println(waitFor(lnk_Alias));
		if (!btn_addAlias.isCurrentlyVisible()) {
			waitFor(lnk_Alias);
			lnk_Alias.click();
			waitABit(1000);
		}

		//verifying the alias table now
		if (col_firstName.isCurrentlyVisible())
			Assert.assertTrue("Table header for first name does not match", col_firstName.getText().trim().equals("First Name"));
		if (col_secondName.isCurrentlyVisible()) 
			Assert.assertTrue("Table header for second name does not match", col_secondName.getText().trim().equals("Second Name"));
		if (col_thirdName.isCurrentlyVisible())
			Assert.assertTrue("Table header for third name does not match", col_thirdName.getText().trim().equals("Third Name"));
		if (col_familyName.isCurrentlyVisible())
			Assert.assertTrue("Table header for family name does not match", col_familyName.getText().trim().equals("Family Name"));
		if (col_dateOfBirth.isCurrentlyVisible())
			Assert.assertTrue("Table header for date of birth does not match", col_dateOfBirth.getText().trim().equals("Date of Birth"));
		if (col_gender.isCurrentlyVisible())
			Assert.assertTrue("Table header for gender does not match", col_gender.getText().trim().equals("Gender"));
		if (col_viewColumn.isCurrentlyVisible())
			Assert.assertTrue("Table header for view column does not match", col_viewColumn.getText().trim().equals("View"));
		if (col_editColumn.isCurrentlyVisible())
			Assert.assertTrue("Table header for edit column does not match", col_editColumn.getText().trim().equals("Edit"));
		if (col_deleteColumn.isCurrentlyVisible()) 
			Assert.assertTrue("Table header for delete column does not match", col_deleteColumn.getText().trim().equals("Delete"));


		//Validating that a record is present
		if (tr_firstRecord.isCurrentlyVisible())
			System.out.println("one record is present in alias table as expected.");
		else
			System.out.println("No record is present in Alias table.");
	}

	@FindBy(xpath = "//a[contains(text(),'Alias')]")
	private WebElementFacade lnk_Alias;

	@FindBy(xpath = "(//button[text()='Add'])[1]")
	private WebElementFacade btn_addAlias;

	public void clickAddAliasBtn() {
		System.out.println(waitFor(lnk_Alias));
		if (!btn_addAlias.isCurrentlyVisible()) {
			waitFor(lnk_Alias);
			lnk_Alias.click();
			waitABit(1000);
		}
		try {
			waitFor(btn_addAlias);
			btn_addAlias.click();
			waitABit(1000);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	@FindBy(xpath = "//button[@id='alias_view0']")
	private WebElementFacade btn_viewAlias;

	public void clickViewAliasBtn() {
		System.out.println(waitFor(lnk_Alias));
		if (!btn_viewAlias.isCurrentlyVisible()) {
			waitFor(lnk_Alias);
			lnk_Alias.click();
			waitABit(1000);
		}
		try {
			waitFor(btn_viewAlias);
			btn_viewAlias.click();
			waitABit(1000);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@FindBy(xpath = "//button[@id='alias_edit0']")
	private WebElementFacade btn_updateAlias;

	public void clickUpdateAliasBtn() {
		if (!btn_viewAlias.isCurrentlyVisible()) {
			waitFor(lnk_Alias);

			lnk_Alias.click();
			waitABit(500);

			if (btn_updateAlias.isPresent()) {
				btn_updateAlias.click();
				waitABit(1000);
			} else
				System.out.println("alias update is locked");
		}
	}
	
	@FindBy(xpath = "//button[@id='alias_delete0']")
	private WebElementFacade btn_deleteAlias;
	
	public void clickDeleteAliasBtn() {
		if (!btn_deleteAlias.isCurrentlyVisible()) {
			lnk_Alias.click();
			if (btn_deleteAlias.isCurrentlyVisible()) {
				btn_deleteAlias.click();
				waitABit(1000);
				} else
				System.out.println("Delete btn is not available");
		}
	}
	
	public void verfiyAliasRecordDeleted() {
		if (!btn_deleteAlias.isCurrentlyVisible()) {
		System.out.println("Delete is working for Alias");
			} 
		else
		System.out.println("Delete is not working for Alias");
		}
	
	// for Additional Identifier(Abhijit.Behuria@meganexus.com)
	
	@FindBy(xpath = "//a[contains(text(),'Additional Identifiers')]")
	private WebElementFacade lnk_AdditionalIdentifier;
	/*@FindBy(xpath ="//button[contains(@ng-reflect-router-link,'additionalidentifier,new')]")
	private WebElementFacade btn_addAdditionalIdentifier;*/
	@FindBy(xpath ="(//button[contains(@ng-reflect-router-link,'additionalidentifier')])[2]")
	private WebElementFacade btn_ViewAdditionalIdentifier;
	@FindBy(xpath ="//button[@ng-reflect-router-link='additionalidentifier,new']")
	private WebElementFacade btn_AddAdditionalIdentifier;
	
	public void expandAdditionalIdentifier(){
		lnk_AdditionalIdentifier.click();
		waitABit(1000);
		
	}
	
	
	//-------------------------------Search-------------------------------------------	
		@FindBy(xpath = "(//a[@id='filter'])[2]")
		private WebElementFacade lnk_filter;
		
		/*public void clickOnFilter()
		{
			if (btn_addAdditionalIdentifier.isCurrentlyVisible())
			{
				waitForPresenceOf("(//a[@id='filter'])[2]");
				lnk_filter.click();
				waitABit(1000);
			}
		}
		*/
		
		@FindBy(xpath= "//label[contains(@for,'identifierTypeId')]")
		private WebElementFacade lbl_IdentifierType;
		
		@FindBy(xpath = "//select[contains(@id,'identifierTypeId')]")
		private WebElementFacade ddl_IdentifierType;
		
		@FindBy(xpath = "(//button[contains(.,'Search')])[2]")
		private WebElementFacade btn_search;
		
		@FindBy(xpath = "(//button[contains(.,'Reset')])[2]")
		private WebElementFacade btn_reset;
		
		public void SearchAdditionalIdentifier()
		{
			
			waitForPresenceOf("(//a[contains(@id,'filter')])[2]");
			if (!ddl_IdentifierType.isCurrentlyVisible())
			{
				lnk_filter.click();
				waitABit(1000);
				ddl_IdentifierType.selectByVisibleText(GetSRD_or_NSRDValue.getUIValue_from_SRD20("ADDITIONAL IDENTIFIER TYPE",
						ReadXMLData.getXMLData("inboundXML/AO.xml", "//AdditionalIdentifier", "./IdentifierType")));
				waitABit(1000);
				btn_search.click();
			}
		}
		
		//-------------------View---------------------------------
		
		@FindBy(xpath = "//span[contains(.,'Identifier Type ')]")
		private WebElementFacade lbl_Identifiertype;
		@FindBy(xpath = "//th[@trsortby='identifier']")
		private WebElementFacade lbl_identifier;
		@FindBy(xpath = "//th[contains(.,'View')]")
		private WebElementFacade lbl_view;
		@FindBy(xpath ="(//th[contains(.,'Delete')])[2]")
		private WebElementFacade lbl_delete;
		@FindBy (xpath= "//th/span[contains(text(),'Identifier Type ')]/following::tr[1]/td[1]")
		private WebElementFacade first_tableRecord;
		
		@FindBy (xpath= "(//button[contains(@ng-reflect-router-link,'additionalidentifier')])[2]")
		private WebElementFacade btn_view;
		
		@FindBy(xpath = "//button[contains(@ng-reflect-router-link,'additionalidentifier,new')]")
		private WebElementFacade btn_addAdditionalIdentifier;
		@SuppressWarnings("deprecation")
		
		public void listAdditionalIdentifierDetails()
		{
			//pass expected breadcrumb value as a parameter to the verifyBreadCrumbs function.
			verifyBreadCrumbs("Service User Summary Profile");

			
			System.out.println(waitFor(lnk_AdditionalIdentifier));
			if (!btn_addAdditionalIdentifier.isCurrentlyVisible()) {
				waitFor(lnk_AdditionalIdentifier);
				lnk_AdditionalIdentifier.click();
				waitABit(1000);
			}
			//verifying the Additional identifier table now
			System.out.println(lbl_Identifiertype.getText().trim());
			System.out.println(lbl_identifier.getText().trim());
			
			Assert.assertTrue("Identifiertype is not Match", lbl_Identifiertype.getText().trim().equals("IDENTIFIER TYPE") );
			Assert.assertTrue("Identifier is not match", lbl_identifier.getText().trim().equals("IDENTIFIER") );
//			Assert.assertTrue("View lable is not match", lbl_view.getText().trim().equals("View"));
//			Assert.assertTrue("Delete lable is not match", lbl_delete.getText().trim().equals("Delete"));
//			Assert.assertTrue("Add button is not available ", btn_addAdditionalIdentifier.getText().trim().equals("ADD"));
			
			// Validate that a record presents in the table
//			Assert.assertTrue("Record not avaliable", first_tableRecord.isPresent() );	
			
		}
		
		public void clickOnAddadditionalIdentifier()
		{
			System.out.println(waitFor(lnk_AdditionalIdentifier));
			if(!btn_AddAdditionalIdentifier.isCurrentlyVisible())
				{
					waitFor(lnk_AdditionalIdentifier);
					lnk_AdditionalIdentifier.click();
					waitABit(1000);
				}
			try {
				waitFor(btn_AddAdditionalIdentifier);
				btn_AddAdditionalIdentifier.click();
				waitABit(1000);
				
			} catch (Exception e) {
				System.out.println(e);
			}
			
		}
		public void clickviewbutton()
		{
			System.out.println(waitFor(lnk_AdditionalIdentifier));
			if(!btn_view.isCurrentlyVisible())
				{
					waitFor(lnk_AdditionalIdentifier);
					lnk_AdditionalIdentifier.click();
					waitABit(1000);
				}
			try {
				waitFor(btn_AddAdditionalIdentifier);
				btn_view.click();
				waitABit(1000);
				
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		public void clickbuttonview()
		{
			btn_view.click();
			waitABit(1000);
		}
		
		
		

	private void clickaddonAdditionalIdentifier() {
			// TODO Auto-generated method stub
			
		}
	
	//-----------Delete Additional Identifier-----------------//
	@FindBy(xpath = "(//button[@id='additionalIdentifier_delete'])[1]")
	private WebElementFacade btn_deleteAdditionalIdentifier;
	
	public void clickDeleteAdditionalIdentifierBtn() {
		if (!btn_deleteAdditionalIdentifier.isCurrentlyVisible()) {
			lnk_AdditionalIdentifier.click();
			if (btn_deleteAdditionalIdentifier.isCurrentlyVisible()) {
				btn_deleteAdditionalIdentifier.click();
				waitABit(1000);
				} else
				System.out.println("Delete btn is not available");
		}
	}
	
	public void verfiyAdditionalIdentifierRecordDeleted() {
		if (!btn_deleteAdditionalIdentifier.isCurrentlyVisible()) {
		System.out.println("Delete is working for Additional Identifier");
			} 
		else
		System.out.println("Delete is not working for Additional Identifier");
		}

	@Override
	public WebElementFacade getUniqueElement() {
		return lnk_Alias;
	}

	public void verifyServiceUserProfileHeader() {
			if (text_viewServiceUserProfile.isCurrentlyVisible()) {
				System.out.println("Back button on screen is working as expected");
			}
			else { 
				System.out.println("Back button on screen is not working as expected"); 
			}
	}
}
	