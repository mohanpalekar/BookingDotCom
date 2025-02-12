package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {

	private String filePath;

	public String sheetName;

	public ExcelUtil(String filePath, String sheetName) {

		this.filePath = filePath;

		this.sheetName = sheetName;

	}

	public Object[][] readExcelData() {

		String [][] dataArray = null;

		File file = new File(this.filePath);

		//FileInputStream excelFile = null;

		try(FileInputStream excelFile = new FileInputStream(file)){

			if(file.exists()) {

				try(XSSFWorkbook workbook = new XSSFWorkbook(excelFile)) {

					XSSFSheet workSheet = workbook.getSheet(this.sheetName);

					int lastRowIndex = workSheet.getLastRowNum();

					System.out.println("lastRowIndex : "+lastRowIndex);

					dataArray = new String[lastRowIndex][2];

					for(int row=1; row<=lastRowIndex; row++) {

						String userName = workSheet.getRow(row).getCell(0).getStringCellValue();

						String passWord = workSheet.getRow(row).getCell(1).getStringCellValue();

						dataArray[row-1][0] = userName;

						dataArray[row-1][1] = passWord;

						//						System.out.println("Row : "+row);
						//
						//						System.out.println("Username : "+userName+" , Password : "+passWord);			

					}

				} catch (FileNotFoundException e) {

					e.printStackTrace();

				} catch (IOException e) {

					e.printStackTrace();
				}


			}
		}catch(IOException e) {

			e.printStackTrace();

		}

		return dataArray;


	}

	//	public static void main(String[] args) {
	//
	//		String filePath = "src//test//resources//testData//Book1.xlsx";
	//
	//		String sheetName = "Login";
	//
	//		ExcelUtil excel = new ExcelUtil(filePath, sheetName);	
	//
	//		excel.readExcelData();
	//
	//
	//	}

}
