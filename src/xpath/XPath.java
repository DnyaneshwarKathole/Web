package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\Program\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https:\\www.facebook.com");
		
		driver.findElement(By.xpath("//input[@type='text'][1]")).sendKeys("Dnyaneshwar.kathole@atidiv.com");
		//driver.findElement(By.xpath("//input [@id='pass']")).sendKeys("India@1234");
		//driver.findElement(By.xpath("//button[@name='login']")).click();
		//driver.findElement(By.xpath("//button[text()='Log In']")).click();
		//driver.findElement(By.xpath("//button[contains(@name,'login')]")).click();

	}

}
