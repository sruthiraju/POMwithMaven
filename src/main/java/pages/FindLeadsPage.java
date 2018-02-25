package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindLeadsPage extends ProjectMethods{
	
	public FindLeadsPage() {
		PageFactory.initElements(driver,this);
	}	
	
	
	@FindBy(how=How.XPATH,using="(//label[text()='Lead ID:']/following::input[2])\")")
	private WebElement eleenterfname;
	
	public FindLeadsPage enterFname(String data) {
		//verifyPartialText(eleenterfname, data);
		return this;	
	}
	
@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
private WebElement elefindlead;

public FindLeadsPage clickFindLead() {
	//WebElement eleLogin = locateElement("class","decorativeSubmit");
	click(elefindlead);
	/*HomePage hp = new HomePage();
	return hp;*/
	return new FindLeadsPage();
}

@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
private WebElement elefirstele;

public ViewLeadPage clickFirstElement() {
	//WebElement eleLogin = locateElement("class","decorativeSubmit");
	click(elefirstele);
	/*HomePage hp = new HomePage();
	return hp;*/
	return new ViewLeadPage();

	
	
	
	
	
	
	
	
	// type(locateElement("xpath", "(//label[text()='Lead ID:']/following::input[2])"),"aaa");	

}
}
