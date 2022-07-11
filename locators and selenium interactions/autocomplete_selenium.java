package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autocomplete_selenium {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARO EDWIN\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/autoComplete.html");
		
		WebElement input=driver.findElement(By.xpath("//*[@id=\'tags\']"));
		input.sendKeys("s");
		Thread.sleep(4000);
		List<WebElement> list=driver.findElements(By.xpath("//*[@id=\'ui-id-1\']/li"));
		System.out.println(list.size());
		for (WebElement option : list) {
			if(option.getText().equals("Web Services"))
			{
				option.click();
				System.out.println("selecting"+option.getText());
				break;
			}	
		}	
	}
}
