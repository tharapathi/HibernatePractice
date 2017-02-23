package com.inheritance;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="VEHICAL_TABLE")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
/*@DiscriminatorColumn(name="VEHICAL_TYPE",
		discriminatorType = DiscriminatorType.STRING)*/
public class VehicalVo {

	@Id @GeneratedValue
	private int id;
	private String name;
	private String licenceNo;
	
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
	public String getLicenceNo() {
		return licenceNo;
	}
	public void setLicenceNo(String licenceNo) {
		this.licenceNo = licenceNo;
	}
	
}
