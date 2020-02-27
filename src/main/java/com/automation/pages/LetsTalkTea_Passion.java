package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.automation.utilities.SeleniumHelper;

public class LetsTalkTea_Passion extends SeleniumHelper {
	
	private WebDriver LetsTalkTea_Passiondriver;

	
	public LetsTalkTea_Passion(WebDriver LetsTalkTea_Passiondriver) {
		PageFactory.initElements(LetsTalkTea_Passiondriver, this);
	}
	
	public void scrollWindow()
	{
	scrollWindow(LetsTalkTea_Passiondriver);
	}

}
