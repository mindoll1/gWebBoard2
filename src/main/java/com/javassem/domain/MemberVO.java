package com.javassem.domain;

public class MemberVO {
	private String userId;
	private String userPass;
	private String userName;
	private boolean idPass;
	
	public boolean isIdPass() {
		return idPass;
	}
	public void setIdPass(boolean idPass) {
		this.idPass = idPass;
	}
	//-----------------------------------------------------------------------
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName =userName;
	}

	
	
}
