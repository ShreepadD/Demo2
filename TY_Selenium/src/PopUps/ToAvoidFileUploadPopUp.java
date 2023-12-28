package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToAvoidFileUploadPopUp {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.naukri.com/registration/createAccount");
		WebElement upload = driver.findElement(By.id("resumeUpload"));
		Actions action= new Actions(driver);
		action.scrollToElement(upload).scrollByAmount(0, 100).perform();
		Thread.sleep(2000);
		upload.sendKeys("/Users/admin/Downloads/chromedriver-mac-x64 2");
	}
	
}
