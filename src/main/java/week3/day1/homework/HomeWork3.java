package week3.day1.homework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://layout.jquery-dev.com/demos/iframe_local.html");
		driver.findElementByXPath("(//button[text()='Close Me'])[1]").click();
		WebElement iframe1 = driver.findElementByXPath("//iframe[@src='iframe_local_child.html']");
		driver.switchTo().frame(iframe1);
		driver.findElementByXPath("(//button[text()='Close Me'])").click();
		driver.findElementByXPath("(//button[text()='Close Me'])[2]").click();
		driver.switchTo().defaultContent();
		driver.findElementByXPath("(//button[text()='Close Me'])[2]").click();
		
		

	}

}
