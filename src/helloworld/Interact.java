package helloworld;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Interact {
	
	public static String senioritet = "junior";
	public static String grad = "Beograd";
	
	public static void clickMenuProgramiranje(WebDriver d) {
		WebElements.getProgMenu(d).click();
	}
	
	public static void clickMenuPrakse(WebDriver d) {
		WebElements.getPrakseMenu(d).click();
	}
	
	public static void clickMenuQa(WebDriver d) {
		WebElements.getQaMenu(d).click();
	}
	
//	public static void selectGrad(WebDriver d) {
//		WebElements.getGrad(d).selectByVisibleText(grad);
//	}
	
	public static void clickGrad(WebDriver d) {
		WebElements.getGrad(d).click();
	}
	
	public static void inputGrad(WebDriver d) {
		WebElements.getGrad(d).sendKeys(grad);
		WebElements.getGrad(d).sendKeys(Keys.ENTER);
	}
	
	public static void clickSenioritet(WebDriver d) {
		WebElements.getSenioritet(d).click();
	}
	
	public static void inputSenioritet(WebDriver d) {
		WebElements.getSenioritet(d).sendKeys(senioritet);
		WebElements.getSenioritet(d).sendKeys(Keys.ENTER);
	}
	
//	public static void clickJuniorOption(WebDriver d) {
//		WebElements.getJuniorOption(d).click();
//	}
}
