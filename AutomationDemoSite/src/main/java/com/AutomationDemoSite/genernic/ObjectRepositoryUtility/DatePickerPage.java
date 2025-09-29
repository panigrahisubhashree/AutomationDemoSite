package com.AutomationDemoSite.genernic.ObjectRepositoryUtility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.AutomationDemoSite.genernic.WebDriverUtility.WebDriverUtility;

public class DatePickerPage {
	WebDriver driver;
	WebDriverUtility wblib;
	public DatePickerPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id ="datepicker1")
	private WebElement DatePickerDisabledTestField;
	
	@FindBy(xpath="//a[@class='ui-datepicker-next ui-corner-all']")
	private WebElement nextButton;
	
	@FindBy(xpath="//a[contains(text(),'7')]/../../../..")
	private WebElement DateSelection;
	
	@FindBy(id = "datepicker2")
	private WebElement DatePickerEnabledTextField;
	
	@FindBy(xpath= "//select[@title='Change the month']")
	private WebElement monthselectionDropdown;
	
	@FindBy(xpath="//select[@title='Change the month']")
	private WebElement monthselect;
	
	@FindBy(xpath="//a[contains(text(),'7')]//ancestor::div[@class='datepick-month']")
	private WebElement DateSelection2;
	
	public WebElement getMonthselect() {
		return monthselect;
	}
	public WebElement getDateSelection2() {
		return DateSelection2;
	}
	public WebElement getNextButton() {
		return nextButton;
	}
	public WebElement getDateSelection() {
		return DateSelection;
	}
	public WebElement getMonthselectionDropdown() {
		return monthselectionDropdown;
	}
	public WebElement getDatePickerDisabledTestField() {
		return DatePickerDisabledTestField;
	}
	public WebElement getDatePickerEnabledTextField() {
		return DatePickerEnabledTextField;
	}
	

	public void NavigateToSelectDateInDisabled() {
		DatePickerDisabledTestField.click();
		nextButton.click();
		DateSelection.click();
	}
	
	public void NavigateToSelectDateInEnabled() {
		DatePickerEnabledTextField.click();
		monthselectionDropdown.click();
		WebElement monthselect = driver.findElement(By.xpath("//select[@title='Change the month']"));
		Select dropdown = new Select(monthselect);
		dropdown.selectByContainsVisibleText("December");
		//wblib.SelectByText(monthselect, "December");
		DateSelection2.click();
		
		
	}
	
	
}
