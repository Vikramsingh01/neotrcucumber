package com.meganexus.pageObjectLib;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class GenerateLetterPage extends NeoTR_Page{

	
	@FindBy(xpath = "//button[@id='planentry_addLetter0']")
	private WebElementFacade btn_addLetter;
	
	//Label verification
	@FindBy(xpath = "//h2[contains(.,'Generate Letter')]")
	private WebElementFacade hdr_generateLetter;
	@FindBy(xpath = "//label[@for='templateNameId']")
	private WebElementFacade lbl_pleaseSelLetter;
	@FindBy(xpath = "//label[@for='file']")
	private WebElementFacade lbl_document;

	
	@FindBy(xpath = "//select[@id='templateNameId']")
	private WebElementFacade ddl_selectLetter;
	@FindBy(xpath = "//button[@id='submitButton']")
	private WebElementFacade btn_generateLetter;
	@FindBy(xpath = "//input[@id='file']")
	private WebElementFacade browse_Letter;
	@FindBy(xpath = "//button[@id='submitButton']")
	private WebElementFacade btn_UploadLetter;
	
	public void clickOnAddLetterBtn() {
    	btn_addLetter.click();
		
	}
	
	public void clickOnGenerateLetterBtn() {
		btn_generateLetter.click();
		
	}
	public void clickOnUploadBtn() {
		btn_UploadLetter.click();
		
	}
	
	//Upload letter from local machine
	
	public void UploadLetterFromLocalMachine() {
		
		browse_Letter.sendKeys("C:/Amardeep/TestData/Uploadfile.txt");
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public WebElementFacade getUniqueElement() {
		// TODO Auto-generated method stub
		return hdr_generateLetter;
	}
	
	

}
