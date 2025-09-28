package testcases;

import base.TestBase;
import pages.AmazonHomePage;
import pages.AmazonLoginPage;
import pages.AmazonProductDetailsPage;
import pages.ShoppingCartPage;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;
public class AmazonProductDetailsTest extends TestBase{
	AmazonProductDetailsPage amazonProductDetailsPage;
	AmazonHomePage amazonHomePage;
	ShoppingCartPage shoppingCartPage;
	AmazonLoginPage amazonLoginPage;
	@BeforeSuite
	public void setup()
	{
		//initialization();
		amazonProductDetailsPage=new AmazonProductDetailsPage();
		amazonHomePage =new AmazonHomePage();
		shoppingCartPage=new ShoppingCartPage();
		amazonLoginPage=new AmazonLoginPage();
	}
	
	@Test(priority = 2)
	public void VerifyProductDetailsAndAddToCart() throws InterruptedException {
		String productTitle="Noise Twist Go Round dial Smartwatch with BT Calling, 1.39\" Display, Metal Build, 100+ Watch Faces, IP68, Sleep Tracking, 100+ Sports Modes, 24/7 Heart Rate Monitoring (Gold Link)";
		String productPrice="1,499";
		//String productTitle="Fire-Boltt Phoenix Ultra Smart Watch 1.39 inch Bluetooth Calling, AI Voice Assistant, Metal Body with 120+ Sports Modes, SpO2, Heart Rate Monitoring (Rainbow SS)";
		//String productPrice="1,799";
		
		Assert.assertEquals(amazonProductDetailsPage.getSearchedProductTitle(),productTitle);
	    Assert.assertEquals(amazonProductDetailsPage.getSearchedProductPrice(),productPrice);
	   // amazonProductDetailsPage.findOnAddToCart();
	   
		amazonProductDetailsPage.clickOnAddToCart(); 
		
		//amazonProductDetailsPage.clickProceedToCheckOut();
		 Thread.sleep(1000);
		amazonHomePage.clickOnCart();
		
		
		//shoppingCartPage.clickProceedToBuy();
		/*
		 * amazonLoginPage.enterEmailOrPhone("6370171564");
		 * amazonLoginPage.clickContinue(); amazonLoginPage.enterPassword("Test@123");
		 * amazonLoginPage.clickSignIn();
		 */
		}
	
	
	
}
