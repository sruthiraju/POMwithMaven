package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods{
	
	public ViewLeadPage() {
		PageFactory.initElements(driver,this);
	}
	

		@FindBy(how=How.ID,using="viewLead_companyName_sp")
	private WebElement eleverifyCName;
	
		public ViewLeadPage verifyCompanyName(String data) {
			verifyPartialText(eleverifyCName, data);
			return this;		
		}
	

		@FindBy(how=How.LINK_TEXT,using="Edit")
		private WebElement eleedit;
	
		public ViewLeadPage clickCRM() {
			//WebElement eleLogin = locateElement("class","decorativeSubmit");
			click(eleedit);
			//HomePage hp = new HomePage();
			//return hp; //
			return new ViewLeadPage();
	
		}
		
		
	
	
	
	
	
	
	
	
	
	
	

}
