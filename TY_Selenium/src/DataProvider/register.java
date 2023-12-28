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

public class register {
@DataProvider
public String[][] userDetails() throws IOException {
	FileInputStream fis= new FileInputStream(new File("./resources/friends.xlsx"));
	Workbook workbook= WorkbookFactory.create(fis);
	Sheet sheet = workbook.getSheet("Sheet3");
	int totalNoOfUser = sheet.getPhysicalNumberOfRows();
	int totalUserData = sheet.getRow(0).getPhysicalNumberOfCells();
	String[][] registerDetails= new String[totalNoOfUser][totalUserData];
	for(int i=0;i<totalNoOfUser;i++)
	{
		for(int j=0;j<totalUserData;j++)
		{
			registerDetails[i][j]= sheet.getRow(i).getCell(j).toString();
		}
	}
	return registerDetails;
}
@Test (dataProvider = "userDetails")
public void register(String[] arr) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/register");
	driver.findElement(By.id("gender-"+arr[0].toLowerCase()+"")).click();
	driver.findElement(By.id("FirstName")).sendKeys(arr[1]);
	driver.findElement(By.id("LastName")).sendKeys(arr[2]);
	driver.findElement(By.id("Email")).sendKeys(arr[3]);
	driver.findElement(By.id("Password")).sendKeys(arr[4]);
	driver.findElement(By.id("ConfirmPassword")).sendKeys(arr[5]);
	Thread.sleep(2000);
	driver.findElement(By.id("register-button")).click();
	Thread.sleep(2000);
	driver.quit();
}
}
