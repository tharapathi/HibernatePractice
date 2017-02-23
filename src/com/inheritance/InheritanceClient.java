package com.inheritance;

import org.hibernate.Session;

import com.thara.common.HibernateUtility;

public class InheritanceClient {

	public static void main(String[] args) {
		
		Session session =HibernateUtility.getSessionFactory().openSession();
		
		VehicalVo vehicalVo = new VehicalVo();
		vehicalVo.setName("car");
		
		TwoWhellerVo twoWheeler = new TwoWhellerVo();
		twoWheeler.setName("TVS Star City");
		twoWheeler.setSteeringHandler("TVS Star City Streaning Handler");
		
		FourWheelerVo fourWheeler = new FourWheelerVo();
		fourWheeler.setName("Ignics");
		fourWheeler.setSteeringWheeler("Ignics Streaning handler");
		
		session.save(vehicalVo);
		session.save(twoWheeler);
		session.save(fourWheeler);
		session.beginTransaction().commit();
		
		session.close();

	}

}
