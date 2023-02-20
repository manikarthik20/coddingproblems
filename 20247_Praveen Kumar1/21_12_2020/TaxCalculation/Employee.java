package com.ojas.Exception;

public class Employee {
	String empName;
	String country;
	double salary;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(String empName, String country, double salary) {
		super();
		this.empName = empName;
		this.country = country;
		this.salary = salary;
	}
	

}
