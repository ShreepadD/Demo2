package DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class workingWithDataProvider {
@DataProvider
public String[] passTestData() throws EncryptedDocumentException, IOException {
	FileInputStream fis = new FileInputStream(new File("./resources/dataProvider.xlsx"));
	Workbook workbook = WorkbookFactory.create(fis);
	int colCount = workbook.getSheet("Sheet1").getRow(0).getPhysicalNumberOfCells()-1;
	String[] data= new String[colCount];
	for(int i=0;i<colCount;i++)
	{
		data[i]=workbook.getSheet("Sheet1").getRow(0).getCell(i+1).toString();
	}
	return data;
}
@Test(dataProvider="passTestData")
public void testingUserNameTextFeild(String testData) {
	ChromeDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/login");
	driver.findElement(By.id("Email")).sendKeys(testData);
}
}
