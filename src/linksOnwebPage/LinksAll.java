package linksOnwebPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "G:\\Program\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https:www.google.com");
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		System.out.println("on the webpage links are "+links.size());
		
		
		
		//using normal each for 
		for(WebElement lis:links)
		{
			System.out.println(lis.getText());
		}
		
		
		//using normal  for 
		for (int i = 0; i < links.size()-1; i++) 
		{
			System.out.println(links.get(i).getText());
		}
		
		
		
		
		
		
		
		
		
		
	}

	
	}


