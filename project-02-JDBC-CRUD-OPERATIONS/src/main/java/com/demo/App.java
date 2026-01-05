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
       EmployeeDao ed=new EmployeeDao();
       Employee e=new Employee();
       
//       e.setName("alex");
//       e.setDesignation("java developer");
//       e.setCompany("tesla");
//       e.setSalary(45000.0);
       
//       System.out.println(ed.inertEmployee(e));
       
//       System.out.println(ed.deleteEmployeeById(1));

         ed.fetchEmployee();
    }
}





