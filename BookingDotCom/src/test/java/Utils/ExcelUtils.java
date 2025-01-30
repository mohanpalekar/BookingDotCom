package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	public static void main(String[] args) {

		String filePath = "src//test//resources//testData//Book1.xlsx";

		File file = new File(filePath);

		if(file.exists()) {

			String sheetname = "Login";

			try {

				FileInputStream excelFile = new FileInputStream(file);

				XSSFWorkbook workbook = new XSSFWorkbook(excelFile);

				XSSFSheet workSheet = workbook.getSheet(sheetname);
				
				int lastRowIndex = workSheet.getLastRowNum();

				System.out.println(lastRowIndex);
				
				//System.out.println(workSheet.getRow(1).getCell(3).getNumericCellValue());
				
				for(int row=1; row<=lastRowIndex; row++) {
					
					String userName = workSheet.getRow(row).getCell(0).getStringCellValue();
					
					String passWord = workSheet.getRow(row).getCell(1).getStringCellValue();
					
					System.out.println("Username : "+userName+" , Password : "+passWord);			
					
				}

			} catch (FileNotFoundException e) {

				e.printStackTrace();
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}


		}



	}

}
