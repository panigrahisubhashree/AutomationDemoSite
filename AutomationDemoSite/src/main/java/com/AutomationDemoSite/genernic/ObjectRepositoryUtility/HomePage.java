package com.AutomationDemoSite.genernic.ObjectRepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AutomationDemoSite.genernic.WebDriverUtility.WebDriverUtility;

/**
 * author Subhashree_Panigrahi POM class for HomePage
 * 
 */
public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'SwitchTo')]")
	private WebElement SwitchTo_dropdown;

	@FindBy(xpath = "//ul[@class='dropdown-menu']//a[text()='Windows']")
	private WebElement WindowsOption;

	@FindBy(xpath = "//a[contains(text(),'Frames')]")
	private WebElement FramesOption;

	@FindBy(xpath = "//a[contains(text(),'Datepicker')]")
	private WebElement DatePickerOption;

	@FindBy(xpath = "//a[contains(text(),'Widgets')]")
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

	/**
	 * author Subhashree_Panigrahi BusinessEntity created to perform click action on
	 * windows inside switchTo dropdown
	 * 
	 */
	public void NavigateToWindowsLink() {
		SwitchTo_dropdown.click();
		WindowsOption.click();
	}

	/**
	 * author Subhashree_Panigrahi BusinessEntity created to perform click action on
	 * Frames inside switchTo dropdown
	 * 
	 */
	public void NavigateToFrames() {
		SwitchTo_dropdown.click();
		FramesOption.click();
	}

	/**
	 * author Subhashree_Panigrahi BusinessEntity created to perform click action on
	 * DatePicker inside switchTo dropdown
	 * 
	 */
	public void NavigateToDatePicker() {
		Widgets_dropdown.click();
		DatePickerOption.click();
	}
}
