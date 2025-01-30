package HO_Reports_Credential;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com_Utility.BaseClass;
import Com_Utility.HomePage;
import Com_Utility.Liabrary;
import HO_Reports.AR_Activity_Reports_Main;

public class AR_Activity_Reports extends BaseClass{

	@Test
	public void Activity_Reports () throws Exception{
	HomePage hp = PageFactory.initElements(driver,HomePage.class);
	AR_Activity_Reports_Main AR = PageFactory.initElements(driver,AR_Activity_Reports_Main.class);

	
	Liabrary.custom_click(hp.getReports_Menu(), "Click on Report Menu");
	Thread.sleep(1000);
	
	
	Liabrary.custom_click(hp.getActivity_Report_SubMenu(), "Click on Activity Report Submenu");
	Thread.sleep(1000);
	
	
	Liabrary.custom_click(AR.getActivity_Report_Menu(),"Click on Activity Report Menu");
	Thread.sleep(1000);
	
	
	driver.findElement(By.xpath("//*[@id='ctl00_ParentMasterContentPlaceHolder1_Fromdate_dateInput']")).sendKeys("20/10/2024");
	Thread.sleep(1000);
	
	
	driver.findElement(By.xpath("//*[@id='ctl00_ParentMasterContentPlaceHolder1_Todate_dateInput']")).sendKeys("29/11/2024");
	Thread.sleep(1000);
	
	
	Liabrary.custom_click(AR.getView_Button(),"Click on view Button ");
	Thread.sleep(1000);
	
	
	Liabrary.custom_click(AR.getDownload_Button(), "Click on Download Button");
	Thread.sleep(1000);

}
	
	
	
	
	
	
	
	
	
	
	
}
