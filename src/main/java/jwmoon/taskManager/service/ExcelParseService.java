package jwmoon.taskManager.service;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jwmoon.taskManager.domain.Task;
import jwmoon.taskManager.mapper.TaskMapperTest;

public class ExcelParseService implements ParseService {
	
	private static Logger log = (Logger) LoggerFactory.getLogger(ExcelParseService.class);
	
	public List<Task> getList() {
		
		return new ArrayList<Task>(); 
	}
	
	public void getListFromExcel(){
		// get File
		
		// parsing
		
		// 
	}
	
	
	static XSSFRow row;
	
	public static void main(String[] args) throws Exception {
		File file = new File("D://schedule/sche.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		 if(file.isFile() && file.exists())
	      {
	         System.out.println(
	         "openworkbook.xlsx file open successfully.");
	      }
	      else
	      {
	         System.out.println(
	         "Error to open openworkbook.xlsx file.");
	      }
		 
		 log.info("n : " + workbook.getNumberOfSheets());
		 XSSFSheet sheet1 = workbook.getSheetAt(4);
		 Iterator<Row> rowIterator = sheet1.iterator();
		 while(rowIterator.hasNext()){
			 row = (XSSFRow) rowIterator.next();
			 
			 Iterator < Cell > cellIterator = row.cellIterator();
	         while ( cellIterator.hasNext()) 
	         {
	        	 Cell cell = cellIterator.next();
	        	 switch (cell.getCellType()) 
	             {
	                case Cell.CELL_TYPE_NUMERIC:
	                System.out.print(  cell.getNumericCellValue() + " \t\t " );
	                break;
	                case Cell.CELL_TYPE_STRING:
	                System.out.print( cell.getStringCellValue() + " \t\t " );
	                break;
	             }
	        	 System.out.println();
	         }
	         fis.close();
		 }
		 /*for(int i=0; i < sheet1.getPhysicalNumberOfRows(); i++){
			 
		 }*/
	}

}
