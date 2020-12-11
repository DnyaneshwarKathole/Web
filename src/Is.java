import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "G://Program//ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https:www.facebook.com");
		
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(8000);
		boolean str = driver.findElement(By.xpath("(//input[@class='_8esa'])[1]")).isSelected();
		System.out.println("single line "+str);
		
		
		WebElement st2 = driver.findElement(By.xpath("(//input[@class='_8esa'])[1]"));
		boolean st3 = st2.isSelected();
		System.out.println("three line code"+st3);
	}

}
