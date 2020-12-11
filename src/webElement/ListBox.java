package webElement;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "G://Program//ChromeDriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https:www.facebook.com");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(5000);

		WebElement day = driver.findElement(By.xpath("//select[@title='Day']"));
		Select s =new Select(day);
		s.selectByValue("1");
		WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
		Select s1=new Select(month);
		s1.selectByValue("2");
		WebElement year = driver.findElement(By.xpath("//select[@title='Year']"));
		Select s2=new Select(year);
		s2.selectByValue("2020");
		List <WebElement> options =s2.getOptions();
		//System.out.println("total no of options: " + (options.size() - 1));
		for (WebElement ele : options) 
		{
			System.out.println(ele.getText());

		}
		
		
		

		
		
		
		
		
		
	}

}
