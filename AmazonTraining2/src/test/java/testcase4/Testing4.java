package testcase4;

import base.TestBase;

public class Testing4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		TestBase t=new TestBase();
		t.initialization();
		PriceMonitorTest a=new PriceMonitorTest();
		a.setup();
		a.checkPriceAndNotify();
	}

}
