package com.demo;

import com.dao.EmployeeDao;
import com.model.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Employee e=new Employee();
        EmployeeDao ed=new EmployeeDao();
        
        e.setName("Haridas");
        e.setDesignation("java developer");
        e.setSalary(6789.0);
        
        ed.insertEmployee(e);
        
        
    }
}
