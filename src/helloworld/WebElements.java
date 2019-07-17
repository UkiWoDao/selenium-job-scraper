package helloworld;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebElements {
	
	public static WebElement getProgMenu(WebDriver d) {
		WebElement e = d.findElement(By.cssSelector(Data.getMENIPROGRAMIRANJE()));
		return e;
	}
	
	public static WebElement getQaMenu(WebDriver d) {
		WebElement e = d.findElement(By.cssSelector(Data.getMENIQA()));
		return e;
	}
	
	public static WebElement getPrakseMenu(WebDriver d) {
		WebElement e = d.findElement(By.cssSelector(Data.getMENIPRAKSE()));
		return e;
	}
	
	public static WebElement getGrad(WebDriver d) {
		WebElement e = d.findElement(By.cssSelector(Data.getGRAD()));
		return e;
	}
		
	public static WebElement getSenioritet(WebDriver d) {
		WebElement e = d.findElement(By.xpath(Data.getSENIORITET()));
		return e;
	}
	
	public static WebElement getJobHeading(WebDriver d) {
		WebElement e = d.findElement(By.className(Data.getJOBHEADINGCLASS()));
		return e;
	}
	
	public static List<WebElement> getAllJobHeadings(WebDriver d) {
		List<WebElement> h3list = d.findElements(By.className(Data.getJOBHEADINGCLASS()));
		return h3list;
	}
	
	// get all h3s that contain a string
	public static List<WebElement> getFilterJobHeadings(WebDriver d, String keyword){
		List<WebElement> H3 = d.findElements(By.xpath("//h3[text()[contains(.,'" + keyword + "' )]]"));
		return H3;
	}
	
	public static WebElement getJobTags(WebDriver d) {
		WebElement e = d.findElement(By.className(Data.getJOBTAGSCLASS()));
		return e;
	}
	
}
