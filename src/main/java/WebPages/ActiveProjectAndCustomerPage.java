package WebPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.king.utilities.BaseClass;
import com.king.utilities.baseclasses;

public class ActiveProjectAndCustomerPage {
	@FindBy(xpath="//input[@value='Add New Customer']")
	private WebElement AddNewCustomer;
	
	@FindBy(className="successmsg")
	private WebElement RetriveSuccessMessage;
	
	public ActiveProjectAndCustomerPage() {
		PageFactory.initElements(baseclasses.driver,this);
	}
public void ClickOnAddNewCustomerbuttion() {
	AddNewCustomer.click();
}
public String RetriveSuccessMessage() {
	String s=RetriveSuccessMessage.getText();
	return s;
}
}
