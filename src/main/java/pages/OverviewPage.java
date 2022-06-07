package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OverviewPage extends PageBase {

	public OverviewPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id="calendarTab")
	WebElement calendarBtn;
	public void openCalendar() {
		clickBTN(calendarBtn);
	}
}
