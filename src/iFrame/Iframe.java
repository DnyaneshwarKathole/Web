package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "G:\\Program\\ChromeDriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		//driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		driver.findElement(By.id("tryhome")).click();
		
		
		
		
		
		
		
		
		
		
	}

}
