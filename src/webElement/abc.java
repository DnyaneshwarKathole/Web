package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class abc {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "G:\\Program\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(2000);

		// month
		// step1:
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select s=new Select(month);
		
		  boolean result = s.isMultiple();
		System.out.println(result);
		
		
		
		
		
	}

}
