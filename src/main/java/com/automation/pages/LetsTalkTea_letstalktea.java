package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.utilities.SeleniumHelper;

public class LetsTalkTea_letstalktea extends SeleniumHelper{
	
private WebDriver letstalktea_driver;

public LetsTalkTea_letstalktea(WebDriver letstalktea_driver) {
	PageFactory.initElements(letstalktea_driver, this);
}

	@FindBy(linkText = "Let's Talk Tea")
	private WebElement letstalktea_link;

	
	@FindBy(name = "name")
	private WebElement name_TextBox;
	
	@FindBy(name = "email")
	private WebElement email_TextBox;
	
	@FindBy(name = "subject")
	private WebElement subject_TextBox;
	
	@FindBy(name = "message")
	private WebElement message_TextBox;
	
		
	public void letstalktea_Info() {
		
		click_OnElement(letstalktea_link);
		sendKeys_OnElement(email_TextBox, "valli@gmail.com");
		sendKeys_OnElement(name_TextBox, "ABCD");
		sendKeys_OnElement(subject_TextBox, "Hello Message");
		sendKeys_OnElement(message_TextBox, "Hi HEllo");



	}
	

}
