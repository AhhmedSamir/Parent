package tests;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pages.CalendarPage;
import pages.CreateEventPage;
import pages.InstitutePage;
import pages.LoginPage;
import pages.OverviewPage;

public class CreateEventTest extends TestBase{

	String email = "demo@parent.cloud";
	String pass = "12345678";
	 @Test(priority = 1)
	 public void login () {
		 LoginPage login = new LoginPage(driver);
		 login.login(email, pass);
		 
	 }
	@Test(priority = 2)
	public void openKidsPalace()  {
		InstitutePage ins = new InstitutePage(driver);
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.urlContains("institute"));
		ins.enterKidsPalace();
	}
	@Test(priority = 3)
	public void openCalendar () {
		OverviewPage over = new OverviewPage(driver);
		over.openCalendar();
	}
	@Test(priority = 4)
	public void createEvent() {
		CalendarPage cal = new CalendarPage(driver);
		cal.createEvent();
	}
	@Test(priority = 5)
	public void creatingEvent() throws InterruptedException {
		CreateEventPage create = new CreateEventPage(driver);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlContains("create"));
		create.createEvent();
	}
}
