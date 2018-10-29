package com.meganexus.stepsLib;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import com.meganexus.genericLib.Outbound_Xml;
import com.meganexus.pageObjectLib.ProtectedCharacteristicsPage;

import net.thucydides.core.annotations.Step;

public class ProtectedCharacteristicsSteps extends NeoTR_Steps
{
	ProtectedCharacteristicsPage proCharPage;
	
	@Step
	public void clickProtectedCharacteristicsTab()
	{
		clickOnProtectedCharacteristicsBtn();
	}

	public void verifyProtectedCharacteristicsDetails() {
		try {
			proCharPage.validateProCharDetails();
		} catch(ElementNotFoundException e){
			e.printStackTrace();
			System.out.println("Plz check the element's xpath OR maybe no record available for viewing");
		}
		
	}

	public void validateProtectedCharacteristicsWithInbound() {
		try {
			proCharPage.validateProCharWithInbound();
		} catch(ElementNotFoundException e){
			e.printStackTrace();
			System.out.println("Plz check the element's xpath OR maybe no record available for viewing");
		}
	}

	public void clickBackButton() {
		clickBackBtn();
	}
	
	public void editProtectedCharacteristics() {
		try {
			proCharPage.clickEditBtn();
			proCharPage.editProChar();
			proCharPage.clickOnSubmitBtn();
		} catch(ElementNotFoundException e){
			e.printStackTrace();
			System.out.println("Plz check the element's xpath OR maybe add button is not visible");
		}
	}

	public void validateEditedProtectedCharacteristics() {
		try {
			proCharPage.validateEditedProChar();
		} catch(ElementNotFoundException e){
			e.printStackTrace();
			System.out.println("Plz check the element's xpath OR maybe add button is not visible");
		}
	}

	public void validateProtectedCharacteristicsWithUPDoutbound() {
		try {
			Outbound_Xml.fetchOutboundXml("-C20-to-N00-");
			Thread.sleep(10000);
			Outbound_Xml.changeXMLName("-C20-to-N00-", "UPDProChar.xml");
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("unable to create xml for UPD outbound");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		proCharPage.validateUPDoutbound();
	}

	public void addNewProtectedCharacteristics() {
		try {
			proCharPage.addNewProChar();
		} catch(ElementNotFoundException e){
			e.printStackTrace();
			System.out.println("Plz check the element's xpath OR maybe add button is not visible");
		}
	}

	public void validateCreatedProtectedCharacteristics() {
		try {
			proCharPage.validateNewProChar();
		} catch(ElementNotFoundException e){
			e.printStackTrace();
			System.out.println("Plz check the element's xpath OR maybe add button is not visible");
		}
	}

	public void validateProtectedCharacteristicsWithINSoutbound() {
		try {
			Outbound_Xml.fetchOutboundXml("-C20-to-N00-");
			Thread.sleep(10000);
			Outbound_Xml.changeXMLName("-C20-to-N00-", "INSProChar.xml");
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("unable to create xml for outbound");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		proCharPage.validateINSoutbound();
	}

}
