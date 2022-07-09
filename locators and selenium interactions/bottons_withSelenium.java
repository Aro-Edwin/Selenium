package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class bottons_withSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ARO EDWIN\\Downloads\\geckodriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
		
		
		//find the xy position
		WebElement getpositionbtn=driver.findElement(By.id("position"));
		Point xypoint=getpositionbtn.getLocation();
		int x=xypoint.getX();
		int y=xypoint.getY();
		System.out.println("x value is"+x+" y value is "+y);
		
		
		//find the colour
		WebElement colourbtn=driver.findElement(By.id("color"));
		String color=colourbtn.getCssValue("background-color");
		System.out.println(color);
		
		//find the size
		WebElement sizebtn=driver.findElement(By.id("size"));
		int height=sizebtn.getSize().getHeight();
		int weight=sizebtn.getSize().getWidth();
		System.out.println("button size is :"+height+weight);
		
		//go to home botton
		WebElement homebtn=driver.findElement(By.id("home"));
		homebtn.click();
		

	}

}
