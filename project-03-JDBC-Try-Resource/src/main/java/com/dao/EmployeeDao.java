package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.model.Employee;

public class EmployeeDao {

	// inserting employee
	public void insertEmployee(Employee e) {

		String sql = "insert into employee (name,designation,salary) values(?,?,?)";

		try (Connection con = DBConnection.createConnection(); PreparedStatement pst = con.prepareStatement(sql)) {

			pst.setString(1, e.getName());
			pst.setString(2, e.getDesignation());
			pst.setDouble(3, e.getSalary());

			pst.executeUpdate();
			System.out.println("Employee added successfully");
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}

	// displaying all employee
	public List<Employee> getAllEmployees() {
		List<Employee> list = new ArrayList<>();
		String query = "SELECT * FROM employee";

		try (Connection conn = DBConnection.getConnection();
				Statement st = conn.createStatement();
				ResultSet rs = st.executeQuery(query)) {

			while (rs.next()) {
				Employee emp = new Employee();
				emp.setId(rs.getInt("id"));
				emp.setName(rs.getString("name"));
				emp.setDesignation(rs.getString("designation"));
				emp.setSalary(rs.getDouble("salary"));
				list.add(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	//update employee details
	public void updateEmployee(Employee e) {
		String sql="update employee set name=?,designation=?,salary=? where id=?";
		
		
	}

}
