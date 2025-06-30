package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class configReader {

	public static Properties getPropertyObject() throws IOException {
	//	String name;
		FileInputStream fp= new FileInputStream("C:\\Users\\Param\\eclipse-workspace\\UMavenPracticeProj\\src\\main\\java\\resources\\config.properties");
		Properties prop = new Properties();
		prop.load(fp);
		
		return prop;	
	}
	
	public static String getUrl() throws IOException {
		return getPropertyObject().getProperty("url");
	}
	
	public static String getUsername() throws IOException {
		return getPropertyObject().getProperty("username");
	}
	public static String getPassword() throws IOException {
		return getPropertyObject().getProperty("password");
	}
}
