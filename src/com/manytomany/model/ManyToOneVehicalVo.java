package com.manytomany.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

@Entity
@Table(name="VEHICAL")
public class ManyToOneVehicalVo {

	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	@Column(name="VEHICAL_ID")
	private int vechicalId;
	@Column(name="VEHICAL_NAME")
	private String vehicalName;
	@Column(name="VEHICAL_MODEL")
	private String vehicalModel;
	
	@ManyToOne
	@NotFound(action=NotFoundAction.IGNORE)
	private ManyToOneEmployeeVo manyToManyEmployeeVo;
	
	
	public int getVechicalId() {
		return vechicalId;
	}

	public void setVechicalId(int vechicalId) {
		this.vechicalId = vechicalId;
	}

	public ManyToOneEmployeeVo getManyToManyEmployeeVo() {
		return manyToManyEmployeeVo;
	}

	public void setManyToManyEmployeeVo(ManyToOneEmployeeVo manyToManyEmployeeVo) {
		this.manyToManyEmployeeVo = manyToManyEmployeeVo;
	}

	public ManyToOneVehicalVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ManyToOneVehicalVo(int vechicalId, String vehicalName, String vehicalModel) {
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
