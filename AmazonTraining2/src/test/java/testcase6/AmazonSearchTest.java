package testcase6;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.*;

import base.TestBase;
import testcase6Pages.AmazonHomePage;

import java.time.Duration;
import java.time.LocalTime;
public class AmazonSearchTest extends TestBase{
	AmazonHomePage amazonPage;

    @BeforeClass
    public void setup() throws InterruptedException {
		//initialization();
    	amazonPage = new AmazonHomePage();
    	 // Check if current time is between 3 PM to 6 PM
          LocalTime now = LocalTime.now();
          LocalTime start = LocalTime.of(15, 0);
          LocalTime end = LocalTime.of(18, 0);

          if (now.isBefore(start) || now.isAfter(end)) {
              System.out.println("Test skipped - Not in allowed time window (only allowed 3 PM to 6 PM)");
              return;
              }
       
     }

    @Test
    public void searchAndFilterProduct() throws InterruptedException {
        amazonPage.searchProduct("watch");
        /*
        amazonPage.applyBrandFilter("C");
        amazonPage.applyPriceFilter(2001, 100000); // Price above 2000
        amazonPage.applyRatingFilter();

        // You can also add validation checks here if needed
    }

    @AfterClass
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
    */
        amazonPage.selectbrand();
        amazonPage.applyBrandFilter('C');
        Thread.sleep(3000); // wait for filters to load

        amazonPage.applyPriceFilter(2000);
        Thread.sleep(3000);

        amazonPage.applyRatingFilter();
        Thread.sleep(3000);

        boolean isFiltered = amazonPage.verifyFilteredResults();

        if (isFiltered) {
            System.out.println("All filters applied successfully. Results are correct.");
        } else {
            System.out.println("Some results do not match the filters.");
        }

    }
}
