package switchToModule;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.AutomationDemoSite.baseTest.BaseClass;
import com.AutomationDemoSite.genernic.ObjectRepositoryUtility.HomePage;
import com.AutomationDemoSite.genernic.ObjectRepositoryUtility.WindowsPage;

public class SwitchToWindowsTest extends BaseClass{

	@Test
	public void SitchToWindownsModuleTest() {
		
	
		HomePage hp = new HomePage(driver);
		hp.NavigateToWindowsLink();
		
		WindowsPage wp = new WindowsPage(driver);
		wp.NavigateToOpenNewSeperateWindows();
		
	
		
		
//		
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		driver.get("https://demo.automationtesting.in/Windows.html");
//		driver.findElement(By.xpath("//a[contains(text(),'SwitchTo')]")).click();
//		driver.findElement(By.xpath("//ul[@class='dropdown-menu']//a[text()='Windows']")).click();
//		driver.findElement(By.xpath("//a[contains(text(),'Open New Seperate Windows')]")).click();
//		driver.findElement(By.xpath("//button[contains(text(),'click') and @class='btn btn-primary']")).click();
//		String parentWindow = driver.getWindowHandle();
//		Set<String> allWindows = driver.getWindowHandles();
//		for(String handle :allWindows) {
//			if(!handle.equals(parentWindow)) {
//				driver.switchTo().window(handle);
//				System.out.println("Switched to child window: " + driver.getTitle());
//				System.out.println(driver.getCurrentUrl());
//			}
//		}
		
	}
}
