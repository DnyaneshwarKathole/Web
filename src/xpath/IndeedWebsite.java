package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class IndeedWebsite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "G:\\Program\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:www.indeed.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='text-input-what']")).sendKeys("Back Office ");
		driver.findElement(By.xpath("//input[@id='text-input-where']")).sendKeys("Pune");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String Str=driver.getCurrentUrl();
		System.out.println(Str);
		driver.findElement(By.xpath("")).
		//driver.get(Str);
		
		
		
		
		
	}

}
