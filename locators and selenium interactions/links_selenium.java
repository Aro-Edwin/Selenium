package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class links_selenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARO EDWIN\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/Link.html");
		
		//Go to Home Page
		WebElement home=driver.findElement(By.linkText("Go to Home Page"));
		home.click();
		
		//back to the base page
		driver.navigate().back();
		
		//Find where am supposed to go without clicking me?
		WebElement find=driver.findElement(By.partialLinkText("Find where"));
		String link=find.getAttribute("href");
		System.out.println("The link goes to :"+link);
		
		WebElement broken=driver.findElement(By.linkText("Verify am I broken?"));
		broken.click();
		String title=driver.getTitle();
		if(title.contains("404")) {
			System.out.println("This Link Is Broken!!!!");
		}
		else {
			System.out.println("This Link is Not Broken");
		}
		
		driver.navigate().back();
		
		//Go to Home Page (Interact with same link name)
		home.click();
		driver.navigate().back();
		
		//How many links are available in this page?

		List<WebElement> no=driver.findElements(By.tagName("a"));
		int size=no.size();
		System.out.println(size);
	}

}
