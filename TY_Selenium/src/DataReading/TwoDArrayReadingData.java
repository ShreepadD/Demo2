package DataReading;
/***
 * @author admin
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TwoDArrayReadingData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		//Step1 create FIS
		File absPath=new File("./resources/Demo4.xlsx");
		//Respective File Object creation
		FileInputStream fis=new FileInputStream(absPath); 
		Workbook workbook = WorkbookFactory.create(fis);
		//read methods
		int rowCount = workbook.getSheet("Sheet3").getPhysicalNumberOfRows();
		int cellCount = workbook.getSheet("Sheet3").getRow(0).getPhysicalNumberOfCells();
		String[][] arr= new String[rowCount][cellCount];
		for(int i=0;i<rowCount;i++)
		{
			for(int j=0;j<cellCount;j++)
			{
				arr[i][j]=workbook.getSheet("Sheet3").getRow(i).getCell(j).toString();
			}
		}
		for(int i=0;i<rowCount;i++)
		{
			for(int j=0;j<cellCount;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
