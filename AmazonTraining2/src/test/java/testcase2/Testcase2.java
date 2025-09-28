package testcase2;

import java.time.LocalTime;

import base.TestBase;

public class Testcase2 {

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
		
		Adding2ProductTest a3=new Adding2ProductTest();
		a3.setup();
		a3.SearchForAProduct1();
	}

}
