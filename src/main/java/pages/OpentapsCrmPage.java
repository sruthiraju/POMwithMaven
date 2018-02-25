package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class OpentapsCrmPage extends ProjectMethods{
	
	public OpentapsCrmPage() {
		PageFactory.initElements(driver,this);
	}	


  @FindBy(how=How.ID,using="updateLeadForm_companyName")
   private WebElement eleupdatecname;

  public OpentapsCrmPage UpdateComName(String data) {
		//WebElement elePassword = locateElement("password");
		type(eleupdatecname, data);
		return this;
	}



@FindBy(how=How.XPATH,using="//input[@value='Update']")
private WebElement eleupdate;


public ViewLeadPage clickupdate() {
	//WebElement eleLogin = locateElement("class","decorativeSubmit");
	click(eleupdate);
	/*HomePage hp = new HomePage();
	return hp;*/
	return new ViewLeadPage();
}
}





 