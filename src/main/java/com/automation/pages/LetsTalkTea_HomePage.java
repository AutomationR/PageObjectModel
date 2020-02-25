package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.automation.utilities.SeleniumHelper;

public class LetsTalkTea_HomePage extends SeleniumHelper {

	private WebDriver LetsTalkTea_HomePage;
	public LetsTalkTea_HomePage(WebDriver LetsTalkTea_HomePage) {
		PageFactory.initElements(LetsTalkTea_HomePage, this);
	}

	@FindBy(linkText = "Welcome")
	private WebElement welcome_link;// Find element

	@FindBy(linkText = "Our Passion")
	private WebElement passion_link;
	
	@FindBy(linkText = "Menu")
	private WebElement menu_link;

	@FindBy(linkText = "Let's Talk Tea")
	private WebElement letstalktea_link;
	
	@FindBy(linkText = "Check Out")
	private WebElement checkout_link;
	


	public void clickOnWelcomeLink() {
		click_OnElement(welcome_link);

	}

	public void clickOnPassionLink() {
		click_OnElement(passion_link);

	}
	

	public void clickOnMenuLink() {
		click_OnElement(menu_link);

	}
	
	public void clickOnletstalkteaLink() {
		click_OnElement(letstalktea_link);

	}
	
	public void clickOnCheckoutLink() {
		click_OnElement(checkout_link);

	}
	
	
}
