package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 * This is the Finland ArcGIS Online Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Dist_Finland_ArcGISOnlinePage extends ESRIWrappers {
	public Dist_Finland_ArcGISOnlinePage() throws Throwable {
		waitForPageLoad(15);
		if (!VerifyTitle("ArcGIS Online - Create Web Maps, Applications, and Data in the Cloud")) {
			Reporter.reportStep("This is not a ArcGIS Online (Finland) page.", "FAIL");
		} else
			System.out.println("Finland ArcGIS Online  page Launched Successfully");
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

	// verify ArcGIS online label
	public Dist_Finland_ArcGISOnlinePage verifyArcGISOnlinelbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disFinlandHome.ArcGISonlineLbl.xpath"), data);
			System.out.println(getTextByXpath(prop.getProperty("disFinlandHome.ArcGISonlineLbl.xpath")));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
}
