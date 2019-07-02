package jobScraper;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import jobScraper.StData;
import jobScraper.StElems;

public class Scraper {
	
	// TODO: make option whether to search by different criteria (pad/unpaid, internship/fulltime job, etc)	
	public static void main(String[] args) {
		
//		/* set up web driver */
//		// find your working directory
////		System.out.println(System.getProperty("user.dir"));
//		
//		// setProperty if not using environment variable for your web driver engine
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\src\\jobScraper\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		driver.get(StData.getUrlInt());

		// target h3 by keyword
		List<WebElement> p = StElems.filterByLocation(driver);

		// grab ad content after h3
		for(WebElement e : p) {
			System.out.println(e.getText());
		}
		
		driver.quit();
	}
}
