package com.cts.emplmngt.dao;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.cts.emplmngt.bean.Employee;
import com.cts.emplmngt.util.HibernateUtil;


public class employeeDAOImpl implements employeeDAO{

	private static employeeDAOImpl emp_DAOImpl;	
	public static employeeDAOImpl getInstance()
	{
		if(emp_DAOImpl==null)
		{
			emp_DAOImpl = new employeeDAOImpl();
			return emp_DAOImpl;
		}
		else
		{
			return emp_DAOImpl;
		}
	}
	private employeeDAOImpl()
	{	
		
	}
	private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	
	
	public String insertEmployee(Employee employee) {
		
		Session session = null;
		Transaction transaction = null;
		// TODO Auto-generated method stub
		try{
			session = sessionFactory.openSession();
		
		transaction = session.getTransaction();
		System.out.println("Inside DAO");

		transaction.begin();
		session.save(employee);
		System.out.println("Tupple inserted");

		transaction.commit();}
		
		catch(Exception e)
		{
			if(transaction != null)
			{
				transaction.rollback();
			}
			e.printStackTrace();
			
			
			
		}
		finally
		{
			if(session!=null)
			{
				session.close();
			}
		}
		return null;
	}

	public String deleteEmployeeByID(String Id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Employee> getEmployeeByID(String Id) {
		// TODO Auto-generated method stub
		Session session = null;
		String query = "from Empl WHERE empID=?";
		org.hibernate.query.Query<Employee> query2=null;

		// TODO Auto-generated method stub
		try{
			session = sessionFactory.openSession();
			query2=session.createQuery(query);
			query2.setParameter(0, Id);
			List<Employee> list = query2.getResultList();

System.out.println("Inside DAO -getAllEmp");

		System.out.println("All Employees Retrieved");
return list;
		}
		
		catch(Exception e)
		{
			
			e.printStackTrace();
			
			
			
		}
		finally
		{
			if(session!=null)
			{
				session.close();
			}
		}return null;
	}

	public boolean update(String id) {
		// TODO Auto-generated method stub
		Session session = null;
		Transaction transaction = null;
		// TODO Auto-generated method stub
		try{
			session = sessionFactory.openSession();
		
		transaction = session.getTransaction();
		System.out.println("Inside DAO -update");

		transaction.begin();
		session.update(id);
		System.out.println("Tupple inserted");

		transaction.commit();}
		
		catch(Exception e)
		{
			if(transaction != null)
			{
				transaction.rollback();
			}
			e.printStackTrace();
			
			
			
		}
		finally
		{
			if(session!=null)
			{
				session.close();
			}
		}
		return true;
	}

	public List<Employee> getAllEmployee() {
		Session session = null;
		String query = "from Empl";
		org.hibernate.query.Query<Employee> query2=null;

		// TODO Auto-generated method stub
		try{
			session = sessionFactory.openSession();
			query2=session.createQuery(query);
List<Employee> list = query2.getResultList()
;

System.out.println("Inside DAO -getAllEmp");

		System.out.println("All Employees Retrieved");
return list;
		}
		
		catch(Exception e)
		{
			
			e.printStackTrace();
			
			
			
		}
		finally
		{
			if(session!=null)
			{
				session.close();
			}
		}
				return null;
	}

	public List<Employee> getAllEmployeesByName(String name) {
		// TODO Auto-generated method stub
		Session session = null;
		String query = "from Empl WHERE firsrName=?";
		org.hibernate.query.Query<Employee> query2=null;

		// TODO Auto-generated method stub
		try{
			session = sessionFactory.openSession();
			query2=session.createQuery(query);
			query2.setParameter(0, name);
			List<Employee> list = query2.getResultList();

System.out.println("Inside DAO -getAllEmpbyName");

		System.out.println("All Employees Retrieved");
return list;
		}
		
		catch(Exception e)
		{
			
			e.printStackTrace();
			
			
			
		}
		finally
		{
			if(session!=null)
			{
				session.close();
			}
		}return null;
	}

}
