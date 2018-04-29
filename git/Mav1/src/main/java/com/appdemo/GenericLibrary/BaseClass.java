package com.appdemo.GenericLibrary;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass
{
	public static WebDriver driver;
	ExcelLib cc = new ExcelLib();
	
	@BeforeClass
	public void configBC() throws Throwable
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\antony\\eclipse-workspace\\Mav1\\src\\test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		Properties pob = cc.getpropobj();
		String url = pob.getProperty("url");
		driver.get(url);
	}
	@AfterClass
	public void AfterClass()
	{
		driver.close();
	}

}
