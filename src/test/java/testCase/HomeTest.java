package testCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import steps.HomeSteps;

public class HomeTest {
	
	private static WebDriver driver;
	
	HomeSteps homeSteps = new HomeSteps(driver);
	
	
    @Test
	public void first()
	{
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.expedia.co.in/");
		homeSteps.clickHotels();
	}
	
}
