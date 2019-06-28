package jobScraper;

public class StData {
	
	private static String root = "https://startit.rs/";
	private static String urlPr = root + "it-prakse/";
	private static String urlPo = root + "poslovi/";
	private static String TARGET_CONTAINER = "//*[@id=\"single-content\"]";
	private static String TARGET_H3 = "/html/body/div[4]/div/h3";
	private static String TARGET_UL = "/html/body/div[4]/div/ul";
	
	public static String getUrlPr() {
		return urlPr;
	}

	public static String getUrlPo() {
		return urlPo;
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
