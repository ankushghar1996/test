package HO_Settings_Credential;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com_Utility.BaseClass;
import Com_Utility.HomePage;
import Com_Utility.Liabrary;
import HO_Settings.Cluster_Mapping;

public class Test_Cluster_Mapping extends BaseClass{

	
	@Test
	public void Cluster_Mapping () throws Exception {
		HomePage hp = PageFactory.initElements(driver,HomePage.class);	
		Cluster_Mapping CM =PageFactory.initElements(driver,Cluster_Mapping.class);

		
		   //ObjectRepo.test.log(Status.INFO, "Test Case 1 : Verify that user should be select Setting Menu.")
			Liabrary.custom_click(hp.getSettings_Menu(),"Select Setting menu");
			Thread.sleep(1000);
			
			
			//ObjectRepo.test.log(Status.INFO, "Test Case 2 : Verify that user should be select Configurations Sub menu.")
			Liabrary.custom_click(hp.getConfigurations_SubMenu(),"Select Configurations Sub menu");
			Thread.sleep(1000);
 
 
		   //ObjectRepo.test.log(Status.INFO, "Test Case 3 : Verify that user should be Select Cluster_Mapping Page.");	
			Liabrary.custom_click(CM.getCluster_Mapping_Menu(),"Select Cluster_Mapping Page");
			Thread.sleep(1000);
			
			
		  //ObjectRepo.test.log(Status.INFO, "Test Case 4 :Verify that Cluster Mapping Header Text.");
			WebElement User_Master_Header_TXT = driver.findElement(By.xpath("//span[text()='Cluster Mapping']"));
			String Actual_Text = User_Master_Header_TXT.getText();
			System.out.println(Actual_Text);
			String Expected_Text= "Cluster Mapping";
			Assert.assertEquals(Expected_Text,Actual_Text);
			Thread.sleep(1000);

 
			//ObjectRepo.test.log(Status.INFO, "Test Case 5 : Verify that user should be Select Cluster Mapping Dropdown.");	
			Liabrary.custom_click(CM.getSelect_Cluster_Type_Dropdown(),"Select Cluster Mapping Dropdown");
			Thread.sleep(1000);	

 
			//ObjectRepo.test.log(Status.INFO, "Test Case 6 : Verify that user should be Select Cluster Mapping Dropdown Value.");	
			Liabrary.custom_click(CM.getSelect_Cluster_Type_Dropdown_Value(),"Select Cluster Mapping Dropdown Value");
			Thread.sleep(1000);
			
			
			//ObjectRepo.test.log(Status.INFO, "Test Case 7 : Verify that user should be Click on Search Button");	
			Liabrary.custom_click(CM.getSearch_Button(),"Click on Search Button");
			Thread.sleep(1000);
			
			
			//ObjectRepo.test.log(Status.INFO, "Test Case 8 : Verify that user should be Click on Cluster Add Button");	
			Liabrary.custom_click(CM.getADD_BTN(),"Click on Cluster Mapping Add Button");
			Thread.sleep(1000);
			

			//h4[normalize-space()='Area Hierarchy Mapping']
			//ObjectRepo.test.log(Status.INFO, "Test Case 9 :Verify that Area Hierarchy Mapping Header Text.");
			WebElement Area_Hierarchy_Mapping_Header_TXT = driver.findElement(By.xpath("//h4[normalize-space()='Area Hierarchy Mapping']"));
			String Actual_Text2 = Area_Hierarchy_Mapping_Header_TXT.getText();
			System.out.println(Actual_Text2);
			String Expected_Text2= "Area Hierarchy Mapping";
			Assert.assertEquals(Expected_Text2,Actual_Text2);
			Thread.sleep(1000);

			
			//ObjectRepo.test.log(Status.INFO, "Test Case 10 : Verify that user should be Click on Cluster Add Button");	
			Liabrary.custom_click(CM.getADD_BTN(),"Click on Cluster Add Button");
			Thread.sleep(1000);
 
 
			// WebDriverWait for waiting elements to become interactable
			//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			// Dropdown1
			Actions action = new Actions(driver);
			WebElement element1 =driver.findElement(By.xpath("//span[@id='ctl00_ParentMasterContentPlaceHolder1_ddlAreaType_Arrow']"));
			action.moveToElement(element1).click().perform();
			Thread.sleep(2000);
			
			
			driver.findElement(By.xpath("//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlAreaType_DropDown']//ul//li[text()='ZSM']")).click();
			Thread.sleep(1000);
			
			
			// Dropdown2
			WebElement element2 = driver.findElement(By.xpath("//span[@id='ctl00_ParentMasterContentPlaceHolder1_ddlAreaName_Arrow']"));
			action.moveToElement(element2).click().perform();
			Thread.sleep(2000);
			
			
			driver.findElement(By.xpath("//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddlAreaName_DropDown']//ul//li[normalize-space()='Karnataka and Kerala']")).click();
			Thread.sleep(1000);
			
			
			// Dropdown3
			WebElement element3 = driver.findElement(By.xpath("//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlParentArea_Input']"));
			action.moveToElement(element3).click().perform();
			Thread.sleep(2000);
			
			
			driver.findElement(By.xpath("//*[@id='ctl00_ParentMasterContentPlaceHolder1_ddlParentArea_DropDown']//ul//li[text()='UAT.RSM']")).click();
			Thread.sleep(1000);
			
			
			Liabrary.custom_click(CM.getCancel_button(), Expected_Text2); 

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
