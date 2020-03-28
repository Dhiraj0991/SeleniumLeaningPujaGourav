package facebook;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FacebookClass2 {
	WebDriver driver;

	@Test(priority = 1)
	public void errorMessage() throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/gp/cart/view.html?ref_=nav_cart");
		
		Thread.sleep(50000);
		WebElement element = driver.findElement(By.xpath(" (//span[@class='a-dropdown-prompt'])[2]"));
		
		System.out.println("the etxt is"+element.getText());

	}

}
