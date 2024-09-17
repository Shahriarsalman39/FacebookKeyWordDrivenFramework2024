package com.facebook_utilities;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class TestReader {
Properties pros;
	
public TestReader() {
	
	pros=new Properties();
	
	
	String FilePath= "src/test/resources/Test.properties";
	
	FileInputStream fis;
	try {
	 fis= new FileInputStream(FilePath);
	 pros.load(fis);
	} catch (IOException e) {
	
		e.printStackTrace();
	}
}

	public String readBrowser() {
		return pros.getProperty("browser");
		
	}
	public String readurl() {
		return pros.getProperty("url");
		
	}
	
	public String readF_name() {
		return pros.getProperty("firstname");
		
	}
	public String readS_name() {
		return pros.getProperty("Surname");
		
	}
	public String readEmail() {
		return pros.getProperty("email");
		
	}
	public String readPasS() {
		return pros.getProperty("password");
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		TestReader tr=new TestReader();
		System.out.println(tr.readBrowser());
		System.out.println(tr.readurl());
	}
}
