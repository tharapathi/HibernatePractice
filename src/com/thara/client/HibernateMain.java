package com.thara.client;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.thara.common.HibernateCommon;
import com.thara.common.HibernateUtility;
import com.thara.model.Address;
import com.thara.model.Employee;

public class HibernateMain {

	public static void main(String[] args) {

		Session session = HibernateUtility.getSessionFactory().openSession();
		
		
		Address homeAddress = new Address("Boodidhapalli", "Kallupalli","Andhra", "517408");
		Address officeAddress = new Address("DodanaKunte", "bangalore","Karnataka", "560048");
		
		Transaction tx = session.beginTransaction();
		Date nowString = HibernateCommon.getEmployeeJoinDate("2013/03/29");
		Employee emp = new Employee("Tharapathi0", 29, (float) 37000.00, "# Konanakunta0, Bangalore0", nowString ,homeAddress, officeAddress);
		tx.begin();
		session.save(emp);

		/*List<Employee> empList = new ArrayList<>();
		List<Employee> query =  session.createQuery("from Employee e where  e.empName like '%thara%'").list();

		for (Employee employee : query) {
			System.out.println(employee.getEmpJoinDate() + "--"+employee.getSalary() +"---"+employee.getEmpAddress() + "--"+employee.getEmpId() + "--" +employee.getEmpName());
		}
		System.out.println();
		Employee empGet = (Employee) session.get(Employee.class, 2);

		if(empGet != null){
			System.out.println(empGet.getEmpJoinDate() + "--"+empGet.getEmpAddress() + "--"+empGet.getEmpId() + "--" +empGet.getEmpName());
		}


		System.out.println("Critera flow..");

		Criteria criteria = session.createCriteria(Employee.class).add(Restrictions.isNotNull("empName"));

		empList = criteria.list();
		for (Employee employee : empList) {
			System.out.println(employee.getEmpJoinDate() + "--" +employee.getEmpAddress() + "--"+employee.getEmpId() + "--" +employee.getEmpName());
		}
		String hql = "UPDATE Employee SET empJoinDate = :empJoinDate "  + 
	             "WHERE empid < :empId";
	Query delQuery = session.createQuery(hql);
	delQuery.setDate("empJoinDate", nowString);
	delQuery.setParameter("empId", 10);
	int result = delQuery.executeUpdate();
	System.out.println("Rows affected: " + result);*/
		tx.commit();
		session.close();
	}

}
