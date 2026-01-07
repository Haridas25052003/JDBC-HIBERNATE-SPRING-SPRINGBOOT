package com.demo;

import java.util.List;

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
        
//        e.setName("Haridas");
//        e.setDesignation("java developer");
//        e.setSalary(6789.0);
        
//        List<Employee> list=ed.getAllEmployees();
//        for(Employee e1:list)
//        	System.out.println(e1);
        
        e.setName("alex");
        e.setId(1);
        ed.updateEmployee(e);
        
        
    }
}
