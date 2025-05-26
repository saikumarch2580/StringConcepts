package Selenium.TestOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PracticeOne extends BaseClass{
	

 

	 WebDriver driver;
	 
	
	@Test(priority =1)
	public void login() throws Exception {
		
		 driver = new ChromeDriver();
		 driver.get("https://app.autorox.co:9443/axuat/");
		 //driver.get("https://app.autorox.co");
		 driver.manage().window().maximize();
		 login(driver);
		 ClickOnMenuButton(driver);
		 OpenInward(driver);		
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
		 selectSellProductParts(driver);
		 Click_NextButton(driver);
		 EnterSellProductsCustomerDetails(driver);
		 TheFinalNextButton(driver);
		 CheckTheConfirmationpopupIsdisplayingOrNot(driver);
		 CreateInvoiceButtonIsDisplayingOrNot(driver);
		 CreateInvoiceButton(driver);
	 
	}
	@Test(priority =2)
	public void CancelInvoiceVisible() {
		
		CancelInvoiceVisableOrNot(driver);
	}

	@Test(priority =3, dependsOnMethods= {"CancelInvoiceVisible"})
	public void inwardCheckAfterCreatingTheInvoice() throws Exception {
		
		checkThePartsareEditableAfterInvoice(driver);
		inwardCheckAfterCreatingTheInvoice(driver);
		
		
	}
	
}  
		 
	


	 