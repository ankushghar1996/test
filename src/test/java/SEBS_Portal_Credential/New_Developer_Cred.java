package SEBS_Portal_Credential;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com_Utility.BaseClass_SEBS_Portal;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import SEBS_Portal.New_Developer_Creation;

public class New_Developer_Cred extends BaseClass_SEBS_Portal{
	
	@Test(priority=0)
	public void SECR_ViewProfile() throws Exception { 
		
		New_Developer_Creation view = PageFactory.initElements(driver, New_Developer_Creation.class);
	
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_01", "Click SEBS Menu", () ->{
		Liabrary.custom_click(view.getSEBS_Menu(), "Click SEBS Menu");});
		Thread.sleep(1000);
	
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_02", "Click Developer Creation SubMenu", () ->{
		Liabrary.custom_click(view.getDeveloper_Creation_SubMenu(), "Click Developer Creation SubMenu"); });
		Thread.sleep(1000);
	
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Credr_TC_03", "Click Developer Add Menu", () ->{
		Liabrary.custom_click(view.getAdd_Menu(), "Click Developer Add Menu"); });
		Thread.sleep(1000);
		
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_04", "Click Distributor Mapped", () ->{
		Liabrary.custom_click(view.getDistributor_Mapped(), "Click Distributor Mapped");});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_05", "select Distributor Mapped", () ->{
		Liabrary.custom_click(view.getSelect_Distributor_Mapped(), "select Distributor Mapped");});
		Thread.sleep(1000);
		
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_TC_06", "Click Distributor Name", () ->{
			Liabrary.custom_Sendkeys(view.getEnter_Developer_Name(), excel.getStringdata("SEBS_Devloper", 2, 0), null); });
			Thread.sleep(1000);
		
			ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_07", "Click Distributor Mapped", () ->{
		driver.findElement(By.xpath("//ng-select[@bindvalue='SalesmanId']//input[@type='text']")).click();
			});
		Thread.sleep(1000);
		
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_08", "select Distributor Mapped", () ->{
		driver.findElement(By.xpath("//span[@class='ng-option-label']")).click();
		});
		Thread.sleep(1000);
		
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_09", "Click Distributor Mapped", () ->{
		driver.findElement(By.xpath("//ng-select[@bindvalue='RouteId']//input[@type='text']")).click();
		});
		Thread.sleep(1000);
		
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_10", "select Distributor Mapped", () ->{
		driver.findElement(By.xpath("//span[normalize-space()='Navle road']")).click();
		});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_11", "Enter contact Number", () ->{
		Liabrary.custom_Sendkeys(view.getEnter_Contact_Number(), excel.getNumericdata("SEBS_Devloper", 1, 1), null);});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_12", "Enter Email Address", () ->{
		Liabrary.custom_Sendkeys(view.getEnter_Email_Address(), excel.getStringdata("SEBS_Devloper", 1, 2), null);});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_13", "Enter Email Address", () ->{
		Liabrary.custom_Sendkeys(view.getEnter_Address_Line_1(), excel.getStringdata("SEBS_Devloper", 1, 3), null); });
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_14", "Scroll in to Address Line", () ->{
			WebElement scroll = driver.findElement(By.xpath("//label[normalize-space()='Address Line 2']"));
	    	JavascriptExecutor jse= (JavascriptExecutor)driver;
	    	jse.executeScript("arguments[0].scrollIntoView(true);", scroll); });
	        Thread.sleep(1000);
		
	    ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_15", "Click On State Dropdown", () ->{
	        Liabrary.custom_click(view.getState_Dropdown(), null); });
			Thread.sleep(1000);
			
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_16", "Select State Dropdown", () ->{	
	        Liabrary.custom_click(view.getSelect_State(), null); });
			Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_17", "Select City Dropdown", () ->{		
			Liabrary.custom_click(view.getCity_Dropdown(), null); });
			Thread.sleep(1000);
			
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_18", "Select City Dropdown", () ->{	
		Liabrary.custom_click(view.getSelect_City(), null); });
		Thread.sleep(1000);
	        
	        
	   ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_19", "Enter PIN Code", () ->{	
		Liabrary.custom_Sendkeys(view.getEnter_Pin_Code(), excel.getNumericdata("SEBS_Devloper", 1, 4), null); });
		Thread.sleep(1000);
	
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_20", "Enter GST Number", () ->{	
		Liabrary.custom_Sendkeys(view.getEnter_GST_Number(), excel.getStringdata("SEBS_Devloper", 1, 5), null); });
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_21", "Enter_Project_Funnel_lakhs_of_Developer", () ->{
		Liabrary.custom_Sendkeys(view.getEnter_Project_Funnel_lakhs_of_Developer(), excel.getNumericdata("SEBS_Devloper", 1, 6), null); });
		Thread.sleep(1000);
		
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_22", "Enter Sales Funnel For developer", () ->{
		Liabrary.custom_Sendkeys(view.getSalesFunnelFordeveloper(), excel.getNumericdata("SEBS_Devloper", 1, 7), null);});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_23", "Enter Fosroc Expected sales in 2025", () ->{
		Liabrary.custom_Sendkeys(view.getEnter_Fosroc_Expected_sales_in_2025(), excel.getNumericdata("SEBS_Devloper", 1, 8), null); });
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_24", "Scroll in to view", () ->{
		WebElement scroll1 = driver.findElement(By.xpath("//input[@formcontrolname='YTDsales']"));
    	JavascriptExecutor jse1= (JavascriptExecutor)driver;
    	jse1.executeScript("arguments[0].scrollIntoView(true);", scroll1); });
        Thread.sleep(1000);
		
        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_25", "Click YTD Sales", () ->{
		Liabrary.custom_Sendkeys(view.getYTDsales(), excel.getNumericdata("SEBS_Devloper", 1, 9), null); });
		Thread.sleep(1000);
		
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_26", "Click Dropdown Menu Button", () ->{
		Liabrary.custom_click(view.getDropdownMenuButton(), null); });
		Thread.sleep(1000);
		
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_27", "Click on Checkbox ", () ->{
		Liabrary.custom_click(view.getCheckbox(), null); });
		Thread.sleep(1000);
		
	
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_28", "send email ", () ->{
		driver.findElement(By.xpath("//input[contains(@placeholder,'Email ID.')]")).sendKeys("abc1234@gmail.com"); });
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_29", "Send Mobile number ", () ->{
		driver.findElement(By.xpath("//input[contains(@placeholder,'Contact Number.')]")).sendKeys("9854788931"); });
		Thread.sleep(3000);
		
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_30", "Click on save button ", () ->{
		Liabrary.custom_click(view.getSAVE_Button(), "click on save btn");
		});
		
		
