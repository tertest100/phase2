package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
	
	@Test
	
	public void testloginfunctionality() {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.simplilearn.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        
        WebElement loginlink = driver.findElement(By.linkText("Log in"));
        
		loginlink.click();
		WebElement loginmessage = driver.findElement(By.xpath("//*[contains(text(),'Log in to continue learning')]"));
		
		String expected = "Log in to continue learning experience";
		String actual = loginmessage.getText();
		
		Assert.assertEquals(actual, expected);
	}

}
