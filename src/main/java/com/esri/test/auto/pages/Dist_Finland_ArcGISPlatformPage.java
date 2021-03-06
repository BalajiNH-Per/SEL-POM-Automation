package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the Finland ArcGIS Platform | Platform Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Dist_Finland_ArcGISPlatformPage extends ESRIWrappers {
	public Dist_Finland_ArcGISPlatformPage() throws Throwable {
		waitForPageLoad(15);
		if (!VerifyTitle("ArcGIS Platform | Platform")) {
			Reporter.reportStep("This is not a ArcGIS Platform | Platform (finland) page.", "FAIL");
		} else
			System.out.println("Finland ArcGIS Platform | Platform page Launched Successfully");
	}

	// click back button in browser
	public Dist_Finland_HomePage clickbsrBackBtn() throws Throwable {
		try {
			clickBrowserBackButton();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_Finland_HomePage();
	}

	// verify ArcGIS desktop label
	public Dist_Finland_ArcGISPlatformPage verifyArcGISPlatformlbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disFinlandHome.ArcGISPlatformLbl.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
}
