package testcase6;

import base.TestBase;
import testcase6.AmazonSearchTest;

public class Testing6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		TestBase t=new TestBase();
		t.initialization();
		 // Check if current time is between 3 PM to 6 PM
      /*  LocalTime now = LocalTime.now();
        LocalTime start = LocalTime.of(15, 0);
        LocalTime end = LocalTime.of(18, 0);

        if (now.isBefore(start) || now.isAfter(end)) {
            System.out.println("Test skipped - Not in allowed time window (only allowed 3 PM to 6 PM)");
            return;
            }
        */
		AmazonSearchTest a=new AmazonSearchTest();
		a.setup();
		a.searchAndFilterProduct();
	}

}
