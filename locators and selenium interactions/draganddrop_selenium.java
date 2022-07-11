package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop_selenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARO EDWIN\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/drop.html");

		//drag and drop
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		
		//create object for mouse oprations
		
		Actions action=new Actions(driver);
		action.dragAndDrop(drag, drop).build().perform();
		
		//another method
		//action.clickAndHold(drag).moveToElement(drop).release(drop).build().perform();
		
	
	}

}
