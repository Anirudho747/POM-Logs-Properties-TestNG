package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import screen.HomeScreen;

public class HomeSteps extends HomeScreen{
	
	public  WebDriver driver;

	public HomeSteps(WebDriver driver)
	{
		this.driver = driver;
        PageFactory.initElements(driver, this);
	}

	public void clickHotels()
	{
		flights.click();
		hotels.click();
	}

}
