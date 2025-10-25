package switchToModule;

import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorldoMeter {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.worldometers.info/coronavirus/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		
		Actions action = new Actions(driver);
		List<WebElement> bars = driver.findElements(By.xpath(
				"//div[@id='coronavirus-cases-daily']//*[name()='svg']/descendant::*[name()='rect' and @class='highcharts-point']"));

		Set<String> toolTipData = new LinkedHashSet<String>();

		// Loop through each bar and get tooltip text
		for (WebElement bar : bars) {
			action.moveToElement(bar).perform();

			// Tooltip element appears dynamically
			WebElement tooltipElements = driver.findElement(By.xpath(
					"//[local-name()='svg']/descendant::[name()='g' and @class='highcharts-label highcharts-tooltip highcharts-color-undefined']"));

			String TooltipText = tooltipElements.getText();
			if (!TooltipText.isEmpty()) {
				toolTipData.add(TooltipText);
			}
		}
		for (String tooltipDatawithnumbers : toolTipData) {
			System.out.println(tooltipDatawithnumbers);
		}

	}

}
