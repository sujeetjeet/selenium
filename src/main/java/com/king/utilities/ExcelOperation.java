package com.king.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelOperation {
	public static String readData(String SheetName, int RowNumber, int CellNumber) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"//textdata//data.xlsx");
		Workbook w1= WorkbookFactory.create(fis);
		String s=w1.getSheet("Sheet1").getRow(2).getCell(2).getStringCellValue();
		return s;
	}
public static void writeData(String SheetName, int rowNumber, int cellNumber) throws IOException {
FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"//textdata//data.xlsx");
Workbook w1 = WorkbookFactory.create(fis);
w1.getSheet("Sheet1").getRow(4).getCell(4).setCellValue("selenium");
FileOutputStream fos= new FileOutputStream(System.getProperty("user.dir")+"//textdata//data.xlsx");
w1.write(fos);
}
}
