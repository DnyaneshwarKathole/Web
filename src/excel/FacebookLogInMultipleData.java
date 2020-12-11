package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogInMultipleData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "G:\\Program\\ChromeDriver.exe");
		WebDriver driver =new ChromeDriver();
		
		
		FileInputStream file =new FileInputStream("G:\\Program\\Excel Sheet\\Facebook Log In.xlsx");
		
		
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
		
		
	
		
		
		
		
	}

}
