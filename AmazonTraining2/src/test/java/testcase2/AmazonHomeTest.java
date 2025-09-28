package testcase2;
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
		amazonHomePage = new AmazonHomePage();

	}

	  @Test
	  public void SearchForAProduct() throws InterruptedException {
	  amazonHomePage.selectCategory("Electronics");
	  Assert.assertEquals(amazonHomePage.getSelectedCategory(), "Electronics");
	  amazonHomePage.searchForProduct("female smartwatch");
	  amazonHomePage.clickOnSearchButton();
	  
	  }
	
}
