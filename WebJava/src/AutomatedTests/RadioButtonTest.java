package AutomatedTests;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;		
import org.openqa.selenium.*;		

public class RadioButtonTest {				
    public static void main(String[] args) {									
    		
    	// declaration and instantiation of objects/variables		
    	System.setProperty("webdriver.chrome.driver","/home/terli001gmail/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();		

        driver.get("http://demo.guru99.com/test/radio.html");	
	driver.manage().window().setSize(new Dimension(1280, 777));
        WebElement radio1 = driver.findElement(By.id("vfb-7-1"));							
        WebElement radio2 = driver.findElement(By.id("vfb-7-2"));							
        WebElement radio3 = driver.findElement(By.id("vfb-7-3"));		
        //Radio Button1 is selected		
        radio1.click();			
        System.out.println("Radio Button Option 1 Selected");					
        try {Thread.sleep(2000);} catch(Exception e1) {}
        //Radio Button1 is de-selected and Radio Button2 is selected		
        radio2.click();			
        System.out.println("Radio Button Option 2 Selected");	
        try {Thread.sleep(2000);} catch(Exception e2) {}
        radio3.click();
        System.out.println(radio3.isEnabled());       
        
        // Selecting CheckBox		
        WebElement option1 = driver.findElement(By.id("vfb-6-0"));							

        // This will Toggle the Check box 		
        option1.click();	
        try {Thread.sleep(2000);} catch(Exception e1) {}
        // Check whether the Check box is toggled on 		
        if (option1.isSelected()) {					
            System.out.println("Checkbox is Toggled On");					
            System.out.println(option1.isDisplayed());
            System.out.println(option1.getText());
        } else {			
            System.out.println("Checkbox is Toggled Off");					
        }		
        try {Thread.sleep(2000);} catch(Exception e1) {}
        
        //WebElement option2 = driver.findElement(By.id("vbf-6-1"));
       //option1.clear(); 
        
		driver.close();		
    }  	
}
