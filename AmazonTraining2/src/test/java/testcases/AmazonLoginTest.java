package testcases;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import base.TestBase;
import pages.AmazonLoginPage;
import util.ConfigReader;
public class AmazonLoginTest extends TestBase{
	ConfigReader configReader=new ConfigReader();	
	AmazonLoginPage amazonLoginPage;
		
	@BeforeTest
	public void setup()
	{
		amazonLoginPage=new AmazonLoginPage();

	} 
	@Test(priority = 4)
	public void amazonLogin()
	{
		
		amazonLoginPage.enterEmailOrPhone(configReader.getUsername());
		amazonLoginPage.clickContinue();
		amazonLoginPage.enterPassword(configReader.getPassword());
		amazonLoginPage.clickSignIn();
		
	}
}
