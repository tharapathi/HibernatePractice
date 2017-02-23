package com.thara.collection.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class AddressCollectionVo {
	
/*	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="EMP_ADDRESS_ID")
	private int emp_address_id;
	
	public int getEmp_address_id() {
		return emp_address_id;
	}
	public void setEmp_address_id(int emp_address_id) {
		this.emp_address_id = emp_address_id;
	}*/
	@Column(name="STREET_NAME")
	private String street;
	@Column(name="CITY_NAME")
	private String city;
	@Column(name="STATE_NAME")
	private String state;
	@Column(name="PIN_CODE")
	private String pincode;
	
	public AddressCollectionVo() {
		super();
	}
	public AddressCollectionVo(String street, String city, String state, String pincode) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	

}
