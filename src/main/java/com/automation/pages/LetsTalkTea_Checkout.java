package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.utilities.SeleniumHelper;
public class LetsTalkTea_Checkout extends SeleniumHelper {
	
	private WebDriver Checkout_driver;
	
	public LetsTalkTea_Checkout(WebDriver Checkout_driver) {
		PageFactory.initElements(Checkout_driver, this);
	}
	
	@FindBy(id = "email")
	private WebElement email_TextBox;
	
	@FindBy(id = "name")
	private WebElement name_TextBox;
	
	@FindBy(id = "address")
	private WebElement address_TextBox;
	
	@FindBy(id = "card_type")
	private WebElement cardtype_Dropdown;
	
	@FindBy(id = "card_number")
	private WebElement cardnum_TextBox;
	
	@FindBy(id = "cardholder_name")
	private WebElement cardname_TextBox;
	
	@FindBy(id = "verification_code")
	private WebElement verifycode_TextBox;
	
	
	
	public void customer_Info() {
		
		sendKeys_OnElement(email_TextBox, "abc@gmail.com");
		sendKeys_OnElement(name_TextBox, "xxyyzz");
		sendKeys_OnElement(address_TextBox, "Chennai");
		dropdown_selectbyindex(cardtype_Dropdown, 1);
		sendKeys_OnElement(cardnum_TextBox, "0123456789");
		sendKeys_OnElement(cardname_TextBox, "Personx");
		sendKeys_OnElement(verifycode_TextBox, "9876");


	}
	
	

}
