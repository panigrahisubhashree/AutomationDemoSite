package com.AutomationDemoSite.genernic.ObjectRepositoryUtility;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AutomationDemoSite.genernic.WebDriverUtility.WebDriverUtility;

public class WindowsPage {

	WebDriver driver;
	WebDriverUtility wblib;
	public WindowsPage(WebDriver driver) {
		this.driver=driver;
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
	
	public void NavigateToOpenNewSeperateWindows() {
		Open_New_Seperate_WindowsButton.click();
		ClickBtton.click();
		//wblib.SwitchToWindow(driver);
		String parentWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		for(String handle :allWindows) {
			if(!handle.equals(parentWindow)) {
				driver.switchTo().window(handle);
				System.out.println("Switched to child window: " + driver.getTitle());
				System.out.println(driver.getCurrentUrl());
				break;
			}
		}
	}
	
	
}
