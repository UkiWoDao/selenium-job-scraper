package startit;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebElements {
	
	public static WebElement getContainer(WebDriver driver) {
		WebElement cont = driver.findElement(By.xpath(Data.getTargetContainer()));
		return cont;
	}
	
	public static WebElement getH3(WebDriver driver) {
		WebElement h3 = driver.findElement(By.xpath(Data.getTargetH3()));
		return h3;
	}
	
	public static WebElement getUl(WebDriver driver) {
		WebElement ul = driver.findElement(By.xpath(Data.getTargetUl()));
		return ul;
	}
	
//	public static List<WebElement> filterByLocation(WebDriver driver) {
//		List<WebElement> filterH3 = driver.findElements(By.xpath(StData.getFilterH3()));
//		return filterH3;
//	}
	
	// get all h3s that contain a string
	public static List<WebElement> getH3(WebDriver driver, String location){
		List<WebElement> H3 = driver.findElements(By.xpath("//h3[text()[contains(.,'" + location + "' )]]"));
		return H3;
	}
	
	public static List<WebElement> getUl(WebDriver driver, String location){
		List<WebElement> UL = driver.findElements(By.xpath("//h3[text()[contains(., '" + location + "')]]/following-sibling::ul[1]"));
		return UL;
	}
}
