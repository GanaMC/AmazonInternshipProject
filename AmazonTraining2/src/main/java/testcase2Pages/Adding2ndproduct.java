package testcase2Pages;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.TestBase;

public class Adding2ndproduct extends TestBase {
	 @FindBy(xpath = "//input[@id='twotabsearchtextbox']") WebElement searchBoxInput;
	 @FindBy(xpath = "//input[@id='nav-search-submit-button']")@CacheLookup WebElement searchButton;
	 @FindBy(xpath = "//h2[@aria-label='Sponsored Ad - soundcore by Anker Q20i Wireless Bluetooth Over-Ear Headphones with Hybrid Active Noise Cancelling, 40h Playtime in ANC Mode, Hi-Res Audio, Deep Bass, Personalization via App (Black)']//span[contains(text(),'soundcore by Anker Q20i Wireless Bluetooth Over-Ea')]") WebElement item2;
	 //@FindBy(xpath ="//div[@class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_1']//h2")WebElement item2;
	 @FindBy(xpath ="//input[@id='add-to-cart-button']")WebElement addtocart;
	 public Adding2ndproduct() {
			PageFactory.initElements(getdriver(), this);
		}
	 public void searchForProduct(String product){
			searchBoxInput.sendKeys(product);	
		}
		
		public void clickOnSearchButton()
		{
			searchButton.click();
		}
			
		public void clickOnProduct() {
			item2.click();
		}
			public void addtocart() {
			addtocart.click();
			}
			
				
	   
}
