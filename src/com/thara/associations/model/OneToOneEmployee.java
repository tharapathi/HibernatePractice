package com.thara.associations.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="Employee")
public class OneToOneEmployee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="empid")
	private int empId = 0;
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

	@OneToMany
	@JoinTable(name="EMPLOYEE_VEHICAL",joinColumns= @JoinColumn(name="empid"),
										inverseJoinColumns=@JoinColumn(name="VEHICAL_ID"))//@JoinColumn(name="VEHICAL_ID")
	private Collection<OneToOneVehical> oneToOneVehical = new ArrayList<OneToOneVehical>();
	
	
	public Collection<OneToOneVehical> getOneToOneVehical() {
		return oneToOneVehical;
	}


	public void setOneToOneVehical(Collection<OneToOneVehical> oneToOneVehical) {
		this.oneToOneVehical = oneToOneVehical;
	}


	public OneToOneEmployee() {
		super();
	}
	

	public OneToOneEmployee(int empId, String empName, int empAge, float salary, String empAddress, Date empJoinDate) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
		this.salary = salary;
		this.empAddress = empAddress;
		this.empJoinDate = empJoinDate;
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
