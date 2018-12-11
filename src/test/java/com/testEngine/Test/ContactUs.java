package com.testEngine.Test;

import com.testEngine.testBase.testBase;
import org.testng.annotations.Test;

public class ContactUs extends testBase{
	public static String url = "https://www.google.com/";
	
	@Test
	public void verifyHomePage() throws Exception{
		openBrowser("Chrome");
		clickContactUs();
		
	}

}
