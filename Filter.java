package jobScraper;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import org.openqa.selenium.WebElement;

public class Filter {
	
	public static void filterByKeywords(List<WebElement> web, ArrayList<String> keywords){
		
		// loop through list of web elements
		for(WebElement e : web) {
			
			// access iterator to safely manipulate list items
			Iterator<WebElement> i = web.iterator();
			
			// loop through keywords for each web element
			for(String s : keywords) {				
				while(i.hasNext()) {
					
					// remove web elements that do not contain keywords
					if(!e.getText().toLowerCase().matches(s)){
						WebElement p = i.next();
						i.remove();
					}
				}

			}
		}
	}
	
	public static void main(String[] args) {
		
		ArrayList<String> keywords = new ArrayList<>();
			keywords.add("web");
			keywords.add("develop");
			keywords.add("javascript");
			keywords.add("qa");
			keywords.add("quality assurance");
			keywords.add("test");
			keywords.add("java");
			keywords.add("frontend");
			keywords.add("front-end");
	}
}
