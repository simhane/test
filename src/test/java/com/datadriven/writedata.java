package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writedata {

	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\R Vishal\\OneDrive\\Desktop\\test.xlsx");
		
		FileInputStream fis=new FileInputStream(f);
		
		Workbook wb=new XSSFWorkbook(fis);
		
		Sheet createSheet = wb.createSheet("vishal1");
		
		Row createRow = createSheet.createRow(5);
		
		Cell createCell = createRow.createCell(0);
		
		createCell.setCellValue("cool person1");
		
		Cell createCell2 = createRow.createCell(1);
		
		createCell2.setCellValue("vishal");
		
		
		FileOutputStream fos=new FileOutputStream(f);
		
		wb.write(fos);
		
		
		System.out.println("wroite process done");
		

	}

}
