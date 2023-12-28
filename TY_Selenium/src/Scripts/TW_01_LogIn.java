package Scripts;
/***
 * @author Shreepad
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TW_01_LogIn {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		//step 1: Launch Browser
		ChromeDriver driver= new ChromeDriver();
		System.out.println("Browser Launched");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait explicitwait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		//step 2: Enter URL
		driver.get("https://twitter.com/?logout=1702353824142");
		System.out.println("URL entered");
		
		//Correct URL page displayed
		String expectedTitle="X. It's what's happening";
		String actualtitle = driver.getTitle();
		if(actualtitle.equals(expectedTitle))
		{
			System.out.println("Correct Login Page Opened");
		}
		else
		{
			System.out.println("Incorrect Login Page opened");
		}
		
		// Step 3: Click on Sign In
		driver.findElement(By.xpath("//span[text()='Sign in']")).click();
		
		
		File absPath=new File("./resources/Demo2.xlsx");

		FileInputStream fis=new FileInputStream(absPath);
		Workbook workbook = WorkbookFactory.create(fis);
		
		
		
		String data1 = workbook.getSheet("Sheet2").getRow(6).getCell(6).getStringCellValue();
		WebElement userNameFeild = driver.findElement(By.xpath("//input[@autocomplete='username']"));
		userNameFeild.clear();
		//Login Pop displayed or not
		if(userNameFeild.isDisplayed())
		{
			System.out.println("Login Pop up displayed");
		}
		else
		{
			System.out.println("Login Pop up not displayed");
		}
		//Step4: Enter Email address
		String userNameValue="shreepaddaundkar3107@gmail.com";
		userNameFeild.sendKeys(userNameValue);
		if(userNameFeild.getAttribute("value").equals(userNameValue))
		{
			System.out.println("Correct Email entered");
		}
		else
		{
			System.out.println("Incorrect Email entered");
		}
		
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		WebElement twtUserName = driver.findElement(By.xpath("//span[text()='Enter your phone number or username']"));
		if(twtUserName.isDisplayed())
		{
			System.out.println("User is directed to page for Enter Phone Number or User Name");
		}
		else
		{
			System.out.println("User is not directed to Enter Phone Number or User Name ");
		}
//		String data2 = workbook.getSheet("Sheet2").getRow(7).getCell(6).getStringCellValue();
//		WebElement pass = driver.findElement(By.xpath("//input[@name='text']"));
//		explicitwait.until(ExpectedConditions.visibilityOf(pass));
//		pass.sendKeys(data2);
//		driver.findElement(By.xpath("//div[@class='css-175oi2r r-sdzlij r-1phboty r-rs99b7 r-lrvibr r-19yznuf r-64el8z r-1dye5f7 r-1loqt21 r-o7ynqc r-6416eg r-1ny4l3l']")).click();
//		String data3 = workbook.getSheet("Sheet2").getRow(8).getCell(6).getStringCellValue();
//		driver.findElement(By.xpath("//input[@autocomplete='current-password']")).sendKeys(data3);
//		driver.findElement(By.xpath("//span[text()='Log in']")).click();
	}

}
