package SeleniumBasics;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshot 
{
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("Webdriver.chrome.driver", "/Driver/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.meesho.com/");
		//File source=driver.findElement(By.xpath("//a[text()='Women']")).getScreenshotAs(OutputType.FILE);
		//File destFile = new File("./SS/women.jpg");
		
		File source = driver.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./SS/meesho.jpg");
		FileHandler.copy(source, destFile);
	}
}
