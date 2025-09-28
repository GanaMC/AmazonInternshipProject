package testcase4;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import java.time.Duration;
import base.TestBase;
import testcase4Pages.EmailNotifier;
import testcase4Pages.ProductPage;

public class PriceMonitorTest extends TestBase{
	WebDriver driver;
    ProductPage productPage;

    // === SET YOUR PRODUCT URL AND THRESHOLD ===
    final String productURL = "https://www.amazon.in/Noise-Smartwatch-Calling-Tracking-Monitoring/dp/B0CQ4HSR2D/ref=sr_1_8?crid=3MZJEUC0BE8W8&dib=eyJ2IjoiMSJ9.e-AtMeiY68NGZ2hw99flZJaCXb9Uu4ZAAk9CK4Rr4ikb0BtixyWhIzb6vF07G67RHYak7_U13vuveC1f08yKtoC_GqXb9-Hdi1rpVd3wnEwum_VMf8mgDHEiEr1OLie5ira3lNiLdNsEZ9FZFdsw6GCsMxZlvqPmGsqAdYPADM-Su5mRhexDeS8YbollUjZVfiHT7VlW9HMiL6hnoPbhTIMDu3l-1czspkUkgdrtsyu1vQjbwSXUQJvziDs9RaMGbtB5bxJNe1jI3TvjNHuP0VDjZPFmPSgr4USjTJoZE1Q.BugQOe039DfNBZ0kIzb-NkIFWc4FfZ_5rzCJoO5eK68&dib_tag=se&keywords=female%2Bwatch&qid=1758970207&sprefix=female%2Bwatch%2Caps%2C762&sr=8-8&th=1";
    final double priceThreshold = 1499.00;
    @BeforeClass
    public void setup() throws InterruptedException {
		//initialization();
    	driver.get(productURL);
       productPage = new ProductPage();
    }  
    @Test
    public void checkPriceAndNotify() {
        double currentPrice = productPage.getProductPrice();
        System.out.println("Current Price: ₹" + currentPrice);

        if (currentPrice < priceThreshold) {
            System.out.println("Price below threshold! Sending email...");
         //   EmailNotifier.sendNotificationEmail("Product price dropped to ₹" + currentPrice, productURL);
        } else {
            System.out.println("Price is still above threshold.");
        }
    }

}
