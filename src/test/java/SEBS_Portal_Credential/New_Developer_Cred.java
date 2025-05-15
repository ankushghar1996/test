package SEBS_Portal_Credential;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com_Utility.BaseClass_SEBS_Portal;
import Com_Utility.Liabrary;
import SEBS_Portal.New_Developer_Creation;

public class New_Developer_Cred extends BaseClass_SEBS_Portal{

	
	
	@Test
	public void SECR_ViewProfile() throws Exception {
		
		New_Developer_Creation view = PageFactory.initElements(driver, New_Developer_Creation.class);
	
		
		Liabrary.custom_click(view.getSEBS_Menu(), null);
		Thread.sleep(1000);
	
	
		Liabrary.custom_click(view.getDeveloper_Creation_SubMenu(), null);
		Thread.sleep(1000);
	
	
		Liabrary.custom_click(view.getAdd_Menu(), null);
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(view.getDistributor_Mapped(), null);
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(view.getSelect_Distributor_Mapped(), null);
		Thread.sleep(1000);
		
		
		Liabrary.custom_Sendkeys(view.getEnter_Developer_Name(), excel.getStringdata("SEBS_Devloper", 1, 0), null);
		Thread.sleep(1000);
		
		
		Liabrary.custom_Sendkeys(view.getEnter_Contact_Number(), excel.getNumericdata("SEBS_Devloper", 1, 1), null);
		Thread.sleep(1000);
		
		
		Liabrary.custom_Sendkeys(view.getEnter_Email_Address(), excel.getStringdata("SEBS_Devloper", 1, 2), null);
		Thread.sleep(1000);
		
		
		Liabrary.custom_Sendkeys(view.getEnter_Address_Line_1(), excel.getStringdata("SEBS_Devloper", 1, 3), null);
		Thread.sleep(1000);
		
		
			WebElement scroll = driver.findElement(By.xpath("//label[normalize-space()='Address Line 2']"));
	    	JavascriptExecutor jse= (JavascriptExecutor)driver;
	    	jse.executeScript("arguments[0].scrollIntoView(true);", scroll);
	        Thread.sleep(1000);
		
		
	        Liabrary.custom_click(view.getState_Dropdown(), null);
			Thread.sleep(1000);
			
			
	        Liabrary.custom_click(view.getSelect_State(), null);
			Thread.sleep(1000);
		
			
			Liabrary.custom_click(view.getCity_Dropdown(), null);
			Thread.sleep(1000);
			
			
			Liabrary.custom_click(view.getSelect_City(), null);
			Thread.sleep(1000);
	        
	        
			
		Liabrary.custom_Sendkeys(view.getEnter_Pin_Code(), excel.getNumericdata("SEBS_Devloper", 1, 4), null);
		Thread.sleep(1000);
	
	
		Liabrary.custom_Sendkeys(view.getEnter_GST_Number(), excel.getStringdata("SEBS_Devloper", 1, 5), null);
		Thread.sleep(1000);
		
		
		Liabrary.custom_Sendkeys(view.getEnter_Project_Funnel_lakhs_of_Developer(), excel.getNumericdata("SEBS_Devloper", 1, 6), null);
		Thread.sleep(1000);
		
		
		Liabrary.custom_Sendkeys(view.getSalesFunnelFordeveloper(), excel.getNumericdata("SEBS_Devloper", 1, 7), null);
		Thread.sleep(1000);
		
		
		Liabrary.custom_Sendkeys(view.getEnter_Fosroc_Expected_sales_in_2025(), excel.getNumericdata("SEBS_Devloper", 1, 8), null);
		Thread.sleep(1000);
		
		
		WebElement scroll1 = driver.findElement(By.xpath("//input[@formcontrolname='YTDsales']"));
    	JavascriptExecutor jse1= (JavascriptExecutor)driver;
    	jse1.executeScript("arguments[0].scrollIntoView(true);", scroll1);
        Thread.sleep(1000);
		
		
		Liabrary.custom_Sendkeys(view.getYTDsales(), excel.getNumericdata("SEBS_Devloper", 1, 9), null);
		Thread.sleep(1000);
		
		
		
		Liabrary.custom_click(view.getDropdownMenuButton(), null);
		Thread.sleep(1000);
		
		
		
		Liabrary.custom_click(view.getCheckbox(), null);
		Thread.sleep(1000);
		
		
		
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'Email ID.')]")).sendKeys("abc1234@gmail.com");
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'Contact Number.')]")).sendKeys("3687412222");
		Thread.sleep(3000);
		
		
		Liabrary.custom_click(view.getCANCEL_Button(), null);
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	}
	
}
