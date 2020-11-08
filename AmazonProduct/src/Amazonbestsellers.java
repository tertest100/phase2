import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Amazonbestsellers {
	private static final String db = "jdbc:mysql://localhost:3306/Amazonbestseller";
	private static final String dbserver = "jdbc:mysql://localhost:3306";
	private static final String user = "root";
	private static final String pwd = "root";
	
	private static Connection con;
	
	private static PreparedStatement pstmt;
	
	private static WebDriver driver;
	 
	public static void insertRecord() throws SQLException {

		//call Amazon POM will all the locaters.
		AmazonFactory page = PageFactory.initElements(driver, AmazonFactory.class);
		
		// Break up the Xpath to find all the lists of Video Games 
		String beforeXpath = "//*[@id='zg-ordered-list']/li[";
		String afterXpath = "]/span/div/span/a/div";
		String text = null;
		 Scanner s2 = new Scanner(System.in	);
		 char ans = ' ' ;
		String query2 = "Insert into Amazonbestseller.vgames (rankid,productname) values (?,?)";
		 int listsize = page.Findsize();
		
		
		try {
		
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			}
			catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		
			con=DriverManager.getConnection(db, user, pwd);

		// set to disabled the commit.
			con.setAutoCommit(false);
			
			//Do a loop and get all the lists of Best Sellers video games in Amazon then prepare the statements to add to the database.
			for(int rank = 1; rank<=listsize; rank++  )
			{
			text = driver.findElement(By.xpath(beforeXpath+rank+afterXpath)).getText();
		
			pstmt = con.prepareStatement(query2);
			pstmt.setInt(1,rank);
			pstmt.setString(2, text);
			
			pstmt.executeUpdate();
			System.out.println(text);
			
			}
			
			 int ret = pstmt.executeUpdate();
			 //do a commit or Rollback, if you like the lists to be added to the database.
				if (ret == 1) {
					System.out.println("Would like this to be added to the databases for your record?");
					System.out.println("Enter C for Confirm  or A for Abort:");
					ans = s2.nextLine().charAt(0);
					if (ans == 'C') {
						con.commit();					
						System.out.println("Games List successfully added a to the Database record");
					}
					else {
						con.rollback();
						System.out.println("Aborted the transaction, Games lists did not added");
					}
				}
			
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
	

	
	
	
	
	public static void main(String[] args) throws InterruptedException, SQLException
	{
		System.setProperty("webdriver.chrome.driver","/home/terli001gmail/Downloads/chromedriver");
		driver = new ChromeDriver();
				
		 String baseUrl = "https://www.amazon.com/";
		 // launch  and direct it to the Base URL
		 driver.get(baseUrl);
		 
		//  Calling Page Object design from AmazonFactory class. 
		 AmazonFactory page = PageFactory.initElements(driver, AmazonFactory.class);
		 
		 //Click on bestseller page
		 page.AmazonBS();
		 
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		 //Click on Video Games Sellers page.
		 page.AmazonVG();	 
		 
		//Call to get the Video Games product lists from Amazon.
		 insertRecord();	 
		 
	}

}
