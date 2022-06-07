package tests;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pages.InstitutePage;
import pages.LoginPage;

public class InstituteTest extends TestBase {

	String email = "demo@parent.cloud";
	String pass = "12345678";
	 @Test(priority = 1)
	 public void login () {
		 LoginPage login = new LoginPage(driver);
driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		 login.login(email, pass);
		 
	 }
	@Test(priority = 2)
	public void openKidsPalace()  {
		InstitutePage ins = new InstitutePage(driver);
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.urlContains("institute"));
		ins.enterKidsPalace();
	}
}
