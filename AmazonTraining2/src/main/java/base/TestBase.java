package base;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalTime;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestBase {
	public static WebDriver driver = null;
	public static Properties prop;
	// public static EventFiringWebDriver e_driver;
	// public static WebEventListener eventListener;
	
	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					"C:\\Users\\Gana mc\\Desktop\\Eclipse\\AmazonTrail\\AmazonTraining2\\src\\main\\java\\config\\Config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//String browsername = prop.getProperty("browser");
		
	}
	//@Test
	public static void initialization() {
		String browsername = prop.getProperty("browser");
         System.out.println(browsername);
		if (browsername.equals("edge")) {
			//System.setProperty("webdriver.edge.driver", "C:\\Users\\Gana mc\\Downloads\\edgedriver_win64\\msedgedriver.exe");
			System.setProperty("webdriver.edge.driver", "C:\\Users\\Gana mc\\Downloads\\edgedriver_win64\\msedgedriver.exe");
			driver = getdriver();

		}
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(prop.getProperty("URL"));
		
		
	}

	/*public static void myWait()
	{
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(2000));
		//wait.until(ExpectedConditions.element))
	}
	*/
	public static final WebDriver getdriver(){
	    if (driver == null){
	      driver = new EdgeDriver();
	      return driver;
	    }else{
	      return driver;
	    }
	  }

}
