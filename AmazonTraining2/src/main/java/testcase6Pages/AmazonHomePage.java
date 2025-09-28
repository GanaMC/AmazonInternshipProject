package testcase6Pages;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class AmazonHomePage extends TestBase{
	By searchBox = By.id("twotabsearchtextbox");
    By searchButton = By.id("nav-search-submit-button");

    public AmazonHomePage() {
         PageFactory.initElements(getdriver(), this);
    }

    public void searchProduct(String productName) {
        driver.findElement(searchBox).sendKeys(productName);
        driver.findElement(searchButton).click();
    }
    /*
    public void applyBrandFilter(String brandStartsWith) {
        try {
            Thread.sleep(2000); // Let filters load
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (WebElement element : driver.findElements(By.xpath("//span[text()='Brand']/ancestor::div[contains(@class, 'a-section')]//li/span/a/span"))) {
            String brand = element.getText().trim();
            if (brand.startsWith(brandStartsWith)) {
                element.click();
                break;
            }
        }
    }

    public void applyPriceFilter(int minPrice, int maxPrice) {
        WebElement min = driver.findElement(By.id("low-price"));
        WebElement max = driver.findElement(By.id("high-price"));
        WebElement goButton = driver.findElement(By.xpath("//input[@class='a-button-input' and @type='submit']"));

        min.sendKeys(String.valueOf(minPrice));
        max.sendKeys(String.valueOf(maxPrice));
        goButton.click();
    }

    public void applyRatingFilter() {
        // Click on 4 Stars & Up
        driver.findElement(By.xpath("//span[text()='4 Stars & Up']")).click();
    }
    */

    public void applyBrandFilter(char startingLetter) {
        List<WebElement> brands = driver.findElements(By.xpath("//li[@aria-label][.//span[contains(@class, 'a-size-base')] and starts-with(translate(normalize-space(.//span[@class='a-size-base a-color-base']), 'abcdefghijklmnopqrstuvwxyz', 'ABCDEFGHIJKLMNOPQRSTUVWXYZ'), '" + startingLetter + "')]//input[@type='checkbox']"));

        if (!brands.isEmpty()) {
            brands.get(0).click(); // Select first matching brand
        }
    }
    public void selectbrand() {
    	 WebElement brand = driver.findElement(By.xpath("//a[@aria-label='Apply the filter Casio to narrow results']//i[@class='a-icon a-icon-checkbox']"));
    	 brand.click();
    }
    public void applyPriceFilter(int minPrice) {
        WebElement minBox = driver.findElement(By.id("low-price"));
        WebElement maxBox = driver.findElement(By.id("high-price"));
        WebElement goBtn = driver.findElement(By.xpath("//input[@aria-labelledby='a-autoid-1-announce']"));

        minBox.sendKeys(String.valueOf(minPrice));
        goBtn.click();
    }

    public void applyRatingFilter() {
        // Apply 4 Stars & Up filter
        WebElement rating = driver.findElement(By.xpath("//span[text()='4 Stars & Up']"));
        rating.click();
    }

    public boolean verifyFilteredResults() {
        List<WebElement> prices = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
        List<WebElement> ratings = driver.findElements(By.xpath("//span[@class='a-icon-alt']"));

        for (int i = 0; i < Math.min(prices.size(), ratings.size()); i++) {
            String priceText = prices.get(i).getText().replace(",", "").replaceAll("[^0-9]", "");
            int price = Integer.parseInt(priceText);

            String ratingText = ratings.get(i).getText().split(" ")[0];
            double rating = Double.parseDouble(ratingText);

            if (price < 2000 || rating < 4.0) {
                return false;
            }
        }
        return true;
    }
    
    
}
