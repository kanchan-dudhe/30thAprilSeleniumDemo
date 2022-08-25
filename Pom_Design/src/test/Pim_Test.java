package test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Pim_Test extends BestTest {

	@BeforeMethod
	public void login() {
		loginPage.loginMothod();
	}

	@Test
	public void verifyTitlelOfPimPage() {
		String pimPageTitle = pimpage.tileOfPimPage();
		AssertJUnit.assertEquals(pimPageTitle, "PIM");

	}

}
