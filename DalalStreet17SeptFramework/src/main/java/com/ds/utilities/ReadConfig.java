package com.ds.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	Properties pro ;
	public ReadConfig() 
	{
		String path = "D:\\velocity_data\\zipFiles\\DalalStreet17SeptFramework\\src\\test\\resourses\\configs\\Configs.properties";
		
		try
		{
			File file = new File(path);
			FileInputStream fis = new FileInputStream(file);
			pro = new Properties();
			pro.load(fis);
		} 
		catch (IOException e) 
		{	
			e.printStackTrace();
		}
		
	}
	
	public String getApplicationUrl() 
	{
		String url = pro.getProperty("url");
		return url;	
	}
	
	public String getEmailId() 
	{
		String email = pro.getProperty("email");
		return email;	
	}
	
	public String getPassword() 
	{
		String password = pro.getProperty("password");
		return password;	
	}
}

