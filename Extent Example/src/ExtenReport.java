import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtenReport {
ExtentReports extent;
ExtentTest logger;

	
	@Test
    public void test() {
        
        System.setProperty("webdriver.chrome.driver", "/home/terli001gmail/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.facebook.com");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        extent = new ExtentReports (System.getProperty("user.dir") +"/test-output/extent.html", true);
        
        logger = extent.startTest("Test01");
        
        logger.log(LogStatus.PASS, "Open Facebook");
        
        extent.endTest(logger);
        
	}
     @AfterTest
     public void endtest() {
        extent.flush();
      
        extent.close();        
     }



}
