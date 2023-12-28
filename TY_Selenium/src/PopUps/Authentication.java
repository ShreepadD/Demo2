package PopUps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class Authentication {

	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		//System.setProperty(null, null)
		 ChromeDriver driver= new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 driver.get("https://the-internet.herokuapp.com/basic_auth");
		 Thread.sleep(2000);
		 Robot robot= new Robot();
		 robot.keyPress(KeyEvent.VK_S);
		 Thread.sleep(2000);
		 robot.keyPress(KeyEvent.VK_TAB);
		 Thread.sleep(2000);
		 robot.keyPress(KeyEvent.VK_S);
		 Thread.sleep(2000);
		 robot.keyPress(KeyEvent.VK_ENTER);
		 Thread.sleep(2000);
		 robot.keyRelease(KeyEvent.VK_S);
		 //robot.keyRelease(KeyEvent.VK_S);
		 robot.keyRelease(KeyEvent.VK_ENTER);
		 
	}

}
