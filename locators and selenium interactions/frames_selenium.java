	package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames_selenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARO EDWIN\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
		
		
		//I am inside a frame
		driver.switchTo().frame(0);
		WebElement inside=driver.findElement(By.id("Click"));
		inside.click();
		String text=driver.findElement(By.id("Click")).getText();
		System.out.println(text);
		
		driver.switchTo().defaultContent();
		//I am inside a nested frame
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		WebElement nested=driver.findElement(By.id("Click1"));
		nested.click();

		driver.switchTo().defaultContent();
		//Find total number of frames.
		List<WebElement> totalframes=driver.findElements(By.tagName("iframe"));
		int size=totalframes.size();
		System.out.println("Total number of Frames"+size);
	}

}
