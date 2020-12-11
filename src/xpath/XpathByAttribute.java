package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G://Program//chromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("hfkfkf");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("fyuikyfk");
		driver.findElement(By.xpath("//button[@id='u_0_b']")).click();
		//String st1=driver.getTitle();
		
		
//		if(st1.contains("Facebook")) {
//			System.out.println("Log in successfull ");
//		    driver.findElement(By.xpath("//span[@class='a8c37x1j ni8dbmo4 stjgntxs l9j0dhe7 ltmttdrg g0qnabr5']")).click();
//		}
//		else
//		{
//			driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
//	
//		}
//			
		
		
	}

}
