package DataReading;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataReading {

	public static void main(String[] args) throws IOException {
//		//create File type object to get the absolute path for the file
//		File absPath= new File("./resources/Demo4.xlsx");
//		//create FileInputStream object using absolute path
//		FileInputStream fis= new FileInputStream(absPath);
//		//creating a workbook factory object using fis ref
//		Workbook workbook = WorkbookFactory.create(fis);
//		System.out.println(workbook.getSheet("Sheet3").getRow(3).getCell(0));
		//create File type object to get absolute path for a file
		File abspth= new File("./resources/Demo4.xlsx");
		//create Fis object using file ref
		FileInputStream fis= new FileInputStream(abspth);
		//create workbook factory object using fis
		Workbook workbook= WorkbookFactory.create(fis);
		//read data method
		
		int row=workbook.getSheet("Sheet3").getPhysicalNumberOfRows();

		int col=workbook.getSheet("Sheet3").getRow(0).getPhysicalNumberOfCells();
		String arr[][]= new String[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=workbook.getSheet("Sheet3").getRow(i).getCell(j).toString();
			}
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
