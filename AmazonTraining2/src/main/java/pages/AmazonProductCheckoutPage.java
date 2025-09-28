package pages;

import base.TestBase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
public class AmazonProductCheckoutPage extends TestBase{

@FindBy(xpath = "(//span[@id='deliver-to-address-text'])[1]")WebElement changeAddress;
@FindBy(xpath = "(//input[@type='submit'])[2]")WebElement shipToAddressButton;
	
	public AmazonProductCheckoutPage(){
		PageFactory.initElements(getdriver(), this);
	}
	public void selectaddress() {
		changeAddress.click();
	}
	public void clickShipToAddressButton() 
	{
		
		
		shipToAddressButton.click();
	}
}
