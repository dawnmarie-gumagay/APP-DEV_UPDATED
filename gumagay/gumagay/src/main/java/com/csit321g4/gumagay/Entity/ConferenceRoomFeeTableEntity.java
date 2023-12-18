package com.csit321g4.gumagay.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tblconferenceroom")
public class ConferenceRoomFeeTableEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid;

	@Column(name = "conferenceroomtype")
	private int roomtype;

	@Column(name = "timeslotclassificationcode")
	private int timeslot;
		
	@Column(name = "fee")
	private int fee;

	// Default constructor with no arguments
	public ConferenceRoomFeeTableEntity() {
		// You can leave it empty or initialize any default values if needed
	}

	public ConferenceRoomFeeTableEntity(int sid, int roomtype, int timeslot, int fee) {
		super();
		this.sid = sid;
		this.roomtype = roomtype;
		this.timeslot = timeslot;
		this.fee = fee;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public int getRoomtype() {
		return roomtype;
	}

	public void setRoomtype(int roomtype) {
		this.roomtype = roomtype;
	}

	public int getTimeslot() {
		return timeslot;
	}

	public void setTimeslot(int timeslot) {
		this.timeslot = timeslot;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}
}
