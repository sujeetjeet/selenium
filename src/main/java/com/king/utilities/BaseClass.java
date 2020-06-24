package com.king.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	public static WebDriver driver;
	public Properties p1;
	@BeforeTest
	public void OpenBrowser() throws IOException {
		
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"//app.properties");
		p1=new Properties();
		p1.load(fis);
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		driver=new FirefoxDriver();
		driver.get(p1.getProperty("url"));
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	
	@BeforeClass
	public void Login() {
		driver.findElement(By.name("username")).sendKeys(p1.getProperty("userid"));
		driver.findElement(By.name("pwd")).sendKeys(p1.getProperty("password"));
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	
	@AfterClass
	public void LogOut() {
		driver.findElement(By.className("logoutImg")).click();
	}
	
	@AfterTest
	public void CloseBrowser() {
		driver.close();
	}
}