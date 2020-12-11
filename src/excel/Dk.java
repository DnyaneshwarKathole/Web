package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Dk
{
	public static void main (String args[]) throws EncryptedDocumentException, IOException
	{

		FileInputStream file =new FileInputStream("G:\\Program\\Excel Sheet\\Facebook Log In.xlsx");


		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet1");

		for(int i=0;i<=sh.getLastRowNum();i++)
		{
			for(int j=0;j<=sh.getRow(i).getLastCellNum()-1;j++)
			{
			   Cell cl=sh.getRow(i).getCell(j);
			   if(cl.getCellType()==CellType.STRING)
  			 	 System.out.print(cl.getStringCellValue()+ " ");

			   else if(cl.getCellType()==CellType.NUMERIC)
				   
				   System.out.print((long)cl.getNumericCellValue()+ " ");
   
			   else if(cl.getCellType()==CellType.BOOLEAN)
				   System.out.print(cl.getBooleanCellValue()+ " ");

			   else if(cl.getCellType()==CellType.BLANK)
				   System.out.print("blank cell");


			}
		}
	}
}