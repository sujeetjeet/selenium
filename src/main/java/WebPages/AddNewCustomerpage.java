package WebPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.king.utilities.BaseClass;
import com.king.utilities.baseclasses;

public class AddNewCustomerpage {
	@FindBy(name="name")
	private WebElement CustomerNameTextField;
	
	@FindBy(name="createCustomerSubmit")
	private WebElement CustomerCreateButton;
	
	public AddNewCustomerpage() {
		PageFactory.initElements(baseclasses.driver,this);
		}
	
	public void EnterCustomername(String CustomerName) {
		CustomerNameTextField.sendKeys(CustomerName);	
	}
	public void ClickOnCustomerCreateButton() {
		CustomerCreateButton.click();
	}

}
