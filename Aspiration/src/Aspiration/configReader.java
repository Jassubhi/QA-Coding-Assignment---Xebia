package Aspiration;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class configReader {
	 private Properties properties;
	    private final String propertyFilePath= System.getProperty("user.dir")  +"//src//Aspiration//data.properties";


	    public configReader(){
	        BufferedReader reader;
	        try {
	            reader = new BufferedReader(new FileReader(propertyFilePath));
	            properties = new Properties();
	            try {
	                properties.load(reader);
	                reader.close();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	            throw new RuntimeException("data.properties not found" + propertyFilePath);
	        }
	    }

	    public String getDriverPath(){
	        String driverPath = properties.getProperty("driverPath");
	        if(driverPath!= null) 
	        	return driverPath;
	        else 
	        	throw new RuntimeException("driverPath not specified in Config file.");
	    }


	    public String getUrl() {
	        String url = properties.getProperty("url");
	        if(url != null) 
	        	return url;
	        else 
	        	throw new RuntimeException("url not specified in Config file.");
	    }
}
