package testCase;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import steps.HomeSteps;

public class HomeTest {
	
	public  WebDriver driver;
	
	
    @Test
	public void first()
	{
    	WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.expedia.co.in/");
		HomeSteps homeSteps = new HomeSteps(driver);
		homeSteps.selectCity();
		getDates();
		homeSteps.selectDate();
	}
    
    public void getDates()
    {
    	driver.findElement(By.xpath("//button[@aria-label='"+getStartDate()+"']")).click();
		driver.findElement(By.xpath("//button[@aria-label='"+getEndDate()+"']")).click();
    }
    
    public static String getStartDate()
	{
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy");
        Calendar cal = Calendar.getInstance();  
        System.out.println(sdf.format(cal.getTime())+" is the date before adding days");
        cal.add(Calendar.DAY_OF_MONTH, 31);  
        String dateAfter = sdf.format(cal.getTime());  
          
        //date after adding three days to the given date  
        System.out.println(dateAfter+" is the date after adding 30 days.");
        return dateAfter;
        
    }
	
	public static String getEndDate()
	{
		SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy");
        Calendar cal = Calendar.getInstance();  
        System.out.println(sdf.format(cal.getTime())+" is the date before adding days");
        cal.add(Calendar.DAY_OF_MONTH, 40);  
        String dateAfter = sdf.format(cal.getTime());  
          
        //date after adding three days to the given date  
        System.out.println(dateAfter+" is the date after adding 40 days.");
        return dateAfter;
	}
	
}
