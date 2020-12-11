package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetCurrentUrl;

import com.sun.xml.bind.v2.runtime.RuntimeUtil.ToStringAdapter;

public class FacebookLogInUsingExcelData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "G:\\Program\\ChromeDriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https:www.facebook.com");
	    driver.manage().window().maximize();
		
	    FileInputStream File = new FileInputStream("G:\\Program\\Excel Sheet\\Facebook Log In.xlsx");
	     
	    Sheet sh = WorkbookFactory.create(File).getSheet("Sheet2");
	    
	    for (int i = 0; i <=sh.getLastRowNum(); i++) {
	    	for (int j = 0; j <=sh.getRow(i).getLastCellNum()-1; j++) {
	    		
	    		
	    	Cell cellvalue = sh.getRow(i).getCell(j);
	    			
	    			if(cellvalue.getCellType()==CellType.STRING) {
	    				System.out.println(cellvalue.getStringCellValue());
	    			WebElement str = driver.findElement(By.xpath("//input[@name='email']"));
	    			str.sendKeys(cellvalue.getStringCellValue());
//	    			Thread.sleep(5000);
//	    			str.clear();
	    			}
	    			else if(cellvalue.getCellType()==CellType.NUMERIC)
	    			{
	    				long long1=(long) cellvalue.getNumericCellValue();
	    				 String s2 = Long.toString(long1);
	    				System.out.println(long1);
	    				driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(s2);
	    			}
	    			else if(cellvalue.getCellType()==CellType.BOOLEAN)
	    			{
	    				System.out.println(cellvalue.getBooleanCellValue());
	    			}
	    			else if(cellvalue.getCellType()==CellType.BLANK)
	    				{
	    				System.out.print(cellvalue.getCellType()==CellType.BLANK);
	    				}
	    			
	    			
	    			
			}
	    		
		}
	// driver.findElement(By.xpath("//button[@name='login']")).click();	
	    
	//driver.close();
	      String url=driver.getCurrentUrl();
	      
	    
		
		
		
		
		
	}

	
	}

	
	


