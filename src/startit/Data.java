package startit;

public class Data {
	
	private static String URL = "https://startit.rs/it-prakse/";
	private static String TARGET_CONTAINER = "//*[@id=\"single-content\"]";
	private static String TARGET_H3 = "/html/body/div[4]/div/h3";
	private static String TARGET_UL = "/html/body/div[4]/div/ul";
	
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
	
}
