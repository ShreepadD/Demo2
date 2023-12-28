package Actions;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo 
{
	public static void main(String[] args) throws IOException 
	{
		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.meesho.com/");
//		WebElement logo = driver.findElement(By.xpath("//div[@class='header-logo-container']"));
//		File source = driver.getScreenshotAs(OutputType.FILE);
//		File destFile= new File("./SS/meesho1.png");
//		org.openqa.selenium.io.FileHandler.copy(source, destFile);
//		File source = logo.getScreenshotAs(OutputType.FILE);
//		File destFile= new File("./SS/logo.png");
//		org.openqa.selenium.io.FileHandler.copy(source, destFile);
//		Dimension size = driver.manage().window().getSize();
//		int X= size.getHeight();
//		int Y=size.getWidth();
//		System.out.println("X is "+X+" "+"Y is "+Y);
//		Point pos = driver.manage().window().getPosition();
//		int X= pos.getX();
//		int Y= pos.getY();
//		System.out.println(X);
//		System.out.println(Y);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://start.atlassian.com/");
	}
}
