package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InstitutePage extends PageBase{

	public InstitutePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "div.institution__name")
	WebElement kidsPalaceInstitute;
	
	public void enterKidsPalace() {
		clickBTN(kidsPalaceInstitute);
	}
}
