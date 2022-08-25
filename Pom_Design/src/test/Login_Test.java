package test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class Login_Test extends BestTest {
	@Test(priority = 1)
	public void verifyLogin() {
		loginPage.loginMothod();
		String title=pimpage.tileOfPimPage();
		System.out.println("title of PIM page is: " + title);
		AssertJUnit.assertEquals(title, "PIM");
	}

	@Test(priority = 0)
	public void verifyLohinPageIsDisplay() {
		String loginTitle = loginPage.titleOfLoginPage();
		AssertJUnit.assertEquals(loginTitle, "Login");
	}

	@Test(priority = -1)
	public void verifyUrlOfLoginPage() {
		String urlOfLogin = loginPage.urlOfPage();
		AssertJUnit.assertEquals(urlOfLogin, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}
}
