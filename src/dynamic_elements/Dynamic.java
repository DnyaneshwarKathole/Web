package dynamic_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "G://Program//chromeDriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https:www.flipkart.com");
		
		driver.manage().window().maximize();
		WebElement close = driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		if(close.isDisplayed()) 
		{
			close.click();
		}
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("realme 7");
		driver.findElement(By.xpath("//button[@class='vh79eN']")).click();
		Thread.sleep(5000);
		
	String review = driver.findElement(By.xpath("((//div[@class=\"col col-7-12\"])[1]//span//span)[1]")).getText();
		
		System.out.println(review);
		
		
		
	}

}
