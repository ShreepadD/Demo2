package dummy;

import org.openqa.selenium.chrome.ChromeDriver;

public class demo 
{
public static void main(String[] args) {
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.get("//strong[.='Recently viewed products']");
}
}
//strong[.='Recently viewed products']/../..//li[1]