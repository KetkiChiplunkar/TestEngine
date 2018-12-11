package com.testEngine.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import com.testEngine.testBase.testBase;
import com.testEngine.utilities.ReadExcel;

public class LoginTest extends testBase {
	String path =(System.getProperty("user.dir")+"\\src\\test\\resources\\excel\\TestData.xlsx");

	
	@Test
	public void loginTest() throws Exception{
		//emailAddress = this.emailAddress;
		//password = this.password;
		openBrowser("Chrome");
login("chiplunkar.k1@gmail.com","ket190785");
		//System.out.println("emailAddress "+ emailAddress+ "password "+password);
	}







@DataProvider


public Object[][]testData(){
	
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
//	 
 XSSFCell cell = row.getCell(0);
	                       //System.out.println(cell);
	// System.out.println(sheet.getRow(0).getCell(0));
     int RowNum = sheet.getPhysicalNumberOfRows();// count my number of Rows
     int ColNum= row.getLastCellNum(); // get last ColNum 
     Object Data[][]= new Object[RowNum-1][ColNum]; // pass my  count data in array
     
     for(int i=0; i<RowNum-1; i++) //Loop work for Rows
     {  
  
         for (int j=0; j<ColNum; j++) //Loop work for colNum
         {
        	 DataFormatter formatter = null;
			String value=formatter.formatCellValue(cell);
             Data[i][j]=value;
             System.out.println("value is dataprovider "+value);

                 }
             }
 

 return Data;
}

}
     