package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.CookieStore;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xwpf.usermodel.BreakClear;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class All_data {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\R Vishal\\eclipse-workspace\\Maven_Project1\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();

		WebElement search = driver.findElement(By.name("q"));

		WebElement btn = driver.findElement(By.className("L0Z3Pu"));

		File f = new File("C:\\Users\\R Vishal\\eclipse-workspace\\Maven_Project1\\New Microsoft Excel Worksheet.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet sheet = wb.getSheet("sheet1");

		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();

		System.out.println("physicalNumberOfRows:" + physicalNumberOfRows);

		for (int i = 0; i < physicalNumberOfRows; i++) {

			Row row = sheet.getRow(i);

			int physicalNumberOfCells = row.getPhysicalNumberOfCells();

			System.out.println(physicalNumberOfCells);

			for (int j = 0; j < physicalNumberOfCells; j++) {

				Cell cell = row.getCell(j);

				CellType cellType = cell.getCellType();

				if (cellType.equals(cellType.STRING)) {
			

					String s1 = cell.getStringCellValue();
					
	
					System.out.println(s1);

					search.sendKeys(s1);
					
					Thread.sleep(2000);

					btn.click();
					
					Thread.sleep(2000);
					
					search.clear();
					

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

	}

}
