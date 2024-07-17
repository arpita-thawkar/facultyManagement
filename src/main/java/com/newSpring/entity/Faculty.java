package com.newSpring.entity;

import java.util.List;

public class Faculty {
	
	
	int fid;
	String fnm;
	int fexp;
	int fsal;
	List<Subject> subnames;
	public Faculty() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Faculty(int fid, String fnm, int fexp, int fsal, List<Subject> subnames) {
		super();
		this.fid = fid;
		this.fnm = fnm;
		this.fexp = fexp;
		this.fsal = fsal;
		this.subnames = subnames;
	}

	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getFnm() {
		return fnm;
	}
	public void setFnm(String fnm) {
		this.fnm = fnm;
	}
	public int getFexp() {
		return fexp;
	}
	public void setFexp(int fexp) {
		this.fexp = fexp;
	}
	public int getFsal() {
		return fsal;
	}
	public void setFsal(int fsal) {
		this.fsal = fsal;
	}
	
	public List<Subject> getSubnames() {
		return subnames;
	}

	public void setSubnames(List<Subject> subnames) {
		this.subnames = subnames;
	}

	@Override
	public String toString() {
		return "Faculty [fid=" + fid + ", fnm=" + fnm + ", fexp=" + fexp + ", fsal=" + fsal + ", subnames=" + subnames
				+ "]";
	}

	
	

}
