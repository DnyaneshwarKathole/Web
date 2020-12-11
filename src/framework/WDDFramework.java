package framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WDDFramework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options =new ChromeOptions();
		//options.add_argument("--disable-notifications")	;	
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "G://program//ChromeDriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://kite.zerodha.com/");
		
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("DV1510");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Vijay@123");

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("959594");
	
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		boolean result = driver.findElement(By.xpath("//span[text()='Kulkarni']")).isDisplayed();
		if(result)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		
		
	}

}
