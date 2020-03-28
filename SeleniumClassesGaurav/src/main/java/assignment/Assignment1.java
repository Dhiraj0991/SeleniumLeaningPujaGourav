package assignment;

import java.lang.reflect.Method;
import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assignment1 {

	WebDriver driver;
	int n;
	int sum;

	SoftAssert softAssert = new SoftAssert();

	@Test(priority = 1)
	public void testcase1() {

		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://jupiter.cloud.planittesting.com");
		
		
	driver.findElement(By.xpath("//a[contains(text(),'Contact')]")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Submit')]")).click();

	}
//		/* Forname box error message validation */
//
//		String str = driver.findElement(By.xpath("//span[contains(text(),'Forename is required')]")).getText();
//		System.out.println("Error messsage from forname box is:" + str);
//		softAssert.assertEquals("Forename is required", "Forename is required");
//
//		/* Email box error message validation */
//
//		String str1 = driver.findElement(By.xpath("//span[contains(text(),'Email is required')]")).getText();
//		System.out.println("Error messsage from email box is:" + str1);
//		softAssert.assertEquals("Email is required", "Email is required");
//
//		/* Message box error message validation */
//
//		String str2 = driver.findElement(By.xpath("//span[contains(text(),'Message is required')]")).getText();
//		System.out.println("Error messsage from email box is:" + str2);
//		softAssert.assertEquals("Message is required", "Message is required");
//
//		softAssert.assertAll();
//
//	}
//
//	@Test(priority = 2)
//	public void testCase2() throws Exception {
//		/* Populate mandatory fields */
//		driver.findElement(By.id("forename")).sendKeys("Gaurav");
//		driver.findElement(By.id("email")).sendKeys("gaurav.dwivedy94@gmail.com");
//		driver.findElement(By.id("message")).sendKeys("Hi, I am Learning Selenium");
//
//		driver.findElement(By.xpath("//a[contains(text(),'Submit')]")).click();
//		Thread.sleep(6000);
//		String successMessage = driver.findElement(By.xpath("//div[contains(@class,'alert-success')]")).getText();
//		System.out.println(successMessage);
//
//	}
//
//	@Test(priority = 3)
//	public void testcase3() {
//		driver.navigate().back();
//		driver.navigate().forward();
//
//		driver.findElement(By.id("forename")).sendKeys("Gaurav");
//		driver.findElement(By.id("email")).sendKeys("gaurav.dwivedy94gmailcom");
//		driver.findElement(By.id("message")).sendKeys("Hi, I am Learning Selenium");
//
//		String error = driver.findElement(By.xpath("//span[contains(text(),'Please enter a valid email')]")).getText();
//
//		System.out.println(error);
//		softAssert.assertEquals(error, "Please enter a valid email");
//
//	}
//
	@Test(priority = 4)
	public void testCase4() throws Exception {

		driver.findElement(By.xpath("//a[contains(text(),'Shop')]")).click();
		Thread.sleep(6000);
		for (int i = 0; i < 2; i++) {
		
			driver.findElement(By.xpath("(//a[contains(text(),'Buy')])[6]")).click();

		}
		driver.findElement(By.xpath("(//a[contains(text(),'Buy')])[4]")).click();
		driver.findElement(By.xpath("//li[@id='nav-cart']//a[1]")).click();
		
		
		//Method 1
//		String items= driver.findElement(By.xpath("//p[@class='cart-msg']")).getText();

//		String[] cartItem = items.split(" ");
//		System.out.println("Total items in the cart is:"+cartItem[2]);

		
		//Method 2
		
//		items=items.replaceAll("\\D+","");
//		System.out.println(items);
		
		
		//Method 3
		
		//
		System.out.println("The cart item is: "+driver.findElement(By.xpath("(//td[@class='ng-binding'])[3]")).getText());
		
//		List<WebElement> itemList=driver.findElements(By.xpath("//tr"));
//		
//		
//		int count=itemList.size()-3;
////		System.out.println("The number of rows:"+count);
//		
//		for (int i = 1; i <= count; i++) {
//			String itemnumber=driver.findElement(By.xpath("(//input[@name='quantity'])[1]")).getText();
//			
////			List<WebElement> itemnumberList=driver.findElements(By.xpath(xpathExpression))
//			n=Integer.parseInt(itemnumber);
//			sum=0;
//			sum=sum+n;
//			
//		}
//		
//		System.out.println("The number of items in cart is: "+sum);
		
		
		
	}

}