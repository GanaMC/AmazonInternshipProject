package testcase2;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.AmazonHomePage;
import testcase2Pages.Adding2ndproduct;

public class Adding2ProductTest extends TestBase{
	Adding2ndproduct adding2ndproduct;

	/*
	 * public AmazonHomeTest() { super(); }
	 */

	@BeforeMethod
	public void setup() throws InterruptedException {
		//initialization();
		adding2ndproduct = new Adding2ndproduct();

	}

	  @Test
	  public void SearchForAProduct1() throws InterruptedException {
	  
		  adding2ndproduct.searchForProduct("headset bluetooth wireless");
		  adding2ndproduct.clickOnSearchButton();
		  Thread.sleep(5000);
		  adding2ndproduct.clickOnProduct();
		  Thread.sleep(2000);
		  adding2ndproduct.addtocart();
	  }
	  
}
