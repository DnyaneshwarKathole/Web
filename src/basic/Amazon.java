package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "G://Program//chromedriver.exe");//"G:\Program\.exe"
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Dnyaneshwar@atidiv.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("india@123");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		
       
        
	}

}
