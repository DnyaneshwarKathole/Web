package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub

		FileInputStream File = new FileInputStream("G:\\Program\\Excel Sheet\\New Microsoft Excel Worksheet.xlsx");
		//String value=WorkbookFactory.create(File).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
//		System.out.println(value);
	//	FileInputStream File2 = new FileInputStream("G:\\Program\\Excel Sheet\\New Microsoft Excel Worksheet.xlsx");
//		String value2=WorkbookFactory.create(File2).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
//		System.out.print(value2);
//		
		
		Cell cellvalue = WorkbookFactory.create(File).getSheet("Sheet1").getRow(0).getCell(1);
		System.out.println(cellvalue.getStringCellValue());
		
		if(cellvalue.getCellType()==CellType.STRING)
		{
			System.out.println(cellvalue.getStringCellValue());
		}
		else if(cellvalue.getCellType()==CellType.NUMERIC)
		{
			System.out.println(cellvalue.getNumericCellValue());
		}
		else if(cellvalue.getCellType()==CellType.BOOLEAN)
		{
			System.out.println(cellvalue.getBooleanCellValue());
		}
		else if(cellvalue.getCellType()==CellType.BLANK)
		{
			System.out.println("this Cell Is Blank");
		}
			
			
			
		
	}

}
