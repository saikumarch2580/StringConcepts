package Selenium.TestOne;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SeleniumExcel {
	
		
		XSSFWorkbook workbook;
		XSSFSheet sheets; 

		public void Excelutils(String path, String sheet) throws Exception {

			File file = new File(path);

			FileInputStream fis = new FileInputStream(file);
			workbook = new XSSFWorkbook(fis);
			sheets = workbook.getSheet(sheet);
			

		}
		
		public String getCellCount(int rownum, int cellvalue) {
			XSSFRow row = sheets.getRow(rownum);
			XSSFCell  colmn = row.getCell(cellvalue);
			 return sheets.getRow(rownum).getCell(cellvalue).toString();
			
		} 
	    
		public int rowcount() { 
			
			int totalnoofrows = sheets.getPhysicalNumberOfRows();
			return totalnoofrows;
			
		}
	}



