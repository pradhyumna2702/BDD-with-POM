package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class LoginPage extends TestBase {

	@FindBy(xpath = "//input[@name='userName']")
	WebElement userid;

	@FindBy(xpath = "//input[@name='password']")
	WebElement password;

	@FindBy(xpath = "//input[@name='login']")
	WebElement loginbtn;

	@FindBy(xpath = "//img[@alt='Mercury Tours']")
	WebElement guru99logo;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public String validateLoginTitle() {
		return driver.getTitle();
	}


	public HomePage login(String un, String pw) {

		userid.sendKeys(un);
		password.sendKeys(pw);
		loginbtn.click();
		
		return new HomePage();
	}

}
