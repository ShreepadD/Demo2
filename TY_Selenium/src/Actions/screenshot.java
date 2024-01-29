package Actions;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class screenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
//		WebElement element = driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']"));
//		File ss = element.getScreenshotAs(OutputType.FILE);
//		File dest= new File("./SS/element.png");
//		FileHandler.copy(ss, dest);
//		driver.findElement(By.linkText("Create new account")).click();
//		WebElement dropdownElement = driver.findElement(By.id("day"));
//		Select dropdown= new Select(dropdownElement);
//		dropdown.selectByVisibleText("29");
//		Actions actions= new Actions(driver);
//		WebElement search = driver.findElement(By.id("small-searchterms"));
//		actions.click(search).sendKeys("books").sendKeys(Keys.ENTER).perform();
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
	}

}
