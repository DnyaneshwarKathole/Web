package autoSuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "G:\\Program\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		String exp="iphone 11 pro";
		driver.get("https:www.google.com");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Iphone");
		Thread.sleep(5000);
		List<WebElement> options = driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
		
		System.out.println(options.size());
		
		System.out.println(options.size());
		for(WebElement  ele: options)
		{
			//System.out.println(ele.getText());
			String act=ele.getText();
			System.out.println(act);
			if(act.equals(exp)) {
				ele.click();
			break;
			}
			
		}
		
		
		
		
		
		
		
	}

}
