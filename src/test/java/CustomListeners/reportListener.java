package CustomListeners;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.testEngine.testBase.testBase;
import com.testEngine.utilities.TestUtil;

public class reportListener implements ITestListener  {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
//		Reporter.log("TestMethod resides in "+ result.getClass().getName(),true);
//		if(result.getParameters().length!=0){
//			
//			String params = null; 
//			for(Object parameter:result.getParameters()){
//				
//				params = parameter.toString()+",";
//			}
//			
//	Reporter.log("Test Method had the following parameters "+params,true);
//		}
//	String status = null; 
//	switch (result.getStatus()){
//	case ITestResult.SUCCESS: 
//		status = "PASS";
//	case ITestResult.SKIP:
//		status="IGNORE";
//	case ITestResult.FAILURE:
//    TestUtil.captureScreenshot();
//	}
//	Reporter.log("Test Status: " + status, true);	
	}

	public void onTestFailure(ITestResult arg0) {
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		TestUtil.captureScreenshot();
		Reporter.log("Capturing screenshot");
		// Reporter.log("<img src=\"C:\\Users\\ketki.chiplunkar\\workspace\\TestEngine\\src\\test\\resources\\Screenshot\\error.jpg\"height='100' width='100'></img>");
       // 	 Reporter.log("<a target = \"blank\"href=\"C:\\Users\\ketki.chiplunkar\\workspace\\TestEngine\\src\\test\\resources\\Screenshot\\error.jpg\">Screenshot</a>");
	
        Reporter.log("<a target = \"blank\"href="+TestUtil.screen+ ">Screenshot</a>");
	
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}


	 public void screenCapture() throws IOException{
//         System.setProperty("org.uncommons.reportng.escape-output", "false");
//         File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//         String Path = "E:\\Automation\\testproject\\Screenshots\\";
//         File screenshotName = new File(Path +driver.getTitle()+".png");
//         //Now add screenshot to results by copying the file
//         FileUtils.copyFile(scrFile, screenshotName);
         Reporter.log("<br>  <img src='"+TestUtil.screenName+"' height='100' width='100' /><br>");
         Reporter.log("<a href="+TestUtil.screenName+"></a>");

	 }

}
