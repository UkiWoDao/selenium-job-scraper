package jobScraper;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StElems {
	
	public static WebElement getContainer(WebDriver driver) {
		WebElement cont = driver.findElement(By.xpath(StData.getTargetContainer()));
		return cont;
	}
	
	public static WebElement getH3(WebDriver driver) {
		WebElement h3 = driver.findElement(By.xpath(StData.getTargetH3()));
		return h3;
	}
	
	public static WebElement getUl(WebDriver driver) {
		WebElement ul = driver.findElement(By.xpath(StData.getTargetUl()));
		return ul;
	}
	
	public static List<WebElement> filterByLocation(WebDriver driver) {
		List<WebElement> filterH3 = driver.findElements(By.xpath(StData.getFILTERH3()));
		return filterH3;
	}
}
