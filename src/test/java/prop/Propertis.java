package prop;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import logger.LogUtility;

public class Propertis {
	
	private static LogUtility logUtility = new LogUtility(Propertis.class);

	public static void main(String[] args) {
		
		 logUtility.logTestTitle("Title");
	     logUtility.logTestInfo("Info");
	     logUtility.logException("Exceptiomn");
	     logUtility.logSuccess("Success");

		Properties prop = new Properties();
		FileInputStream fis;
		try {
			fis = new FileInputStream("/home/ani/eclipse-workspace2/com.yatra.prj/src/test/resources/Config.properties");
			prop.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(prop.get("browser"));
		System.out.println(prop.get("username"));
		System.out.println(prop.get("password"));

	}

}
