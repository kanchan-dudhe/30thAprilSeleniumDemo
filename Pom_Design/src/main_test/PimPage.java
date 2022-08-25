package main_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.BestTest;

public class PimPage extends BestTest {

	// find all the locators of page
	@FindBy(xpath = "//h6[text()='PIM']")
	WebElement txtpage;

	// Initialization of variable/locators

	public PimPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// methods required to perform test case
	public String tileOfPimPage() {
	return	txtpage.getText();
	
	}

}
