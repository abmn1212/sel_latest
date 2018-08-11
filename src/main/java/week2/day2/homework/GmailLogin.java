package week2.day2.homework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GmailLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     ChromeDriver driver = new ChromeDriver();
     ChromeOptions op = new ChromeOptions();
     op.setHeadless(false);
     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
     driver.get("https://www.google.com/gmail/about/#");
     driver.findElementByXPath("//a[text()=\"Sign In\"]").click();
     driver.findElementByXPath("//input[@id='identifierId']").sendKeys("abmn121294");
     driver.findElementByXPath("(//content[@class='CwaK9'])[3]").click();
     Thread.sleep(10000);
     driver.findElementByXPath("(//input[@tabindex='0'])[1]").sendKeys("abmngmail");
     driver.findElementByXPath("(//content[@class='CwaK9'])[1]").click();
     Thread.sleep(10000);
     driver.findElementByXPath("//span[contains(@class,'gbii')]").click();
     Thread.sleep(5000);
     driver.findElementByLinkText("Sign out").click();
     
     
     
	}

}
