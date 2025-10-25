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

/**
 * author Subhashree_Panigrahi test class for SwitchToFramesModule
 * 
 */
public class SwitchToFramesTest extends BaseClass {

	@Test
	public void switchToFramesModuleTest() {

		HomePage hp = new HomePage(driver);
		hp.NavigateToFrames();

		FramesPage fp = new FramesPage(driver);
		fp.NavigateToNestedFrame();

	}
}
