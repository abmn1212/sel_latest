package week3.day1.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://popuptest.com/");
		driver.findElementByLinkText("Multi-PopUp Test #2").click();
		Set<String> setWinHan = driver.getWindowHandles();
		List<String> listWinHan = new ArrayList<String>();
		listWinHan.addAll(setWinHan);
		driver.switchTo().window(listWinHan.get(1));
		driver.close();
		driver.switchTo().window(listWinHan.get(2));
		driver.close();
		driver.switchTo().window(listWinHan.get(3));
		driver.close();
		driver.switchTo().window(listWinHan.get(0));
		System.out.println("Parent window URL is: " +driver.getCurrentUrl());
		System.out.println("Parent window title is: " +driver.getTitle());
		
		
		

	}

}
