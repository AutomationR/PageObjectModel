package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.utilities.SeleniumHelper;

public class LetsTalkTea_Checkout extends SeleniumHelper{
	
	private WebDriver Checkout_driver;
	
	public LetsTalkTea_Checkout(WebDriver Checkout_driver) {
		PageFactory.initElements(Checkout_driver, this);
	}
	
	@FindBy(id = "email")
	private WebElement email_TextBox;
	
	@FindBy(id = "name")
	private WebElement name_TextBox;
	
	
	public void customer_Info() {
		
		sendKeys_OnElement(email_TextBox, "abc@gmail.com");
		sendKeys_OnElement(name_TextBox, "xxyyzz");
	}
	
	

}
