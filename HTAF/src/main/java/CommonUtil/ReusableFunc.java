package CommonUtil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReusableFunc {

	
	public static String getValue(String strKey) throws IOException {
		
//		String path = "src\\main\\resources\\config.properties";
//		FileInputStream fis = new FileInputStream(path);
//
//		Properties prop = new Properties();
//		prop.load(fis);
//		
//		System.out.println(prop.getProperty("url"));
		
		
		FileInputStream fis = new FileInputStream("src\\main\\resources\\config.properties");
		Properties prop = new Properties();
		prop.load(fis);
		
  	    return	prop.getProperty(strKey);
  	    
  	    	}
}

