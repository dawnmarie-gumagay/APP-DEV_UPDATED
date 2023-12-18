package com.csit321g4.gumagay.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tblcourse")
public class GumagayCourseEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int cid;
	
	@Column(name = "description")
	private String desc;
	
	@Column(name = "units")
	private int units;

	public GumagayCourseEntity() {
		super();
	}

	public GumagayCourseEntity(int cid, String desc, int units) {
		super();
		this.cid = cid;
		this.desc = desc;
		this.units = units;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getUnits() {
		return units;
	}

	public void setUnits(int units) {
		this.units = units;
	}


	
	
}
