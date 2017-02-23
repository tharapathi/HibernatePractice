package com.inheritance;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
//@DiscriminatorValue("Bike")
@Table(name="TWOWHEELER_VEHICAL")
public class TwoWhellerVo extends VehicalVo{

	private String steeringHandler;

	public String getSteeringHandler() {
		return steeringHandler;
	}

	public void setSteeringHandler(String steeringHandler) {
		this.steeringHandler = steeringHandler;
	}
	
}
