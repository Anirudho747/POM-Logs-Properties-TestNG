/**
 * 
 */
package com.yatra.pkg;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author ani
 *
 */
public class Wdrvrmngr {
	
	private static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.expedia.co.in/");
		elmnts();
//		tearDown();
	}
	
	public static void elmnts()
	{
//		driver.findElement(By.xpath("//a[@href='?pwaLob=wizard-flight-pwa']")).click();
		driver.findElement(By.xpath("//a[@href='?pwaLob=wizard-hotel-pwa-v2']")).click();
		driver.findElement(By.xpath("//button[@aria-label='Going to']")).click();
		driver.findElement(By.xpath("//input[@id='location-field-destination']")).sendKeys("Daman");
		driver.findElement(By.xpath("//input[@id='location-field-destination']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//button[contains(@aria-label,'Check-in')]")).click();
		
		driver.findElement(By.xpath("//button[@aria-label='"+getStartDate()+"']")).click();
		driver.findElement(By.xpath("//button[@aria-label='"+getEndDate()+"']")).click();
		driver.findElement(By.xpath("//button[@data-stid='apply-date-picker']")).click();
		driver.findElement(By.xpath("//button[@data-testid='submit-button']")).click();
	}
	
	public static void tearDown()
	{
		driver.quit();
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
