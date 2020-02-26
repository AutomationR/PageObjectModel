package com.automation.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.automation.pages.LetsTalkTea_Checkout;
import com.automation.pages.LetsTalkTea_HomePage;
import com.automation.pages.LetsTalkTea_letstalktea;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Steps {
	
	public static WebDriver driver;
	//LetsTalkTea_HomePage homepageObj= new LetsTalkTea_HomePage(driver);

	
	@Given("^Launch  chrome browser and enter the URL$")
	public void launch_chrome_browser_and_enter_the_URL() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("http://www.practiceselenium.com/");
		driver.manage().window().maximize();
	  
			    
	}

	@When("^Click on the our passion link$")
	public void click_on_the_our_passion_link() throws Throwable {
		
		LetsTalkTea_HomePage homepageObj= new LetsTalkTea_HomePage(driver);
		homepageObj.clickOnPassionLink();
	    
	}
	
	@When("^Click on the our menu link$")
	public void click_on_the_our_menu_link() throws Throwable {
		LetsTalkTea_HomePage homepageObj= new LetsTalkTea_HomePage(driver);
	    homepageObj.clickOnMenuLink();
	    
	}

	@When("^Click on the our letstalktea link$")
	public void click_on_the_our_letstalktea_link() throws Throwable {
		LetsTalkTea_HomePage homepageObj= new LetsTalkTea_HomePage(driver);
	    homepageObj.clickOnletstalkteaLink();
	    
	}

	@When("^Click on the our checkout link$")
	public void click_on_the_our_checkout_link() throws Throwable {
		LetsTalkTea_HomePage homepageObj= new LetsTalkTea_HomePage(driver);
	    homepageObj.clickOnCheckoutLink();
	    
	}
	
	@When("^Enter the details in the checkout page$")
	public void enter_the_details_in_the_checkout_page() throws Throwable {
		LetsTalkTea_Checkout checkoutpageObj= new LetsTalkTea_Checkout(driver);
		checkoutpageObj.customer_Info();
	
	
	}
	

	@When("^Enter details in the lets talk tea page$")
	public void enter_details_in_the_lets_talk_tea_page() throws Throwable {
	
	LetsTalkTea_letstalktea letstalkteapageObj= new LetsTalkTea_letstalktea(driver);
	letstalkteapageObj.letstalktea_Info();

}



}
