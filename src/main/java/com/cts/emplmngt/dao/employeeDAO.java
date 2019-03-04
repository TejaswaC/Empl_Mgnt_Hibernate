package com.cts.emplmngt.dao;


import java.util.List;

import com.cts.emplmngt.bean.Employee;


public interface employeeDAO {
	
		public String insertEmployee(Employee employee);
	
		public String deleteEmployeeByID(String Id); 
		
		public List<Employee> getEmployeeByID(String Id); 
		
		public boolean update(String id);
		
		public List<Employee> getAllEmployee();
		
		public List<Employee> getAllEmployeesByName(String name);

		
		 

}
