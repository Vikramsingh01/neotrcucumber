package com.meganexus.stepsLib;

import com.meganexus.pageObjectLib.AllocationPage;
import com.meganexus.pageObjectLib.ComponentManagementPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
public class ComponentManagementSteps {
	

ComponentManagementPage componentManagementPage;

@Step	
 public void navigateToComponentManagement(){
	componentManagementPage.clickonComponentManagement();
}

@Step	
public void verifyFieldsListView(){
	componentManagementPage.verifyfieldListViewOfCompManagement();
}

@Step	
public void reAllocateComponents(){
	componentManagementPage.verifyReallocationofComponents();
}

}
