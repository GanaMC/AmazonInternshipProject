package testcase1;
import base.TestBase;
import testcase1Pages.AmazonHomePage;
import testcase1Pages.AmazonSearch;
import testcase1Pages.ProductPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.SkipException;
import java.time.LocalTime;
import java.util.List;

public class AmazonSearchTest  extends TestBase{
	AmazonSearch searchPage;
	AmazonHomePage amazonHomePage;
	ProductPage productPage;

	@BeforeTest
	public void setup() throws InterruptedException {
	
		initialization();
		
		amazonHomePage =new AmazonHomePage();
		searchPage = new AmazonSearch();
		productPage= new ProductPage();
		
	}
		
		@Test
	    public void searchTheProdut()throws InterruptedException {
			
			LocalTime now = LocalTime.now();
	        if (now.isBefore(LocalTime.of(15, 0)) || now.isAfter(LocalTime.of(18, 0))) {
	            System.out.println("⏰ Test skipped - Not in allowed time window (3 PM to 6 PM)");
	            return;
	        }
             
			amazonHomePage.search("sunscreen for women");
			 Thread.sleep(2000);
	       // try { Thread.sleep(3000); } catch (Exception ignored) {}

	        List<WebElement> products = searchPage.getAllProducts();

	        for (WebElement product : products) {
	            //try {
	                String title = searchPage.getProductTitle(product);
	                if (title.matches("^[ABCDabcd].*")) 
	                	continue;

	                searchPage.clickProduct(product);
	                Thread.sleep(2000);

	                if (productPage.isElectronics()) {
	                    driver.navigate().back();
	                    Thread.sleep(2000);
	                    continue;
	                }

	                String prodTitle = productPage.getProductTitle();
	                String price = productPage.getProductPrice();

	                System.out.println("✔ Valid Product Found:");
	                System.out.println("  Title: " + prodTitle);
	                System.out.println("  Price: " + price);
	                break;

	            }
	        
	           // catch (Exception e) {
	           //     driver.navigate().back();
	           //     try { Thread.sleep(1000); } catch (Exception ignored) {}
	            //}
	       // }
		
	  }
	}


	
