package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assert {
	public static WebDriver driver;
	
	@Test
	
	public void tc_1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Shanu Data\\Slenium\\Chrome Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.xpath("//input[@name=\"cuid\"]"));
	
		
	}

	
}
