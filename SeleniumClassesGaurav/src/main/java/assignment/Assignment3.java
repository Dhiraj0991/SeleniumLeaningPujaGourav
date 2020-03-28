package assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assignment3 {
	
	WebDriver driver;
	int n;
	int sum=0;

	SoftAssert softAssert = new SoftAssert();

	@Test(priority = 1)
	public void testcase1() throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://jupiter.cloud.planittesting.com");
		
		driver.findElement(By.xpath("//a[contains(text(),'Shop')]")).click();
		Thread.sleep(6000);
		for (int i = 0; i < 2; i++) {
		
			driver.findElement(By.xpath("(//a[contains(text(),'Buy')])[6]")).click();

		}
		driver.findElement(By.xpath("(//a[contains(text(),'Buy')])[4]")).click();
		driver.findElement(By.xpath("//li[@id='nav-cart']//a[1]")).click();
		
		
		List<WebElement> itemList=driver.findElements(By.xpath("//tr"));
	
		int count=itemList.size()-3;
		System.out.println("The number of rows:"+count);
		
	for (int i = 1; i <= count; i++) {
		String string=driver.findElement(By.xpath("(//input[@name='quantity'])["+i+"]")).getAttribute("value");
		
		
		n=Integer.parseInt(string);
		
			sum=sum+n;
		
		}
		
	System.out.println("The number of items in cart is: "+sum);
		
		
	}
	

}
