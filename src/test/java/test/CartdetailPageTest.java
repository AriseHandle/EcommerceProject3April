package test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pojo.Browser;
import pom.CartDetailPage;
import pom.MyShopingCartPage;
import pom.NaaptolHomePage;
import pom.ProductCheckoutPage;
import pom.ProductResultPage;
import pom.ProductSpecificationPage;

public class CartdetailPageTest extends BaseTest {
	
	@BeforeMethod
    public void openBrowser() {
    	driver=Browser.chrome();
	}
	
	
	@Test
	public void verifyCustomerIsAbleToAddProductToCart() throws InterruptedException {
		NaaptolHomePage naaptolHomePage = new NaaptolHomePage(driver);
		naaptolHomePage.enterProductToSearch("Mobile");
		naaptolHomePage.clickOnSearchButton();
		
		ProductResultPage productResultPage = new ProductResultPage(driver);
		productResultPage.moveToProduct(0, driver);
		productResultPage.clickOnQuickViews(0);
		
		ProductSpecificationPage productSpecificationPage = new ProductSpecificationPage(driver);
		Thread.sleep(1000);
		productSpecificationPage.clickOnClickHereToBuy();	
		CartDetailPage cartPage =new CartDetailPage(driver);
		cartPage.waitForCloseToBeDisplayed(driver);
		int numberOfCartItems =cartPage.getNumerOfItemsInCart();
		Assert.assertTrue(numberOfCartItems > 0);	
	}
	@Test (priority = 1)
	public void verifyCustomerIsAbleToClickContinewShopping() throws InterruptedException {
		NaaptolHomePage naaptolHomePage = new NaaptolHomePage(driver);
		naaptolHomePage.enterProductToSearch("Mobile");
		naaptolHomePage.clickOnSearchButton();
		
		ProductResultPage productResultPage = new ProductResultPage(driver);
		productResultPage.moveToProduct(0, driver);
		productResultPage.clickOnQuickViews(0);
		
		ProductSpecificationPage productSpecificationPage = new ProductSpecificationPage(driver);
		Thread.sleep(1000);
		productSpecificationPage.clickOnClickHereToBuy();	
		CartDetailPage cartPage =new CartDetailPage(driver);

		cartPage.waitForCloseToBeDisplayed(driver);
		int numberOfCartItems =cartPage.getNumerOfItemsInCart();
		Assert.assertTrue(numberOfCartItems > 0);
		
		MyShopingCartPage myShopingCartPage=new MyShopingCartPage(driver);
		myShopingCartPage.clickOnContinewShoping();
	
	}
	
	@Test (priority = 2)
	public void verifyIfCutomerIsAbleToRemoveProductFromCart() throws InterruptedException {
		NaaptolHomePage naaptolHomePage = new NaaptolHomePage(driver);
		naaptolHomePage.enterProductToSearch("Mobile");
		naaptolHomePage.clickOnSearchButton();
		
		ProductResultPage productResultPage = new ProductResultPage(driver);
		productResultPage.moveToProduct(0, driver);
		productResultPage.clickOnQuickViews(0);
		
		ProductSpecificationPage productSpecificationPage = new ProductSpecificationPage(driver);
		Thread.sleep(1000);
		productSpecificationPage.clickOnClickHereToBuy();	
		CartDetailPage cartPage =new CartDetailPage(driver);
		cartPage.waitForCloseToBeDisplayed(driver);
		int numberOfCartItems =cartPage.getNumerOfItemsInCart();
		Assert.assertTrue(numberOfCartItems > 0);
		CartDetailPage cartDetailPage=new CartDetailPage(driver);
		cartDetailPage.clickOnRemoveProduct();
	
		int numberOfItemsPostRemove =cartPage.getNumerOfItemsInCart();
	}
	
	@Test (priority = 3)
	public void verifyIfCustomerIsAbletoProceedToCheckout() throws InterruptedException {
		NaaptolHomePage naaptolHomePage = new NaaptolHomePage(driver);
		naaptolHomePage.enterProductToSearch("Mobile");
		naaptolHomePage.clickOnSearchButton();
		
		ProductResultPage productResultPage = new ProductResultPage(driver);
		productResultPage.moveToProduct(0, driver);
		productResultPage.clickOnQuickViews(0);
		
		ProductSpecificationPage productSpecificationPage = new ProductSpecificationPage(driver);
		Thread.sleep(1000);
		productSpecificationPage.clickOnClickHereToBuy();	
		CartDetailPage cartPage =new CartDetailPage(driver);
		cartPage.waitForCloseToBeDisplayed(driver);
		int numberOfCartItems =cartPage.getNumerOfItemsInCart();
		Assert.assertTrue(numberOfCartItems > 0);
		
		MyShopingCartPage myShopingCartPage=new MyShopingCartPage(driver);
		myShopingCartPage.clickOnProceedToCheckoutButton(0);
		
		ProductCheckoutPage checkoutPage=new ProductCheckoutPage(driver);
		checkoutPage.enterRegisterMobileNumber("7262811431");
		
		checkoutPage.clickOnSubmitButton();
		Thread.sleep(20000);
		checkoutPage.clickOnSubmitButton02();
		
	}
	
	
}

