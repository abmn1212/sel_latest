package wdMethods;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import testcase.ExcelWorkbook;



public class Annotations extends SeMethods{
	public String excelFileName,testName,testDesc,category,author,moduleName;
	@BeforeSuite
	public void startSuite() {
		beginResult();
	}
	
	@BeforeClass
	public void startTest() {
		startTest(testName, testDesc);
	}

	@Parameters({"url","uName","pWord"})
	@BeforeMethod/*(groups= {"smoke","sanity"})*/
	public void login(String url, String uName, String pwd) {
		startTestIteration(moduleName, author, category);
		startApp("chrome", url);
		type(locateElement("id", "username"), uName);
		type(locateElement("id", "password"), pwd);
		click(locateElement("className", "decorativeSubmit"));
		click(locateElement("linkText", "CRM/SFA"));
	}
	
	@AfterMethod
	public void closeApp() {
		closeBrowser();
	}
	
	@AfterSuite
	public void stopSuite() {
		endResult();
	}
	
	@DataProvider(name = "fetchdata", indices = {0})
	public Object[][] getData() throws IOException {		
		ExcelWorkbook excel = new ExcelWorkbook();
		return excel.readExcel(excelFileName);		
	}
	
	
	
}
