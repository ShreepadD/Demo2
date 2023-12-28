package elementRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
//public BasePage(WebDriver driver) {
//	PageFactory.initElements(driver, this);
//	}
@FindBy(xpath="//span[text()='Shopping cart']")
private WebElement shoppingCart;

@FindBy(partialLinkText = "BOOKS")
private WebElement books;

@FindBy(partialLinkText = "COMPUTERS")
private WebElement computers;

@FindBy(partialLinkText = "ELECTRONICS")
private WebElement electronics;

@FindBy(partialLinkText = "APPAREL & SHOES")
private WebElement apparelAndShoes;

@FindBy(partialLinkText = "DIGITAL DOWNLOADS")
private WebElement didgitalDownloads;

@FindBy(partialLinkText = "JEWELRY")
private WebElement jewelry;

@FindBy(partialLinkText = "GIFT CARDS")
private WebElement giftCards;

@FindBy(partialLinkText = "Compare products list")
private WebElement compareProductsList;

@FindBy(partialLinkText = "Recently viewed products")
private WebElement recentlyViewedProducts;

@FindBy(linkText = "Orders")
private WebElement orders;

@FindBy(xpath="//input[@class='button-1 add-to-cart-button']")
private WebElement addToCartButton;

@FindBy(xpath="//input[@value='Add to compare list']")
private WebElement addToCompareList;

@FindBy(xpath="//input[@class='qty-input valid']")
private WebElement quantityFeildBox;

@FindBy(xpath="//strong[.='Recently viewed products']/../..//li[1]")
private WebElement recentlyViewedItem;

public WebElement getShoppingCart() {
	return shoppingCart;
}

public WebElement getBooks() {
	return books;
}

public WebElement getComputers() {
	return computers;
}

public WebElement getElectronics() {
	return electronics;
}

public WebElement getApparelAndShoes() {
	return apparelAndShoes;
}

public WebElement getDidgitalDownloads() {
	return didgitalDownloads;
}

public WebElement getJewelry() {
	return jewelry;
}

public WebElement getGiftCards() {
	return giftCards;
}

public WebElement getCompareProductsList() {
	return compareProductsList;
}

public WebElement getRecentlyViewedProducts() {
	return recentlyViewedProducts;
}

public WebElement getOrders() {
	return orders;
}

public WebElement getAddToCartButton() {
	return addToCartButton;
}

public WebElement getAddToCompareList() {
	return addToCompareList;
}

public WebElement getQuantityFeildBox() {
	return quantityFeildBox;
}

public WebElement getRecentlyViewedItem() {
	return recentlyViewedItem;
}
}

