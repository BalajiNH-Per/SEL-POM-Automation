package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the India Training Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Dist_India_CustEduServicesPage extends ESRIWrappers {
	public Dist_India_CustEduServicesPage() throws Throwable {
		waitForPageLoad(15);
		if (!VerifyTitle("Customer Education Services")) {
			Reporter.reportStep("This is not a Customer Education Services (India) page.", "FAIL");
		} else
			System.out.println("India Customer Education Services page Launched Successfully");
	}

	// click back button in browser
	public Dist_India_HomePage clickbsrBackBtn() throws Throwable {
		try {
			clickBrowserBackButton();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_India_HomePage();
	}

	// verify Customer Education Services label
	public Dist_India_CustEduServicesPage verifyCustEduServlbl(String data) throws Throwable {
		try {
			verifyValueById(prop.getProperty("disIndiaCustEduSer.custEduSerLabel.id"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	
}
