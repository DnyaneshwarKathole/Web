package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "G:\\Program\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.naukri.com");
		 WebElement text = driver.findElement(By.xpath("//input[@name='keyword']"));
		text.sendKeys("back office");
		
		System.out.println(text.getAttribute("value"));
		
		
		//driver.findElement(By.xpath("//input[contains(@name,'loc')]")).sendKeys("Pune");
		//driver.findElement(By.xpath("//button[contains(text(),'Search')]")).click();
		
		
		
		
		
	}

}
//driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("india@123");