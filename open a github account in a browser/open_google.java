package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class open_google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//open the chrome app and search our github accout
		
		//set pantrom(browser,driverlocation)
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ARO EDWIN\\Downloads\\chromedriver\\chromedriver.exe");
		//object creation
		WebDriver driver= new ChromeDriver();
		//open github function
		driver.get("https://github.com/Aro-Edwin/Selenium.git");
	}

}
