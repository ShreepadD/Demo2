package elementRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeSuite;

public class base_Script extends BasePage{
public base_Script(WebDriver driver) {
		super(driver);
	}
static	ChromeDriver driver;
@BeforeSuite
public void launchBrowser() {
	driver= new ChromeDriver();
	Reporter.log("Browser Launched", true);

	driver.get("https://demowebshop.tricentis.com/login");
	driver.findElement(By.id("Email")).sendKeys("shreepaddaundkar3107@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("Asdfghjkl@123");
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
}
}
