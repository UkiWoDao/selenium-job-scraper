package jobScraper;

public class StData {
	
	private static String location = "Beograd";
	private static String urlInt = "https://startit.rs/it-prakse/";
	private static String urlJob = "https://startit.rs/poslovi/";
	private static String TARGET_CONTAINER = "//*[@id=\"single-content\"]";
	private static String TARGET_H3 = "/html/body/div[4]/div/h3";
	private static String TARGET_UL = "/html/body/div[4]/div/ul";
	private static String FILTERH3 = "//h3[contains(text(), '" + StData.getLocation() + "')]/following-sibling::ul";
	
	
	public static void setLocation(String city) {
		location = city;
	}
	
	public static String getLocation() {
		return location;
	}
	
	public static String getUrlInt() {
		return urlInt;
	}

	public static String getUrlJob() {
		return urlJob;
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

	public static String getFILTERH3() {
		return FILTERH3;
	}
	
}
