package Selenium.TestOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class PracticeOne extends BaseClass{

	 WebDriver driver;
	
	@Test(priority =1, groups= {"Sellproducts"})
	public void login() throws Exception {
		
		 
		/* ChromeOptions options = new ChromeOptions();
		 options.addArguments("--incognito");
		 driver = new ChromeDriver(options);  */
	     driver = new ChromeDriver();
		 driver.get("https://app.autorox.co:9443/axuat/");
		// driver.get("https://app.autorox.co/");
		 driver.manage().window().maximize();
		 login(driver);
		 
	} 
    @Test(priority =2, dependsOnMethods= {"login"})	
	public void EnterPartsInTheInward() throws Exception {

		 ClickOnMenuButton(driver); 
		 OpenInward(driver);		
		 CompareTitle(driver, "Direct Inward - Autorox");
		 CheckboxCheckandUncheck(driver); 
		 VendorDetailsEntry(driver);
		 EnterBillNo(driver);
		 SelectCalender(driver); 
		 excelinward(driver, "SinglePart");
		 partNosEnter(driver, "SinglePart"); 
		 Thread.sleep(2000); 
		 moverightside(driver); 
		 SellingpriceAdd(driver, "SinglePart"); 
		 clicksubmittButton(driver);
		 Thread.sleep(2000);
		 checkThePaymentsTabIsDisplayedorNot(driver); 
		 CheckStockDetails(driver, "SinglePart"); 
		 
	}
	@Test(priority =3, groups= {"Sellproducts"})
	public void ActionsInSellProducts() throws Exception {
     	 NavigateToSellProducts(driver); 
		 sellProductsButtonclick(driver);
		 Thread.sleep(2000); 
		 selectSellProductParts(driver, "SinglePart");
		 Click_NextButton(driver);
		 EnterSellProductsCustomerDetails(driver);
		 TheFinalNextButton(driver);
		 CheckTheConfirmationpopupIsdisplayingOrNot(driver);
		 CreateInvoiceButtonIsDisplayingOrNot(driver);
		 CreateInvoiceButton(driver);
	 
	}
	
	@Test(priority =4, groups= {"Sellproducts"})
	public void CancelInvoiceVisible() {
		
		CancelInvoiceVisableOrNot(driver);
	}
    
	
	@Test(priority =5, dependsOnMethods= {"CancelInvoiceVisible"}, groups= {"Sellproducts"})
	public void inwardCheckAfterCreatingTheInvoice() throws Exception {
		
		checkThePartsareEditableAfterInvoice(driver);
		inwardCheckAfterCreatingTheInvoice(driver); 
		
		
	}
	@Test(priority=6, dependsOnMethods= {"login"})
	public void IssueTheCreditNote() throws Exception {
		IssueCreditNote(driver);
		EnterCreditNoteNumber(driver);
		SelectPartsInCreditNote(driver, "SinglePart");
		creditNoteIssueButton(driver);
		NavigateToInwardScreen(driver);
		CheckStockDetails(driver, "SinglePart");  
		
	}
	    //The priority 7 need to run individually. It is not included with all the testcases. Click on run button to check the below test. 
	    @Test(priority=7, dependsOnMethods = {"login", "EnterPartsInTheInward", "ActionsInSellProducts", "CancelInvoiceVisible"})
	    public void InvoiceCancel() throws Exception {
	    	
	    	CancelInvoiceButtonClick(driver);
	    	CheckAfterCancelingTheInvoicePopupDisplayingOrNot(driver);
	    	checkThePartsareEditableAfterInvoice(driver);
	    	Thread.sleep(2000);
	    	refresh(driver);
	    	CheckAfterRemovingTheParts(driver);
	    	inwardCheckAfterCreatingTheInvoice(driver);
	    	Thread.sleep(2000); 
 
	    }
		
	//Direct credit note this is not recommended. 

	@Test(priority=8, dependsOnMethods= {"login"})
	public void OnlyCreditNote() throws Exception  { 
		NavigateToSellProducts(driver);
		 Thread.sleep(2000); 
		 CheckTheInvoiceStatusJobCardAndPickItInSellProductsDashBoard(driver);
		 NavigateToTempCreditNote(driver);
		
		
	}
    
   
	
}  
		 
	


	 