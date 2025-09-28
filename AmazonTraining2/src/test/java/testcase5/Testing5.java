package testcase5;

import java.time.LocalTime;

import base.TestBase;
import testcases.AmazonLoginTest;
import testcases.AmazonProductCheckoutTest;
import testcases.AmazonProductDetailsTest;
import testcases.AmazonSearchProductsTest;
import testcases.ShoppingCartTest;

public class Testing5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		TestBase t=new TestBase();
		t.initialization();
		 // Check if current time is between 6 PM to 7 PM
        LocalTime now = LocalTime.now();
        LocalTime start = LocalTime.of(18, 0);
        LocalTime end = LocalTime.of(19, 0);

        if (now.isBefore(start) || now.isAfter(end)) {
            System.out.println("Test skipped - Not in allowed time window (only allowed 6 PM to 7 PM)");
            return;
            }
       
		
		AmazonSearchProductsTest a=new AmazonSearchProductsTest();
		a.setup();
		a.serachedProductPageOpened();
		a.clickOnRequiredProduct();
		
		AmazonProductDetailsTest a1=new AmazonProductDetailsTest();
		a1.setup();
		a1.VerifyProductDetailsAndAddToCart();
	
		ShoppingCartTest a2=new ShoppingCartTest();
		a2.setup();
		a2.SearchForAProduct();
		
		AmazonLoginTest a3=new AmazonLoginTest();
		a3.setup();
		a3.amazonLogin();
		
		/*AmazonProductCheckoutTest a4=new AmazonProductCheckoutTest();
		a4.setup();
		a4.useAddress();
		*/
	}

}
