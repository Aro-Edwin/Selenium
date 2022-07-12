package Selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tables_selenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARO EDWIN\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");

		
		//Get the count of number of columns
		List <WebElement> colums=driver.findElements(By.tagName("th"));
		System.out.println("Number of coloums : "+colums.size());
	
		//Get the count of number of rows
		List<WebElement>row=driver.findElements(By.tagName("tr"));
		System.out.println("Nummber of rows :"+row.size());
		
		//Get the progress value of 'Learn to interact with Elements'
		
		WebElement value=driver.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));
		String per=value.getText();
		System.out.println("Learn to interact with Elements prograss :"+per);
	
		//Check the vital task for the least completed progress
		
		//store the integer value create array
		
		List<WebElement> list=driver.findElements(By.xpath("//td[2]"));
		List<Integer> numberlist=new ArrayList<Integer>(); 
		for (WebElement element : list) {
			//remove percentage from get text 100%
			String listof=element.getText().replace("%", "");
			
			//convert string to integer
			numberlist.add(Integer.parseInt(listof));
		}
		//use collection.min for find the low value of the aary
		int smallno=Collections.min(numberlist);
		//System.out.println(smallno);
		
		//td[normalize-space()='20%']//following::td[1]
		String val=Integer.toString(smallno)+"%";

		String finapath="//td[normalize-space()="+'\''+val+'\''+"]//following::td[1]";
		//System.out.println(finapath);
		
		WebElement check=driver.findElement(By.xpath(finapath));
		check.click();
	
	
	
	}

}
