package TestNG;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HelperClass1 {
	@Test(priority = 2)
	public void laliga() {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.laliga.com/en-GB");
		driver.quit();
	}

	@Test(priority = 1, enabled = false)
	public void pl() {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.espn.in/football/table");
		driver.quit();
	}

	@Test(priority = 3)
	public void isl() throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.indiansuperleague.com/");
		driver.quit();
	}
}
