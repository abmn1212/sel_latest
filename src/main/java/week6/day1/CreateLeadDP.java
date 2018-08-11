package week6.day1;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import wdMethods.Annotations;

public class CreateLeadDP extends Annotations{

	@Test(dataProvider = "fetchData")
	public void createLead(String cName, String fName, String lName, String email, int ph) {			
		click(locateElement("linkText", "Create Lead"));
		type(locateElement("id", "createLeadForm_companyName"), cName);
		type(locateElement("id", "createLeadForm_firstName"), fName);
		type(locateElement("id", "createLeadForm_lastName"), lName);
		type(locateElement("id", "createLeadForm_primaryEmail"), email);
		type(locateElement("id", "createLeadForm_primaryPhoneNumber"), ""+ph);
		click(locateElement("name", "submitButton"));			
	}



	/*@DataProvider(name = "fetchData1", indices = {1})
	public Object[] getData1() {
		Object[] data = new Object[5];		
		data[0] ="TestLeaf";
		data[1] ="Babu";
		data[2] ="M";
		data[3] ="babu@testleaf.com";
		data[4] =12345678;	 	

		return data;*/
	}

	