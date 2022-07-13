package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sort_selenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARO EDWIN\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/sortable.html");
		
		List<WebElement> list=driver.findElements(By.xpath("//*[@id='sortable']//li"));
		
		WebElement drag=list.get(6);
		WebElement drop=list.get(0);
		
		Actions action=new Actions(driver);
		action.clickAndHold(drag);
		action.moveToElement(drop);
		action.release(drop);
		action.build().perform();
		
	}
	

}
