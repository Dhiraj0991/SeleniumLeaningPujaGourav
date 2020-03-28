package facebook;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FacebookClass {
	WebDriver driver;

	@Test(priority = 1)
	public void errorMessage() {

		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]")).click();
		String str = driver.findElement(By.xpath("//div[contains(@id,'js')]")).getText();
		System.out.println(str);
		Assert.assertEquals(str, "What's your name?");

	}

	@Test(priority = 2)
	public void validmobilenumber() {
		driver.findElement(By.xpath("(//input[contains(@id,'u_0')])[6]")).click();
		String str = driver.findElement(By.xpath("(//div[contains(@id,'js')])[2]")).getText();
		System.out.println(str);
		Assert.assertEquals(str, "You'll use this when you log in and if you ever need to reset your password.");

	}

	@Test(priority = 3)
	public void password() {
		driver.findElement(By.xpath("(//input[contains(@id,'u_0')])[8]")).click();
		String str = driver.findElement(By.xpath("(//div[contains(@id,'js')])[3]")).getText();
		System.out.println(str);

	}

	@Test(priority = 4)
	public void logIn() {
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		driver.findElement(By.id("email")).click();
		String str = driver.findElement(By.xpath("//div[@class='_4rbf _53ij']")).getText();
		System.out.println(str);
		driver.navigate().back();

	}
	
	
	@Test(priority = 5)
	public void dropDown()
	{
		
		Select s=new Select(driver.findElement(By.id("month")));
		
		List<WebElement> elements=s.getOptions();
		System.out.println("The containt inside month dropdown is");
		for (int i = 0; i < elements.size(); i++) {
			System.out.println(elements.get(i).getText());
		}
		driver.close();
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
