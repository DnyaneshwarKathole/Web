package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "G://Program//ChromeDriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(8000);
		WebElement st = driver.findElement(By.xpath("//input[@value='1']"));
		boolean ab = st.isEnabled();
		System.out.println("isEnabled --"+ab);
		boolean abc = st.isDisplayed();
		System.out.println("isDisplayed --"+abc);
		boolean ac = st.isSelected();
		System.out.println(ac);
		 if(ac==true)
		    {
		    	System.out.println("radio button is selected");
		    }
		    else
		    {
		    	System.out.println("radio button is not selected");
		    	st.click();
		    	Boolean b1=st.isSelected();
		    	if(b1==true)
		    	{
		    		System.out.println("is Selected now");
		    	}
		    	
		    	
		    	
		    	
		    }
		
		
		
		
		
		
		
	}

}
