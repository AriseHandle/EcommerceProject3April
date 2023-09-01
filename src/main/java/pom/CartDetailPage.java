package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartDetailPage {
	
	
	@FindBy (xpath = "//a[@class='red_button2']")                                 private WebElement proceedToCheckout;
	@FindBy (xpath = "//a[@class='link_Continue']")                               private WebElement continueShopping;
	@FindBy (xpath = "//a[text()='Remove']")                                      private WebElement removeProduct;
	@FindBy (xpath = "//input[@class='input_Special_2']")                         private WebElement quantity;
	@FindBy (xpath = "//input[@placeholder='Enter your gift voucher code']")      private WebElement giftVoucher;
	@FindBy (xpath = "//a[@id='cvApplybtn']")                                     private WebElement applygiftVoucher;
	@FindBy (xpath = "//input[@id='earnPointAcctNo']")                            private WebElement zillonCard;
	@FindBy (xpath = "//a[@id='earnPointApplybtn']")                              private WebElement applyZillonCard;
	
	
	public CartDetailPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
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
	

}
