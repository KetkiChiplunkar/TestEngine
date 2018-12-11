package com.testEngine.testBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

import CustomListeners.reportListener;

import com.testEngine.utilities.ReadExcel;
import com.testEngine.utilities.ReadXML;

public class testBase {

	private static final ITestResult FAILURE = null;
	public static WebDriver driver;
	public static String url;
//	public static String nodePlace;
	public static Properties configProp = new Properties();
	public static Properties orProp = new Properties();
	public static FileInputStream fis;
	public static Logger log = Logger.getLogger("devpinoyLogger");
	public static String filePath = "\\src\\test\\java\\com\\testEngine\\utilities\\objectRepo.xml";
	//public static ReadExcel excelRead = new ReadExcel(System.getProperty("user.dir")+"\\src\\test\\resources\\excel\\TestData.xlsx");
	public static reportListener report = new reportListener();
	public static ReadXML read = new ReadXML(System.getProperty("user.dir")+"\\src\\test\\resources\\Properties\\objectRepo.xml");

	// @BeforeSuite
	// public static void launchBrowser(String browser){
	// System.setProperty("webdriver.chrome.driver",
	// System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers\\chromedriver.exe");
	// driver = new ChromeDriver();
	// driver.get(url);
	// }
	public void openBrowser(String browser) {
		
		if (driver == null) {

			try {
				fis = new FileInputStream(
						System.getProperty("user.dir")
								+ "\\src\\test\\resources\\Properties\\config.properties");

			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				configProp.load(fis);
				log.debug("Config.Properties is loaded");
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				fis = new FileInputStream(System.getProperty("user.dir")
						+ "\\src\\test\\resources\\Properties\\OR.properties");
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				orProp.load(fis);
				log.debug("OR.Properties is loaded");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.setProperty(
					"webdriver.chrome.driver",
					System.getProperty("user.dir")
							+ "\\src\\test\\resources\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			log.debug("Browser Initialized");
		}
		System.out.println("url is " + configProp.getProperty("url"));
		driver.get(configProp.getProperty("url"));
		driver.manage().window().maximize();
		log.debug("Navigated to URL "+configProp.getProperty("url"));
	}


public void enterSearchTerm(String search)throws Exception{
  WebElement searchTerm = driver.findElement(By.xpath(orProp.getProperty("searchBar")));
  log.info("Search term is found "+searchTerm);
  searchTerm.sendKeys(search);
  log.info("Enter the search term as "+search);
 // Reporter.log("Enter the search term as "+search );
		  Thread.sleep(5000);
  WebElement clickSearch = driver.findElement(By.xpath(orProp.getProperty("clickSearch")));
  clickSearch.click();
  log.info("clicked on "+ clickSearch);
  //Reporter.log("clicked on "+ clickSearch );
  Thread.sleep(5000);
  	
}

public void clickContactUs()throws Exception{
	WebElement contactUs = driver.findElement(By.xpath(orProp.getProperty("contactUs")));
	log.info("Contact Us is found "+contactUs);
	//Reporter.log("Contact Us is found "+contactUs );
	 Thread.sleep(5000);
	contactUs.click();
	log.info("Clicked on contact us ");
	//Reporter.log("Clicked on contact us ");
	 Thread.sleep(5000);
}


public void login(String emailAddress, String password)throws Exception{
	driver.manage().window().maximize();
	
	WebElement logiDiv = driver.findElement(By.xpath(orProp.getProperty("loginContainer")));
	logiDiv.click();
	Thread.sleep(1000);
	Reporter.log("Clicked on loginContainer "+logiDiv);
	WebElement loginButton  = driver.findElement(By.xpath(orProp.getProperty("loginButton")));
	loginButton.click();
	Reporter.log("Clicked on loginButton "+loginButton);
	Thread.sleep(2000);
	WebElement enterEmail = driver.findElement(By.xpath(orProp.getProperty("enterEmail")));
	enterEmail.sendKeys(emailAddress);
	Reporter.log("enter EmailAddress "+emailAddress);
	WebElement enterPassword = driver.findElement(By.xpath(orProp.getProperty("enterPassword")));
	enterPassword.sendKeys(password);
	Reporter.log("enter Password ");
	WebElement clickLogin = driver.findElement(By.xpath(orProp.getProperty("login")));
	clickLogin.click();
	Reporter.log("logged into the application "+clickLogin);
	Thread.sleep(1000);
	logiDiv.click();
	Thread.sleep(5000);
  //  WebElement logout = driver.findElement(By.xpath(orProp.getProperty("logout")));
 //   logout.click();
  //  Reporter.log("logged out the application "+logout);
	
}

public void giftCard()throws Exception{
Thread.sleep(1000);
driver.findElement(By.xpath(read.xmlRead("//objectRef/GiftCardLink"))).click();
Reporter.log("clicked on GiftCard ");
Thread.sleep(1000);
driver.findElement(By.xpath(read.xmlRead("//objectRef/SendGiftCard"))).click();
Reporter.log("clicked on SendGiftCard ");

	
}


//@AfterTest
//public void closeBrowser(){
//	driver.close();
//	log.debug("Driver closed");
//	
//}














}
