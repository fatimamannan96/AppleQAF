package com.apple.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class userlogin {
	
	WebDriver driver;
	public userlogin (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(id="email")
			WebElement UserName;
	
	public void enterUserName (String uName) {
		UserName.sendKeys(uName);
	}

}
