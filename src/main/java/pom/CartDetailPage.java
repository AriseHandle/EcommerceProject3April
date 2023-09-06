package pom;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartDetailPage {
	
	
	@FindBy (xpath = "//a[@class='red_button2']")                                 private WebElement proceedToCheckout;
	@FindBy (xpath = "//a[@class='link_Continue']")                               private WebElement continueShopping;
	@FindBy (xpath = "//a[text()='Remove']")                                      private WebElement removeProduct;
	@FindBy (xpath = "//input[@class='input_Special_2']")                         private WebElement quantity;
	@FindBy (xpath = "//input[@placeholder='Enter your gift voucher code']")      private WebElement giftVoucher;
	@FindBy (xpath = "//a[@id='cvApplybtn']")                                     private WebElement applygiftVoucher;
	@FindBy (xpath = "//input[@id='earnPointAcctNo']")                            private WebElement zillonCard;
	@FindBy (xpath = "//a[@id='earnPointApplybtn']")                              private WebElement applyZillonCard;
	@FindBy(xpath="//ul[@id='cartData']")										  private List<WebElement> cartItems;
	@FindBy(xpath ="//a[@title='Close']")										  private WebElement close;
	@FindBy(xpath="(//div//label)[3]") 											  private WebElement totalAmount;
	@FindBy(xpath="//a[text()='Remove']")										  private List<WebElement> remove;

	
	public CartDetailPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public int getNumerOfItemsInCart() {
	    return	cartItems.size();	
	}
	
    public void clickOnProceedToCheckout() {
    	proceedToCheckout.click();
		
	}
	public void clickOnContinueShopping() {
		continueShopping.click();
	}
	
	public void clickOnRemoveProduct() {
		removeProduct.click();
	}
	
	public void enterGiftVoucherCode(String voucher) {
		giftVoucher.sendKeys(voucher);	
	}
	
	public void clickToApplyGiftVoucher() {
		applygiftVoucher.click();	
	}
	
	public void enterZillonCardNumber(String number) {
		zillonCard.sendKeys(number);
	}
	
	public void clickToApplyZillonCard() {
		applyZillonCard.click();
	}
	
	public void waitForRemoveToBeDisplayed(WebDriver driver) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.visibilityOfAllElements(remove));
	}

	public void waitForCloseToBeDisplayed(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.visibilityOf(close));
	}
	public double getTotalCartAmount() {
	String price = totalAmount.getText();
	return Double.parseDouble(price.substring(3));
	}
}


