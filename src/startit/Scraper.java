package startit;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import startit.Data;
import startit.WebElements;

public class Scraper {
	
	// TODO: make option whether to search by different criteria (paid/unpaid, internship/fulltime job, etc)	
	public static void main(String[] args) {
		
		File driverFile = new File("C:\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", driverFile.getAbsolutePath());
		
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		driver.get(Data.getUrl());
		
		String location = "Beograd";
		
		// target h3 by keyword
		List<WebElement> p = WebElements.getH3(driver, location);
		List<WebElement> q = WebElements.getUl(driver, location);
		
//		Filter.byKeywords(p, Filter.keywords);
		
//		// grab ad content after h3
//		for(WebElement e : p) {
//			System.out.println(e.getText());
//			System.out.println("----------------------------------------------");
//		}
		
		for(int i = 0; i < p.size(); i++) {
			System.out.println(p.get(i).getText());
			System.out.println(q.get(i).getText());
			System.out.println("----------------------------------------------");
		}
		
		driver.quit();
	}
}
