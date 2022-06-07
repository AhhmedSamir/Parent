package tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import pages.LoginPage;

public class Login extends TestBase {

	String email = "demo@parent.cloud";
	String pass = "12345678";
	 @Test
	 public void login () {
		 LoginPage login = new LoginPage(driver);
driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		 login.login(email, pass);
		 
	 }
}
