package Tasks;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Demo 
{
	public static void main(String[] args) throws IOException 
	{
		//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://currentaffairs.adda247.com/highest-grossing-indian-movies/");
//		Dimension size = driver.manage().window().getSize();
//		int height=size.getHeight();
//		int width= size.getWidth();
//		Point pos = driver.manage().window().getPosition();
//		int X=pos.getX();
//		int Y= pos.getY();
//		File ss = driver.getScreenshotAs(OutputType.FILE);
//		File destfile = new File("./SS/123.png");
//		FileHandler.copy(ss, destfile);
//		WebElement logo = driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']"));
//		File source = logo.getScreenshotAs(OutputType.FILE);
//		File dest= new File("./SS/1.png");
//		FileHandler.copy(source, dest);
		System.out.println("Movie name   "+ "collection");
		for(int i=3;i<=9;i++)
		{
			System.out.println(driver.findElement(By.xpath("//strong[text()='Highest Grossing Indian Movies']/../../../tr["+i+"]/td[2]")).getText());
			System.out.println(driver.findElement(By.xpath("//strong[text()='Highest Grossing Indian Movies']/../../../tr["+i+"]/td[3]]")).getText());
		}
	}
}
