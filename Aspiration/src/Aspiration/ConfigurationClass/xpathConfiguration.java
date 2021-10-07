package Aspiration.ConfigurationClass;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class xpathConfiguration {
	private Properties properties;
    private final String propertyFilePath= System.getProperty("user.dir")  +"//src//Aspiration//xpath.properties";


    public xpathConfiguration(){
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
            throw new RuntimeException("xpath.properties not found" + propertyFilePath);
        }
    }

    public String getSpendAndSaveLink(){
        String spendAndSaveLink = properties.getProperty("spendAndSaveLink");
        if(spendAndSaveLink!= null) 
        	return spendAndSaveLink;
        else 
        	throw new RuntimeException("spendAndSaveLink not specified in Config file.");
    }


    public String getAspirationButton() {
        String aspirationButton = properties.getProperty("aspirationButton");
        if(aspirationButton != null) 
        	return aspirationButton;
        else 
        	throw new RuntimeException("aspirationButton not specified in Config file.");
    }
    
    public String getAspirationPlusButton() {
        String aspirationPlusButton = properties.getProperty("aspirationPlusButton");
        if(aspirationPlusButton != null) 
        	return aspirationPlusButton;
        else 
        	throw new RuntimeException("aspirationPlusButton not specified in Config file.");
    }
    
    public String getYearlyPlan(){
        String yearlyPlan = properties.getProperty("yearlyPlan");
        if(yearlyPlan!= null) 
        	return yearlyPlan;
        else 
        	throw new RuntimeException("yearlyPlan not specified in Config file.");
    }
    
    public String getMonthlyPlan(){
        String monthlyplan = properties.getProperty("monthlyplan");
        if(monthlyplan!= null) 
        	return monthlyplan;
        else 
        	throw new RuntimeException("monthlyplan not specified in Config file.");
    }
}
