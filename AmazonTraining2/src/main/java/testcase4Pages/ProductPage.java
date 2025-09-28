package testcase4Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
public class ProductPage extends TestBase{
	 By priceLocator = By.id("priceblock_ourprice"); // Fallback
	 By dealPriceLocator = By.id("priceblock_dealprice"); // If it's a deal
	  public ProductPage() {
		PageFactory.initElements(getdriver(), this);
    }
	  public double getProductPrice() {
	        String priceText;

	        try {
	            priceText = driver.findElement(priceLocator).getText();
	        } catch (Exception e) {
	            priceText = driver.findElement(dealPriceLocator).getText();
	        }

	        // Clean ₹ and comma
	        priceText = priceText.replace("₹", "").replace(",", "").trim();
	        return Double.parseDouble(priceText);
	    }
	  
	  
	  
}
