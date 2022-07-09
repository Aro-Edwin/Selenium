package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class tableedit_selenium {

	public static void main(String[] args) {
		
		//testleaf website

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ARO EDWIN\\Downloads\\geckodriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");
		
		WebElement emailbox = driver.findElement(By.id("email"));
		emailbox.sendKeys("aroedwin53@gmail.com"+Keys.ENTER);
		
		WebElement appendbox =driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input"));
		appendbox.sendKeys(" words added ");
		
		WebElement gettextbox=driver.findElement(By.name("username"));
		String value=gettextbox.getAttribute("value");
		System.out.println(value);
		
		WebElement boxclear=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
		boxclear.clear();
		
		WebElement disabledbox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/div/div/input"));
		boolean enabled= disabledbox.isEnabled();
		System.out.println(enabled);
	}

}
