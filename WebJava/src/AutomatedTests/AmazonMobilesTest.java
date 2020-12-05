package AutomatedTests;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//comment the above line and uncomment below line to use Chrome
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.remote.RemoteWebDriver;
//import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Alert;
//import org.openqa.selenium.Keys;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class AmazonMobilesTest {
	private static WebDriver driver;
	
    public static void main(String[] args) {
        // declaration and instantiation of objects/variables
    //	System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
	//	WebDriver driver = new FirefoxDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		System.setProperty("webdriver.chrome.driver","/home/terli001gmail/Downloads/chromedriver");
	    driver = new ChromeDriver();
    	
        String baseUrl = "http://www.amazon.in";
       
        
        
        // launch  and direct it to the Base URL
        driver.get(baseUrl);

        try {
        driver.manage().window().maximize();
        Thread.sleep(4000);
  
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]")).click();
        //driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles");
        Thread.sleep(4000);
        //driver.findElement(By.className("nav-input")).click();
        //Thread.sleep(4000);
        //driver.findElement(By.partialLinkText("Apple iPhone 11")).click(); 
        driver.findElement(By.partialLinkText("Samsung")).click();
        Thread.sleep(2000);
        
       
        }
        catch (Exception e1) {
        	e1.printStackTrace();
        }
        
        
        
       
        //close Chrome
        driver.close();
       
    }
    
 

}