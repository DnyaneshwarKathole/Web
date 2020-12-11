package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "G://Program//ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:www.facebook.com");
		
		WebElement  str =driver.findElement(By.xpath("//a[@role='button']"));
		 
		 boolean result  = str.isEnabled();
		 System.out.println(result);
		
		
		
		
		
	}

}
