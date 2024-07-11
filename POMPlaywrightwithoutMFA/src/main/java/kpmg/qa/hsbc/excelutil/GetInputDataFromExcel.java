package kpmg.qa.hsbc.excelutil;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;



public class GetInputDataFromExcel {
	@DataProvider(name ="exceldata123") 
	public Object[][] excelDP() throws IOException {
		//HashMap<String, Object> 
		GetInputDataFromExcel getexceldata = new GetInputDataFromExcel();
		return getexceldata.getExcelData1();
	}
/*	HashMap<String, HashMap<String, Object>> dataMap = new HashMap<>();
		

	 Object[][] dataArray = new Object[dataMap.size()][dataMap.get(0).size()];	
	 protected Object[][] arrObj = null;
	
@DataProvider(name ="exceldata") 
public Object[][] excelDP() {
	arrObj = getExcelData("C:\\ExcelData\\TestDataXLS.xls", "Sheet1");
		return arrObj;		
    		
}

public Object[][] getExcelData(String fileName, String sheetName) {

	Object[][] data = null;
	Workbook wb = null;
	try {
        FileInputStream file = new FileInputStream("C:\\Playwright\\Input Excel.xlsx");

        Workbook workbook = WorkbookFactory.create(file);
        Sheet sheet = workbook.getSheetAt(0);

        Map<Integer, Map<Integer, Object>> dataMap = new HashMap<>();

        Iterator<Row> rowIterator = sheet.iterator();
        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();

            Map<Integer, Object> rowData = new HashMap<>();
            Iterator<Cell> cellIterator = row.cellIterator();
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                //switch (cell.getCellType()) {
                  //  case Cell.CELL_TYPE_NUMERIC:
                    //    rowData.put(cell.getColumnIndex(), cell.getNumericCellValue());
                     //   break;
                        switch (cell.getCellType()) {
                        case STRING:
                        rowData.put(cell.getColumnIndex(), cell.getStringCellValue());
                        break;
                        case NUMERIC:
                        	rowData.put(cell.getColumnIndex(), cell.getNumericCellValue());
                            break;
                }
            }
            dataMap.put(row.getRowNum(), rowData);
        }

      

        for (int row = 0; row < dataArray.length; row++) {
            for (int col = 0; col < dataArray[row].length; col++) {
                if (dataMap.get(row).get(col) instanceof Double) {
                    dataArray[row][col] = (Number) dataMap.get(row).get(col);
                } else {
                    dataArray[row][col] = (String) dataMap.get(row).get(col);
                }
            } //return dataArray;
        }

        workbook.close();
        file.close();

        // Handle the 2D object array as needed
        for (Object[] row : dataArray) {
            for (Object cell : row) {
                System.out.print(cell + "\t");
            }
            System.out.println();
        }

    } catch (IOException e) {
        e.printStackTrace();
    }
	return dataArray;
}


	HashMap<String, Object> dataMap = new HashMap<>();
	HashMap<String, Object> hashmap = new HashMap<>();
	

	//  Object[][] dataArray = new Object[dataMap.size()][dataMap.get(0).size()];	
	
@DataProvider(name ="exceldata") 
public HashMap<String, Object> excelDP() {
	//HashMap<String, Object> 
	hashmap = getExcelData("C:\\ExcelData\\TestDataXLS.xls", "Sheet1");
	return hashmap;
}

public HashMap<String, Object> getExcelData(String fileName, String sheetName) 
{
	Object[][] data = null;
	Workbook wb = null;
	try {
      FileInputStream file = new FileInputStream("C:\\Playwright\\Input Excel.xlsx");

      Workbook workbook = WorkbookFactory.create(file);
      Sheet sheet = workbook.getSheetAt(0);

      Map<Integer, Map<Integer, Object>> dataMap = new HashMap<>();

      Iterator<Row> rowIterator = sheet.iterator();
      while (rowIterator.hasNext()) {
          Row row = rowIterator.next();

          Map<Integer, Object> rowData = new HashMap<>();
          Iterator<Cell> cellIterator = row.cellIterator();
          while (cellIterator.hasNext()) {
              Cell cell = cellIterator.next();
              //switch (cell.getCellType()) {
                //  case Cell.CELL_TYPE_NUMERIC:
                  //    rowData.put(cell.getColumnIndex(), cell.getNumericCellValue());
                   //   break;
                      switch (cell.getCellType()) {
                      case STRING:
                      rowData.put(cell.getColumnIndex(), cell.getStringCellValue());
                      break;
                      case NUMERIC:
                      	rowData.put(cell.getColumnIndex(), cell.getNumericCellValue());
                          break;
              }
          }
          dataMap.put(row.getRowNum(), rowData);
      }

    

     
      workbook.close();
      file.close();

      // Handle the 2D object array as needed
     

  } catch (IOException e) {
      e.printStackTrace();
  }
	return dataMap;
}
*/
/*	@DataProvider(name ="exceldata") 
	/*public Object[][] excelDP() throws IOException {
		//HashMap<String, Object> 
		Object arr[][] = getExcelData1("C:\\Playwright\\Input.xlsx", "Sheet1");
		return arr;
	}
		*/
	
