package pages;

import base.TestBase;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ShoppingCartPage extends TestBase{
@FindBy(xpath = "//input[@name='proceedToRetailCheckout']")WebElement proceedToBuy;
	
	public ShoppingCartPage(){
			PageFactory.initElements(getdriver(), this);
		}
	 
	@Test(priority = 3)
	public void clickProceedToBuy() {
		 proceedToBuy.click();
	} 
	
}
