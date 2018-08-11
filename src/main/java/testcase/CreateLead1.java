package testcase;

import java.io.IOException;

//import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wdMethods.Annotations;
import wdMethods.SeMethods;

public class CreateLead1 extends Annotations{
	
	
	
	
	

	@Test/*(dataProvider="fetchdata")*/
	public void createLead (String companyName, String fName, String lName, String email, String pNo) throws InterruptedException {
		/*startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");
		WebElement elePassword = locateElement("id","password");
		type(elePassword, "crmsfa");
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);*/
		//Thread.sleep(1000);
		WebElement elecrm = locateElement("linktext","CRM/SFA");
		click(elecrm);
		WebElement elecreate = locateElement("linktext","Create Lead1");
		click(elecreate);
		WebElement elecompanyname = locateElement("id","createLeadForm_companyName");
		type(elecompanyname, companyName);
		WebElement elefirstname = locateElement("id","createLeadForm_firstName");
		type(elefirstname, fName);
		WebElement elelastname = locateElement("id","createLeadForm_lastName");
		type(elelastname, lName);
		
		WebElement eleemail = locateElement("id","createLeadForm_primaryEmail");
		type(eleemail, email);
		
		WebElement elephone = locateElement("id","createLeadForm_primaryPhoneNumber");
		type(elephone, pNo);
		
		String sGetFirstName=getAttribute(elefirstname,"value");
		WebElement elesubmit = locateElement("class","smallSubmit");
		click(elesubmit);
		Thread.sleep(1000);
		WebElement eleverifyfirstname = locateElement("id","viewLead_firstName_sp");
		verifyExactText(eleverifyfirstname,sGetFirstName);

	}
}











