package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class images_selenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARO EDWIN\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Image.html");
		
		//Click on this image to go home page
		WebElement click=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/img"));
		click.click();
		
		//open the images page
		WebElement img=driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[4]/a/img"));
		img.click();
		
		//check Am I Broken Image?
		WebElement broken=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/img"));
		
		if(broken.getAttribute("naturalWidth").equals("0")) {
			System.out.println("Image is Broken !!!");
		}
		else {
			System.out.println("Image is not Broken....");
		}
		
		
	}

}
