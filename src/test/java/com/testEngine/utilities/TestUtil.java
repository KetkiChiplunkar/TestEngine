package com.testEngine.utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Reporter;

import com.testEngine.testBase.testBase;

public class TestUtil extends testBase {
	
	public static String screenName;
	public static String screen;
	//public static String path = System.getProperty("user.dir")+"\\target\\surefire-reports\\html\\"+screenName;
	//public static String path = System.getProperty("user.dir")+"\\src\\test\\resources\\Screenshot";

	public  static void captureScreenshot(){
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		try {
			screenName = "error.jpg";
			Date d = new Date();
			screen = d.toString().replace(":", "_").replace("","_");
					
			
			File screenshotName =new File(System.getProperty("user.dir")+"\\target\\surefire-reports\\html\\"+screen);
			FileUtils.copyFile(source, screenshotName);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
