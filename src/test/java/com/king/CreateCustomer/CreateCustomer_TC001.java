package com.king.CreateCustomer;

import org.testng.annotations.Test;

import com.king.utilities.BaseClass;
import com.king.utilities.baseclasses;

import WebPages.ActiveProjectAndCustomerPage;
import WebPages.AddNewCustomerpage;
import WebPages.OpenTasksPage;

public class CreateCustomer_TC001 extends baseclasses{
	@Test
	public void CreateCustomer() {
		OpenTasksPage otp=new OpenTasksPage();
		otp.ClickOnProjectAndCustomerLink();
		ActiveProjectAndCustomerPage apacp= new ActiveProjectAndCustomerPage();
		apacp.ClickOnAddNewCustomerbuttion();
		AddNewCustomerpage ancp=new AddNewCustomerpage();
		ancp.EnterCustomername("q1qq");
		ancp.ClickOnCustomerCreateButton();
		String s=apacp.RetriveSuccessMessage();
		System.out.println(s);
	}

	

}
