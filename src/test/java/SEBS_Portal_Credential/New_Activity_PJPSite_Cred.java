package SEBS_Portal_Credential;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com_Utility.BaseClass_SEBS_Portal;
import Com_Utility.Liabrary;
import SEBS_Portal.New_Site_Creation;

public class New_Activity_PJPSite_Cred extends BaseClass_SEBS_Portal{

	
	@Test
	public void SEBS_New_Activity_PJP_Cred() throws Exception {
		
		New_Site_Creation view = PageFactory.initElements(driver, New_Site_Creation.class);
	
		
		Liabrary.custom_click(view.getActivity_Button(), null);
		Thread.sleep(1000);
	
	
		Liabrary.custom_click(view.getAdd1_Button(), null);
		Thread.sleep(1000);
	
	
		Liabrary.custom_click(view.getDistributor_Mapped(), null);
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(view.getSelect_Distributor_Mapped(), null);
		Thread.sleep(1000);
		
		
		
		
		Liabrary.custom_click(view.getSelect_sales_Engineer_dropdown(), null);
		Thread.sleep(1000);
	
		Liabrary.custom_click(view.getSelect_sales_Engineer(), null);
		Thread.sleep(1000);
		
		
	
		Liabrary.custom_click(view.getSelect_Location_dropdown(), null);
		Thread.sleep(1000);
	
	
		Liabrary.custom_click(view.getSelect_Location(), null);
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(view.getSelect_developer_Name_dropdown(), null);
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(view.getSelect_developer_Name(), null);
		Thread.sleep(1000);
		
		
		WebElement scroll = driver.findElement(By.xpath("//label[normalize-space()='Site Name']"));
    	JavascriptExecutor jse= (JavascriptExecutor)driver;
    	jse.executeScript("arguments[0].scrollIntoView(true);", scroll);
        Thread.sleep(1000);
		
		
		
		
		driver.findElement(By.xpath("//input[@placeholder='Enter Site Name']")).sendKeys("mukeshdelhi");
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(view.getChcekbox_flexCheckDefault(), null);
		Thread.sleep(1000);
	
		

		WebElement scroll1 = driver.findElement(By.xpath("//label[normalize-space()='State']"));
    	JavascriptExecutor jse1= (JavascriptExecutor)driver;
    	jse1.executeScript("arguments[0].scrollIntoView(true);", scroll1);
        Thread.sleep(1000);
		
		
		
        Liabrary.custom_click(view.getDropdownMenuButton(), null);
		Thread.sleep(1000);
		
		
		Liabrary.custom_click(view.getCheckbox(), null);
		Thread.sleep(4000);
		
		
		WebElement scroll2 = driver.findElement(By.xpath("//label[normalize-space()='Contractor Name']"));
    	JavascriptExecutor jse2= (JavascriptExecutor)driver;
    	jse2.executeScript("arguments[0].scrollIntoView(true);", scroll2);
        Thread.sleep(1000);
		
		
		
		driver.findElement(By.xpath("//input[@placeholder='Enter Contractor Name']")).sendKeys("raj");
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//input[@placeholder='Enter Contractor Contact Number.']")).sendKeys("9654120142");
		Thread.sleep(1000);
		
	
	
		Liabrary.custom_click(view.getCANCEL_Button(), null);
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}
