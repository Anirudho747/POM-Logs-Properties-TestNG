package steps;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import screen.HomeScreen;

public class HomeSteps extends HomeScreen{
	
	public  WebDriver driver;
	
	public HomeSteps(WebDriver driver)
	{
		this.driver = driver;
        PageFactory.initElements(driver, this);
	}

	public void selectCity()
	{
		hotels.click();
		destination.click();
		cityName.sendKeys("Daman");
		cityName.sendKeys(Keys.ENTER);
		check_In.click();
	}
	
	public void selectDate()
	{
		confirm_Date.click();
		search_Rooms.click();
	}
	
	

}
