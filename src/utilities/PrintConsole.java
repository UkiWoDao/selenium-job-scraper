package utilities;

import java.util.List;
import org.openqa.selenium.WebElement;

public class Print {
	
	public static void webElements(List<WebElement> list) {
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
		}
	}
}
