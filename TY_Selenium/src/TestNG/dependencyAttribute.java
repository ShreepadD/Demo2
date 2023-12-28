package TestNG;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class dependencyAttribute {
	@Test
	public void a() {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://policelifestyle.com/");
		Reporter.log("a", true);
		driver.quit();
	}

	@Test(dependsOnMethods = { "c", "a" })
	public void b() {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.rado.com/");
		Reporter.log("b", true);
		driver.quit();
	}

	@Test
	public void c() {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.ethoswatches.com/");
		Reporter.log("c", true);
		driver.quit();
	}

	@Test(dependsOnMethods = "a")
	public void d() {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.fossilgroup.com/");
		Reporter.log("d", true);
		driver.quit();
	}

}
