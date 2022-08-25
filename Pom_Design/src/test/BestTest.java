package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import main_test.Login_Page;
import main_test.PimPage;

public class BestTest {
public static WebDriver driver;
protected Login_Page loginPage;
protected PimPage pimpage;


@BeforeClass
public void launchBrowser() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	//Thread.sleep(2000);
	driver.manage().timeouts().getPageLoadTimeout();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
}

@BeforeClass
public void pageObjects() {
	loginPage=new Login_Page(driver);
	pimpage=new PimPage(driver);
}

@AfterClass
public void tearDownEnvironment() {
	driver.quit();
}
}
