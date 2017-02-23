package com.thara.associations.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="VEHICAL")
public class OneToOneVehical {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	@Column(name="VEHICAL_ID")
	private int vechicalId;
	@Column(name="VEHICAL_NAME")
	private String vehicalName;
	@Column(name="VEHICAL_MODEL")
	private String vehicalModel;
	
	
	
	public OneToOneVehical() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public OneToOneVehical(int vechicalId, String vehicalName, String vehicalModel) {
		super();
		this.vechicalId = vechicalId;
		this.vehicalName = vehicalName;
		this.vehicalModel = vehicalModel;
	}

	public String getVehicalName() {
		return vehicalName;
	}
	public void setVehicalName(String vehicalName) {
		this.vehicalName = vehicalName;
	}
	public String getVehicalModel() {
		return vehicalModel;
	}
	public void setVehicalModel(String vehicalModel) {
		this.vehicalModel = vehicalModel;
	}
	

}