//		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_TC_26", "Click on Cancled button ", () ->{
//		Liabrary.custom_click(view.getCANCEL_Button(), null); });
//		Thread.sleep(3000);
//		
	
	
	}
	@Test(priority=1)
	public void SECR_ViewProfile_NS01() throws Exception { 
		
		New_Developer_Creation view = PageFactory.initElements(driver, New_Developer_Creation.class);
		
		//Without click Developer add Menu
	
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_01", "Click SEBS Menu", () ->{
		Liabrary.custom_click(view.getSEBS_Menu(), "Click SEBS Menu");});
		Thread.sleep(1000);
	
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_02", "Click Developer Creation SubMenu", () ->{
		Liabrary.custom_click(view.getDeveloper_Creation_SubMenu(), "Click Developer Creation SubMenu"); });
		Thread.sleep(1000);
	
//		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Credr_TC_03", "Click Developer Add Menu", () ->{
//		Liabrary.custom_click(view.getAdd_Menu(), "Click Developer Add Menu"); });
//		Thread.sleep(1000);

		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_04", "Click Distributor Mapped", () ->{
		Liabrary.custom_click(view.getDistributor_Mapped(), "Click Distributor Mapped");});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_05", "select Distributor Mapped", () ->{
		Liabrary.custom_click(view.getSelect_Distributor_Mapped(), "select Distributor Mapped");});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_TC_06", "Click Distributor Name", () ->{
		Liabrary.custom_Sendkeys(view.getEnter_Developer_Name(), excel.getStringdata("SEBS_Devloper", 2, 0), null); });
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_07", "Click Distributor Mapped", () ->{
		driver.findElement(By.xpath("//ng-select[@bindvalue='SalesmanId']//input[@type='text']")).click();
		});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_08", "select Distributor Mapped", () ->{
		driver.findElement(By.xpath("//span[@class='ng-option-label']")).click();
		});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_09", "Click Distributor Mapped", () ->{
		driver.findElement(By.xpath("//ng-select[@bindvalue='RouteId']//input[@type='text']")).click();
		});
		Thread.sleep(1000);
		
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_10", "select Distributor Mapped", () ->{
		driver.findElement(By.xpath("//span[normalize-space()='Navle road']")).click();
		});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_11", "Enter contact Number", () ->{
		Liabrary.custom_Sendkeys(view.getEnter_Contact_Number(), excel.getNumericdata("SEBS_Devloper", 1, 1), null);});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_12", "Enter Email Address", () ->{
		Liabrary.custom_Sendkeys(view.getEnter_Email_Address(), excel.getStringdata("SEBS_Devloper", 1, 2), null);});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_13", "Enter Email Address", () ->{
		Liabrary.custom_Sendkeys(view.getEnter_Address_Line_1(), excel.getStringdata("SEBS_Devloper", 1, 3), null); });
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_14", "Scroll in to Address Line", () ->{
		WebElement scroll = driver.findElement(By.xpath("//label[normalize-space()='Address Line 2']"));
	    JavascriptExecutor jse= (JavascriptExecutor)driver;
	    jse.executeScript("arguments[0].scrollIntoView(true);", scroll); });
	    Thread.sleep(1000);
		
	    ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_15", "Click On State Dropdown", () ->{
	    Liabrary.custom_click(view.getState_Dropdown(), null); });
	    Thread.sleep(1000);
			
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_16", "Select State Dropdown", () ->{	
	    Liabrary.custom_click(view.getSelect_State(), null); });
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_17", "Select City Dropdown", () ->{		
		Liabrary.custom_click(view.getCity_Dropdown(), null); });
		Thread.sleep(1000);
			
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_18", "Select City Dropdown", () ->{	
		Liabrary.custom_click(view.getSelect_City(), null); });
		Thread.sleep(1000);
	        
	        
	    ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_19", "Enter PIN Code", () ->{	
		Liabrary.custom_Sendkeys(view.getEnter_Pin_Code(), excel.getNumericdata("SEBS_Devloper", 1, 4), null); });
		Thread.sleep(1000);
	
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_20", "Enter GST Number", () ->{	
		Liabrary.custom_Sendkeys(view.getEnter_GST_Number(), excel.getStringdata("SEBS_Devloper", 1, 5), null); });
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_21", "Enter_Project_Funnel_lakhs_of_Developer", () ->{
		Liabrary.custom_Sendkeys(view.getEnter_Project_Funnel_lakhs_of_Developer(), excel.getNumericdata("SEBS_Devloper", 1, 6), null); });
		Thread.sleep(1000);
		
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_22", "Enter Sales Funnel For developer", () ->{
		Liabrary.custom_Sendkeys(view.getSalesFunnelFordeveloper(), excel.getNumericdata("SEBS_Devloper", 1, 7), null);});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_23", "Enter Fosroc Expected sales in 2025", () ->{
		Liabrary.custom_Sendkeys(view.getEnter_Fosroc_Expected_sales_in_2025(), excel.getNumericdata("SEBS_Devloper", 1, 8), null); });
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_24", "Scroll in to view", () ->{
		WebElement scroll1 = driver.findElement(By.xpath("//input[@formcontrolname='YTDsales']"));
    	JavascriptExecutor jse1= (JavascriptExecutor)driver;
    	jse1.executeScript("arguments[0].scrollIntoView(true);", scroll1); });
        Thread.sleep(1000);
		
        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_25", "Click YTD Sales", () ->{
		Liabrary.custom_Sendkeys(view.getYTDsales(), excel.getNumericdata("SEBS_Devloper", 1, 9), null); });
		Thread.sleep(1000);
		
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_26", "Click Dropdown Menu Button", () ->{
		Liabrary.custom_click(view.getDropdownMenuButton(), null); });
		Thread.sleep(1000);
		
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_27", "Click on Checkbox ", () ->{
		Liabrary.custom_click(view.getCheckbox(), null); });
		Thread.sleep(1000);
		
	
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_28", "send email ", () ->{
		driver.findElement(By.xpath("//input[contains(@placeholder,'Email ID.')]")).sendKeys("abc1234@gmail.com"); });
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_29", "Send Mobile number ", () ->{
		driver.findElement(By.xpath("//input[contains(@placeholder,'Contact Number.')]")).sendKeys("9854788931"); });
		Thread.sleep(3000);
		
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_30", "Click on save button ", () ->{
		Liabrary.custom_click(view.getSAVE_Button(), "click on save btn");
		});
	
}
	@Test(priority=2)
	public void SECR_ViewProfile_NS02() throws Exception { 
		
		New_Developer_Creation view = PageFactory.initElements(driver, New_Developer_Creation.class);
		
		//Without Click Developer Creation SubMenu
	
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_01", "Click SEBS Menu", () ->{
		Liabrary.custom_click(view.getSEBS_Menu(), "Click SEBS Menu");});
		Thread.sleep(1000);
