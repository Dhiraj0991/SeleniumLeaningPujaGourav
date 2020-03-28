package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assignment2 {
	WebDriver driver;
	SoftAssert SoftAssert=new SoftAssert();	
	
	
	
	@Test
	public void testCase1()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Work\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Gaurav/Desktop/Selenium%20Assignment/NewIndex.html");
		driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click();
		
		
	}
	
	
	
	
	
	
	
	

}
