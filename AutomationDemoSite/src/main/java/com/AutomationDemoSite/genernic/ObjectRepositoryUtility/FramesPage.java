package com.AutomationDemoSite.genernic.ObjectRepositoryUtility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AutomationDemoSite.genernic.WebDriverUtility.WebDriverUtility;

public class FramesPage {
	WebDriver driver;
	WebDriverUtility wblib;
	public FramesPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Iframe with in an Iframe')]")
	private WebElement Iframe_with_in_an_IframeButton;
	
	public WebElement getIframe_with_in_an_IframeButton() {
		return Iframe_with_in_an_IframeButton;
	}
	
	@FindBy(xpath ="//input[@type='text']")
	private WebElement textfield;
	
	public WebElement getTextfield() {
		return textfield;
	}

	@FindBy(xpath ="//iframe[@src='MultipleFrames.html']")
	private WebElement MainFrame;
	
	@FindBy(xpath= "//iframe")
	private WebElement childframe;
	
	public WebElement getMainFrame() {
		return MainFrame;
	}

	public WebElement getChildframe() {
		return childframe;
	}

	public void NavigateToNestedFrame() {
		Iframe_with_in_an_IframeButton.click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']")));
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
		//wblib.switchtoFrame(driver, MainFrame);
		//wblib.switchtoFrame(driver, childframe);
		textfield.sendKeys("subhashree");
		
	}
	
	

}
