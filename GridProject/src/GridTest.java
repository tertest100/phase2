import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridTest {

	
	
	public static void main(String[] args) throws MalformedURLException {
        // TODO Auto-generated method stub
        DesiredCapabilities capability = new DesiredCapabilities();
        
        capability.setBrowserName("chrome");
        capability.setPlatform(Platform.LINUX);
        
        String HubURL = "http://localhost:4444/wd/hub";
        
        WebDriver driver = new RemoteWebDriver(new URL(HubURL),capability);
        
        driver.get("https://www.facebook.com");
        
    }

}
