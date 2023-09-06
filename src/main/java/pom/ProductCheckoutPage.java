package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductCheckoutPage {
	@FindBy (xpath = "//input[@id='gc-registration-basic-panel-mobile']") 	private WebElement registerMobileNo;
	@FindBy (xpath = "//input[@id='gc-registration-basic-panel-submit']") 	private WebElement submitButton;
	@FindBy (xpath = "//input[@id='gc-registration-otp-panel-otp']") 		private WebElement OTP;
	@FindBy (xpath = "(//a[text()='change?'])[2]") 							private WebElement changeMobileNo;
	@FindBy (xpath = "(//a[text()='resend?'])[2]") 							private WebElement resendOTP;
	@FindBy (xpath = "//input[@id='gc-registration-otp-panel-submit']") 	private WebElement submitButton02;
	
	public ProductCheckoutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterRegisterMobileNumber(String mob) {
		registerMobileNo.sendKeys(mob);
	}
	
	public void clickOnChangeMobileNumber(String mob) {
		registerMobileNo.sendKeys(mob);
	}
	
	public void clickOnSubmitButton() {
		submitButton.click();
	}
	
	public void clickOnSubmitButton02() {
		submitButton02.click();
	}
	
	public void clickOnResendOTPbutton() {
		resendOTP.click();
	}
}
