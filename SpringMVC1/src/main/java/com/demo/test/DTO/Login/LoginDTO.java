package com.demo.test.DTO.Login;

import javax.persistence.Entity;

@Entity
public class LoginDTO 
{
	private String semail;
	private String spass;
	public LoginDTO() {
		System.out.println(this.getClass().getSimpleName()+"created");
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
		return "LoginDTO [semail=" + semail + ", spass=" + spass + "]";
	}
	

}
