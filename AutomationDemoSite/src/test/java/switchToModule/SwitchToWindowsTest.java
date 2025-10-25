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

/**
 * author Subhashree_Panigrahi test class for SwitchToWindowsModule
 * 
 */
public class SwitchToWindowsTest extends BaseClass {

	@Test
	public void SitchToWindownsModuleTest() {

		
		HomePage hp = new HomePage(driver);
		hp.NavigateToWindowsLink();

		WindowsPage wp = new WindowsPage(driver);
		wp.NavigateToOpenNewSeperateWindows();

	}
}
