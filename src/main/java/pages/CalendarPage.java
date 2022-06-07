package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalendarPage extends PageBase {

	public CalendarPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id="createEventBtn")
	WebElement createEventBtn;
	public void createEvent() {
		clickBTN(createEventBtn);
	}
	
}
