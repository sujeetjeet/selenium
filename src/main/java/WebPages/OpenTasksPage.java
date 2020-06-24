package WebPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.king.utilities.BaseClass;
import com.king.utilities.baseclasses;

public class OpenTasksPage {
	@FindBy(linkText="Projects & Customers")
	private WebElement projectAndCuctomer;
	public OpenTasksPage(){
		PageFactory.initElements(baseclasses.driver,this);
	}
	public void ClickOnProjectAndCustomerLink()
	 {
		projectAndCuctomer.click();	
	}

}
