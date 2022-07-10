package Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windows_selenium {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARO EDWIN\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		
		String oldwindow=driver.getWindowHandle();
		
		//Click button to open home page in New Window and close
		WebElement option1=driver.findElement(By.id("home"));
		option1.click();
		Set<String> handles = driver.getWindowHandles();
		for (String newWindow : handles) {
			driver.switchTo().window(newWindow);
		}		
		WebElement editbox=driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a/h5"));
		editbox.click();
		driver.close();
		driver.switchTo().window(oldwindow);
		
		//find the number of opened windows
		WebElement option2=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		option2.click();
		int size=driver.getWindowHandles().size();
		System.out.println("No of Windows Opened :"+size);
		
		//close window expect main window
		WebElement option3=driver.findElement(By.id("color"));
		option3.click();
		Set<String> handle= driver.getWindowHandles();
		for (String allwindows : handle) {
			if(!allwindows.equals(oldwindow)) {
				driver.switchTo().window(allwindows);
				driver.close();
			}
			
		//wait for 2 windows open
		/*WebElement option4=driver.findElement(By.xpath("//*[@id=\'color\']"));
		option4.click();
		Thread.sleep(300);
		int x=driver.getWindowHandles().size();
		System.out.println(x);
		driver.quit();
		}
			*/
		}
	}
}
