package com.blazepages;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.baseblaze.TestBase;

public class ProductStore extends TestBase{
	
  public ProductStore() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

  @FindBy(xpath="//a[@onclick=\"byCat('notebook')\"]")
	WebElement laptop;
  
  @FindBy(xpath="(//img[@src=\"imgs/sony_vaio_5.jpg\"])[1]")
	WebElement Sonyi5;
  
  @FindBy(xpath="//a[@onclick=\"addToCart(8)\"]")
	WebElement AddtoCart;
  
  @FindBy(xpath ="//*[@id=\"nava\"]")
	WebElement Store;
  
  @FindBy(xpath ="(//img[@class=\"card-img-top img-fluid\"])[4]")
 	WebElement Delli78gb;
  
  @FindBy(xpath ="//a[@onclick=\"addToCart(12)\"]")
	WebElement AddtoCart2;
  
  @FindBy(xpath ="//*[@id=\"cartur\"]")
	WebElement Cart;
  
  @FindBy(xpath ="(//*[contains(text(),'Delete')])[2]")
	WebElement Delteitem;
  
  @FindBy(xpath ="//*[@id=\"totalp\"]")
 	WebElement Count;
  
  @FindBy(xpath ="//*[contains(@class, \"btn btn-success\")]")
	WebElement Placeorder;
  
  @FindBy(xpath ="(//*[contains(@class, \"form-control\")])[14]")
	WebElement name;
  
  @FindBy(xpath ="//*[@id=\"country\"]")
	WebElement Country;
  
  @FindBy(xpath ="//*[@id=\"city\"]")
	WebElement City;
  
  @FindBy(xpath ="//*[@id=\"card\"]")
 	WebElement Creditcard;
  
  @FindBy(xpath ="//*[@id=\"month\"]")
	WebElement Month;
  
  @FindBy(xpath ="//*[@id=\"year\"]")
 	WebElement Year;
  
  @FindBy(xpath ="(//*[contains(@class, \"btn btn-primary\")])[3]")
	WebElement Purchase;

  @FindBy(xpath ="(//*[contains(@tabIndex,\"1\")])[18]")
	WebElement OK;
  
  public  void product () throws InterruptedException {
	  
	  laptop.click();
	  
	  Thread.sleep(10000);
	 
	  Sonyi5.click();
	  
	  AddtoCart.click();
	  
	  Thread.sleep(10000);
		 
	  Alert alert = driver.switchTo().alert();  
	  alert.accept();	
	  
	  Store.click();
	  laptop.click();
	  
	  Thread.sleep(10000);
	  
	  Delli78gb.click();
	  
	  AddtoCart2.click();
	  Thread.sleep(10000);
		 
	  Alert alert1 = driver.switchTo().alert();  
	  alert1.accept();	
	  
	  Cart.click();
	  
	 
	  WebDriverWait wait = new WebDriverWait(driver,30);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[contains(text(),'Delete')])[2]")));
	 
	  Delteitem.click();
	  
	  Thread.sleep(10000);
	  
	  String ele = Count.getText();
	  System.out.println("Total price is "+ ele);
	  
	  int Actualprice = 790;
	  Assert.assertEquals(ele, Actualprice);
	  
	  
	  Placeorder.click();
	  
	  Thread.sleep(10000);
	  
	  name.sendKeys("Sunny Chawla");
	  Country.sendKeys("India");
	  City.sendKeys("New Delhi");
	  Creditcard.sendKeys("745789654123");
	  Month.sendKeys("January");
	  Year.sendKeys("1989");
	  
	 Thread.sleep(10000);
	  
	
	  Purchase.click();
	  
	  OK.click(); 
  }


}


     