package com.esri.test.auto.pages;

import com.esri.test.auto.utils.Reporter;
import com.esri.test.auto.wrappers.ESRIWrappers;

/**
 *  This is the Germany Impressum Page of ESRI Distributor Application
 * 
 * @author Udhayasundar S
 *
 */
public class Dist_Germany_ImpressumPage extends ESRIWrappers {
	public Dist_Germany_ImpressumPage() throws Throwable {
		waitForPageLoad(15);
		if (!VerifyTitle("Impressum | Esri Deutschland")) {
			Reporter.reportStep("This is not a Impressum | Esri Deutschland (Germany) page.", "FAIL");
		} else
			System.out.println("Germany Impressum | Esri Deutschland page Launched Successfully");
	}

	// click back button in browser
	public Dist_Germany_HomePage clickbsrBackBtn() throws Throwable {
		try {
			clickBrowserBackButton();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new Dist_Germany_HomePage();
	}

	// verify Impressum label
	public Dist_Germany_ImpressumPage verifyImpressumlbl(String data) throws Throwable {
		try {
			verifyValueByXpath(prop.getProperty("disGermanyImp.ImpressumLabel.xpath"), data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
}
