package test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.NaaptolHomePage;

public class SearchProductTest extends BaseTest {
	@BeforeMethod
    public void openBrowser() {
    	driver=Browser.chrome();
    }
	@Test
	public void verifySearchProduct() {
		NaaptolHomePage searchproduct=new NaaptolHomePage(driver);
		searchproduct.enterProductToSearch("mobile");
		searchproduct.clickOnSearchButton();
		String title=driver.getTitle();
		Assert.assertTrue(title.contains("mobile"));
	}
}
