//isSelected: this method is use to verify radio button/checkbox is selected or not.


package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "G://Program//ChromeDriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https:www.facebook.com");
		
		driver.manage().window().maximize();
		WebElement te =driver.findElement(By.xpath("//a[@role='button']"));
		te.click();
		//String t2=
		System.out.println(te.getText());
		Thread.sleep(8000);
         WebElement str=driver.findElement(By.xpath("//input[@class='_8esa']"));
	    Boolean b=str.isSelected();
	    System.out.println(b);
	    if(b==true)
	    {
	    	System.out.println("radio button is selected");
	    }
	    else
	    {
	    	System.out.println("radio button is not selected");
	    	str.click();
	    	Boolean b1=str.isSelected();
	    	if(b1==true)
	    	{
	    		System.out.println("is Selected now");
	    	}
	    	
	    	
	    	
	    	
	    	
	    }
	    
		
		
		
		
		
	}

}
