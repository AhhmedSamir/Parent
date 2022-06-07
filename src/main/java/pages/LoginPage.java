package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id="txtEmail")
	WebElement emailField;
	@FindBy(id="txtPassword")
	WebElement passField;
	@FindBy(id="submitBtn")
	WebElement loginBTn;
	
	public void login(String email , String pass) {
		sendTxtToElement(emailField, email);
		sendTxtToElement(passField, pass);
		clickBTN(loginBTn);
	}
}
