package screen;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeScreen {
	
	@FindBy(xpath = "//a[@href='?pwaLob=wizard-flight-pwa']")
	public WebElement flights;
	
	@FindBy(xpath = "//a[@href='?pwaLob=wizard-hotel-pwa-v2']")
	public WebElement hotels;

	@FindBy(xpath = "//button[@aria-label='Going to']")
	public WebElement destination;
	
	@FindBy(xpath = "//input[@id='location-field-destination']")
	public WebElement cityName;
	
	@FindBy(xpath = "//button[contains(@aria-label,'Check-in')]")
	public WebElement check_In;
	
	@FindBy(xpath = "//button[contains(@aria-label,'Check-out')]")
	public WebElement check_Out;
	
	@FindBy(xpath = "//button[contains(@aria-label,'Check-out')]")
	public WebElement save_Btn;
	
	@FindBy(xpath = "//button[@data-stid='apply-date-picker']")
	public WebElement confirm_Date;
	
	@FindBy(xpath = "//button[@data-testid='submit-button']")
	public WebElement search_Rooms;
	
}
