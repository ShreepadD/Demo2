package DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class loginUsingXlsx {
@DataProvider
public String[][] login() throws IOException {
	FileInputStream fis= new FileInputStream(new File("./resources/New.xlsx"));
	Workbook workbook= WorkbookFactory.create(fis);
	Sheet sheet = workbook.getSheet("Sheet2");
	int totalNoOfUsers = sheet.getPhysicalNumberOfRows();
	int totalNoOfUserInfo = sheet.getRow(0).getPhysicalNumberOfCells();
	String[][] detailsArr= new String[totalNoOfUsers][totalNoOfUserInfo];
	for(int i=0;i<totalNoOfUsers;i++) {
		for(int j=0;j<totalNoOfUserInfo;j++) {
			detailsArr[i][j]=sheet.getRow(i).getCell(j).toString(); 
		}
	}
	return detailsArr;
}
@Test (dataProvider = "login")
public void demoWebShopLogin(String[] arr) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/login");
	driver.findElement(By.id("Email")).sendKeys(arr[0]);
	driver.findElement(By.id("Password")).sendKeys(arr[1]);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
}
}
