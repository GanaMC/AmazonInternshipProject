package pages;

import base.TestBase;
import java.time.Duration;
//import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonProductDetailsPage extends TestBase{

	@FindBy(xpath = "//div[@id='titleSection']")WebElement serachedProductTitle;
	@FindBy(xpath = "(//span[normalize-space()='1,499'])[1]")WebElement serachedProductPrice;
	@FindBy(xpath = "(//input[@id='add-to-cart-button'])[2]")WebElement addToCartButton;
	@FindBy(xpath = "(//input[@name='proceedToRetailCheckout'])[1]") WebElement proceedToCheckoutButton;
	
	WebElement serachProductPanel;
	// Create WebDriverWait instance
    WebDriverWait wait = new WebDriverWait(getdriver(), Duration.ofSeconds(30));

	public AmazonProductDetailsPage(){
			PageFactory.initElements(getdriver(), this);
		}
	 
	public String getSearchedProductTitle() {
		return serachedProductTitle.getText();
	} 
	public String getSearchedProductPrice() {
		return serachedProductPrice.getText();
	} 
	
	/*public void findOnAddToCart()
	{
		WebElement addToCartButton = driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]"));
		JavascriptExecutor jsc=(JavascriptExecutor)driver;
		jsc.executeScript("arguments[0].scrollIntoView(true);",addToCartButton);
		//Actions actions = new Actions(driver);
		//actions.scrollToElement(addToCartButton);
		//actions.perform();
		//Thread.sleep(5000);
		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", addToCartButton);	
		}
	*/
		public void clickOnAddToCart()
		{
		addToCartButton.click();

	}
	public void clickProceedToCheckOut()
	{
        proceedToCheckoutButton.click();
	}
}
