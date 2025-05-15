package Com_Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;                    
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excel_Data_Provider {

	
private XSSFWorkbook wb;
	
	public  Excel_Data_Provider() throws Exception {
		String Excel_path=System.getProperty("user.dir")+"\\Excel_TestData\\Excel_FSRC.xlsx";
		
		File f=new File(Excel_path);
		FileInputStream file=new FileInputStream(f);
		wb=new XSSFWorkbook(file);
	}
	
/*
	 public ExcelDataProvider() throws IOException {
	        
	        String excelPath = System.getProperty("user.dir") + File.separator + "Excel_TestData" + File.separator + "login_credential.xlsx";
	        
	        File file = new File(excelPath);

	       
	        try (FileInputStream fis = new FileInputStream(file)) {
	            wb = new XSSFWorkbook(fis);  
	        } catch (IOException e) {
	           
	            e.printStackTrace();
	            throw e;  
	        }
	    }
	*/
	
	public  String getStringdata(String sheetname,int rownum,int cellnum) {
		return wb.getSheet(sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();
		
}
	
	public String getStringdata2(String sheetname, int rownum, int cellnum) {

	    Cell cell = wb.getSheet(sheetname).getRow(rownum).getCell(cellnum);

	    if (cell == null) {

	        return "";  // Return empty if cell is null

	    }

	    switch (cell.getCellType()) {

	        case STRING:

	            return cell.getStringCellValue();

	        case NUMERIC:

	            return String.valueOf((int) cell.getNumericCellValue());

	        default:

	            return "";

	    }

	}
 
	
	
	public  String get_Date(String sheetname,int rownum,int cellnum) {
		Date date= wb.getSheet(sheetname).getRow(rownum).getCell(cellnum).getDateCellValue();
		DateFormat simple = new SimpleDateFormat("dd/MM/yyyy");
		return simple.format(date);
	}

	public String getNumericdata(String sheetname,int rownum,int cellnum) {
		 Double d=wb.getSheet(sheetname).getRow(rownum).getCell(cellnum).getNumericCellValue();
return String.format("%.0f", d);

	}
	
	
	
	public Object[][] getAllData(String sheetName) {
	    int rowCount = wb.getSheet(sheetName).getPhysicalNumberOfRows();
	    int colCount = wb.getSheet(sheetName).getRow(0).getLastCellNum();

	    Object[][] data = new Object[rowCount - 1][colCount];

	    for (int i = 1; i < rowCount; i++) {
	        for (int j = 0; j < colCount; j++) {
	            Cell cell = wb.getSheet(sheetName).getRow(i).getCell(j);
	            data[i - 1][j] = (cell != null) ? cell.toString() : "";
	        }
	    }
	    return data;
	}

	
	
	
	
	
	
	

	
}
