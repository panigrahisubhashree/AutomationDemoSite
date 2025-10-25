package switchToModule;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MakeMyTrip {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.makemytrip.com/");
		
		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		
		driver.findElement(By.id("fromCity")).click();
		driver.findElement(By.xpath("//input[@aria-controls='react-autowhatever-1']")).sendKeys("Bengaluru");
		driver.findElement(By.xpath("//span[text()='Bengaluru']")).click();
		
		
		driver.findElement(By.id("toCity")).click();
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Bhubaneswar");
		driver.findElement(By.xpath("//p[text()='Bhubaneswar, India']")).click();
		
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		//driver.findElement(By.xpath("//p[text()='7']/ancestor::div[@class='DayPicker-Month' and contains(.,'November')]")).click();

//		for(; ;)
//		{
//		try {
//			driver.findElement(By.xpath("//p[text()='7']/ancestor::div[@class='DayPicker-Month' and contains(.,'November')]")).click();
//			break;
//			
//		}catch(Exception e) {
//			driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
//		}
//		
//		}
		

	}

}
