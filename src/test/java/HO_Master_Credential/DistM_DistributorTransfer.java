package HO_Master_Credential;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Com_Utility.BaseClass;
import Com_Utility.Common_Data;
import Com_Utility.HomePage;
import Com_Utility.Liabrary;
import Com_Utility.ObjectRepo;
import HO_Master.DM_DistributorApprovl;
import HO_Master.DM_DistributorTransfer;

public class DistM_DistributorTransfer extends BaseClass{
	
	@Test(priority = 0)
	public void Distributor_Transfer1() throws Exception {
		
		
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		DM_DistributorTransfer DT = PageFactory.initElements(driver, DM_DistributorTransfer.class);
		
	
		ObjectRepo.startTestAndLog_1_SS("SA_Distributor_Transfer_TC01", "Click On Master Menu", () -> {
		Liabrary.custom_click(hp.getMaster_Menu(), "select Master Menu");});
		Thread.sleep(1000);
			
		ObjectRepo.startTestAndLog_1_SS("SA_Distributor_Transfer_TC02", "Click On Distributor Master SubMenu", () -> {
		Liabrary.custom_click(hp.getDistributorMaster_SubMenu(), "select Distributor Master sub menu");});
		Thread.sleep(1000);
	
		ObjectRepo.startTestAndLog_1_SS("SA_Distributor_Transfer_TC03", "Click On Distributor Transfer", () -> {
		Liabrary.custom_click(DT.getDistributor_Transfer(), null);});
		Thread.sleep(1000);
	
	
		ObjectRepo.startTestAndLog_1_SS("SA_Distributor_Transfer_TC04", "Click On Distributor Master SubMenu", () -> {
			WebElement UploadText=driver.findElement(By.xpath("//h4[normalize-space()='Distributor Transfer']"));
			String Actual_Text=UploadText.getText();
			System.out.println(Actual_Text);
			String Expected_Text="Distributor Transfer";
			Assert.assertEquals(Expected_Text, Actual_Text);});
			Thread.sleep(2000);
	
			ObjectRepo.startTestAndLog_1_SS("SA_Distributor_Transfer_TC05", "Click On SFA1_Dropdown", () -> {
			Liabrary.custom_click(DT.getSFA1_Dropdown(), null);});
			Thread.sleep(1000);
			
			ObjectRepo.startTestAndLog_1_SS("SA_Distributor_Transfer_TC06", "Click On SFA1 Dropdown Value", () -> {
			Liabrary.custom_click(DT.getSFA1Value_Dropdown(), null);});
			Thread.sleep(1000);
			
			ObjectRepo.startTestAndLog_1_SS("SA_Distributor_Transfer_TC07", "Click On Route 1 Dropdown", () -> {
			Liabrary.custom_click(DT.getRoute1_Dropdown(), null);});
			Thread.sleep(1000);
			
			ObjectRepo.startTestAndLog_1_SS("SA_Distributor_Transfer_TC08", "Click On Route 1 Dropdown Value", () -> {
			Liabrary.custom_click(DT.getRoute1Value_Dropdown(), null);});
			Thread.sleep(1000);
	
			ObjectRepo.startTestAndLog_1_SS("SA_Distributor_Transfer_TC09", "Click On SFA 2 Dropdown", () -> {
			Liabrary.custom_click(DT.getSFA2_Dropdown(), null);});
			Thread.sleep(1000);
			
			ObjectRepo.startTestAndLog_1_SS("SA_Distributor_Transfer_TC10", "Click On SFA 2 Dropdown Value", () -> {
			Liabrary.custom_click(DT.getSFA2Value_Dropdown(), null);});
			Thread.sleep(1000);
			
			ObjectRepo.startTestAndLog_1_SS("SA_Distributor_Transfer_TC11", "Click On Route 2 Dropdown", () -> {
			Liabrary.custom_click(DT.getRoute2_Dropdown(), null);});
			Thread.sleep(1000);
			
			ObjectRepo.startTestAndLog_1_SS("SA_Distributor_Transfer_TC12", "Click On Route 2 Dropdown Value", () -> {
			Liabrary.custom_click(DT.getRoute2Value_Dropdown(), null);});
			Thread.sleep(1000);
	
			ObjectRepo.startTestAndLog_1_SS("SA_Distributor_Transfer_TC13", "Click On Transfer Button", () -> {
			Liabrary.custom_click(DT.getTransfer_btn(), null);});
			Thread.sleep(4000);
			
			ObjectRepo.startTestAndLog_1_SS("SA_Distributor_Transfer_TC14", "Click On Select CheckBox1", () -> {
			Liabrary.custom_click(DT.getSelectCheckBox1(), null);});
			Thread.sleep(1000);
			
			ObjectRepo.startTestAndLog_1_SS("SA_Distributor_Transfer_TC15", "Click On Arrow1 Forward Button", () -> {
			Liabrary.custom_click(DT.getArrow1_Forward(), null);});
			Thread.sleep(1000);
			
			ObjectRepo.startTestAndLog_1_SS("SA_Distributor_Transfer_TC16", "Click On Select CheckBox2", () -> {
			Liabrary.custom_click(DT.getSelectCheckBox2(), null);});
			Thread.sleep(4000);
	
		}		
	
