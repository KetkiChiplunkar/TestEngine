package com.testEngine.testBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.testEngine.utilities.ReadXML;

public class Page {
	
	public WebDriver driver;
	public ReadXML read = new ReadXML(System.getProperty("user.dir")+"\\src\\test\\resources\\Properties\\objectRepo.xml");
	
	public Page() {

		System.setProperty(
				"webdriver.chrome.driver",
				System.getProperty("user.dir")
						+ "\\src\\test\\resources\\Drivers\\chromedriver.exe");
	
		driver = new ChromeDriver();	
		driver.get("https://www.zoho.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
	}

	
	
	

}
