package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   //System.setProperty("webdriver.chrome.driver", "/home/terli001gmail/Downloads/chromedriver");
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.redbus.in");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	          
		
	}

}
