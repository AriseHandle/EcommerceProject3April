package test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.NaaptolHomePage;

public class ShoppingCategoriesTest extends BaseTest {
	@BeforeMethod
    public void openBrowser() {
    	driver=Browser.chrome();
    }
	@Test
	public void moveToCategory() {
		NaaptolHomePage naaptolHomePage=new NaaptolHomePage(driver);
		String homePageTitle=driver.getTitle();
		naaptolHomePage.moveToShoppingCategories(driver);			
		naaptolHomePage.selectCategories(2);	
		String newPageTitle=driver.getTitle();
		Assert.assertNotEquals(homePageTitle,newPageTitle);
	}
}
