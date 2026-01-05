package com.model;

public class Employee {
	
	private int id;
	private String name;
	private String company;
	private String designation;
	private double salary;
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", company=" + company + ", designation=" + designation
				+ ", salary=" + salary + "]";
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
