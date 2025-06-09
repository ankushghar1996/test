package SEBS_Portal_Credential;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com_Utility.BaseClass_SEBS_Portal;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import SEBS_Portal.New_Site_Creation;

public class New_Site_Cred extends BaseClass_SEBS_Portal{

	
	@Test
	public void SEBS_New_Site_Cred() throws Exception {
		
		New_Site_Creation view = PageFactory.initElements(driver, New_Site_Creation.class);
	
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Site_Cred_TC_01", "Click on SEBS Menu", () ->{
		Liabrary.custom_click(view.getSEBS_Menu(), null);});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Site_Cred_TC_02", "Click on SEBS Menu", () ->{
		Liabrary.custom_click(view.getSite_Creation_SubMenu(), null);});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Site_Cred_TC_03", "Click on Add Menu", () ->{
		Liabrary.custom_click(view.getAdd_Menu(), null);});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Site_Cred_TC_04", "Click on Distributor_Mapped", () ->{
		Liabrary.custom_click(view.getDistributor_Mapped(), null);});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Site_Cred_TC_05", "Click on Select_Distributor_Mapped", () ->{
		Liabrary.custom_click(view.getSelect_Distributor_Mapped(), null);});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Site_Cred_TC_06", "Click Select_sales_Engineer_dropdown", () ->{
		Liabrary.custom_click(view.getSelect_sales_Engineer_dropdown(), null);});
		Thread.sleep(1000);
	
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Site_Cred_TC_07", "Click Select_sales_Engineer", () ->{
		Liabrary.custom_click(view.getSelect_sales_Engineer(), null);});
		Thread.sleep(1000);
	
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Site_Cred_TC_08", "Click on Select_Location_dropdown", () ->{
		Liabrary.custom_click(view.getSelect_Location_dropdown(), null);});
		Thread.sleep(1000);
	
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Site_Cred_TC_09", "Click on Select_Location", () ->{
		Liabrary.custom_click(view.getSelect_Location(), null);});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Site_Cred_TC_10", "Click on Select_developer_Name_dropdown", () ->{
		Liabrary.custom_click(view.getSelect_developer_Name_dropdown(), null);});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Site_Cred_TC_11", "Click on Select_developer_Name", () ->{
		Liabrary.custom_click(view.getSelect_developer_Name(), null);});
		Thread.sleep(1000);
		
		
		WebElement scroll = driver.findElement(By.xpath("//label[normalize-space()='Site Name']"));
    	JavascriptExecutor jse= (JavascriptExecutor)driver;
    	jse.executeScript("arguments[0].scrollIntoView(true);", scroll);
        Thread.sleep(1000);
		
		
		
        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Site_Cred_TC_12", "Send Site Name", () ->{
		driver.findElement(By.xpath("//input[@placeholder='Enter Site Name']")).sendKeys("mukeshdelhi");});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Site_Cred_TC_13", "Click on Chcekbox_flexCheckDefault", () ->{
		Liabrary.custom_click(view.getChcekbox_flexCheckDefault(), null);});
		Thread.sleep(1000);
	
		

		WebElement scroll1 = driver.findElement(By.xpath("//label[normalize-space()='State']"));
    	JavascriptExecutor jse1= (JavascriptExecutor)driver;
    	jse1.executeScript("arguments[0].scrollIntoView(true);", scroll1);
        Thread.sleep(1000);
		
		
        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Site_Cred_TC_14", "Click on Dropdown Menu Button", () ->{
        Liabrary.custom_click(view.getDropdownMenuButton(), null);});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Site_Cred_TC_15", "Click on Checkbox", () ->{
		Liabrary.custom_click(view.getCheckbox(), null);});
		Thread.sleep(4000);
		
		
		WebElement scroll2 = driver.findElement(By.xpath("//label[normalize-space()='Contractor Name']"));
    	JavascriptExecutor jse2= (JavascriptExecutor)driver;
    	jse2.executeScript("arguments[0].scrollIntoView(true);", scroll2);
        Thread.sleep(1000);
		
		
        ObjectRepo.startTestAndLog_1_SS("SEBS_New_Site_Cred_TC_16", "Enter Contractor Name", () ->{
		driver.findElement(By.xpath("//input[@placeholder='Enter Contractor Name']")).sendKeys("raj");});
		Thread.sleep(1000);
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Site_Cred_TC_17", "Enter Contractor Contact Number", () ->{
		driver.findElement(By.xpath("//input[@placeholder='Enter Contractor Contact Number.']")).sendKeys("9654120142");});
		Thread.sleep(1000);
		
		
		ObjectRepo.startTestAndLog_1_SS("SEBS_New_Site_Cred_TC_18", "Click on CANCEL_Button", () ->{
		Liabrary.custom_click(view.getCANCEL_Button(), null);});
		
		
		
		
		
		
		
	
	}
	
}
