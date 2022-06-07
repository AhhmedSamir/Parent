package pages;

import java.sql.Time;
import java.time.Duration;
import java.time.LocalTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateEventPage extends PageBase{

	public CreateEventPage(WebDriver driver) {
		super(driver);
		js = ((JavascriptExecutor) driver);
	}

	@FindBy(xpath  = "/html/body/app-root/app-main-layout/main/app-create-event/div/div[2]/form/div/div/div[1]/prt-upload-capture-button/div[1]/button")
	WebElement addPic;
	@FindBy(id="imageInput")
	WebElement upload;
	@FindBy(id="modalMainBtn")
	WebElement closeAlert;
	@FindBy(id= "eventTitle")
	WebElement title;
	@FindBy(id="eventDescription")
	WebElement description;
	@FindBy(xpath = "//*[@id=\"Recipients\"]/div/div/div[2]/input")
	WebElement sendTolist;
	@FindBy(id="option_0")
	WebElement kidsPalaceContact;
	@FindBy(css= "div.p-relative.input_form.clickable")
	WebElement dateList;
	@FindBy(xpath="/html/body/bs-datepicker-container/div/div/div/div/bs-days-calendar-view/bs-calendar-layout/div[2]/table/tbody/tr[2]/td[1]")
	WebElement eventDay;
	@FindBy(id="timepickerStartTime")
	WebElement startTime;
	@FindBy(xpath="//li[contains(text(), '04:00')]")
	WebElement sTime;
	@FindBy(id="timepickerEndTime")
	WebElement endTime;
	@FindBy(xpath="//li[contains(text(), '05:00')]")
	WebElement eTime;
	@FindBy(id="submitCreateEventBtn")
	WebElement submitBtn;
	public void createEvent() throws InterruptedException {
		String imagePath = "C:\\Users\\pio\\eclipse-workspace\\ParentWebApp\\Uploads\\blank-profile-picture-973460_1280.png";
	    clickBTN(addPic);
		sendTxtToElement(upload, imagePath);
		Thread.sleep(1000);
		clickBTN(closeAlert);
		sendTxtToElement(title, "party");
		sendTxtToElement(description, "Birthday party");
		clickBTN(sendTolist);
		clickBTN(kidsPalaceContact);
		ScrollDown();
		Thread.sleep(1000);
		clickBTN(dateList);
		clickBTN(eventDay);
		sendTxtToElement(startTime, "04:00");
		clickBTN(sTime);
		sendTxtToElement(endTime, "05:00");
		clickBTN(eTime);
		endTime.submit();
		clickBTN(submitBtn);
	}
}
