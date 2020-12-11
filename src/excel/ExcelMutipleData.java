package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelMutipleData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub

	FileInputStream File = new FileInputStream("G:\\Program\\Excel Sheet\\HDFC.xlsx");
	//String Data = WorkbookFactory.create(File).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
	//System.out.println(Data);
		
		//int lastRow = WorkbookFactory.create(File).getSheet("Sheet1").getLastRowNum();
		//System.out.println(lastRow);
		
	      Sheet sh = WorkbookFactory.create(File).getSheet("Sheet2");
		 
	      for (int i = 0; i <=sh.getLastRowNum(); i++) 
	      {
			for (int j = 0; j <= sh.getRow(i).getLastCellNum()-1; j++) 
			{
				
			Cell cellvalue = sh.getRow(i).getCell(j);
				
			if(cellvalue.getCellType()==CellType.STRING)
			{
				System.out.print(cellvalue.getStringCellValue()+"\t\t\t\t");
			}
			else if (cellvalue.getCellType()==CellType.NUMERIC) 
			{
				long l=(long)cellvalue.getNumericCellValue();
				System.out.print(l+"\t\t\t\t");
			}  
			else if(cellvalue.getCellType()==CellType.BOOLEAN)
			{
				System.out.print(cellvalue.getBooleanCellValue()+"\t\t\t\t");
			}
			else if(cellvalue.getCellType()==CellType.BLANK)
			{
				System.out.print(cellvalue.getCellType()==CellType.BLANK);
			}
			} 
	    	System.out.println(); 	  
		 }
	      
	      
	      
		
	}

}
