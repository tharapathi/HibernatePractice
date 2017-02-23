package com.thara.collection.model;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.CollectionOfElements;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;



@Entity
@Table(name="Employee")
public class EmployeeCollectionVo {
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
	
	@CollectionOfElements(fetch=FetchType.EAGER)
	@JoinTable(name = "EMP_ADDRESS",
	joinColumns=@JoinColumn(name="emp_address_id"))
	
	@GenericGenerator(name ="hlio-gen", strategy="hilo")
	@CollectionId(columns = { @Column(name="ADDRESS_ID") }, generator = "hlio-gen", type = @Type(type="long"))
	private Collection<AddressCollectionVo> listOfAddresses = new HashSet<AddressCollectionVo>();
	
	

	public Collection<AddressCollectionVo> getListOfAddresses() {
		return listOfAddresses;
	}


	public void setListOfAddresses(Collection<AddressCollectionVo> listOfAddresses) {
		this.listOfAddresses = listOfAddresses;
	}


	public EmployeeCollectionVo() {
		super();
		// TODO Auto-generated constructor stub
	}


	public EmployeeCollectionVo(String empName, int empAge, float salary, String empAddress, Date empJoinDate) {
		super();
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
