package com.genericLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReader {
	
	public String readPropertyFile(String key) throws IOException {
		FileInputStream in = new FileInputStream("./src/test/resources/config.properties");
		Properties prop = new Properties();
		prop.load(in);
		return prop.getProperty(key);
	}
	

}
