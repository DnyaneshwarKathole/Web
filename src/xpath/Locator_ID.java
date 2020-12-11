package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_ID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "G:\\Program\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:www.facebook.com");
		
	          driver.findElement(By.id("email")).sendKeys("akshay.jadhav@atidiv.com");
	          driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("india@123");
		      driver.findElement(By.linkText("Log In")).click();
		       
		      
		       
	}

}
