package com.demo;

import com.dao.StudentDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        StudentDao sd=new StudentDao();
        
        System.out.println(sd.createConnection());
    }
}
