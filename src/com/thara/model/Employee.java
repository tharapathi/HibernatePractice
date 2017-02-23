package com.thara.model;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="Employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="empid")
	private int empId;
	@Column(name="empname")
	private String empName;
	@Column(name="empAge")
	private int empAge;
	@Column(name="salary")
	private float salary;
	@Column(name="empaddress")
	private String empAddress;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="empJoinDate")
	private Date empJoinDate; 
	
	@Embedded
	@AttributeOverrides({ @AttributeOverride (name="street", column = @Column(name="HOME_STREET_NAME")) ,
		@AttributeOverride (name="city", column = @Column(name="HOME_CITY_NAME")) ,
		@AttributeOverride (name="state", column = @Column(name="HOME_STATE_NAME")) ,
		@AttributeOverride (name="pincode", column = @Column(name="HOME_PIN_CODE")) })
	private Address homeAddress;
	@Embedded
	private Address officeAddress;
	
	public Employee() {
		super();
	}
	
	public Employee(String empName, int empAge, float salary, String empAddress, Date empDate, Address homeAddress, Address officeAddress ) {
		super();
		this.empName = empName;
		this.empAge = empAge;
		this.salary = salary;
		this.empAddress = empAddress;
		this.empJoinDate = empDate;
		this.homeAddress = homeAddress;
		this.officeAddress = officeAddress;
	}
	
	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}
	

	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	public Date getEmpJoinDate() {
		return empJoinDate;
	}

	public void setEmpJoinDate(Date empJoinDate) {
		this.empJoinDate = empJoinDate;
	}
	
	

}
