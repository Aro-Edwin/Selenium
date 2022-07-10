package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown_selenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARO EDWIN\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		//select program using index
		WebElement dropdown1=driver.findElement(By.id("dropdown1"));
		Select slt1=new Select(dropdown1);
		slt1.selectByIndex(1);
		
		//select program using visible text
		WebElement dropdown2=driver.findElement(By.name("dropdown2"));
		Select slt2=new Select(dropdown2);
		slt2.selectByVisibleText("Selenium");
		
		//select program using value
		WebElement dropdown3=driver.findElement(By.id("dropdown3"));
		Select slt3=new Select(dropdown3);
		slt3.selectByValue("1");
		
		//number of dropdown options
		WebElement dropdown4=driver.findElement(By.className("dropdown"));
		Select slt4=new Select(dropdown4);
		List< WebElement > listoptions=slt4.getOptions();
		int size=listoptions.size();
		System.out.println("Number of dropdown options "+size);
		
		//using send keys in dropdown
		WebElement dropdown5=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/select"));
		dropdown5.sendKeys("Appium");
		
		//select multiple choice
		WebElement dropdown6=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[6]/select"));
		Select slt6=new Select(dropdown6);
		slt6.selectByIndex(1);
		slt6.selectByIndex(2);
		slt6.selectByIndex(3);
		slt6.selectByIndex(4);
		
	}

}
