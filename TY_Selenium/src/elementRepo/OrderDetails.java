package elementRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderDetails extends BasePage{
public OrderDetails(WebDriver driver) {
	super(driver);
}
@FindBy (xpath="//input[@value='Re-order']")
private WebElement reOrder;

}
