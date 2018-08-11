package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.Annotations;


public class CreateLead extends Annotations {

	public CreateLead() {
		PageFactory.initElements(driver, this);
	}


	@FindBy(id="createLeadForm_companyName")
	WebElement eleCName;

	@FindBy(id="createLeadForm_firstName")
	WebElement eleFName;

	@FindBy(id="createLeadForm_lastName")
	WebElement eleLName;

	@FindBy(xpath="//input[@value='Create Lead']")
	WebElement eleCreateLeadButton;
	
	@FindBy(className="errorMessage")
	WebElement eleError;

	public CreateLead typeCName(String cName) {

		type(eleCName, cName);
		return this;
	}

	public CreateLead typeFName(String fName) {

		type(eleFName, fName);
		return this;
	}

	public CreateLead typeLName(String lName) {

		type(eleLName, lName);
		return this;
	}


	public ViewLead clickCreateLeadButton() {
		click(eleCreateLeadButton);
		
	return new ViewLead();
	}
	
	public CreateLead clickCreateLeadButtonForFailure() {
		click(eleCreateLeadButton);
		return this;
	}
	
	public CreateLead errorVerification(String expectedText) {
		verifyPartialText(eleError, expectedText);
		return this;

	}	

}
