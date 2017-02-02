/**
 * 
 */
package com.newRegistration.project;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author 486958
 *
 */

public class Regform extends ActionSupport{
	
	private static final long serialVersionUID = 1L;
	
	private String firstName;
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	private String lastName;
	private String email;
	private long phoneNo;
	

	
	public static void main(String[] args) {
		
		
		
	}

	public String execute(){
		System.out.println("test");
		
		
				
		return "success";
	}
}
