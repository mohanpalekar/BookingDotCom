import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheet {

	private static XSSFSheet ExcelWSheet;

	private static XSSFWorkbook ExcelWBook;

	private static XSSFCell Cell;

	private static XSSFRow Row;

	public static Object[][] getTableArray(String FilePath, String SheetName) throws Exception {   

		String[][] tabArray = null;

		try {

			FileInputStream ExcelFile = new FileInputStream(FilePath);

			// Access the required test data sheet

			ExcelWBook = new XSSFWorkbook(ExcelFile);

			ExcelWSheet = ExcelWBook.getSheet(SheetName);

			int startRow = 1;

			int startCol = 1;

			int ci,cj;

			int totalRows = ExcelWSheet.getLastRowNum();

			// you can write a function as well to get Column count

			int totalCols = 2;

			tabArray=new String[totalRows][totalCols];

			ci=0;

			for (int i=startRow;i<=totalRows;i++, ci++) {           	   

				cj=0;

				for (int j=startCol;j<=totalCols;j++, cj++){

					tabArray[ci][cj]=getCellData(i,j);

					System.out.println(tabArray[ci][cj]);  

				}

			}

		}

		catch (FileNotFoundException e){

			System.out.println("Could not read the Excel sheet");

			e.printStackTrace();

		}

		catch (IOException e){

			System.out.println("Could not read the Excel sheet");

			e.printStackTrace();

		}

		return(tabArray);

	}

	public static String getCellData(int RowNum, int ColNum) throws Exception {

		try{

			Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);

			CellType dataType = Cell.getCellType();

			if  (dataType.NUMERIC.getCode()==3) {

				return "";

			}else{

				String CellData = Cell.getStringCellValue();

				return CellData;
			}
		}catch (Exception e){

			System.out.println(e.getMessage());

			throw (e);

		}

	}

	public static void main(String[] args) throws IOException {

		FileInputStream ExcelFile = new FileInputStream("C:\\Users\\palek\\OneDrive\\Documents\\Book1.xlsx");

		// Access the required test data sheet

		ExcelWBook = new XSSFWorkbook(ExcelFile);

		ExcelWSheet = ExcelWBook.getSheet("Login");

		System.out.println(ExcelWBook.getSheetName(0));

		Cell = ExcelWSheet.getRow(1).getCell(1);

		CellType dataType = Cell.getCellType();

		System.out.println(dataType);

		String dataType1 = Cell.getStringCellValue();

		System.out.println(dataType1);
		
		System.out.println(ExcelWSheet.getLastRowNum());

	}


}
