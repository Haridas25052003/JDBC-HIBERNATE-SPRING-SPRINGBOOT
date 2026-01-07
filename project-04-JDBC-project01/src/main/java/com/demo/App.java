package com.demo;

import java.sql.Connection;

import com.dao.DBConnection;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	//DBConnection db=new DBConnection();
    	
    	DBConnection.createConnection();
    }
}
