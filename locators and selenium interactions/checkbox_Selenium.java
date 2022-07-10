package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox_Selenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARO EDWIN\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/checkbox.html");
		  
		//select the languages that you know
		WebElement langknow=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/input[1]"));
		langknow.click();
		
		//Confirm Selenium is checked
		WebElement check=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/input"));
		System.out.println("selenium is checked :"+check.isSelected());
		
		//DeSelect only checked
		WebElement select1=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/input[1]"));
		if(select1.isSelected()) {
			select1.click();
		}
		
		WebElement select2=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/input[2]"));
		if(select2.isSelected()) {
			select2.click();
		}
	
	}
	

}
