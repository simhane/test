package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class data {

	public static void main(String[] args) throws IOException {

 File f = new File("C:\\Users\\R Vishal\\eclipse-workspace\\Maven_Project1\\New Microsoft Excel Worksheet.xlsx");

 
 FileInputStream fis= new FileInputStream(f);
 
 
 Workbook wb = new XSSFWorkbook(fis);
 
 Sheet sheet = wb.getSheet("sheet1");
 
 Row row = sheet.getRow(1);
 
 Cell cell = row.getCell(1);
 
  CellType cellType = cell.getCellType();
 
  
  if (cellType.equals(cellType.STRING)) {
	  
	  String s1 = cell.getStringCellValue();
	  
	System.out.println(s1);
}
  
  else if (cellType.equals(cellType.NUMERIC)) {
	  
	  double n = cell.getNumericCellValue();
	  
	  
	  System.out.println(n);
	  
	
}
  
  
  else {
	
	  byte errorCellValue = cell.getErrorCellValue();
	  
	  System.out.println(errorCellValue);
}
  
  
  
	}

}
