package com.ojas.IOStream;

public class Employee {
int empId;
String empName;
double empSalary;
public Employee() {
	
}
public Employee(int empId, String empName, double empSalary) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.empSalary = empSalary;
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public double getSalary() {
	return empSalary;
}
public void setSalary(double salary) {
	this.empSalary = salary;
}
@Override
public String toString() {
	return +empId+","+empName+","+empSalary;
}

}
