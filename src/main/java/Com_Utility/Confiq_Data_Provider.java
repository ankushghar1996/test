package Com_Utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Confiq_Data_Provider {

	
	private Properties pro;
	public  Confiq_Data_Provider() throws Exception {
		String confiqpath=System.getProperty("user.dir")+"\\Config_TestData\\Confiq.properties";
		File f =new File(confiqpath);
		FileInputStream file=new FileInputStream(f);
		pro=new Properties();
		pro.load(file);
	}
	
	
	public String get_BaseURL() { 
		return pro.getProperty("Testing_URL");
	}
//	public String get_CPA_username() { 
//		return pro.getProperty("CPA_Username");
//	}
//	public String get_cpa_password() { 
//		return pro.getProperty("CPA_pass");
//	}
//	public String get_Browser_name() { 
//		return pro.getProperty("Browser");
//	}
	
	
}
	
	
	

	
	
	
	
	
	
	
	
	
	
	

