package Selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class downloadfiles_selenium {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARO EDWIN\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://masstamilan.in/vikram-2022/");
		
		WebElement openlink=driver.findElement(By.linkText("128kbps Zip Download"));
		openlink.click();
		Thread.sleep(8000);
		
		File files=new File("C:\\Users\\ARO EDWIN\\Downloads");
		File[] file=files.listFiles();
		for (File id : file) {
			if (id.getName().equals("Vikram.zip")){
				System.out.println("File is downloaded");
			}
		}


	}

}
