package com.parallel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelTests {

	WebDriver driver;
	@Test(groups="Chrome")
	public void LaunchChrome() {
		System.setProperty("webdriver.chrome.driver", "/home/terli001gmail/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(groups="Chrome", dependsOnMethods="LaunchChrome")
	public void TryFacebook1() {
		System.out.println(Thread.currentThread().getId());
		driver.findElement(By.id("email")).sendKeys("ter8_go@hotmail.com");
		driver.findElement(By.id("pass")).sendKeys("Valleymede1");
		driver.findElement(By.id("loginbutton")).click();
	}
	
	@Test(groups="Firefox")
	public void LaunchFirefox() {
		System.setProperty("webdriver.gecko.driver", "/home/terli001gmail/Downloads/geckodriver");
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		try {
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Test(groups="Firefox", dependsOnMethods="LaunchFirefox")
	public void TryFacebook2() {
		System.out.println(Thread.currentThread().getId());
		driver.findElement(By.id("email")).sendKeys("ter8_go@hotmail.com");
		driver.findElement(By.id("pass")).sendKeys("Valleymede100");
		driver.findElement(By.id("loginbutton")).click();
		System.out.println(Thread.currentThread().getId());
	}
}

