package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InitializeBrowser {
	

	public static WebDriver startBrowser(String url) throws Exception {

		System.setProperty(Utils.getPropertiesFromObject().getProperty("fsystemvariable"),
				Utils.getPropertiesFromObject().getProperty("fdriverpath"));
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(url);
		return driver;

	}

}
  