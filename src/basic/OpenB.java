package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "G:\\Program\\chromedriver.exe");
		WebDriver driver = new  ChromeDriver();

		//driver.findElement(By.xpath(("//a[text()='Mobiles']"))[2].click();
		
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//a[text()='Mobiles'][1]")).click();
		//driver.findElement(By.xpath("//a[text()='Mobiles'][2]")).click();
		
		
		

	}

}
