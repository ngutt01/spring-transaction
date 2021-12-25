package com.app.sathya;

public class FirstSpring {
	private int sid;
	private String sname;
	
	public void setSid(int sid) {
		this.sid = sid;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "FirstSpring [sid=" + sid + ", sname=" + sname + "]";
	}
}
