package testcase3;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;

import testcase3Pages.HomePage;
import testcase3Pages.LoginPage;

import java.time.LocalTime;
public class LoginTest {
	    WebDriver driver;
	    LoginPage loginPage;
	    HomePage homePage;
	    @BeforeClass
	    public void setup() {
	    	
	    	
	        // Only run between 12PM to 3PM
	        LocalTime now = LocalTime.now();
	        LocalTime start = LocalTime.NOON; // 12 PM
	        LocalTime end = LocalTime.of(15, 0); // 3 PM

	        if (now.isBefore(start) || now.isAfter(end)) {
	            throw new SkipException("Test only runs between 12 PM to 3 PM");
	        }
	    }
	    
	    @Test
	    public void testLoginAndProfileValidation() throws InterruptedException {
	        loginPage = new LoginPage();
	        homePage = new HomePage();

	        // ⚠️ Replace with valid credentials for testing
	        String email = "ganaathul97@gmail.com";
	        String password = "Test1997@12345";

	        loginPage.login(email, password);
	        Thread.sleep(5000); // Wait for login to complete

	        String profileName = homePage.getProfileName();
	        System.out.println("Logged in as: " + profileName);

	        boolean isValid = homePage.isProfileNameValid(profileName.toUpperCase());
	        Assert.assertTrue(isValid, "Profile name contains invalid characters!");
	    }

}
