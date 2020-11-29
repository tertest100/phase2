package AutomatedTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoITScriptTest {
	private static WebDriver driver;
	
	  public static void main(String[] args) {
	      // declaration and instantiation of objects/variables
	  //	System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		//	WebDriver driver = new FirefoxDriver();
			//comment the above 2 lines and uncomment below 2 lines to use Chrome
			System.setProperty("webdriver.chrome.driver","C:\\Users\\nvmur\\Downloads\\chromedriver_win32\\chromedriver.exe");
		    driver = new ChromeDriver();
	  	
	      String baseUrl = "http://www.tinyupload.com";
	        
	      
	      
	      // launch  and direct it to the Base URL
	      driver.get(baseUrl);
	      
	      try {
	    	    //driver.manage().window().setSize(new Dimension(755, 716));
	           driver.findElement(By.name("uploaded_file")).click();
	    	 
	    	   Thread.sleep(2000);
	    	  
	    	   Runtime.getRuntime().exec("C:\\Users\\nvmur\\Downloads\\TinyFile.exe");
	    	  
	    	   Thread.sleep(3000);
	      
	      }
	      catch (Exception e1) {
	      	e1.printStackTrace();
	      }
	      
	      
	      
	     
	      //close Chrome
	    //  driver.close();
	     
	  }
	  


	}