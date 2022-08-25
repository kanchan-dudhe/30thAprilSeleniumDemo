package main_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.BestTest;

public class Login_Page extends BestTest {
	
	// find all the locators of page
	@FindBy(name="username")
	WebElement UserName;
	
	@FindBy(name="password")
	WebElement PassWord;
	
	@FindBy(xpath="//button[text()=' Login ']")
	WebElement  btnLogin ;
	
	@FindBy(xpath="//h5[text()='Login']")
	WebElement titlelofinPage;
	
	
	//Initialization of variable/locators
	
	//to initilize variable we required constructor
	
	public Login_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	
	//methods required to perform test case
	public void loginMothod() {
		UserName.sendKeys("Admin");
		PassWord.sendKeys("admin123");
		btnLogin.click();	
	}
	
	public String titleOfLoginPage() {
		return titlelofinPage.getText();
	}
	
	public String urlOfPage() {
	return	driver.getCurrentUrl();
				
	}

}
