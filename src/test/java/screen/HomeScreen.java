package screen;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeScreen {
	
	@FindBy(xpath = "//a[@href='?pwaLob=wizard-flight-pwa']")
	protected WebElement flights;
	
	@FindBy(xpath = "//a[@href='?pwaLob=wizard-hotel-pwa-v2']")
	protected WebElement hotels;

	@FindBy(xpath = "//button[@aria-label='Going to']")
	protected WebElement destination;
	
	@FindBy(xpath = "//input[@id='location-field-destination']")
	protected WebElement cityName;
	
	@FindBy(xpath = "//button[contains(@aria-label,'Check-in')]")
	protected WebElement check_In;
	
	@FindBy(xpath = "//button[contains(@aria-label,'Check-out')]")
	protected WebElement check_Out;
	
	@FindBy(xpath = "//button[contains(@aria-label,'Check-out')]")
	protected WebElement Save_Btn;
	
	@FindBy(xpath = "//button[@data-stid='apply-date-picker']")
	protected WebElement Confirm_Date;
	
	@FindBy(xpath = "//button[@data-testid='submit-button']")
	protected WebElement Search_Rooms;
}
