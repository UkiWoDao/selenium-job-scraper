package jobScraper;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import jobScraper.StData;

public class Scraper {
	
	public static void main(String[] args) {
		
		// set up webdriver
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Uros\\eclipse-workspace\\selenium\\src\\jobScraper\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		ArrayList<String> keywords = new ArrayList<>();
		keywords.add("web develop");
		keywords.add("javascript");
		keywords.add("qa");
		keywords.add("java");
		keywords.add("frontend");
		keywords.add("front-end");
		
		// open browser/fetch page
		driver.get(StData.getUrlPr());
		
		// target ad container
		WebElement p = driver.findElement(By.xpath(StData.getTargetContainer()));
		
		// filter h3 by location keyword
		List<WebElement> q = p.findElements(By.xpath("//h3[text()[contains(., 'Beograd')]]/following-sibling::ul"));
		
		// grab ad content after h3
		for(WebElement e : q) {
			System.out.println(e.getText());
		}
		
		// filter by job ad keywords
//		System.out.println(q.size());
		List<WebElement> jobs;
		
	
	}
}
