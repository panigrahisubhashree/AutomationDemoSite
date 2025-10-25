

package com.AutomationDemoSite.genernic.fileutility;

/**
 * author Subhashree_Panigrahi
 * FileUtility class to fetch common data from external property file
 * 
 */
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {

	public String getDataFromPropertiesFile(String key) throws IOException {
		
		FileInputStream fis = new FileInputStream("src\\main\\resources\\ConfigData\\commonDataOfDemoAutomationTesting.properties");
		Properties pobj = new Properties();
		pobj.load(fis);
		String data = pobj.getProperty(key);
		return data;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
