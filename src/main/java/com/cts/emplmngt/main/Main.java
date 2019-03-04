package com.cts.emplmngt.main;

import com.cts.emplmngt.bean.Employee; 
import com.cts.emplmngt.service.EmployeeService;
import com.cts.emplmngt.service.EmpoyeeServiceImpl;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("H");

EmployeeService esi = new EmpoyeeServiceImpl();

Employee employee = new Employee("sfd","sfd","sdf",3);

String id = "abc";

//System.out.println(esi.getAllEmployeesByName(id));

esi.insertEmployee(employee);


}}
