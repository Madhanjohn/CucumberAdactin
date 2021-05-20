package com.adaction.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Configuration_Reader {
	
	public static Properties p;
	
	public Configuration_Reader() throws Exception {

			File f = new File("C:\\Users\\PC\\Desktop\\Madhan Course\\Esclipe\\Final_Cucumber_Project\\src\\test\\java\\com\\adaction\\properties\\Configuration.properties");
			
			FileInputStream fis = new FileInputStream(f);
			
			p = new Properties();
			
			p.load(fis);
	}
	
	public String getBrowser() {

			String browser = p.getProperty("browser");
			return browser;
			
	}
	
	public String getUrl() {
		
		String url = p.getProperty("url");
		return url;
	}
	

}
