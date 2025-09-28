package testcase1Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.TestBase;

public class ProductPage extends TestBase{
	WebDriverWait wait = new WebDriverWait(getdriver(), Duration.ofSeconds(30));

	public ProductPage(){
			PageFactory.initElements(getdriver(), this);
		}
	public boolean isElectronics() {
        try {
            String breadcrumb = driver.findElement(By.id("wayfinding-breadcrumbs_feature_div")).getText();
            return breadcrumb.toLowerCase().contains("electronics");
        } catch (Exception e) {
            return false;
        }
    }

    public String getProductTitle() {
        return driver.findElement(By.id("productTitle")).getText().trim();
    }

    public String getProductPrice() {
        return driver.findElement(By.cssSelector("span.a-price span.a-offscreen")).getText();
    }
	
}
