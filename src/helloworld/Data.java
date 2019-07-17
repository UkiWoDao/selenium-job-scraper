package helloworld;

import java.util.ArrayList;

public class Data {
	private static ArrayList<String> devKeywords = new ArrayList<>();
	
	// target web page
	public static String URL = "https://www.helloworld.rs/oglasi-za-posao/";
	
	// paths/classes
	private static String GRAD = "#s2id_autogen4";
	private static String SENIORITET = "//*[@id=\"s2id_autogen517\"]/a";
	private static String MENIPROGRAMIRANJE = "li.__tag-holder:nth-child(1) > a:nth-child(1)";
	private static String MENIPRAKSE = "li.__tag-holder:nth-child(5) > a:nth-child(1)";
	private static String MENIQA = "li.__tag-holder:nth-child(6) > a:nth-child(1)";
	private static String JOBHEADINGCLASS = "job-link";
	private static String JOBTAGSCLASS = "jobtags";
	
	// getters
	public static String getGRAD() {
		return GRAD;
	}
	
	public static String getSENIORITET() {
		return SENIORITET;
	}
	
	public static String getMENIPRAKSE() {
		return MENIPRAKSE;
	}
	
	public static String getMENIQA() {
		return MENIQA;
	}

	public static String getMENIPROGRAMIRANJE() {
		return MENIPROGRAMIRANJE;
	}
	
	public static String getJOBHEADINGCLASS() {
		return JOBHEADINGCLASS;
	}
	
	public static String getJOBTAGSCLASS() {
		return JOBTAGSCLASS;
	}
	
	// keywords for filtering development job ads
	public static ArrayList<String> getDevKeywords() {	
		devKeywords.add("web");
		devKeywords.add("develop");
		devKeywords.add("java");
		devKeywords.add("frontend");
		devKeywords.add("front-end");
		
		return devKeywords;
	}
	
}
