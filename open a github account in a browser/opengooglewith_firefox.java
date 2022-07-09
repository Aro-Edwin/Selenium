package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class opengooglewith_firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\ARO EDWIN\\Downloads\\geckodriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://github.com/Aro-Edwin/Selenium.git");
		driver.quit();
	}

}