	public static Object[][] getExcelData1() throws IOException{
		FileInputStream file = new FileInputStream("C:\\Playwright\\Input.xlsx");
		Workbook workbook = WorkbookFactory.create(file);
        Sheet sheet = workbook.getSheetAt(0);
     /*   int lastrownum = sheet.getLastRowNum();
        System.out.println("Last row is : " +lastrownum);
        int lastcolnum = sheet.getRow(0).getLastCellNum();
        System.out.println("Last column is " +lastcolnum);
        Object[][] a = new Object[lastrownum][1];
        Map<String, Object> map;
        for(int i=1; i<=lastrownum; i++) {
        	map = new HashMap<>();
        	for(int j=0; j<lastcolnum; j++) {
        		//a[i-1][j]=sheet.getRow(i).getCell(j).getStringCellValue();
        		String Key =sheet.getRow(0).getCell(j).getStringCellValue();
        		String Value =sheet.getRow(i).getCell(j).getStringCellValue();
        	map.put(Key, Value);
	}
        	a[i-1][0]=map;
        }
        return a;
*/
/*
        Row headerRow = sheet.getRow(0);
        Map<String, Object> dataMap;
        Object[][] b = new Object[sheet.getLastRowNum()][1];
        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
        	dataMap = new HashMap<>();
            Row dataRow = sheet.getRow(i);
            for (int j = 0; j < headerRow.getLastCellNum(); j++) {
                Cell headerCell = headerRow.getCell(j);
                Cell dataCell = dataRow.getCell(j);
                switch (headerCell.getCellType()) {
                    case STRING:
                    	System.out.println("I am string value" +headerCell);
                        dataMap.put(headerCell.getStringCellValue(), dataCell.getStringCellValue());
                        break;
                    case NUMERIC:
                    	System.out.println("I am numeric value"+headerCell);
                        dataMap.put(headerCell.getStringCellValue(), String.valueOf(dataCell.getNumericCellValue()));
                        break;
                    default:
                        dataMap.put(headerCell.getStringCellValue(), dataCell.getStringCellValue());
                        break;
                }
            }
            b[i-1][0]=dataMap;
        }

        return b;
        } 
*/

        int lastrownum = sheet.getLastRowNum();
        //System.out.println("Last row is : " +lastrownum);
        int lastcolnum = sheet.getRow(0).getLastCellNum();
        //System.out.println("Last column is " +lastcolnum);
        DataFormatter formatter = new DataFormatter();
        Object[][] a = new Object[lastrownum][1];
        Map<String, Object> map;
        for(int i=1; i<=lastrownum; i++) {
        	map = new HashMap<>();
        	for(int j=0; j<lastcolnum; j++) {
        		//a[i-1][j]=sheet.getRow(i).getCell(j).getStringCellValue();
        		String Key =sheet.getRow(0).getCell(j).getStringCellValue();
        		String Value =formatter.formatCellValue(sheet.getRow(i).getCell(j));
        		
        	map.put(Key, Value);
	}
        	a[i-1][0]=map;
        }
        return a;

		
	}
}
	