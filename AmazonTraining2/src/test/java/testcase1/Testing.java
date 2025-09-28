package testcase1;

import base.TestBase;

public class Testing {
	public static void main(String[] args) throws InterruptedException 
	{
			TestBase t=new TestBase();
			t.initialization();
			AmazonSearchTest a1=new AmazonSearchTest();
			a1.setup();
			a1.searchTheProdut();
	}		
}
