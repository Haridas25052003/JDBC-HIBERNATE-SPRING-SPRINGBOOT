package com.demo;

import java.sql.Connection;
import java.util.List;

import com.dao.MenuDAO;
import com.model.MenuItem;
import com.util.DBConnection;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	//DBConnection db=new DBConnection();
    	
    	//DBConnection.createConnection();
    	
    	MenuDAO md=new MenuDAO();
    	
    	List<MenuItem> menuList=md.getAllAvailableItems();
    	for(MenuItem m : menuList)
    		System.out.println(m);
    	
    	MenuItem mi=new MenuItem();
    	
    	// mi.setAvailability(false);
    	
    	// System.out.println(md.updateAvailabitliy(1, false));
    	
    	mi.setName("kajuu curry");
    	mi.setPrice(100.0);
    	mi.setCategory("veg special");
    	mi.setAvailability(true);
    	
    	System.out.println(md.addMenuItem(mi));
    	
    }
}
