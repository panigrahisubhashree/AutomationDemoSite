package switchToModule;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.AutomationDemoSite.baseTest.BaseClass;
import com.AutomationDemoSite.genernic.ObjectRepositoryUtility.DatePickerPage;
import com.AutomationDemoSite.genernic.ObjectRepositoryUtility.HomePage;

/**
 * author Subhashree_Panigrahi test class for WidgetsModule
 * 
 */
public class WidgetsModuleTest extends BaseClass {

	@Test
	public void DatePickerTest() {

		HomePage hp = new HomePage(driver);
		hp.NavigateToDatePicker();

		DatePickerPage dpp = new DatePickerPage(driver);
		dpp.NavigateToSelectDateInDisabled();
		dpp.NavigateToSelectDateInEnabled();

	}

}
