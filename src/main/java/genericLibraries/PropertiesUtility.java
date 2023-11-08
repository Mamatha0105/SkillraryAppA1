package genericLibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.Properties;



/**
 * This class contains reusable methods to read data from properties file
 * @author Mamatha
 */

public class PropertiesUtility {
	private Properties property;
	
	/*
	 * This method is used to initialize properties file
	 * @param filepath
	 */
	public void propertiesInitialization(String filePath) {
		FileInputStream fis=null;
		try {
			fis=new FileInputStream(filePath);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		property=new Properties();
		try {
			property.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * This method is used to fetch data from properties file
	 * @param key
	 * @return
	 */
	public String readFromProperties(String Key) {
		return property.getProperty(Key);
	}
	
	
		
	}


