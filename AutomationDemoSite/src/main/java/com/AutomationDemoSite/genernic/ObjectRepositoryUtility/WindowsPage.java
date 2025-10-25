package com.AutomationDemoSite.genernic.ObjectRepositoryUtility;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AutomationDemoSite.genernic.WebDriverUtility.WebDriverUtility;

/**
 * author Subhashree_Panigrahi POM class for WindowsPage
 * 
 */
public class WindowsPage {

	WebDriver driver;
	WebDriverUtility wblib; 

	public WindowsPage(WebDriver driver) {
		this.driver = driver;//to use in business utility we are using this line and we are declaring driver as a global variable
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'Open New Seperate Windows')]")
	private WebElement Open_New_Seperate_WindowsButton;

	@FindBy(xpath = "//button[contains(text(),'click') and @class='btn btn-primary']")
	private WebElement ClickBtton;

	public WebElement getClickBtton() {
		return ClickBtton;
	}

	public WebElement getOpen_New_Seperate_WindowsButton() {
		return Open_New_Seperate_WindowsButton;
	}

	/**
	 * author Subhashree_Panigrahi BusinessEntity to capture current url and titile
	 * of the another window which will display after clicking on click button
	 * inside OpenNewSeperateWindow
	 * 
	 * 
	 */
	public void NavigateToOpenNewSeperateWindows() {
		Open_New_Seperate_WindowsButton.click();
		ClickBtton.click();
		// wblib.SwitchToWindow(driver);
		String parentWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		for (String handle : allWindows) {
			if (!handle.equals(parentWindow)) {
				driver.switchTo().window(handle);
				System.out.println("Switched to child window: " + driver.getTitle());
				System.out.println(driver.getCurrentUrl());
				break;
			}
		}
	}

}
