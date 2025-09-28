package testcase5;

import base.TestBase;
import pages.AmazonHomePage;
import pages.AmazonSearchProductsPage;

import java.time.LocalTime;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class AmazonSearchProductsTest extends TestBase {
	AmazonSearchProductsPage amazonSearchProductsPage;
	AmazonHomePage amazonHomePage;
	/*
	 * public AmazonSearchProductsTest() { super();
	 * 
	 * 
	 * }
	 */

	@BeforeClass
	public void setup() throws InterruptedException {
		 // Check if current time is between 6 PM to 7 PM
        LocalTime now = LocalTime.now();
        LocalTime start = LocalTime.of(18, 0);
        LocalTime end = LocalTime.of(19, 0);

        if (now.isBefore(start) || now.isAfter(end)) {
            System.out.println("Test skipped - Not in allowed time window (only allowed 6 PM to 7 PM)");
            return;
            }
		//initialization();
		 
		//amazonHomePage =new AmazonHomePage();
		//amazonSearchProductsPage = new AmazonSearchProductsPage();
		
	}


	@Test(priority=0)
	public void serachedProductPageOpened() throws InterruptedException
	{
		
		amazonHomePage.selectCategory("Electronics");
	
		
	    Assert.assertEquals(amazonHomePage.getSelectedCategory(), "Electronics");
		
		amazonHomePage.searchForProduct("female smartwatch");
		amazonHomePage.clickOnSearchButton(); 
		Thread.sleep(5000);
		Assert.assertEquals(amazonSearchProductsPage.getPageLabelForSearchedProduct().contains("female"),true);
		Assert.assertEquals(amazonSearchProductsPage.getPageLabelForSearchedProduct().contains("watch"),true);
		
	
	}
	
	@Test(priority=1)
	public void clickOnRequiredProduct() throws InterruptedException
	{
       
		amazonSearchProductsPage.clickOnProduct("Noise Twist Go Round dial Smartwatch with BT Calling, 1.39\" Display, Metal Build, 100+ Watch Faces, IP68, Sleep Tracking, 100+ Sports Modes, 24/7 Heart Rate Monitoring (Gold Link)");
		//amazonSearchProductsPage.clickOnProduct("Fire-Boltt Phoenix Ultra Smart Watch 1.39 inch Bluetooth Calling, AI Voice Assistant, Metal Body with 120+ Sports Modes, SpO2, Heart Rate Monitoring (Rainbow SS)");
		
	}
	
}
