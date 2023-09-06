package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductResultPage {
	
	@FindBy (xpath = "//div[@class='grid_Square ']")           private List<WebElement> products;
	@FindBy (xpath = "//span[text()='Quick View']")            private List<WebElement> quickView;
	@FindBy (xpath = "//span[text()='Click here to Buy']")     private WebElement clickToBuy;
	@FindBy (xpath = "//a[@title='Close']")                    private WebElement close;
	@FindBy (xpath = "//a[text()='Change Pincode']")           private WebElement changePincode;
	@FindBy (xpath = "//a[@class='terms_condition']")          private WebElement termsConditions;
	@FindBy (xpath = "//a[text()=' See More Details » ']")     private WebElement seeMoreDetails;
	@FindBy (xpath = "//a[@class='sml-link tooltip']")         private WebElement addToWishList;
	@FindBy (xpath = "//a[@id='showSellers']")                 private WebElement MoreSeller;
	@FindBy (xpath = "//div[@class='item_title']/descendant::a") private static List <WebElement> productName;
	
    public ProductResultPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
    }
    public  void clickOnProduct(int i) {
    	products.get(i).click();
    }

    public int getNumberOfProductDisplayed() {
    	int result=products.size();
		return result;
    }
    
	public void moveToProduct(int i, WebDriver driver) {
		WebElement product = products.get(i);
		Actions action = new Actions(driver);
		action.moveToElement(product);
		action.perform();
	}
	
	public void clickOnQuickViews(int i) {
		quickView.get(i).click();
	}
	public void clickOnBuyProduct() {
		clickToBuy.click();
	}
	
	public String getProductName (int index) {
		WebElement handle = productName.get(index);
		String title = handle.getText();
		return title;																	
	}

	public void clickOnCloseButton() {
		close.click();
	}
	public void clickOnChangePincode() {
		changePincode.click();
	}
	public void clickOnTermsAndConditions() {
		termsConditions.click();
	}
	public void clickToSeeMoreDetails() {
		seeMoreDetails.click();
	}
	public void clickToAddProductIntoWishList() {
		addToWishList.click();
	}
	public void clickToViewMoreSeller() {
		MoreSeller.click();
	}
	
}
