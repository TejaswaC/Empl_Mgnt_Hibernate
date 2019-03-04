package com.cts.emplmngt.bean;


import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.*;



@Entity(name="Empl")
@Table(name="empl_table")


public class Employee {
	
@Id
@Column(name="empID" ,nullable=false, unique=true)
private String empID;

@Column(name="firstName" ,nullable=false )
private String firsrName;

@Column(name="lastName" ,nullable=false)

private String lastName;
@Column(name="salary" ,nullable=false)
private float salary;

Employee()
{}
 



@Override
public String toString() {
	return "Employee [empID=" + empID + ", firsrName=" + firsrName + ", lastName=" + lastName + ", salary=" + salary
			+ ", getEmpID()=" + getEmpID() + ", getFirsrName()=" + getFirsrName() + ", getLastName()=" + getLastName()
			+ ", getSalary()=" + getSalary() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
			+ ", toString()=" + super.toString() + "]";
}
public String getEmpID() {
	return empID;
}
public void setEmpID(String empID) {
	this.empID = empID;
}
public String getFirsrName() {
	return firsrName;
}
public void setFirsrName(String firsrName) {
	this.firsrName = firsrName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
public Employee(String empID, String firsrName, String lastName, float salary) {
	super();
	this.empID = empID;
	this.firsrName = firsrName;
	this.lastName = lastName;
	this.salary = salary;
}
}
