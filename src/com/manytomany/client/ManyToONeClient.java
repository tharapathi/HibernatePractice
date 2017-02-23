package com.manytomany.client;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.manytomany.model.ManyToOneEmployeeVo;
import com.manytomany.model.ManyToOneVehicalVo;
import com.thara.common.HibernateCommon;
import com.thara.common.HibernateUtility;

public class ManyToONeClient {

	public static void main(String[] args) {

		
		Session session = HibernateUtility.getSessionFactory().openSession();
		Date joinDate = HibernateCommon.getEmployeeJoinDate("2013/03/29");
		ManyToOneEmployeeVo employee = new ManyToOneEmployeeVo(0, "jithesh1", 18, (float) 5200.00, "Kallupalli viallage", joinDate);
		
		ManyToOneVehicalVo vehical = new ManyToOneVehicalVo(0,"pulser2", "2010");
		ManyToOneVehicalVo vehical2 = new ManyToOneVehicalVo(0,"TVS Sports2", "2010");
		
		employee.getManyToOneVehical().add(vehical);
		employee.getManyToOneVehical().add(vehical2);
		
		vehical.setManyToManyEmployeeVo(employee);
		vehical2.setManyToManyEmployeeVo(employee);
		
		Transaction tx = session.beginTransaction();
		session.save(employee);
		session.save(vehical);
		session.save(vehical2);
		
		tx.commit();
		session.close();
		
	
	}

}
