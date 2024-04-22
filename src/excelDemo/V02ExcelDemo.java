package excelDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class V02ExcelDemo {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		String path="F:\\\\Selenium\\\\Excel demo.xlsx";
		
		FileInputStream obj = new FileInputStream(path);
		
		String data= WorkbookFactory.create(obj).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(data);
	}
}
