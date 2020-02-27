package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.utilities.SeleniumHelper;

public class LetsTalkTea_Menu extends SeleniumHelper
{

	WebDriver LetsTalkTea_Menu;
	public LetsTalkTea_Menu(WebDriver LetsTalkTea_Menu)
	{
		PageFactory.initElements(LetsTalkTea_Menu,this);
	}
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[16]/div[1]/a[1]/span[1]") 
	WebElement grrenTeaCheckOut;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[15]/div[1]/a[1]/span[1]")
	
	WebElement redTeaCheckOut;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[27]/div[1]/a[1]/span[1]")
	WebElement ooLongTeaCheckOut;
	
	
	public void clickOnGreenTea()
	{
		click_OnElement(grrenTeaCheckOut);

	}
	public void clickOnRedTea()
	{
		click_OnElement(redTeaCheckOut);

	}
	public void clickonOolongTea()
	{
		click_OnElement(ooLongTeaCheckOut);
	}
	
}
