package Assessment;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoDaddy {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver= new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.godaddy.com/");
		Thread.sleep(2000);
		Dimension size = driver.manage().window().getSize();
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
		Dimension newSize= new Dimension(765,1300);
		driver.manage().window().setSize(newSize);
	}

}
