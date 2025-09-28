package testcase1Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.TestBase;

public class AmazonHomePage extends TestBase{
	AmazonHomePage amazonHomePage;

	 public AmazonHomePage(){
			PageFactory.initElements(getdriver(), this);
		}
	 public void search(String query) {
	        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
	        searchBox.sendKeys(query);
	        driver.findElement(By.id("nav-search-submit-button")).click();

	 }
	 
	
}
