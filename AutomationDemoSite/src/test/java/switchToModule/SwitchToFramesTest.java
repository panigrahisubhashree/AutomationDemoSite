package switchToModule;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.AutomationDemoSite.baseTest.BaseClass;
import com.AutomationDemoSite.genernic.Javautility.JavaUtility;
import com.AutomationDemoSite.genernic.ObjectRepositoryUtility.FramesPage;
import com.AutomationDemoSite.genernic.ObjectRepositoryUtility.HomePage;
import com.AutomationDemoSite.genernic.ObjectRepositoryUtility.WindowsPage;
import com.AutomationDemoSite.genernic.WebDriverUtility.WebDriverUtility;
import com.AutomationDemoSite.genernic.fileutility.FileUtility;

public class SwitchToFramesTest extends BaseClass {

	@Test
	public void switchToFramesModuleTest() {
		
		HomePage hp = new HomePage(driver);
		hp.NavigateToFrames();
		
		FramesPage fp = new FramesPage(driver);
		fp.NavigateToNestedFrame();
		
	
		
		
		
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		driver.get("https://demo.automationtesting.in/Windows.html");
//		driver.findElement(By.xpath("//a[contains(text(),'SwitchTo')]")).click();
//		driver.findElement(By.xpath("//a[contains(text(),'Frames')]")).click();
//		driver.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]")).click();
//		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']")));
//		driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("subhashree");
	}
}
