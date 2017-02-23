package com.inheritance;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USER_DETAILS")
public class UserDetailsVo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="USER_ID")
	private int id;
	@Column(name="USER_NAME")
	private String name;
	
	private VehicalVo vehical;
	
	
	public UserDetailsVo() {
		super();
	}
	public UserDetailsVo(int id, String name, VehicalVo vehical) {
		super();
		this.id = id;
		this.name = name;
		this.vehical = vehical;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public VehicalVo getVehical() {
		return vehical;
	}
	public void setVehical(VehicalVo vehical) {
		this.vehical = vehical;
	}
	
}
