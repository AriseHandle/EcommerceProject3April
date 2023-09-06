package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductSpecificationPage {
	@FindBy (xpath="//a[@class='sml-link tooltip']") 			 private WebElement wishList;
	@FindBy (xpath = "//span[text()='Click here to Buy']")		 private WebElement clickHereToBuyButton ;
	@FindBy (xpath="//a[@class='terms_condition']")				 private WebElement privacyPolicy;
	@FindBy(xpath="//input[@id='pincodeDeliveryId_0']") 		 private WebElement pinCode;
	@FindBy(xpath="//a[@class='button_1'][1]") 					 private WebElement checkButton;
	
	public ProductSpecificationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnWishList() {
		wishList.click();
	}
	
	public void clickOnClickHereToBuy() {
		clickHereToBuyButton.click();
	}
	
	public void clickOnPrivacyPolicy() {
		privacyPolicy.click();
	}
	
	public void enterPinCode(String a) {
		pinCode.sendKeys(a);
	}
	public void clickOnCheckButton() {
		checkButton.click();
	}
}