package Tcs;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.MyHomePage;
import wdMethods.Annotations;

public class CreateLeadTC_NEG extends Annotations {
	@BeforeTest
	public void setValues()
	{
		excelFileName= "CreateLeadTCNEG";
		moduleName = "leads";
		category = "sanity";
		author = "Abhijit";
		testName= "Create Lead";
		testDesc="Create a new Lead";
		moduleName= "Leads";


	}

	@Test(dataProvider = "fetchdata")
	public void CreateLead( String cName, String fName, String lName, String expectedText) {

		new MyHomePage()
		.clickLeads()
		.clickCreateLeads()
		.typeCName(cName)
		.typeFName(fName)
		.typeLName(lName)
		.clickCreateLeadButtonForFailure()
		.errorVerification(expectedText)
		.clickCreateLeadButton()
		.verifyFname(fName);
	}
}
