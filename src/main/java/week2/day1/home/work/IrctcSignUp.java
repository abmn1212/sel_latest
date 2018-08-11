package week2.day1.home.work;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class IrctcSignUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions op = new ChromeOptions();
		op.setHeadless(false);
		ChromeDriver driver = new ChromeDriver(op);
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		
		WebElement userId = driver.findElementById("userRegistrationForm:userName");
		userId.sendKeys("AbhijitMani");
		
		driver.findElementById("userRegistrationForm:password").sendKeys("Broadsword12");
		
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("Broadsword12");
		
		WebElement securityQuestion = driver.findElementById("userRegistrationForm:securityQ");
		Select ques = new Select(securityQuestion);
		ques.selectByIndex(1);
		
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("Danny");
		
		WebElement language = driver.findElementById("userRegistrationForm:prelan");
		Select lang = new Select(language);
		lang.selectByVisibleText("English");
		
		driver.findElementById("userRegistrationForm:firstName").sendKeys("Abhijit");
		
		driver.findElementById("userRegistrationForm:lastName").sendKeys("Mani");
		
		driver.findElementById("userRegistrationForm:gender:0").click();
		
		driver.findElementById("userRegistrationForm:maritalStatus:1").click();
		
		WebElement date = driver.findElementById("userRegistrationForm:dobDay");
		Select d = new Select(date);
		d.selectByVisibleText("12");
		
		WebElement month = driver.findElementById("userRegistrationForm:dobMonth");
		Select m = new Select(month);
		m.selectByVisibleText("DEC");
		
		WebElement year = driver.findElementById("userRegistrationForm:dateOfBirth");
		Select y = new Select(year);
		y.selectByVisibleText("1994");
		
		WebElement occupation = driver.findElementById("userRegistrationForm:occupation");
		Select occ = new Select(occupation);
		occ.selectByVisibleText("Private");
		
		driver.findElementById("userRegistrationForm:uidno").sendKeys("55555", Keys.TAB);
		
		driver.findElementById("userRegistrationForm:idno").sendKeys("BUB4545", Keys.TAB);
		
		WebElement country = driver.findElementById("userRegistrationForm:countries");
		Select c = new Select(country);
		
		c.selectByVisibleText("India");
		
		driver.findElementById("userRegistrationForm:email").sendKeys("ab121294@gmail.com", Keys.TAB);
		
		driver.findElementById("userRegistrationForm:mobile").sendKeys("9884775419", Keys.TAB);
		
		WebElement nationality = driver.findElementById("userRegistrationForm:nationalityId");
		Select n = new Select(nationality);
		
		n.selectByVisibleText("India");
		
		driver.findElementById("userRegistrationForm:address").sendKeys("No2 kumaraswamynagar");
		
		driver.findElementById("userRegistrationForm:pincode").sendKeys("600126", Keys.TAB);
		
		Thread.sleep(2000);
		
		WebElement city = driver.findElementById("userRegistrationForm:cityName");
		Select cit = new Select(city);
		cit.selectByIndex(1);
		
		Thread.sleep(2000);
		
		WebElement postOffice = driver.findElementById("userRegistrationForm:postofficeName");
		Select post = new Select(postOffice);
		post.selectByIndex(2);
		
		List<WebElement> allOptions = post.getOptions();
		int size = allOptions.size();
		System.out.println(size);
		
		for(WebElement disp : allOptions) 
		{
		System.out.println(disp.getText());	
		}
		
		driver.findElementById("userRegistrationForm:landline").sendKeys("044566478");

	}

}
