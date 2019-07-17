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

public class Scrape {
	
	// TODO: make option whether to search by different criteria (paid/unpaid, internship/fulltime job, etc)	
	public static void main(String[] args) {
		
		File driverFile = new File("C:\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", driverFile.getAbsolutePath());
		
		WebDriver d = new ChromeDriver();
//		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		d.get(Data.getUrl());
		
		String location = "Beograd";
		
		// target h3 and ul by keyword parameter
		List<WebElement> p = WebElements.getH3(d, location);
		List<WebElement> q = WebElements.getUl(d, location);
		
//		Filter.byKeywords(p, Filter.keywords);
			
		for(int i = 0; i < p.size(); i++) {
			System.out.println(p.get(i).getText());
			System.out.println(q.get(i).getText());
			System.out.println("----------------------------------------------");
		}
		
		d.quit();
	}
}
