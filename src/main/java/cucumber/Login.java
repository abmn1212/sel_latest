package cucumber;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Login {
	public ChromeDriver driver;
	@Given ("Open the browser")
	public void OpenBrowser()
	{
		driver= new ChromeDriver();

	}
	@And ("Maximize the window")
	public void maximize()
	{
		driver.manage().window().maximize();

	}
	@And ("Load the URL")
	public void loadURL()
	{
		driver.get("http://leaftaps.com/opentaps/control/main");

	}
	@And ("Set the TimeOut")
	public void timeOut()
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);


	}
	@And ("Enter the Username (.*)")
	public void userName(String uName)
	{
		driver.findElementById("username").sendKeys(uName);

	}
	@And ("Enter the Password (.*)")
	public void pwd(String pwd)
	{
		driver.findElementById("password").sendKeys(pwd);
	}
	
	@And ("Click on Login button")
	public void clickLogin()
	{
		driver.findElementByClassName("decorativeSubmit").click();
	}
	
	@And ("Verify login is successful")
	public void loginSuccess()
	{
		System.out.println("Login succesful! :)");
	}
	
	@And ("Click on CRMSFA")
	public void clickCRMSFA()
	{
		driver.findElementByXPath("//a[contains(text(), 'CRM')]").click();
	}
	
	@And ("Click Create Lead link")
		public void enterFName()
		{
			driver.findElementByPartialLinkText("Create Lead").click();
		}

	@And ("Enter Company Name (.*)")
	public void enterCName(String cName)
	{
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
	}
	
	@And ("Enter First Name (.*)")
	public void enterfName(String fName)
	{
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
	}
	
	@And ("Enter Last Name (.*)")
	public void enterLName(String lName)
	{
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
	}
	
	@When ("Click on Create Lead button")
	public void createLead()
	{
		driver.findElementByXPath("//input[@value = 'Create Lead']").click();
	}
	
	@Then ("Create Lead is successful")
	public void leadSuccess()
	{
		System.out.println("Create Lead is successful! :)");
	}
	
	@But ("Create Lead failed")
	public void leadFail()
	{
		System.out.println("Create Lead Failed :( ");
	}
	
}
