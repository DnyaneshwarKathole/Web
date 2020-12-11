package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lokmat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "G:\\Program\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https:www.lokmat.com");
		//driver.findElement(By.xpath("//a[text()='English'][1]")).click();
		driver.findElement(By.xpath("//a[@class='menu-cat active']")).click();
		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,"t");
		driver.findElement(By.linkText("https:\\www.facebook.com")).sendKeys(selectLinkOpeninNewTab);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
