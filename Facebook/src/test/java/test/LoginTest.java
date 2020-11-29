package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	WebDriver driver = new ChromeDriver();
    driver.get("https://www.facebook.com");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
    
}
