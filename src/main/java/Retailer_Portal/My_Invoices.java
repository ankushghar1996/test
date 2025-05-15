package Retailer_Portal;
 
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.How;
 
	public class My_Invoices {
 
		@FindBy(how=How.XPATH,using="//div[@class='navbar-title d-flex']//img[@data-bs-target='#sidebar']")
		private WebElement Menu ;
		
		@FindBy(how=How.XPATH,using="//div[@class='offcanvas-options pt-2']//span[text()='Product Wise Purchase']")
		private WebElement My_Invoice;
		
		@FindBy(how=How.XPATH,using="//img[contains(@src,'arrow.svg')]")
		private WebElement My_Invoice_Back_Button;
		
 
		public WebElement getProduct_Wise_Purchase() {
			return My_Invoice;
		}
 
		public WebElement getProduct_Wise_Purchase_Back_Button() {
			return My_Invoice_Back_Button;
		}
 
		public WebElement getMenu() {
			return Menu;
		}


		

	}