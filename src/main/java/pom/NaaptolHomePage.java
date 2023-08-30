package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NaaptolHomePage {
	@FindBy (xpath="//a[@id='login-panel-link']")                                private WebElement login;
	@FindBy (xpath="//a[text()='Track Order']")                                  private WebElement trackOrder;
	@FindBy (xpath="//div[@id='cate_head']")                                     private WebElement shoopingCategories;
	@FindBy (xpath="//input[@id='header_search_text']")                          private WebElement searchField;
	@FindBy (xpath="(//a[@href='javascript:autoSuggestion.headerSearch()'])[2]") private WebElement searchButton;
	@FindBy (xpath="(//a[@id='cart-panel-link'])[2]")                            private WebElement cart;
	@FindBy (xpath="(//a[@href='/faces/jsp/becomeASeller/becomASeller.jsp'])[1]")private WebElement becomeSeller;	
	@FindBy (xpath="//ul[@id='mainMenu_UL']//li/a")                              private List<WebElement> categories;

	public NaaptolHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}		
	public void clickOnLogin() {
		login.click();
	}	
	 
	public void clickOnTrackOrder() {
		trackOrder.click();
	}
	public void moveToShoopingCategories(WebDriver driver) {
		Actions obj=new Actions(driver);
		obj.moveToElement(shoopingCategories);
		obj.perform();
	}
    public void checkShoopingCategoryList(int i) {
    	for(i=1;i<categories.size();++i) {
			String name=categories.get(i).getText();
			System.out.println(name);
		}
		
	}
	public void enterProductToSearch(String search) {
		searchField.sendKeys(search);
	}
	public void clickOnSearchButton() {
		searchButton.click();
	}
	public void clearSearchField() {		
		searchField.clear();
	}
	public void clickOnCartButton() {
		cart.click();
	}
	public void clickOnBecomeASeller() {
		becomeSeller.click();
	}	
	public void selectCategories(int i) {
		WebElement value=categories.get(i);
		value.click();	
	}
}
