package com.cts.emplmngt.service;

import java.util.List; 

import com.cts.emplmngt.bean.Employee;
import com.cts.emplmngt.dao.employeeDAO;
import com.cts.emplmngt.dao.employeeDAOImpl;


public class EmpoyeeServiceImpl implements EmployeeService{
	
	private static EmpoyeeServiceImpl emp_serviceImpl;	
	private employeeDAO e_dao = employeeDAOImpl.getInstance();

	public static EmpoyeeServiceImpl getInstance()
	{
		if(emp_serviceImpl==null)
		{
			emp_serviceImpl = new EmpoyeeServiceImpl();
			return emp_serviceImpl;
		}
		else
		{
			return emp_serviceImpl;
		}
	}

	public String insertEmployee(Employee employee) {
		// TODO Auto-generated method stub
		System.out.println("Inside Service");
		return e_dao.insertEmployee(employee);
	}

	public String deleteEmployeeByID(String Id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Employee> getEmployeeByID(String Id) {
		// TODO Auto-generated method stub
		return e_dao.getEmployeeByID(Id);

	}

	public boolean update(String id) {
		// TODO Auto-generated method stub
		System.out.println("Inside Servicec- update");
		return e_dao.update(id);	}

	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return e_dao.getAllEmployee();
	}

	public List<Employee> getAllEmployeesByName(String name) {
		// TODO Auto-generated method stub
		return e_dao.getAllEmployeesByName(name);
	}

}
