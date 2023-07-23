package com.demo.test.DTO.Update;



public class UpdateDTO 
{
	private int sid;	
	private String sname;
	private String saddress;
	private String scourse;
	private String splace;
	private int sage;
	private String semail;
	private String spass;

	
	
	public UpdateDTO() 
	{
		System.out.println(this.getClass().getSimpleName()+"created");
	}



	public int getSid() {
		return sid;
	}



	public void setSid(int sid) {
		this.sid = sid;
	}



	public String getSname() {
		return sname;
	}



	public void setSname(String sname) {
		this.sname = sname;
	}



	public String getSaddress() {
		return saddress;
	}



	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}



	public String getScourse() {
		return scourse;
	}



	public void setScourse(String scourse) {
		this.scourse = scourse;
	}



	public String getSplace() {
		return splace;
	}



	public void setSplace(String splace) {
		this.splace = splace;
	}



	public int getSage() {
		return sage;
	}



	public void setSage(int sage) {
		this.sage = sage;
	}



	public String getSemail() {
		return semail;
	}



	public void setSemail(String semail) {
		this.semail = semail;
	}



	public String getSpass() {
		return spass;
	}



	public void setSpass(String spass) {
		this.spass = spass;
	}



	@Override
	public String toString() {
		return "UpdateDTO [sid=" + sid + ", sname=" + sname + ", saddress=" + saddress + ", scourse=" + scourse
				+ ", splace=" + splace + ", sage=" + sage + ", semail=" + semail + ", spass=" + spass + "]";
	}
	
	
	
	

}
