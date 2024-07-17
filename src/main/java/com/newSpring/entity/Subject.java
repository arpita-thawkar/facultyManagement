package com.newSpring.entity;

public class Subject {

	
	int sid;
	String snm;
	
	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Subject(int sid, String snm) {
		super();
		this.sid = sid;
		this.snm = snm;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSnm() {
		return snm;
	}

	public void setSnm(String snm) {
		this.snm = snm;
	}

	@Override
	public String toString() {
		return "Subject [sid=" + sid + ", snm=" + snm + "]";
	}
	
}
