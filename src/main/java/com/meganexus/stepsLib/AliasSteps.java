package com.meganexus.stepsLib;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import com.meganexus.genericLib.Outbound_Xml;
import com.meganexus.pageObjectLib.AliasPage;
import com.meganexus.pageObjectLib.ProfilesPage;

import net.thucydides.core.annotations.Step;

@SuppressWarnings("serial")
public class AliasSteps extends NeoTR_Steps {
	AliasPage alias;
	ProfilesPage profilePage;
	String expectedBreadcrumb = null;
	
	@Step
	public void clickProfilesTab() {
		clickOnProfile();
	}
	
	@Step
	public void validateAliasList() {
		profilePage.validateAliasList();
	}
	
	@Step
	public void clickAddAliasButton() {
		profilePage.clickAddAliasBtn();
	}
	
	@Step
	public void clickEditAliasButton() {
		profilePage.clickUpdateAliasBtn();
		
	}
	
	@Step
	public void clickViewAliasBtn() {
		profilePage.clickViewAliasBtn();
	}
	
	@Step
	public void validateAliasWithInbound() {
		try {
			alias.validateAliasDetails();
		} catch(ElementNotFoundException e){
			e.printStackTrace();
			System.out.println("Plz check the element's xpath OR maybe no record available for viewing");
		}
	}
	
	@Step
	public void updateAlias() {
		try {
			profilePage.clickUpdateAliasBtn();
			alias.updateValidAliasDetails();
			alias.clickSubmitButton();
		} catch(ElementNotFoundException e){
			e.printStackTrace();
			System.out.println("Plz check the element's xpath OR maybe no record available for updating");
		}
		
	}
	
	public void validateUpdatedAliasRecord() {
		try {
			alias.validateAliasDetails();
		} catch(ElementNotFoundException e){
			e.printStackTrace();
			System.out.println("Plz check the element's xpath OR maybe no record available for viewing");
		}
		
	}
	
	public void validateAliasWithUPDoutbound() {
		try {
			Outbound_Xml.fetchOutboundXml("-C20-to-N00-");
			Thread.sleep(10000);
			Outbound_Xml.changeXMLName("-C20-to-N00-", "UPDAlias.xml");
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("unable to create xml for UPD outbound");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// UPD outbound verification code here after this line

		
	}
	
	public void deleteAlias() {
		profilePage.clickDeleteAliasBtn();
		waitABit(500);
		clickOnDeleteConfirmOkBtn();
		waitABit(500);
		
	}
	
	public void validateDeletedAliasRecord() {
		profilePage.verfiyAliasRecordDeleted();
		
	}
	
	public void validateAliasWithDELoutbound() {
		try {
			Outbound_Xml.fetchOutboundXml("-C20-to-N00-");
			Thread.sleep(10000);
			Outbound_Xml.changeXMLName("-C20-to-N00-", "DELAlias.xml");
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("unable to create xml for DEL outbound");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// DEL outbound verification code here after this line
	}

	@Step
	public void addNewAlias() {
		try {
		profilePage.clickAddAliasBtn();
		alias.addValidAliasDetails();
		alias.clickSubmitButton();
		} catch(ElementNotFoundException e){
			e.printStackTrace();
			System.out.println("Plz check the element's xpath");
		}

	}
	
	public void validateCreatedAliasRecord() {
		try {
			alias.validateAliasDetails();
		} catch(ElementNotFoundException e){
			e.printStackTrace();
			System.out.println("Plz check the element's xpath OR maybe no record available for viewing");
		}
		
	
		
	}
	
	public void validateAliasWithINSoutbound() {
		try {
			Outbound_Xml.fetchOutboundXml("-C20-to-N00-");
			Thread.sleep(10000);
			Outbound_Xml.changeXMLName("-C20-to-N00-", "INSAlias.xml");
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("unable to create xml for outbound");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// outbound verification code here after this line
 
	}
	
	public void enterInvalidValuesAndSave() {
		// TODO Auto-generated method stub
		
	}
	
	public void verifyValidationMessages() {
		// TODO Auto-generated method stub
		
	}
	
	@Step
	public void verifyAliasDetails(){
		alias.aliasViewVerification();
		
	}
	
	@Step
	public void clickBackButton(){
		clickBackBtn();
	}
	
	@Step
	public void verifyServiceUserProfileHeader(){
		profilePage.verifyServiceUserProfileHeader();
	}

	

	

	

	

	

	

	

	

	

	
	

}
