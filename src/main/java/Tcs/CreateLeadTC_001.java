package Tcs;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.MyHomePage;
import wdMethods.Annotations;

public class CreateLeadTC_001 extends Annotations {
	@BeforeTest
	public void setValues()
	{
		excelFileName= "CreateLeadTC";
		moduleName = "leads";
		category = "";
		author = "";
		testName= "Create Lead";
		testDesc="Create a new Lead";
		moduleName= "Leads";
	}
	
	@Test(dataProvider = "fetchdata")
	public void CreateLead( String cName, String fName, String lName  ) {
		
		new MyHomePage()
		.clickLeads()
		.clickCreateLeads()
		.typeCName(cName)
		.typeFName(fName)
		.typeLName(lName)
		.clickCreateLeadButton()
		.verifyFname(fName);
	
	}
}
