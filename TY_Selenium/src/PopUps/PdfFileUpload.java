package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PdfFileUpload {

	public static void main(String[] args) 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.filemail.com/share/upload-file");
		WebElement upload = driver.findElement(By.xpath("//input[@type='file']"));
		upload.sendKeys("/Users/admin/Downloads/chromedriver-mac-x64 2");
	}

}
