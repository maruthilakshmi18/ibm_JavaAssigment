package javaPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	
 public static void main(String args[]) throws IOException {
 
	 	Properties props;
	
		FileInputStream fis =new FileInputStream("./data/config.properties");
		props= new Properties();
		props.load(fis);	
		System.out.println("app url is:  "+props.getProperty("appURL"));
		System.out.println("user name is:  "+props.getProperty("adminUserName"));
		System.out.println("password is:  "+props.getProperty("adminPassword"));
		
	}
	
}
