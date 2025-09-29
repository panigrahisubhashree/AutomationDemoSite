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

public class WidgetsModuleTest extends BaseClass {
	
	@Test
	public void DatePickerTest() {
		
		HomePage hp = new HomePage(driver);
		hp.NavigateToDatePicker();
		
		DatePickerPage dpp = new DatePickerPage(driver);
		dpp.NavigateToSelectDateInDisabled();
		dpp.NavigateToSelectDateInEnabled();
		
		
		
		
		
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		driver.get("https://demo.automationtesting.in/Windows.html");
//		driver.findElement(By.xpath("//a[contains(text(),'Widgets')]")).click();
//		driver.findElement(By.xpath("//a[contains(text(),'Datepicker')]")).click();
//		
//		
//		driver.findElement(By.id("datepicker1")).click();
//		driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']")).click();
//		driver.findElement(By.xpath("//a[contains(text(),'7')]/../../../..")).click();
//		
//		driver.findElement(By.id("datepicker2")).click();
//		driver.findElement(By.xpath("//select[@title='Change the month']")).click();
//		WebElement monthselect = driver.findElement(By.xpath("//select[@title='Change the month']"));
//		Select dropdown = new Select(monthselect);
//		dropdown.selectByContainsVisibleText("December");
//		driver.findElement(By.xpath("//a[contains(text(),'7')]//ancestor::div[@class='datepick-month']")).click();
//		
	}

}
