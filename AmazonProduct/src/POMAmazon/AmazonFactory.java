package POMAmazon;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;

public class AmazonFactory {
    // The element is now looked up using the name attribute

	 @FindBy(xpath= "//a[text()='Best Sellers']")
	 WebElement bestseller;
	 
	 @FindBy(xpath= "//a[text()='Video Games']")
	 WebElement VideoGames;

public void AmazonExecute()
{
bestseller.click();
VideoGames.click();

}

	 
    }

