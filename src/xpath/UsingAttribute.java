package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingAttribute {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "G:\\Program\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https:www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	    driver.get("https:www.facebook.com");
	   // driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kathole25@gmail.com");
	   // driver.findElement(By.xpath("//input[@type='password']")).sendKeys("kathole25@gmail.com");
	   // driver.findElement(By.tag("input")).sendKeys("Dnyaneshwar@atidiv.com");
	   // driver.findElement(By.name("//input [@type='password']")).sendKeys("Password");
	   // driver.findElement(By.id("//button[@id='u_0_b']")).click();
	    WebElement str= driver.findElement(By.tagName("input"));
	    str.sendKeys("Dnyaneshwar");
		
		
	}

}