//	
//		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_02", "Click Developer Creation SubMenu", () ->{
//		Liabrary.custom_click(view.getDeveloper_Creation_SubMenu(), "Click Developer Creation SubMenu"); });
//		Thread.sleep(1000);
	
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Credr_TC_03", "Click Developer Add Menu", () ->{
		Liabrary.custom_click(view.getAdd_Menu(), "Click Developer Add Menu"); });
		Thread.sleep(1000);

		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_04", "Click Distributor Mapped", () ->{
		Liabrary.custom_click(view.getDistributor_Mapped(), "Click Distributor Mapped");});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_05", "select Distributor Mapped", () ->{
		Liabrary.custom_click(view.getSelect_Distributor_Mapped(), "select Distributor Mapped");});
		Thread.sleep(1000);

		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_TC_06", "Click Distributor Name", () ->{
		Liabrary.custom_Sendkeys(view.getEnter_Developer_Name(), excel.getStringdata("SEBS_Devloper", 2, 0), null); });
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_07", "Click Distributor Mapped", () ->{
		driver.findElement(By.xpath("//ng-select[@bindvalue='SalesmanId']//input[@type='text']")).click();
		});
		Thread.sleep(1000);

		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_08", "select Distributor Mapped", () ->{
		driver.findElement(By.xpath("//span[@class='ng-option-label']")).click();
		});
		Thread.sleep(1000);

		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_09", "Click Distributor Mapped", () ->{
		driver.findElement(By.xpath("//ng-select[@bindvalue='RouteId']//input[@type='text']")).click();
		});
		Thread.sleep(1000);

		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_10", "select Distributor Mapped", () ->{
		driver.findElement(By.xpath("//span[normalize-space()='Navle road']")).click();
		});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_11", "Enter contact Number", () ->{
		Liabrary.custom_Sendkeys(view.getEnter_Contact_Number(), excel.getNumericdata("SEBS_Devloper", 1, 1), null);});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_12", "Enter Email Address", () ->{
		Liabrary.custom_Sendkeys(view.getEnter_Email_Address(), excel.getStringdata("SEBS_Devloper", 1, 2), null);});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_13", "Enter Email Address", () ->{
		Liabrary.custom_Sendkeys(view.getEnter_Address_Line_1(), excel.getStringdata("SEBS_Devloper", 1, 3), null); });
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_14", "Scroll in to Address Line", () ->{
		WebElement scroll = driver.findElement(By.xpath("//label[normalize-space()='Address Line 2']"));
	    JavascriptExecutor jse= (JavascriptExecutor)driver;
	    jse.executeScript("arguments[0].scrollIntoView(true);", scroll); });
	    Thread.sleep(1000);
		
	    ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_15", "Click On State Dropdown", () ->{
	    Liabrary.custom_click(view.getState_Dropdown(), null); });
		Thread.sleep(1000);
			
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_16", "Select State Dropdown", () ->{	
	    Liabrary.custom_click(view.getSelect_State(), null); });
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_17", "Select City Dropdown", () ->{		
		Liabrary.custom_click(view.getCity_Dropdown(), null); });
		Thread.sleep(1000);
			
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_18", "Select City Dropdown", () ->{	
		Liabrary.custom_click(view.getSelect_City(), null); });
		Thread.sleep(1000);
	        
	        
	   ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_19", "Enter PIN Code", () ->{	
	   Liabrary.custom_Sendkeys(view.getEnter_Pin_Code(), excel.getNumericdata("SEBS_Devloper", 1, 4), null); });
	   Thread.sleep(1000);
	
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_20", "Enter GST Number", () ->{	
		Liabrary.custom_Sendkeys(view.getEnter_GST_Number(), excel.getStringdata("SEBS_Devloper", 1, 5), null); });
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_21", "Enter_Project_Funnel_lakhs_of_Developer", () ->{
		Liabrary.custom_Sendkeys(view.getEnter_Project_Funnel_lakhs_of_Developer(), excel.getNumericdata("SEBS_Devloper", 1, 6), null); });
		Thread.sleep(1000);
		
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_22", "Enter Sales Funnel For developer", () ->{
		Liabrary.custom_Sendkeys(view.getSalesFunnelFordeveloper(), excel.getNumericdata("SEBS_Devloper", 1, 7), null);});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_23", "Enter Fosroc Expected sales in 2025", () ->{
		Liabrary.custom_Sendkeys(view.getEnter_Fosroc_Expected_sales_in_2025(), excel.getNumericdata("SEBS_Devloper", 1, 8), null); });
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_24", "Scroll in to view", () ->{
		WebElement scroll1 = driver.findElement(By.xpath("//input[@formcontrolname='YTDsales']"));
    	JavascriptExecutor jse1= (JavascriptExecutor)driver;
    	jse1.executeScript("arguments[0].scrollIntoView(true);", scroll1); });
        Thread.sleep(1000);
		
        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_25", "Click YTD Sales", () ->{
		Liabrary.custom_Sendkeys(view.getYTDsales(), excel.getNumericdata("SEBS_Devloper", 1, 9), null); });
		Thread.sleep(1000);
		
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_26", "Click Dropdown Menu Button", () ->{
		Liabrary.custom_click(view.getDropdownMenuButton(), null); });
		Thread.sleep(1000);
		
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_27", "Click on Checkbox ", () ->{
		Liabrary.custom_click(view.getCheckbox(), null); });
		Thread.sleep(1000);
		
	
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_28", "send email ", () ->{
		driver.findElement(By.xpath("//input[contains(@placeholder,'Email ID.')]")).sendKeys("abc1234@gmail.com"); });
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_29", "Send Mobile number ", () ->{
		driver.findElement(By.xpath("//input[contains(@placeholder,'Contact Number.')]")).sendKeys("9854788931"); });
		Thread.sleep(3000);
		
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Developer_Cred_TC_30", "Click on save button ", () ->{
		Liabrary.custom_click(view.getSAVE_Button(), "click on save btn");
		});
}
}