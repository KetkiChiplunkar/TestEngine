package com.testEngine.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcel {

	public ReadExcel(String path){
		
	//FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\excel\\TestData.xlsx");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(System.getProperty("user.dir")+path);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		XSSFWorkbook workbook = null;
		try {
			workbook = new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 XSSFSheet sheet = workbook.getSheetAt(0);
		                        //I have added test data in the cell A1 as "SoftwareTestingMaterial.com"
		                        //Cell A1 = row 0 and column 0. It reads first row as 0 and Column A as 0.
		 XSSFRow row = sheet.getRow(0);
		 
		 XSSFCell cell = row.getCell(0);
		                       System.out.println(cell);
		 System.out.println(sheet.getRow(0).getCell(0));
		 //String cellval = cell.getStringCellValue();
		 //System.out.println(cellval);
		 
		 } 

	

	public void  readExcel(String path)throws Exception{
		
		
		FileInputStream fis = null;
		try {
			//String path =(System.getProperty("user.dir")+"\\src\\test\\resources\\excel\\TestData.xlsx") ;
			fis = new FileInputStream(path);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		XSSFWorkbook workbook = null;
		try {
			workbook = new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 XSSFSheet sheet = workbook.getSheetAt(0);
		                        //I have added test data in the cell A1 as "SoftwareTestingMaterial.com"
		                        //Cell A1 = row 0 and column 0. It reads first row as 0 and Column A as 0.
		 XSSFRow row = sheet.getRow(0);
		 
		 XSSFCell cell = row.getCell(0);
		                       System.out.println(cell);
		 System.out.println(sheet.getRow(0).getCell(0));
	     int RowNum = sheet.getPhysicalNumberOfRows();// count my number of Rows
	     int ColNum= row.getLastCellNum(); // get last ColNum 
	     
	}	





















}

