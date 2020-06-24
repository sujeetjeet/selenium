package com.king.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class baseclasses {
	public static WebDriver driver;
	public Properties p1;

	@BeforeTest
	public void openBrowser() throws IOException
	{

		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"//App.properties");
		p1=new Properties();
		p1.load(fis);

		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//drivers//geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(p1.getProperty("url"));	 
	}
	

	@AfterTest
	public void closeBrowser()
	{
		driver.close();	
	}
	
	
	@BeforeClass
	public void login()
	{
		driver.findElement(By.name("username")).sendKeys(p1.getProperty("userid"));	
		driver.findElement(By.name("pwd")).sendKeys(p1.getProperty("password"));	
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	
	
	@AfterClass
	public void logout()
	{
		driver.findElement(By.className("logoutImg")).click();	
	}
}



