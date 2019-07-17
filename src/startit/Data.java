package startit;

import java.util.ArrayList;

public class Data {
	
	private static String URL = "https://startit.rs/it-prakse/";
	private static String TARGET_CONTAINER = "//*[@id=\"single-content\"]";
	private static String TARGET_H3 = "/html/body/div[4]/div/h3";
	private static String TARGET_UL = "/html/body/div[4]/div/ul";
	public static ArrayList<String> keywords;
	
	public static String getUrl() {
		return URL;
	}
	
	public static String getTargetContainer() {
		return TARGET_CONTAINER;
	}
	
	public static String getTargetH3() {
		return TARGET_H3;
	}
	
	public static String getTargetUl() {
		return TARGET_UL;
	}
	
	public static ArrayList<String> getKeywords() {	
		keywords.add("web");
		keywords.add("develop");
		keywords.add("javascript");
		keywords.add("qa");
		keywords.add("quality assurance");
		keywords.add("test");
		keywords.add("java");
		keywords.add("frontend");
		keywords.add("front-end");
		
		return keywords;
	}
	
}
