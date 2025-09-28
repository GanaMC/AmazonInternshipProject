package testcase2;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import pages.ShoppingCartPage;
public class ShoppingCartTest extends TestBase{
	ShoppingCartPage shoppingCartPage;

	@BeforeTest
	public void setup() throws InterruptedException {
		//initialization();
		shoppingCartPage = new ShoppingCartPage();

	}

	@Test(priority=3)
	public void SearchForAProduct() throws InterruptedException {
		
		shoppingCartPage.clickProceedToBuy();
		
	}
}
