package com.thara.associations.client;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.thara.associations.model.OneToOneEmployee;
import com.thara.associations.model.OneToOneVehical;
import com.thara.common.HibernateCommon;
import com.thara.common.HibernateUtility;

public class OneToOneClient {

	public static void main(String[] args) {
		
		Session session = HibernateUtility.getSessionFactory().openSession();
		Date joinDate = HibernateCommon.getEmployeeJoinDate("2013/03/29");
		OneToOneEmployee employee = new OneToOneEmployee(0, "jithesh1", 18, (float) 5200.00, "Kallupalli viallage", joinDate);
		
		OneToOneVehical vehical = new OneToOneVehical(0,"pulser", "2010");
		OneToOneVehical vehical2 = new OneToOneVehical(0,"TVS Sports", "2010");
		
		employee.getOneToOneVehical().add(vehical);
		employee.getOneToOneVehical().add(vehical2);
		
		
		Transaction tx = session.beginTransaction();
		session.save(employee);
		session.save(vehical);
		session.save(vehical2);
		
		tx.commit();
		session.close();
		
	}

}
