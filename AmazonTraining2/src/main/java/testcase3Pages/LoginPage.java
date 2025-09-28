package testcase3Pages;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import base.TestBase;

public class LoginPage extends TestBase{
	
	By signInBtn = By.id("nav-link-accountList");
    By emailField = By.id("ap_email_login");
    By continueBtn = By.id("continue");
    By passwordField = By.id("ap_password");
    By submitBtn = By.id("signInSubmit");
 
    public LoginPage() {
	// TODO Auto-generated constructor stub
	PageFactory.initElements(getdriver(), this);	
}
 

  public void login(String email, String password) {
      driver.findElement(signInBtn).click();
      driver.findElement(emailField).sendKeys(email);
      driver.findElement(continueBtn).click();
      driver.findElement(passwordField).sendKeys(password);
      driver.findElement(submitBtn).click();
  }

}
