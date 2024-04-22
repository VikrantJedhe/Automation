package excelDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class V01ExcelDemo {
	
	

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<2; j++)
			{
				
				String Path="F:\\Selenium\\Excel demo.xlsx";
				FileInputStream file= new FileInputStream(Path);
				String data=WorkbookFactory.create(file).getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue();
				System.out.print(data+" ");
			}
				 System.out.println();
			}
		
		
	
	
		
	}

}
