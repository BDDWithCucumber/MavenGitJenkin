package com.qa.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoTest {
	WebDriver driver;

	@Test(priority=1)
	public void url() throws InterruptedException {
		// Initialize browser
		System.setProperty("webdriver.chrome.driver", "C:\\Jyothi\\Softwares\\Browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://not-devweb-903v:17055/flex/LoginPasscode.aspx");
		driver.manage().window().maximize();
		System.out.println("Open URL");
		Thread.sleep(3000);
	}

	@Test(priority=2)
	public void login() {
		WebElement username = driver.findElement(By.name("UserName"));
		username.click();
		username.sendKeys("devapp");
		WebElement password = driver.findElement(By.name("Password"));
		password.click();
		password.sendKeys("");
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login Successfull");
		driver.close();
	}
}
