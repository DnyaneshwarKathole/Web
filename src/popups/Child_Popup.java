package popups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_Popup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver","G:\\Program\\chromeDriver.exe");
	WebDriver driver=new ChromeDriver();
	 driver.get("https://yourportico.com");
	 
	 driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
	 
		Set<String> st = driver.getWindowHandles(); //5463579558
		
		ArrayList<String> al=new ArrayList<String>(st);
		
		driver.switchTo().window(al.get(1));
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Loft");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Dnyaneshwar.kathole@atidiv.com");
		driver.findElement(By.xpath("(//input[@type='password'])")).sendKeys("India@123");
		driver.findElement(By.xpath("//img[@src='images/showPass.png']")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

}
