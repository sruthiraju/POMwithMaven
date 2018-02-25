package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC005EditLead extends ProjectMethods {
	
	
	
	@BeforeTest
	public void setData() {
		testCaseName="TC005_EditLead";
		testDescription="Editing Lead & Verifying";
		testNodes="Leads";
		category="Smoke";
		authors="Sruthi";
		browserName="chrome";
		dataSheetName="TC005";
	}
	
	
	
	@Test(dataProvider="fetchData")
	public void EditLead(String uName,String pwd,String fName,String uName) {
		/*LoginPage lp = new LoginPage();
		lp.enterUserName();
		lp.enterPassword();
		lp.clickLogIn();*/
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRM()
		.clickLeads()
		.clickFindLeads()
		.enterCompanyName(cName)
		.enterFirstName(fName)
		.enterLastName(lName)
		.clickSubmit()
		.verifyCompanyName(vCName)
		;
		
		
		
		
		
		
		
	}

}


}
