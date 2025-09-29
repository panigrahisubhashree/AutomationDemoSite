package com.AutomationDemoSite.baseTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.AutomationDemoSite.genernic.Javautility.JavaUtility;
import com.AutomationDemoSite.genernic.WebDriverUtility.UtilityClassObject;
import com.AutomationDemoSite.genernic.WebDriverUtility.WebDriverUtility;
import com.AutomationDemoSite.genernic.fileutility.FileUtility;

public class BaseClass {

	public FileUtility flib = new FileUtility();
	public JavaUtility jlib = new JavaUtility();
	public WebDriverUtility wblib = new WebDriverUtility();
	public WebDriver driver = null;
	public static WebDriver sdriver=null; 
	
	 @BeforeSuite(groups={"smokeTest","regressionTest"})
	 public void configBS() {
		 System.out.println("=======connect to DB, Report Config=========");
		
	 }
	 
	 @BeforeClass(groups={"smokeTest","regressionTest"})
		public void configBC() throws IOException {
			System.out.println("========Launch the browser============");
			String BROWSER = System.getProperty("browser",flib.getDataFromPropertiesFile("browser"));
			String URL = System.getProperty("url", flib.getDataFromPropertiesFile("url"));
			if(BROWSER.equals("chrome")) {
				driver = new ChromeDriver();
			}else if(BROWSER.equals("firefox")){
				driver = new FirefoxDriver();
			} else if (BROWSER.equals("edge")){
				driver = new EdgeDriver();
			}else {
				driver = new ChromeDriver();
			}
			driver.get(URL);
			sdriver = driver;
			UtilityClassObject.setDriver(driver);
		}
	 
	 @BeforeMethod(groups={"smokeTest","regressionTest"})
		public void configBM() throws IOException {
			System.out.println("===========Login=============");
		}
		@AfterMethod(groups={"smokeTest","regressionTest"})
		public void configAM() throws Exception {
		System.out.println("===============logout==============");
		}
		@AfterClass(groups={"smokeTest","regressionTest"})
		public void configAC() {
			System.out.println("==============close the browser===============");
			driver.quit();
		}
		@AfterSuite(groups={"smokeTest","regressionTest"})
		public void configAS() {
			System.out.println("===================close DB, Report backup==============");
			
		}
	
}
