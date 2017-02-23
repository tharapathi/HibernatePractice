package com.inheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
//@DiscriminatorValue("Car")
@Table(name="FOURWHEELER_VEHICAL")
public class FourWheelerVo extends VehicalVo {

	private String steeringWheeler;

	public String getSteeringWheeler() {
		return steeringWheeler;
	}

	public void setSteeringWheeler(String steeringWheeler) {
		this.steeringWheeler = steeringWheeler;
	}
	
}
