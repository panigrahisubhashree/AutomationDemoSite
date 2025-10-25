
package com.AutomationDemoSite.genernic.listenerUtility;

/**
 * author Subhashree_Panigrahi
 * RetryListenerImplementation class created to handle Re-Execution of failed testScript
 * 
 */
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryListenerImplimentation implements IRetryAnalyzer {

	int count = 0;
	int limitcount = 3;

	public boolean retry(ITestResult result) {
		if (count < limitcount) {
			count++;
			return true;
		}
		return false;
	}

}
