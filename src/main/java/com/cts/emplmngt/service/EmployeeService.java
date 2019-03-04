package com.cts.emplmngt.service;

import java.util.List;

import com.cts.emplmngt.bean.Employee;


public interface EmployeeService {
	
	
	public String insertEmployee(Employee employee);
	
	public String deleteEmployeeByID(String Id); 
	
	public List<Employee> getEmployeeByID(String Id); 
	
	public boolean update(String id);
	
	public List<Employee> getAllEmployee();
	
	public List<Employee> getAllEmployeesByName(String name);
}
