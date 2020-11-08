package Testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.Baseclass;

public class Test_02 extends Baseclass {
	@Test
	public void t_002() {
		
		driver.findElement(By.xpath("(//*[contains(text(),'Popular')])[1]")).click();
		System.out.println("Test_02 executed successfully");
	}

}
