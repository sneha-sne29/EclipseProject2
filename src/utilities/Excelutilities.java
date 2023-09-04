package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutilities {
	
	public static String getCellValues(String xl,String sheet,int r,int c) 
	{
		try {
			FileInputStream file=new FileInputStream(xl);
			XSSFWorkbook wb=new XSSFWorkbook(file);
			XSSFCell cell=wb.getSheet(sheet).getRow(r).getCell(c);
			if(cell.getCellType()==CellType.STRING)
			{
				return cell.getStringCellValue();
			}
			else
			{
				double v=cell.getNumericCellValue();
				int val=(int)v;
				return String.valueOf(val);
			}
			
		}
		catch(Exception ex)
		{
			return ex.getMessage();
		}
		
		
	}
	
	public static int getRowCount(String xl,String sheet)
	{
		try {
			FileInputStream file=new FileInputStream(xl);
			XSSFWorkbook wb=new XSSFWorkbook(file);
			
			return wb.getSheet(sheet).getLastRowNum();
		}
		catch(Exception x)
		{
			return 0;
		}
	}

}