	@Test(priority = 1)
	public void Distributor_Transfer1_NS1() throws Exception {
		
		
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		DM_DistributorTransfer DT = PageFactory.initElements(driver, DM_DistributorTransfer.class);
		
	
		ObjectRepo.startTestAndLog_1_SS("SA_Distributor_Transfer_TC01", "Click On Master Menu", () -> {
		Liabrary.custom_click(hp.getMaster_Menu(), "select Master Menu");});
		Thread.sleep(1000);
			
		ObjectRepo.startTestAndLog_1_SS("SA_Distributor_Transfer_TC02", "Click On Distributor Master SubMenu", () -> {
		Liabrary.custom_click(hp.getDistributorMaster_SubMenu(), "select Distributor Master sub menu");});
		Thread.sleep(1000);
	
		ObjectRepo.startTestAndLog_1_SS("SA_Distributor_Transfer_TC03", "Click On Distributor Transfer", () -> {
		Liabrary.custom_click(DT.getDistributor_Transfer(), null);});
		Thread.sleep(1000);
	
	
		ObjectRepo.startTestAndLog_1_SS("SA_Distributor_Transfer_TC04", "Click On Distributor Master SubMenu", () -> {
			WebElement UploadText=driver.findElement(By.xpath("//h4[normalize-space()='Distributor Transfer']"));
			String Actual_Text=UploadText.getText();
			System.out.println(Actual_Text);
			String Expected_Text="Distributor Transfer";
			Assert.assertEquals(Expected_Text, Actual_Text);});
			Thread.sleep(2000);
	
			ObjectRepo.startTestAndLog_1_SS("SA_Distributor_Transfer_TC05", "Click On SFA1_Dropdown", () -> {
			Liabrary.custom_click(DT.getSFA1_Dropdown(), null);});
			Thread.sleep(1000);
			
			ObjectRepo.startTestAndLog_1_SS("SA_Distributor_Transfer_TC06", "Click On SFA1 Dropdown Value", () -> {
			Liabrary.custom_click(DT.getSFA1Value_Dropdown(), null);});
			Thread.sleep(1000);
			
			ObjectRepo.startTestAndLog_1_SS("SA_Distributor_Transfer_TC07", "Click On Route 1 Dropdown", () -> {
			Liabrary.custom_click(DT.getRoute1_Dropdown(), null);});
			Thread.sleep(1000);
			
			ObjectRepo.startTestAndLog_1_SS("SA_Distributor_Transfer_TC08", "Click On Route 1 Dropdown Value", () -> {
			Liabrary.custom_click(DT.getRoute1Value_Dropdown(), null);});
			Thread.sleep(1000);
	
			ObjectRepo.startTestAndLog_1_SS("SA_Distributor_Transfer_TC09", "Click On SFA 2 Dropdown", () -> {
			Liabrary.custom_click(DT.getSFA2_Dropdown(), null);});
			Thread.sleep(1000);
			
			ObjectRepo.startTestAndLog_1_SS("SA_Distributor_Transfer_TC10", "Click On SFA 2 Dropdown Value", () -> {
			Liabrary.custom_click(DT.getSFA2Value_Dropdown(), null);});
			Thread.sleep(1000);
			
			ObjectRepo.startTestAndLog_1_SS("SA_Distributor_Transfer_TC11", "Click On Route 2 Dropdown", () -> {
			Liabrary.custom_click(DT.getRoute2_Dropdown(), null);});
			Thread.sleep(1000);
			
			ObjectRepo.startTestAndLog_1_SS("SA_Distributor_Transfer_TC12", "Click On Route 2 Dropdown Value", () -> {
			Liabrary.custom_click(DT.getRoute2Value_Dropdown(), null);});
			Thread.sleep(1000);
	
			ObjectRepo.startTestAndLog_1_SS("SA_Distributor_Transfer_TC13", "Click On Transfer Button", () -> {
			Liabrary.custom_click(DT.getTransfer_btn(), null);});
			Thread.sleep(4000);
			
			ObjectRepo.startTestAndLog_1_SS("SA_Distributor_Transfer_TC14", "Click On Select CheckBox1", () -> {
			Liabrary.custom_click(DT.getSelectCheckBox1(), null);});
			Thread.sleep(1000);
			
			ObjectRepo.startTestAndLog_1_SS("SA_Distributor_Transfer_TC15", "Click On Arrow1 Forward Button", () -> {
			Liabrary.custom_click(DT.getArrow1_Forward(), null);});
			Thread.sleep(1000);
			
			ObjectRepo.startTestAndLog_1_SS("SA_Distributor_Transfer_TC16", "Click On Select CheckBox2", () -> {
			Liabrary.custom_click(DT.getSelectCheckBox2(), null);});
			Thread.sleep(4000);
		}
	
	
@Test(priority = 2)
public void Distributor_Transfer3() throws Exception {

    HomePage hp = PageFactory.initElements(driver, HomePage.class);
    DM_DistributorTransfer DT = PageFactory.initElements(driver, DM_DistributorTransfer.class);

    Liabrary.custom_click(hp.getMaster_Menu(), "select Master Menu");
    Thread.sleep(1000);
    Liabrary.custom_click(hp.getDistributorMaster_SubMenu(), "select Distributor Master sub menu");
    Thread.sleep(1000);
    Liabrary.custom_click(DT.getDistributor_Transfer(), null);
    Thread.sleep(1000);

    WebElement UploadText = driver.findElement(By.xpath("//h4[normalize-space()='Distributor Transfer']"));
    String Actual_Text = UploadText.getText();
    System.out.println(Actual_Text);
    String Expected_Text = "Distributor Transfer";
    Assert.assertEquals(Expected_Text, Actual_Text);
    Thread.sleep(2000);

    Liabrary.custom_click(DT.getSFA1_Dropdown(), null);
    Thread.sleep(1000);
    Liabrary.custom_click(DT.getSFA1Value_Dropdown(), null);
    Thread.sleep(1000);
    Liabrary.custom_click(DT.getRoute1_Dropdown(), null);
    Thread.sleep(1000);
    Liabrary.custom_click(DT.getRoute1Value_Dropdown(), null);
    Thread.sleep(1000);

    Liabrary.custom_click(DT.getSFA2_Dropdown(), null);
    Thread.sleep(1000);
    Liabrary.custom_click(DT.getSFA2Value_Dropdown(), null);
    Thread.sleep(1000);
    Liabrary.custom_click(DT.getRoute2_Dropdown(), null);
    Thread.sleep(1000);
    Liabrary.custom_click(DT.getRoute2Value_Dropdown(), null);
    Thread.sleep(1000);

    Liabrary.custom_click(DT.getTransfer_btn(), null);
    Thread.sleep(1000);
    Liabrary.custom_click(DT.getSelectAllCheckBox(), null);
    Thread.sleep(1000);
    Liabrary.custom_click(DT.getArrow1_Forward(), null);
    Thread.sleep(1000);
    Liabrary.custom_click(DT.getSelectAll2CheckBox(), null);
    Thread.sleep(4000);
    Liabrary.custom_click(DT.getArrow2_Backword(), null);
    Thread.sleep(4000);
}

@Test(priority = 3)
public void DT_WithoutSelectDistributor_CheckBox() throws Exception {

    HomePage hp = PageFactory.initElements(driver, HomePage.class);
    DM_DistributorTransfer DT = PageFactory.initElements(driver, DM_DistributorTransfer.class);

    Liabrary.custom_click(hp.getMaster_Menu(), "select Master Menu");
    Thread.sleep(1000);
    Liabrary.custom_click(hp.getDistributorMaster_SubMenu(), "select Distributor Master sub menu");
    Thread.sleep(1000);
    Liabrary.custom_click(DT.getDistributor_Transfer(), null);
    Thread.sleep(1000);

    WebElement UploadText = driver.findElement(By.xpath("//h4[normalize-space()='Distributor Transfer']"));
    String Actual_Text = UploadText.getText();
    System.out.println(Actual_Text);
    String Expected_Text = "Distributor Transfer";
    Assert.assertEquals(Expected_Text, Actual_Text);
    Thread.sleep(2000);

    Liabrary.custom_click(DT.getSFA1_Dropdown(), null);
    Thread.sleep(1000);
    Liabrary.custom_click(DT.getSFA1Value_Dropdown(), null);
    Thread.sleep(1000);
    Liabrary.custom_click(DT.getRoute1_Dropdown(), null);
    Thread.sleep(1000);
    Liabrary.custom_click(DT.getRoute1Value_Dropdown(), null);
    Thread.sleep(1000);
    Liabrary.custom_click(DT.getSFA2_Dropdown(), null);
    Thread.sleep(1000);
    Liabrary.custom_click(DT.getSFA2Value_Dropdown(), null);
    Thread.sleep(1000);
    Liabrary.custom_click(DT.getRoute2_Dropdown(), null);
    Thread.sleep(1000);
    Liabrary.custom_click(DT.getRoute2Value_Dropdown(), null);
    Thread.sleep(1000);
    Liabrary.custom_click(DT.getTransfer_btn(), null);
    Thread.sleep(1000);
    Liabrary.custom_click(DT.getArrow1_Forward(), null);
    Thread.sleep(4000);
    Liabrary.checkErrorMessageChangable(driver, "//div[@class='toast-message']");
    Thread.sleep(4000);
}

@Test(priority = 4)
public void DT_WithoutSelectToDistributor() throws Exception {

    HomePage hp = PageFactory.initElements(driver, HomePage.class);
    DM_DistributorTransfer DT = PageFactory.initElements(driver, DM_DistributorTransfer.class);

    Liabrary.custom_click(hp.getMaster_Menu(), "select Master Menu");
    Thread.sleep(1000);
    Liabrary.custom_click(hp.getDistributorMaster_SubMenu(), "select Distributor Master sub menu");
    Thread.sleep(1000);
    Liabrary.custom_click(DT.getDistributor_Transfer(), null);
    Thread.sleep(1000);

    WebElement UploadText = driver.findElement(By.xpath("//h4[normalize-space()='Distributor Transfer']"));
    String Actual_Text = UploadText.getText();
    System.out.println(Actual_Text);
    String Expected_Text = "Distributor Transfer";
    Assert.assertEquals(Expected_Text, Actual_Text);
    Thread.sleep(2000);

    Liabrary.custom_click(DT.getSFA1_Dropdown(), null);
    Thread.sleep(1000);
    Liabrary.custom_click(DT.getSFA1Value_Dropdown(), null);
    Thread.sleep(1000);
    Liabrary.custom_click(DT.getRoute1_Dropdown(), null);
    Thread.sleep(1000);
    Liabrary.custom_click(DT.getRoute1Value_Dropdown(), null);
    Thread.sleep(1000);
    Liabrary.custom_click(DT.getTransfer_btn(), null);
    Thread.sleep(1000);

    WebElement UploadText1 = driver.findElement(By.xpath("//span[@id='ParentMasterContentPlaceHolder1_RFVddlToDistributor']"));
    String Actual_Text1 = UploadText1.getText();
    System.out.println(Actual_Text1);
    String Expected_Text1 = "Select Distributor.";
    Assert.assertEquals(Expected_Text1, Actual_Text1);
    Thread.sleep(4000);
}

@Test(priority = 5)
public void DT_WithoutSelectRoute() throws Exception {

    HomePage hp = PageFactory.initElements(driver, HomePage.class);
    DM_DistributorTransfer DT = PageFactory.initElements(driver, DM_DistributorTransfer.class);

    Liabrary.custom_click(hp.getMaster_Menu(), "select Master Menu");
    Thread.sleep(1000);
    Liabrary.custom_click(hp.getDistributorMaster_SubMenu(), "select Distributor Master sub menu");
    Thread.sleep(1000);
    Liabrary.custom_click(DT.getDistributor_Transfer(), null);
    Thread.sleep(1000);

    WebElement UploadText = driver.findElement(By.xpath("//h4[normalize-space()='Distributor Transfer']"));
    String Actual_Text = UploadText.getText();
    System.out.println(Actual_Text);
    String Expected_Text = "Distributor Transfer";
    Assert.assertEquals(Expected_Text, Actual_Text);
    Thread.sleep(2000);

    Liabrary.custom_click(DT.getSFA1_Dropdown(), null);
    Thread.sleep(1000);
    Liabrary.custom_click(DT.getSFA1Value_Dropdown(), null);
    Thread.sleep(1000);
    Liabrary.custom_click(DT.getTransfer_btn(), null);
    Thread.sleep(1000);

    WebElement UploadText2 = driver.findElement(By.xpath("//span[@id='ParentMasterContentPlaceHolder1_RFVddlRoute']"));
    String Actual_Text2 = UploadText2.getText();
    System.out.println(Actual_Text2);
    String Expected_Text2 = "Select Route.";
    Assert.assertEquals(Expected_Text2, Actual_Text2);
    Thread.sleep(4000);
}
}
	
	
	
//}
