package testcase5;
import java.time.LocalTime;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import base.TestBase;
import pages.AmazonHomePage;

public class AmazonHomeTest extends TestBase {
	AmazonHomePage amazonHomePage;

	/*
	 * public AmazonHomeTest() { super(); }
	 */

	@BeforeMethod
	public void setup() throws InterruptedException {
		//initialization();
		//amazonHomePage = new AmazonHomePage();
		 // Check if current time is between 6 PM to 7 PM
        LocalTime now = LocalTime.now();
        LocalTime start = LocalTime.of(18, 0);
        LocalTime end = LocalTime.of(19, 0);

        if (now.isBefore(start) || now.isAfter(end)) {
            System.out.println("Test skipped - Not in allowed time window (only allowed 6 PM to 7 PM)");
            return;
            } 

	}

	  @Test
	  public void SearchForAProduct() throws InterruptedException {
		  
	  amazonHomePage.selectCategory("Electronics");
	  Assert.assertEquals(amazonHomePage.getSelectedCategory(), "Electronics");
	  amazonHomePage.searchForProduct("female smartwatch");
	  amazonHomePage.clickOnSearchButton();
	  
	  }
	
}
