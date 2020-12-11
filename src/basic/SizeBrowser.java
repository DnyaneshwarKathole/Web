package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SizeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 System.setProperty("webdriver.chrome.driver", "G://Program//ChromeDriver.exe");
	 WebDriver driver =new ChromeDriver();
	 driver.get("https://www.whatsapp.com/");
	 driver.findElement(By.xpath("//a[text()='WhatsApp Web']")).click();
	 

		
	}

}
