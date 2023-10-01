package com.Jdx;

public class CollegeName {
	
	private String clgName;
	private String clgAddress;
	private int clgCode;
	
	public CollegeName (String clgName, String clgAddress, int clgCode) {
		this.clgName=clgName;
		this.clgAddress=clgAddress;
		this.clgCode=clgCode;
		
	}

	public String getClgName() {
		return clgName;
	}

	public void setClgName(String clgName) {
		this.clgName = clgName;
	}
	
	public String getClgAddress() {
		return clgAddress;
	
	}
	public String setClgAddress (String clgAddress) {
		return this.clgAddress=clgAddress;
		
	}

}
