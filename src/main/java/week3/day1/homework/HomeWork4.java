package week3.day1.homework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com/draggable/");
		driver.findElementByLinkText("Draggable").click();
		WebElement frameXpath = driver.findElementByXPath("//iframe[@class='demo-frame']");
		driver.switchTo().frame(frameXpath);
		WebElement draggableText = driver.findElementByXPath("//p[text()='Drag me around']");
		System.out.println(draggableText.getText());
		driver.switchTo().defaultContent();
		driver.findElementByLinkText("Droppable").click();
		
	}

}
