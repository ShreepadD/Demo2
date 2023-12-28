package Actions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Atlassin 
{
	public static void main(String[] args)
	{
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://trello.com/login");
		driver.findElement(By.id("user")).sendKeys("shreepaddaundkar3107@gmail.com");
		driver.findElement(By.id("login")).click();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//input[@placeholder='Enter password']")).sendKeys("Qwertyuiop@123");
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		WebElement project = driver.findElement(By.xpath("(//span[@class='board-tile-fade'])[2]"));
		Actions actions= new Actions(driver);
		actions.moveToElement(project).click().perform();
		WebDriverWait explicitwait = new WebDriverWait(driver, Duration.ofSeconds(15));
//		WebElement board = driver.findElement(By.xpath("(//div[@data-testid='trello-card'])[1]"));
//		actions.moveToElement(board).contextClick().perform();
//		WebElement newdata = driver.findElement(By.xpath("//div[@class='ozCejPnL4yzsJ4']"));
//		System.out.println(newdata.getText());
		//driver.navigate().refresh();
		
		WebElement source = driver.findElement(By.linkText("a"));
		explicitwait.until(ExpectedConditions.visibilityOf(source));
		WebElement target = driver.findElement(By.xpath("//h2[text()='3']/../../..//button[contains(@class,'O9vivwyDxMqo')]"));
		actions.dragAndDrop(source, target).perform();
	}
}
