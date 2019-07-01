package jobScraper;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import jobScraper.StData;
import jobScraper.Filter;
import jobScraper.WriteFile;

public class Scraper {
	
	// TODO: make option whether to search by different criteria (pad/unpaid, internship/fulltime job, etc)
	
	public static void main(String[] args) throws IOException {
		
		// set up webdriver
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Uros\\eclipse-workspace\\selenium\\src\\jobScraper\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		// open browser/fetch page
		driver.get(StData.getUrlPr());
		
		// target ad container
		WebElement p = driver.findElement(By.xpath(StData.getTargetContainer()));
		
		// filter h3 by location keyword
		List<WebElement> r = p.findElements(By.xpath("//h3[text()[contains(., '" + StData.getLocation() + "')]]"));
		List<WebElement> q = p.findElements(By.xpath("//h3[text()[contains(., '" + StData.getLocation() + "')]]/following-sibling::ul"));
		
		// grab ad content after h3
		for(WebElement e : q) {
			System.out.println(e.getText());
		}
		
		WriteFile data = new WriteFile("test");
		
		try {
			data.writeToFile("test");
		} 
		catch(IOException ex)
		{
			ex.printStackTrace();
			System.out.println("Wrong!");
		}

	}
}
