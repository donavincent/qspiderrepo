package com.appdemo.GenericLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ExcelLib 
{
	String path = "C:\\Users\\antony\\eclipse-workspace\\Mav1\\src\\test\\resources\\Common.properties";
	public Properties getpropobj() throws Throwable
	{
		FileInputStream fis = new FileInputStream(path);
		Properties pob = new Properties();
		pob.load(fis);
		return pob;
	}

}
