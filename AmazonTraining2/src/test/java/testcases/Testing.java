package testcases;

import base.TestBase;

public class Testing {
public static void main(String[] args) throws InterruptedException 
{
		TestBase t=new TestBase();
		t.initialization();
		
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
		
		AmazonProductCheckoutTest a4=new AmazonProductCheckoutTest();
		a4.setup();
		a4.useAddress();
		
	}
}
