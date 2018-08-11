package week3.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearningFrames {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[@onclick='myFunction()']").click();
		Alert myAlert = driver.switchTo().alert();
	    System.out.println(myAlert.getText()); 
	    Thread.sleep(2000);
	    myAlert.sendKeys("Abhijit Sridurga");
	    Thread.sleep(1000);
	    myAlert.accept();
	    WebElement dispText = driver.findElementByXPath("//p[contains(text(),'How are you')]");
	    System.out.println(dispText.getText());
	    Thread.sleep(2000);
	    driver.switchTo().defaultContent();
	    driver.findElementById("tryhome").click();;
	    Thread.sleep(2000);
	    driver.close();

	}

}
