package testcase3;

import java.time.LocalTime;

import base.TestBase;

public class Testing3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		TestBase t=new TestBase();
		t.initialization();
		/* // Check if current time is between 12 PM to 3 PM
       LocalTime now = LocalTime.now();
        LocalTime start = LocalTime.of(24, 0);
        LocalTime end = LocalTime.of(15, 0);

        if (now.isBefore(start) || now.isAfter(end)) {
            System.out.println("Test skipped - Not in allowed time window (only allowed 12 PM to 3 PM)");
            return;
            }
       */
		
		LoginTest a=new LoginTest();
		a.setup();
		a.testLoginAndProfileValidation();
	}

}
