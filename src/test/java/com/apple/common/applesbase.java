package com.apple.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class applesbase {
	
	public WebDriver driver;
	public void LaunchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
				driver.get("https://secure1.store.apple.com/us-hed/shop/sign_in?c=aHR0cHM6Ly93d3cuYXBwbGUuY29tL3VzLWhlZC9zaG9wL2JhZ3wxYW9zYmI2N2YxYzQxMjI1ODgxMjVmMDBhNTIwNzU2ODMyNmY5MzhkMGM3Nw&r=SCDHYHP7CY4H9XK2H&s=aHR0cHM6Ly93d3cuYXBwbGUuY29tL3VzLWhlZC9zaG9wL2JhZ3wxYW9zYmI2N2YxYzQxMjI1ODgxMjVmMDBhNTIwNzU2ODMyNmY5MzhkMGM3Nw");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
				}
	
	public void closeAllBrowser() {
		driver.quit();
		
	}

}
