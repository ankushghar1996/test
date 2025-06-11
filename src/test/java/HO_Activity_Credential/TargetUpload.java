package HO_Activity_Credential;

import java.util.List;

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
import HO_Activity.ActivityMaster_TargetUpload;

public class TargetUpload extends BaseClass {

	@Test
	public void Target_Upload() throws Exception {

		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		ActivityMaster_TargetUpload TU = PageFactory.initElements(driver, ActivityMaster_TargetUpload.class);
		Common_Data CD = PageFactory.initElements(driver, Common_Data.class);

		ObjectRepo.startTestAndLog_1_SS("HO_Activity_Credential_TargetUpload_TC01", "_Select Activity Menu", () -> {
			Liabrary.custom_click(hp.getActivity_Menu(), "select Activity Menu");
		});
		Thread.sleep(1000);

		ObjectRepo.startTestAndLog_1_SS("HO_Activity_Credential_TargetUpload_TC02", "Step_02_Select Activity Master Sub Menu", () -> {
			Liabrary.custom_click(hp.getActivityMaster_SubMenu(), "select Activity Master sub menu");
		});
		Thread.sleep(1000);

		ObjectRepo.startTestAndLog_1_SS("HO_Activity_Credential_TargetUpload_TC03", "Step_03_Select Target Upload Page", () -> {
			Liabrary.custom_click(TU.getTarget_Upload_Page(), "select Target Upload Page");
		});
		Thread.sleep(1000);

		ObjectRepo.startTestAndLog_1_SS("HO_Activity_Credential_TargetUpload_TC04", "Step_04_Verify Target Upload Header Text", () -> {
			WebElement UploadText = driver.findElement(By.xpath("(//*[normalize-space()='Target Upload'])[4]"));
			String Actual_Text = UploadText.getText();
			System.out.println(Actual_Text);
			String Expected_Text = "Target Upload";
			Assert.assertEquals(Expected_Text, Actual_Text);
		});
		Thread.sleep(2000);

		Thread.sleep(1000);

		ObjectRepo.startTestAndLog_1_SS("HO_Activity_Credential_TargetUpload_TC05", "Step_05_Select User Type 1 Dropdown", () -> {
			Liabrary.custom_click(TU.getUserType1_Dropdown(), "select User Type 1 Dropdown");
		});
		Thread.sleep(2000);

		ObjectRepo.startTestAndLog_1_SS("HO_Activity_Credential_TargetUpload_TC06", "Step_06_Select User Type 1 Option", () -> {
			Liabrary.custom_click(TU.getSelectUserType1(), "usertype1");
		});
		Thread.sleep(1000);

		ObjectRepo.startTestAndLog_1_SS("HO_Activity_Credential_TargetUpload_TC07", "Step_07_Select User Type 2 Dropdown", () -> {
			Liabrary.custom_click(TU.getUserTypes2_Dropdown(), "select User Type 2 Dropdown");
		});
		Thread.sleep(2000);

		ObjectRepo.startTestAndLog_1_SS("HO_Activity_Credential_TargetUpload_TC08", "Step_08_Select User Type 2 Option", () -> {
			Liabrary.custom_click(TU.getSelectUserType2(), "usertype2");
		});
		Thread.sleep(1000);

		ObjectRepo.startTestAndLog_1_SS("HO_Activity_Credential_TargetUpload_TC09", "Step_09_Select Month Dropdown", () -> {
			Liabrary.custom_click(TU.getSelectMonth_Dropdown(), "click on Select Month Dropdown");
		});
		Thread.sleep(1000);

		ObjectRepo.startTestAndLog_1_SS("HO_Activity_Credential_TargetUpload_TC10", "Step_10_Select Month", () -> {
			Liabrary.custom_click(TU.getSelectMonth(), "Month");
		});
		Thread.sleep(1000);

		ObjectRepo.startTestAndLog_1_SS("HO_Activity_Credential_TargetUpload_TC11", "Step_11_Select Year Dropdown", () -> {
			Liabrary.custom_click(TU.getSelectYear_Dropdown(), "click on Select Year Dropdown");
		});
		Thread.sleep(1000);

		ObjectRepo.startTestAndLog_1_SS("HO_Activity_Credential_TargetUpload_TC12", "Step_12_Select Year", () -> {
			Liabrary.custom_click(TU.getSelectYear(), "Year");
		});
		Thread.sleep(1000);

		ObjectRepo.startTestAndLog_1_SS("HO_Activity_Credential_TargetUpload_TC13", "Step_13_Click Upload Button", () -> {
			Liabrary.custom_click(TU.getUpload_Btn(), "select Upload button");
		});
		Thread.sleep(1000);

		ObjectRepo.startTestAndLog_1_SS("HO_Activity_Credential_TargetUpload_TC14", "Step_14_Select File Upload Button", () -> {
			driver.findElement(By.xpath("//*[@value=' +  Select File to upload']")).click();
		});
		Thread.sleep(1000);

		ObjectRepo.startTestAndLog_1_SS("HO_Activity_Credential_TargetUpload_TC15", "Step_15_Upload File from Path", () -> {
			driver.findElement(By.xpath("//*[@value=' +  Select File to upload']")).sendKeys("C:\\Users\\10277\\Downloads");
		});
		Thread.sleep(1000);
	}
}
