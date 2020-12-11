package framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DDFramework {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub

		
		ChromeOptions options =new ChromeOptions();
		//options.add_argument("--disable-notifications")	;	
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "G://program//ChromeDriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://kite.zerodha.com/");
		
	  FileInputStream Input =new FileInputStream("G:\\Program\\Excel Sheet\\kite.xlsx");
			  Sheet sh = WorkbookFactory.create(Input).getSheet("Sheet1");
			 String user_name = sh.getRow(0).getCell(0).getStringCellValue();
			 String password = sh.getRow(0).getCell(1).getStringCellValue();
			 String pin= sh.getRow(0).getCell(2).getStringCellValue();
		
			 driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(user_name);
			 
			 driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
			 driver.findElement(By.xpath("//button[@type='submit']")).click();
				driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
				
				driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(pin);
				
				driver.findElement(By.xpath("//button[@type='submit']")).click();
				boolean result = driver.findElement(By.xpath("//span[text()='Kulkarni']")).isDisplayed();
				if(result)
				{
					System.out.println("Pass");
				}
				else
				{
					System.out.println("Fail");
				}
				
		
			 
	}

}
