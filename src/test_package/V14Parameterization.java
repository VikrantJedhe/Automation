package test_package;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class V14Parameterization {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		
	String path= "F:\\Selenium\\Excel demo.xlsx";	
	
	FileInputStream file= new FileInputStream(path);
	
	String data= WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
	
	System.out.println(data);
	}

	
}
