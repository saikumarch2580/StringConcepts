package Selenium.TestOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PracticeOne extends BaseClass{
	
	WebDriver driver;
	@Test
	public void login() throws Exception {
		
		 driver = new ChromeDriver();
		 driver.get("https://app.autorox.co:9443/axuat/");
		 driver.manage().window().maximize();
		 login(driver);
		 ClickMenu(driver);		
		 CompareTitle(driver, "Direct Inward - Autorox");
		 CheckboxCheckandUncheck(driver); 
		 VendorDetailsEntry(driver);
		 EnterBillNo(driver);
		 SelectCalender(driver);
		 excelinward(driver);
		 partNosEnter(driver);
		 Thread.sleep(2000); 
		 moverightside(driver); 
		 SellingpriceAdd(driver); 
		 clicksubmittButton(driver);
		 Thread.sleep(2000);
		 checkThePaymentsTabIsDisplayedorNot(driver); 
		 CheckStockDetails(driver);
		 NavigateToSellProducts(driver);
		 sellProductsButtonclick(driver);
		 Thread.sleep(2000);
		 
		 
		  
		 
	}

} 
	 