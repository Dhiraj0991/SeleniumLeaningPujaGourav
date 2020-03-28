package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assignment4 {

	WebDriver driver;

	SoftAssert softAssert = new SoftAssert();

	@Test(priority = 1)
	public void testcase1() throws Exception {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");

		driver.findElement(By.id("i-icon-profile")).click();

		driver.findElement(By.id("signInLink")).click();
		
		Thread.sleep(5000);
		WebElement frameElement= driver.findElement(By.className("modalIframe"));
		driver.switchTo().frame(frameElement);
		
		
		driver.findElement(By.id("mobileNoInp")).sendKeys("1234");

	}
}