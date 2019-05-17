package com.sparkelon.business;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import jxl.Sheet;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;





public class ExcelReading {
	
	static XSSFWorkbook workbook;
	   static XSSFSheet Sheet;
	  int i;
	public  ExcelReading(String excelPath,String SheetName) throws Exception{
			//projectPath =System.getProperty("user.dir");
			//workbook = new XSSFWorkbook (projectPath +"/excel/Klmm.xls");
			workbook = new XSSFWorkbook (excelPath);
			Sheet =workbook.getSheet(SheetName);
			
	} 	 	
	public int getRowCount(String SheetName){
		
		int rowcount =Sheet.getLastRowNum();
		return rowcount;
		
				
	}
	
	
	public int  getCoulmnCount(String SheetName){
		
		int colcount =Sheet.getLastRowNum();
		return colcount;
				
	}
	
	public    String getCellDataString(int rowval,int colVal){
		
		 String celldata =Sheet.getRow(rowval).getCell(colVal).getStringCellValue();
		 return celldata;
	}
	
	public   int getCellDataNum(int rowval,int colVal){
		
		 int celldata =(int) Sheet.getRow(rowval).getCell(colVal).getNumericCellValue();
		 return  celldata;
	}
	
	
	public     String getCellvalue(int rowval,int colVal){
	
		  String celldata = Sheet.getRow(rowval).getCell(colVal).getStringCellValue();
		 return celldata;
	}
	
}
	