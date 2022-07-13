package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendares_selenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARO EDWIN\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Calendar.html");
		
		WebElement calendar=driver.findElement(By.id("datepicker"));
		calendar.click();
		
		//perform by sendkeys
		//calendar.sendKeys("01/10/2019"+Keys.ENTER);
		
		
		//for next botton click
		WebElement next=driver.findElement(By.xpath("//a[@title ='Next']"));
		next.click();
		
		//for click 10 date create path
		WebElement pick=driver.findElement(By.xpath("//a[contains(text(),'10')]"));
		pick.click();


	}

}
