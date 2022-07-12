package Selenium;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadfile_selenium {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARO EDWIN\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://photoscissors.com/");
		
		WebElement uploadfile=driver.findElement(By.xpath("//*[@id=\'uploadForm\']/div/button"));
		uploadfile.click();
	
		String file="C:\\Users\\ARO EDWIN\\Downloads\\pic.jpg";
		
		StringSelection select=new StringSelection(file);
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select, null);
		
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	    
	
	}
	

}
