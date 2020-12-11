package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dnynu {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webdriver.chrome.driver", "G:\\Program\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https:\\www.facebook.com");
		//driver.navigate().to("http:\\www.google.com");
		//driver.navigate().back();
		//driver.navigate().forward();
		//driver.navigate().refresh();
//		driver.navigate();
//		String st = driver.getTitle();
//		System.out.println("title--"+st);
//		String st2 = driver.getCurrentUrl();
//		System.out.println("url--"+st2);
//		driver.manage().window().maximize();
		
		//Thread.sleep(5000);
		//driver.close();  //to close the single tab  
		
		//Dimension d= new Dimension(500, 700);//change the browser size
		//driver.manage().window().setSize(d);
		
		//Point p =new Point(300,300);
		//driver.manage().window().setPosition(p);
		String st3 = driver.getPageSource();
		System.out.println(st3);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Dnyaneshwar@atidiv.com");
		driver.findElement(By.xpath("(//input[@class='inputtext _55r1 _6luy'])[2]")).sendKeys("12345678");
		
		
		
		
	}

}
