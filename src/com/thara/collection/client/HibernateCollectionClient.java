package com.thara.collection.client;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.thara.collection.model.AddressCollectionVo;
import com.thara.collection.model.EmployeeCollectionVo;
import com.thara.common.HibernateUtility;

public class HibernateCollectionClient {

	public static void main(String[] args) {

		
		Session session = HibernateUtility.getSessionFactory().openSession();
		final String dateTimeFormatPattern = "yyyy/MM/dd";
		final SimpleDateFormat format = new SimpleDateFormat(dateTimeFormatPattern);
		Date empJoinDate = new Date();
		try {
			empJoinDate = format.parse("2009/03/30");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		EmployeeCollectionVo empCol = new EmployeeCollectionVo("hemapathiCol", 34, (float)25003.00, "Boodidhapalli3", empJoinDate);
		
		AddressCollectionVo colAddress = new AddressCollectionVo("Kallupalli1", "Madanapalli1", "Andhra1", "5174521");
		AddressCollectionVo colAddress1 = new AddressCollectionVo("Kallupalli2", "Madanapalli2", "Andhra2", "517452");
		//AddressCollectionVo colAddress2 = new AddressCollectionVo("Kallupalli2", "Madanapalli2", "Andhra2", "517454");
		empCol.getListOfAddresses().add(colAddress);
		empCol.getListOfAddresses().add(colAddress1);
		Transaction trx = session.beginTransaction();
		
		session.save(empCol);
		
		trx.commit();
		session.close();
		
		session = HibernateUtility.getSessionFactory().openSession();
		
		EmployeeCollectionVo empColProxy = null; 
		empColProxy = (EmployeeCollectionVo) session.get(EmployeeCollectionVo.class, 45);
		System.out.println("Employee Address"+"                 --"+"Employee ID");
		System.out.println(empColProxy.getEmpAddress() +"       --"+empColProxy.getEmpId());
		
		System.out.println();
		session.close();
		System.out.println(empColProxy.getListOfAddresses().size());
		
		
		
	}

}
