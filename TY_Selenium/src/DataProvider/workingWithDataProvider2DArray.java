package DataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class workingWithDataProvider2DArray {
@DataProvider
public String[][] loginDetails() {
	String[][] details= {
			{"Shreepad@123","Asdfghjkl@123"},
			{"joey@123","Asdfghjkl@123"}
		};
	return details;
}
@Test (dataProvider = "loginDetails")
public void demoWebShopLogin(String[] arr) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/login");
	driver.findElement(By.id("Email")).sendKeys(arr[0]);
	driver.findElement(By.id("Password")).sendKeys(arr[1]);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
}
}
