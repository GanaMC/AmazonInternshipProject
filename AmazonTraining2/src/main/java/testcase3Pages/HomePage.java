package testcase3Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePage extends TestBase{

	By profileName = By.id("nav-link-accountList-nav-line-1");
	
	public HomePage() {
		PageFactory.initElements(getdriver(), this);
	}
	public String getProfileName() {
        return driver.findElement(profileName).getText();
    }

    public boolean isProfileNameValid(String name) {
        // Name should not contain A, C, G, I, L, K
        return !name.matches(".*[ACGILK].*");
    }
}
