package com.qa.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoTest {
	@Test
	public void login() {
		// Initialize browser
	
		System.setProperty("webdriver.chrome.driver", "C:\\Jyothi\\Softwares\\Browsers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		// Open facebook
		driver.get("http://www.facebook.com");
		 
		// Maximize browser
		 
		driver.manage().window().maximize();
	}
	}
