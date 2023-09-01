package pom;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class MyShopingCartPage {
	@FindBy (xpath = "//ul[@id='cartData']") private List <WebElement> cartProducts;
	@FindBy (xpath = "(//a[@onclick='cart.continueShopping()'])[1]") private WebElement continewShopingbutton;
	@FindBy (xpath = "//a[@class='red_button2']")private List <WebElement> prceedToCheckoutButton;
	@FindBy (xpath = "//input[@maxlength='1']") private List <WebElement> productQuantity;
	@FindBy (xpath = "//ul[@id='cartData']/child::li[@class='head_UPrice']") private List <WebElement> productPrice;
	@FindBy (xpath = "//ul[@id='cartData']/child::li[@class='head_ship']") private List <WebElement> shippingCharge;
	@FindBy (xpath = "//ul[@id='cartData']/child::li[@class='head_Amount']") private List <WebElement> totalOrderAmmount;
	@FindBy (xpath = "(//ul[@id='cartTotal']/descendant::span)[3]")private WebElement GiftVoucherDiscountPrice;
	@FindBy (xpath = "//a[text()='Remove']") private WebElement removeProductButton; 
	@FindBy (xpath = "//input[@id='cvName']")private WebElement voucherCode;
	@FindBy (xpath = "//a[@id='cvApplybtn']")private WebElement applyVoucherButton;

	public MyShopingCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public int getNumberOfProductDisplayedInMyShopingCart() {
		int result=cartProducts.size();
		return result;
	}
	public void clickOnContinewShoping() {
		continewShopingbutton.click();
	}
	public void clickOnProceedToCheckoutButton(int i) {
		prceedToCheckoutButton.get(i).click();
	}
	public void clickOnRemoveProductButton() {
		removeProductButton.click();
	}
	public double getproductUnitPrice(int i, WebDriver driver) {
		
		String uprice=productPrice.get(i).getText();
		String s=uprice.substring(3,6);
		double unitPrice=Double.parseDouble(s);
		System.out.println(unitPrice);
		return unitPrice;
		}
	public double getShippingPriceOfProduct(int i, WebDriver driver){
		String Sprice=shippingCharge.get(i).getText();
		String s=Sprice.substring(3,6);
		double shippingPrice=Double.parseDouble(s);
		return shippingPrice;
		}
	public double getTotalProductAmmount(int i,WebDriver driver){
		String TPprice=totalOrderAmmount.get(i).getText();
		String s=TPprice.substring(3,6);
		double totalPrice=Double.parseDouble(s);
		return totalPrice;
		}
	}
