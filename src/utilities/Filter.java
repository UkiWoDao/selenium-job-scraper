package utilities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

public class Filter {
	
	// removes all items from a list that do not contain any string from the list of keywords
	public static List<WebElement> byKeyword(List<WebElement> web, ArrayList<String> keywords) {
		// create list for saving web list items (and avoid concurrent modification)
		List<WebElement> filtered = new ArrayList<>();
		// loop through web elements
		for(WebElement e : web) {
			for(String s : keywords) {
				if(e.getText().toLowerCase().contains(s)) {
					filtered.add(e);
				}
			}
		}
		return filtered;
	}
	
}
