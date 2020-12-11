package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "G://Program//ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement cat = driver.findElement(By.xpath("//select[@name='url']"));
		Select s =new Select(cat);
		s.selectByVisibleText("Amazon Devices");
		
		       
		
		
		
		
		
		
	}

}
