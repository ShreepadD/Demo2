package PopUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LicAlertAndConfirmation 
{
	public static void main(String[] args) 
	{
		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://licindia.in/");
		driver.findElement(By.xpath("//button[text()='Close']")).click();
		driver.findElement(By.partialLinkText("Customer Portal")).click();
		Alert popup = driver.switchTo().alert();
		String msg = popup.getText();
		System.out.println(msg);
		popup.accept();
	}
}
