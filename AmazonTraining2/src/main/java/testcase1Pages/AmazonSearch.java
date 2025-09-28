package testcase1Pages;
import base.TestBase;
import java.time.Duration;
import java.util.List;
import java.util.Set;

//import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonSearch extends TestBase{
	
	// Create WebDriverWait instance
		WebDriverWait wait = new WebDriverWait(getdriver(), Duration.ofSeconds(20));
		Set<String> newWindows;
		String oldWindow;

		public AmazonSearch() {
			PageFactory.initElements(getdriver(), this);
		}
	public List<WebElement> getAllProducts() {
        return driver.findElements(By.cssSelector("div.s-main-slot div[data-component-type='s-search-result']"));
    }

    public String getProductTitle(WebElement product) {
        return product.findElement(By.cssSelector("h2 a")).getText().trim();
    }

    public void clickProduct(WebElement product) {
        product.findElement(By.cssSelector("h2 a")).click();
    }
	
}
