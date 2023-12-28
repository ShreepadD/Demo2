package Tasks;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Rediff
{
	public static void main(String[] args) throws IOException  
	{
		//System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		SafariDriver driver= new SafariDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.rediff.com/");
		driver.findElement(By.xpath("//a[@class='signin']")).click();
		driver.findElement(By.xpath("//input[@name='login']")).sendKeys("sumanthElfBatch@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Testing@123");
		driver.findElement(By.xpath("//input[@class='signinbtn']")).click();
		driver.findElement(By.xpath("//li[@title='Compose a new mail']")).click();
		driver.findElement(By.xpath("//input[@class='rd_inp_to as-input']")).sendKeys("sumanthElfBatch@rediffmail.com");
		driver.findElement(By.xpath("//input[@class='rd_inp_sub rd_subject_datacmp2']")).sendKeys("Demo");
		WebElement text = driver.findElement(By.xpath("//iframe[@title='Rich Text Editor, rdMailEditorcmp2']"));
		driver.switchTo().frame(text);
		driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")).sendKeys("YOLO");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("(//a[contains(text(),'Send')])[2]")).click();
		WebElement notification = driver.findElement(By.xpath("//div[text()='Your mail has been sent']]"));
		File source = notification.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./SS/demo.jpg");
		org.openqa.selenium.io.FileHandler.copy(source, destFile);
			
		
		
		

		
		
	}
}
