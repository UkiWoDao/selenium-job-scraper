package helloworld;

import java.io.File;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.Filter;
import utilities.Print;

import org.openqa.selenium.WebElement;

public class Scrape {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO: implement waits instead of thread sleeps
		
		File driverFile = new File("C:\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", driverFile.getAbsolutePath());
		
		WebDriver d = new ChromeDriver();
				
		// navigate to helloworld website
		d.get(Data.URL);
		
		d.manage().window().maximize();
			
//		// select city
//		Interact.clickGrad(d);
//		Interact.inputGrad(d);
//		Thread.sleep(1000);
//		
//		// select level of expertise
//		Interact.clickSenioritet(d);
//		Thread.sleep(1000);
//		Interact.inputSenioritet(d);
//		Thread.sleep(1000);
//			
//		Interact.clickMenuProgramiranje(d);
//		
		List<WebElement> devH3s = WebElements.getAllJobHeadings(d);
		
		List<WebElement> filteredDevH3s = Filter.byKeyword(devH3s, Data.getDevKeywords());
		
		Print.webElements(filteredDevH3s);
		
//		// toggle menu item off
//		Interact.clickMenuProgramiranje(d);
//		
//		Interact.clickMenuPrakse(d);
//		Thread.sleep(1000);
//		
//		// TODO: filter internship ads by keywords and save
//		
//		// toggle menu item off
//		Interact.clickMenuPrakse(d);
//		
//		Interact.clickMenuQa(d);
//		Thread.sleep(1000);
//		
//		// TODO: filter qa ads by keywords and save
//		
//		// kill process
//		d.quit();
	}
}
