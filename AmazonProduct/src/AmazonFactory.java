import java.util.List;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;

public class AmazonFactory{	
	
	// POM for Best Sellers
	 @FindBy(xpath= "//a[text()='Best Sellers']")
	 WebElement bestseller;
	 // POM Video Games	 
	 @FindBy(xpath= "//a[text()='Video Games']")
	 WebElement VideoGames;
	 
	 // POM for List sizes for Video Games on the particular page. 
	 @FindBy(xpath= "//*[@id='zg-ordered-list']/li")
	 List <WebElement>  Sizelist; 
	 
	 // Click on Amazon Best Sellers link	 
	 public void AmazonBS()
	 {
		 bestseller.click();
	 }

	 //Click on Amazon Video Games link
	 public void AmazonVG()
	 {
		 VideoGames.click(); 
	 }

	 //find out number of Best seller games list on the first page and return the value

	 public int Findsize()
	 {
		 return Sizelist.size();

	 }
	 
	 
	
}