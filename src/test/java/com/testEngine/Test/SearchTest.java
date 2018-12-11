package com.testEngine.Test;

import org.testng.annotations.Test;

import com.testEngine.testBase.testBase;

public class SearchTest extends testBase {

	@Test
	public void searchTerm()throws Exception{
		openBrowser("chrome");
		enterSearchTerm("shoes");
		
	}
	
}
