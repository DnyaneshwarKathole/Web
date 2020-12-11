package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseB {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","G:\\Program\\chromedriver.exe");
		//WebDriver driver= new ChromeDriver();
		WebDriver driver = new  ChromeDriver();
        driver.get("https:\\google.com");
        driver.manage().window().maximize();
         String Title = driver.getTitle();  
         System.out.println(Title);
         String Curranturl=driver.getCurrentUrl();
         System.out.println(Curranturl);
        String Currantpagesource=driver.getPageSource();
       // System.out.println(Currantpagesource);
      // driver.close();
        driver.quit();
		
		
	
	
	}
	
	

}
