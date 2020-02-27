package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LetsTalkTea_Welcome {
	
	private WebDriver LetsTalkTea_Welcomedriver;


	public LetsTalkTea_Welcome(WebDriver LetsTalkTea_Welcomedriver) {
		PageFactory.initElements(LetsTalkTea_Welcomedriver, this);

	}
	
}
