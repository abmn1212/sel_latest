package week3.day1.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		Thread.sleep(2000);
		driver.findElementByLinkText("Contact Us").click();;
		driver.findElementByLinkText("Compatible Browser").click();
		Set<String> setOfWinHan = driver.getWindowHandles();
		List<String> listOfWinHan = new ArrayList<String>();
		listOfWinHan.addAll(setOfWinHan);
		driver.switchTo().window(listOfWinHan.get(1));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().window(listOfWinHan.get(2));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().window(listOfWinHan.get(0));
		driver.close();
		driver.switchTo().window(listOfWinHan.get(2));
		driver.close();
		driver.switchTo().window(listOfWinHan.get(1));
		List<WebElement> compBrowser = driver.findElementsByTagName("li");
		for(WebElement listCompBrowser:compBrowser) 
		{
			System.out.println(listCompBrowser.getText());
		}
		
		

	}

}
