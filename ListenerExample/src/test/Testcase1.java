package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class Testcase1 {

		public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        
	       // System.setProperty("webdriver.chrome.driver", "/home/nikunjshah204gm/Downloads/chromedriver");
	        WebDriver driver = new ChromeDriver();
	        
	        EventFiringWebDriver eventRecorder = new EventFiringWebDriver(driver); 
	         
	        /*---- Creating the instance of parent class "WebdriverListeners" class----*/
	         
	        ListenerClass listenrclass = new ListenerClass();
	         
	        /* The below step registers the listeners for logging purpose*/
	         
	        eventRecorder.register(listenrclass);
	        
	        eventRecorder.navigate().to("https://www.google.com");
	            
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	    }
	}

