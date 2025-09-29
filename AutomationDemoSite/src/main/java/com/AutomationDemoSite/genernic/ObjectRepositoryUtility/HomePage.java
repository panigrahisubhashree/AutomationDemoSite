package com.AutomationDemoSite.genernic.ObjectRepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AutomationDemoSite.genernic.WebDriverUtility.WebDriverUtility;

public class HomePage {

	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'SwitchTo')]")
	private WebElement SwitchTo_dropdown;
	
	@FindBy(xpath="//ul[@class='dropdown-menu']//a[text()='Windows']")
	private WebElement WindowsOption;
	
	@FindBy(xpath="//a[contains(text(),'Frames')]")
	private WebElement FramesOption;
	
	@FindBy(xpath="//a[contains(text(),'Datepicker')]")
	private WebElement DatePickerOption;
	
	@FindBy(xpath="//a[contains(text(),'Widgets')]")
	private WebElement Widgets_dropdown;
	
	
	public WebElement getSwitchTo_dropdown() {
		return SwitchTo_dropdown;
	}

	public WebElement getWidgets_dropdown() {
		return Widgets_dropdown;
	}
	
	public WebElement getFramesOption() {
		return FramesOption;
	}

	public void setFramesOption(WebElement framesOption) {
		FramesOption = framesOption;
	}

	public WebElement getWindowsOption() {
		return WindowsOption;
	}

	public WebElement getDatePickerOption() {
		return DatePickerOption;
	}

	public void NavigateToWindowsLink() {
		SwitchTo_dropdown.click();
		WindowsOption.click();
	}
	
	public void NavigateToFrames() {
		SwitchTo_dropdown.click();
		FramesOption.click();
	}
	public void NavigateToDatePicker() {
		Widgets_dropdown.click();
		DatePickerOption.click();
	}
}
