package base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.automationtesting.excelreport.Xl;

public class Baseclass {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void baseclass1()
	{
		System.setProperty("webdriver.gecko.driver",  "/home/terli001gmail/Downloads/chromedriver");
	       //driver = new FirefoxDriver ();
	       driver = new ChromeDriver();
	       
	       driver.get("https://mvnrepository.com/");	
	}
	
	@AfterMethod
	public void quitDriver() {
		driver.close();
	}
	
	@AfterSuite
	public void generateReport() throws Exception {
		Xl.generateReport("Report_Excel.xlsx");
	}

}
