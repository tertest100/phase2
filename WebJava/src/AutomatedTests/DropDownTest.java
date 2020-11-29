package AutomatedTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import org.openqa.selenium.By;

public class DropDownTest {
 public static void main(String[] args) { 
	 	System.setProperty("webdriver.chrome.driver","/home/terli001gmail/Downloads/chromedriver");
	 	WebDriver driver = new ChromeDriver();	
	    String baseURL = "http://demo.guru99.com/test/newtours/register.php";
	    
		driver.get(baseURL);

		Select drpCountry = new Select(driver.findElement(By.name("country")));
		drpCountry.selectByVisibleText("BAHAMAS");
		System.out.println("Selected Bahamas");
	
	//drpCountry.deselectByVisibleText("BAHAMAS");
		
		//System.out.println();
	
//System.out.println(drpCountry.selectByIndex(2));
		//Selecting Items in a Multiple SELECT elements
		driver.get("http://jsbin.com/osebed/2");
		Select fruits = new Select(driver.findElement(By.id("fruits")));
		fruits.selectByVisibleText("Banana");
		//fruits.deselectByVisibleText("Banana");
	
		//Select select = new Select(element);
		List<WebElement> selectedOptions = fruits.getAllSelectedOptions();
		for(WebElement selectedOption : selectedOptions) {
		  System.out.println(selectedOption.getText());
	
		}
		}
 }