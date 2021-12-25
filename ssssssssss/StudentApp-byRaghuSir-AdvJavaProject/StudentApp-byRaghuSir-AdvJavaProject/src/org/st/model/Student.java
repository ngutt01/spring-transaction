package org.st.model;

public class Student {
	
	private int id;
	private String name;
	private String gen;
	private String dob;
	private String email;
	private String phno;
	private String addr;
	
	//alt+shift+S, O > DeselectAll >OK
	//alt+shift+S, R > SelectAll >OK
	//alt+shift+S, S  >OK

	
	
	public Student() {
		super();
	}
	public Student(int id) {
		super();
		this.id = id;
	}
	
	
	public Student(int id, String name, String gen, String dob, String email, String phno, String addr) {
		super();
		this.id = id;
		this.name = name;
		this.gen = gen;
		this.dob = dob;
		this.email = email;
		this.phno = phno;
		this.addr = addr;
	}
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
	public String getGen() {
		return gen;
	}
	public void setGen(String gen) {
		this.gen = gen;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gen=" + gen + ", dob=" + dob + ", email=" + email + ", phno="
				+ phno + ", addr=" + addr + "]";
	}
	
	
	
	
}
