package practice.amazon.producttest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.vtiger.crm.generic.webdriverutility.WebdriverUtility;

public class Sample {
	@Test
	public void sample()
	{
		WebDriver driver=new ChromeDriver();
		WebdriverUtility WLib=new WebdriverUtility();
		WLib.maximizeWindow(driver);
		WLib.waitForPageToLoad(driver);
		driver.get("https://eskooly.com/bb/signin.php");
		driver.findElement(By.id("username")).sendKeys("neerajalingareddy499@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Eskooly@123");
		driver.findElement(By.id("submit")).click();
	}
}
