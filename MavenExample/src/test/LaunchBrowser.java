package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchBrowser {
	
	@Test
	public void login() {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "/home/terli001gmail/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.redbus.in");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	}

}
