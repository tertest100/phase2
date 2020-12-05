package AutomatedTests;


import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class TestScreenShot {

   

    public static void main(String args[]) throws Exception{

    	System.setProperty("webdriver.chrome.driver","/home/terli001gmail/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();		

        //goto url

        driver.get("http://images.google.com");
        Thread.sleep(4000);
        
        driver.findElement(By.xpath("//*[@id=\"sbtc\"]/div/div[2]/input")).sendKeys("images");
        
Thread.sleep(5000);
driver.findElement(By.xpath("//*[@id=\"sbtc\"]/button/div/span")).click();
Thread.sleep(5000);
        //Call take screenshot function

        TestScreenShot.takeSnapShot(driver, "/home/terli001gmail/Downloads/test.png") ;     
        Thread.sleep(2000);
        driver.close();
    }

    /**
     * This function will take screenshot
     * @param webdriver
     * @param fileWithPath
     * @throws Exception
     */

    public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

        //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

        //Call getScreenshotAs method to create image file

                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
                
            //Move image file to new destination

                File DestFile=new File(fileWithPath);

                //Copy file at destination

                FileUtils.copyFile(SrcFile, DestFile);

    }

}