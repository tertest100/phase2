import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
//comment the above line and uncomment below line to use Chrome
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
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
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class provincestest {
	private static WebDriver driver;
	private static Map<String, Object> vars;
	private static final String db = "jdbc:mysql://localhost:3306/provinces";
	private static final String user = "root";
	private static final String pwd = "root";
	
	private static Connection con;
	private static Statement stmt;
	private static ResultSet rs;
	private static PreparedStatement pstmt;
	
	 @FindBy(xpath= "//a[text()='Best Sellers']")
	static
   	 WebElement bestseller;
   	 
   	 @FindBy(xpath= "//a[text()='Video Games']")
	static
   	 WebElement VideoGames;
   	 
   	 // Click on Amazon Best Sellers link	 
	 public static void AmazonBS()
	 {
		 bestseller.click();


	 }

	 //Click on Amazon Video Games link
	 public static void AmazonVG()
	 {
		 VideoGames.click(); 
	 }
   	 
    public static void main(String[] args) {
        // declaration and instantiation of objects/variables
    //	System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
	//	WebDriver driver = new FirefoxDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		System.setProperty("webdriver.chrome.driver","/home/terli001gmail/Downloads/chromedriver");
	    driver = new ChromeDriver();
    	
        String baseUrl = "https://www.amazon.com/";
      
       
        
        vars = new HashMap<String, Object>();
        // launch  and direct it to the Base URL
        driver.get(baseUrl);
        
       driver.findElement(By.xpath("//a[text()='Best Sellers']")).click();
      // Thread(3000);
       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       
       driver.findElement(By.xpath("//a[text()='Video Games']")).click();
       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       
        String a = driver.findElement(By.xpath("//*[@id='zg-ordered-list']/li[1]/span/div/span/a/div")).getText();
       System.out.println(a);

       // char b = (char)a;
        
        
        		
        System.out.println();
        insertRecord();
		
        driver.manage().window().setSize(new Dimension(1280, 777));
        vars.put("window_handles", driver.getWindowHandles());
        //driver.findElement(By.linkText("Add a new record")).click();
       //vars.put("win2548", waitForWindow(2000));
       /* try {
        Thread.sleep(1000);
        }
        catch (Exception e1) { e1.printStackTrace();}
        driver.switchTo().window(vars.get("win2548").toString());
        driver.findElement(By.name("regn_num")).click();
        driver.findElement(By.name("regn_num")).sendKeys("NN 45 CIOO");
        driver.findElement(By.name("model")).click();
        driver.findElement(By.name("model")).sendKeys("Corvette");
        driver.findElement(By.name("color")).click();
        driver.findElement(By.name("color")).sendKeys("Red");
        driver.findElement(By.name("mileage")).click();
        driver.findElement(By.name("mileage")).sendKeys("4444");
        driver.findElement(By.cssSelector("input:nth-child(15)")).click();
        //assertThat(driver.findElement(By.cssSelector("body")).getText(), is("Successfully Inserted"));
        
        
        */
        
       
        //close Chrome
        driver.close();
       
    }
    
    public static void insertRecord() {
		//hardcoding - run more than once and see what happens
		//String query2 = "Insert into coolthings.cars_tbl (car_regn, car_model, car_color, car_mileage) \n" +
		//				"values ('GA02 BB 1234','Lotus', 'Black', 2700)";
		
		//Prepared statement
    	//for (int i = 1; i<= 10; i++)
  
    			
    	String a = driver.findElement(By.xpath("//*[@id='zg-ordered-list']/li[1]/span/div/span/a/div")).getText();
    	String query2 = "Insert into provinces.canadaprovinces (id, name) values (NULL,?)";
    	
    	//pstmt.setInt(4, s2.nextInt());
	
		
		try {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			}
			catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
			con=DriverManager.getConnection(db, user, pwd);
			
			pstmt = con.prepareStatement(query2);
			pstmt.setString(1, a);
			//pstmt.setString(2, a);
			pstmt.executeUpdate();
			/*if (ret == 1) {
				System.out.println("Successfully added a new record");
			}
			else {
				System.out.println("Unable to add a new record");
			}*/
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		finally {
			try {
			con.close();
			pstmt.close();
			
			}
			catch (Exception e2) {
				e2.printStackTrace();
			}
	}
	
	}
    
    
  /* public static String waitForWindow(int timeout) {
        try {
          Thread.sleep(timeout);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        Set<String> whNow = driver.getWindowHandles();
        Set<String> whThen = (Set<String>) vars.get("window_handles");
        if (whNow.size() > whThen.size()) {
          whNow.removeAll(whThen);
        }
        return whNow.iterator().next();
      } 
*/
}