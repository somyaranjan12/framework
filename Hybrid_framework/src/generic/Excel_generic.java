package generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_generic {
	public static String getdata(String sheet,int row,int cell)
	{
		String val="";
		try
		{
			 FileInputStream fis = new FileInputStream("./Excel/hybrid excel.xlsx");
			 Workbook book=WorkbookFactory.create(false);
			 Cell c = book.getSheet(sheet).getRow(row).getCell(cell);
			 val=c.toString();
		}
		catch(Exception e)
		{
			System.out.println("unable to fetch data");
		}
		return val;
	}

}
