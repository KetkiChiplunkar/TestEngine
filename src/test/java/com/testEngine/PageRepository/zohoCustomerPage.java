package com.testEngine.PageRepository;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.testEngine.testBase.Page;

public class zohoCustomerPage extends Page {


	public zohoCustomerPage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void clickCustomer() throws Exception{
		driver.findElement(By.xpath(read.xmlRead("//objectRef/custLink"))).click();
	}
	
	public String getUsersCount()throws Exception{
		WebElement count = driver.findElement(By.xpath(read.xmlRead("//objectRef/custCount")));
		
		return count.getText();

	}

}
