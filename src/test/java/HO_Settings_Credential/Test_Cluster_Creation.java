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
import HO_Settings.Cluster_Creation;

public class Test_Cluster_Creation extends BaseClass{

	
	@Test
	public void Role_Wise_Access () throws Exception{
		HomePage hp =PageFactory.initElements(driver,HomePage.class);	
		Cluster_Creation  CC= PageFactory.initElements(driver,Cluster_Creation.class); 	
		
		
	   //ObjectRepo.test.log(Status.INFO, "Test Case 1 : Verify that user should be select Setting Menu.")
		Liabrary.custom_click(hp.getSettings_Menu(),"Select Setting menu");
		Thread.sleep(1000);
		
		
		//ObjectRepo.test.log(Status.INFO, "Test Case 2 : Verify that user should be select Configurations Sub menu.")
		Liabrary.custom_click(hp.getConfigurations_SubMenu(),"Select Configurations Sub menu");
		Thread.sleep(1000);
 
 
	   //ObjectRepo.test.log(Status.INFO, "Test Case 3 : Verify that user should be Select Cluster Creation Page.");	
		Liabrary.custom_click(CC.getCluster_Creation(),"Select Cluster_Creation Page");
		Thread.sleep(1000);
		
		
	  //ObjectRepo.test.log(Status.INFO, "Test Case 4 :Verify that Cluster Creation Header Text.");
		WebElement User_Master_Header_TXT = driver.findElement(By.xpath("//span[text()='Cluster Creation']"));
		String Actual_Text = User_Master_Header_TXT.getText();
		System.out.println(Actual_Text);
		String Expected_Text= "Cluster Creation";
		Assert.assertEquals(Expected_Text,Actual_Text);
		Thread.sleep(1000);

		
		//ObjectRepo.test.log(Status.INFO, "Test Case 5 : Verify that user should be Select Cluster_Dropdown.");	
		Liabrary.custom_click(CC.getSelect_Cluster_Dropdown(),"Select Cluster_Dropdown");
		Thread.sleep(1000);
		
		
		//ObjectRepo.test.log(Status.INFO, "Test Case 6 : Verify that user should be Select Cluster_Dropdown Value");	
		Liabrary.custom_click(CC.getSelect_Cluster_Dropdown_Value(),"Select Cluster_Dropdown Value");
		Thread.sleep(1000);
		
		
		//ObjectRepo.test.log(Status.INFO, "Test Case 7 : Verify that user should be Click on Search Button");	
		Liabrary.custom_click(CC.getSearch_Button(),"Click on Search Button");
		Thread.sleep(1000);
		
		
		//ObjectRepo.test.log(Status.INFO, "Test Case 8 : Verify that user should be Click on Cluster Add Button");	
		Liabrary.custom_click(CC.getCluster_Add_BTN(),"Click on Cluster Add Button");
		Thread.sleep(1000);
		
		
		Actions Action = new Actions(driver);
		WebElement Element = driver.findElement(By.xpath("//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlAreaType_Input']"));
		Action.moveToElement(Element).click().perform();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlAreaType_DropDown']//ul//li[text()='ZSM']")).click();
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//*[@id='ParentMasterContentPlaceHolder1_txtAreaName']")).sendKeys("New ZSM FOR TEST AUTO");
		Thread.sleep(1000);
		
		
	/*	//ObjectRepo.test.log(Status.INFO, "Test Case 9 : Verify that user should be Select Cluster Type Dropdown");	
		Liabrary.custom_click(CC.getSelect_Cluster_Type_Dropdown(),"Select Cluster Type Dropdown");
		Thread.sleep(1000);
		//ObjectRepo.test.log(Status.INFO, "Test Case 9 : Verify that user should be Select Cluster Type Dropdown Value");	
		Liabrary.custom_click(CC.getSelect_Cluster_Type_Dropdown(),"Select Cluster Type Dropdown Value");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='ParentMasterContentPlaceHolder1_txtAreaName']")).sendKeys("NEW AUTO TEST");
		Thread.sleep(1000);
	*/
	driver.findElement(By.xpath("//*[@id='ParentMasterContentPlaceHolder1_btnCloseAreaCreation']")).click();
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
