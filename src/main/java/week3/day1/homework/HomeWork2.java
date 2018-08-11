package week3.day1.homework;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://layout.jquery-dev.com/demos/iframes_many.html");
		List<WebElement> iframeCount = driver.findElementsByTagName("iframe");
		System.out.println("Total number of frames: " +iframeCount.size());
		WebElement frame1 = driver.findElementByXPath("//iframe[@longdesc='http://newslookup.com']");
		driver.switchTo().frame(frame1);
		List<WebElement> childFrame1 = driver.findElementsByTagName("iframe");
		System.out.println("Total number of child frames in frame1: " +childFrame1.size());
		driver.switchTo().defaultContent();
		WebElement frame2 = driver.findElementByXPath("//iframe[@src='http://www.dogpile.com/']");
		driver.switchTo().frame(frame2);
		List<WebElement> childFrame2 = driver.findElementsByTagName("iframe");
		System.out.println("Total number of child frames in frame2: " +childFrame2.size());
		driver.switchTo().defaultContent();
		WebElement frame3 = driver.findElementByXPath("//iframe[@longdesc='http://bing.com']");
		driver.switchTo().frame(frame3);
		List<WebElement> childFrame3 = driver.findElementsByTagName("iframe");
		System.out.println("Total number of child frames in frame3: " +childFrame3.size());
		driver.switchTo().defaultContent();
		WebElement frame4 = driver.findElementByXPath("//iframe[@longdesc='http://botw.org/']");
		driver.switchTo().frame(frame4);
		List<WebElement> childFrame4 = driver.findElementsByTagName("iframe");
		System.out.println("Total number of child frames in frame4: " +childFrame4.size());
		driver.switchTo().defaultContent();
		WebElement frame5 = driver.findElementByXPath("//iframe[@longdesc='http://duckduckgo.com']");
		driver.switchTo().frame(frame5);
		List<WebElement> childFrame5 = driver.findElementsByTagName("iframe");
		System.out.println("Total number of child frames in frame5: " +childFrame5.size());
		driver.switchTo().defaultContent();
		
	}

}
