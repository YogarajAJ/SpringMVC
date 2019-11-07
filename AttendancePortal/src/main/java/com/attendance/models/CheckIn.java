package com.attendance.models;

import java.sql.Timestamp;

public class CheckIn {
	private Integer id;
	private Timestamp in_time;
	private Timestamp out_time;

	public CheckIn() {
	}

	public CheckIn(Integer id, Timestamp in_time, Timestamp out_time) {
		super();
		this.id = id;
		this.in_time = in_time;
		this.out_time = out_time;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Timestamp getIn_time() {
		return in_time;
	}

	public void setIn_time(Timestamp in_time) {
		this.in_time = in_time;
	}

	public Timestamp getOut_time() {
		return out_time;
	}

	public void setOut_time(Timestamp out_time) {
		this.out_time = out_time;
	}

}
