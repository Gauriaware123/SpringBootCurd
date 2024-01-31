/**
 * *********************************************
 * Date         Name                         
 * *********************************************
 * 11-Dec-2019   Sachin Patil aka JavaPatil  
 */

package com.java.student.util.security.admin;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
public class User {

//    private String userName;
//    private String password;
//    private String userType;
//    private String status;
//    private Long orgId;
//    private String orgName;
//    private String name;
//
//    public User(String userName, String password, String userType, String status, Long orgId,String orgName,String name) {
//        this.userName = userName;
//        this.password = password;
//        this.userType = userType;
//        this.status = status;
//        this.orgId=orgId;
//        this.orgName=orgName;
//        this.name = name;
//    }
//
//    public String getUserName() {
//        return userName;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public String getUserType() {
//        return userType;
//    }
//
//    public String getStatus() {
//        return status;
//    }
//
//    public Long getOrgId() {
//        return orgId;
//    }
//
//    public String getOrgName() {
//        return orgName;
//    }
//
//    public String getName() {
//        return name;
//    }   
	
	private String userName;
	private int organizationId;
	public User(String string, int int1, String string2, String string3, String string4, String string5, String string6,
			String string7) {
		// TODO Auto-generated constructor stub
	}

	public int getOrganizationId() {
		return organizationId;
	}

	public void setOrganizationId(int organizationId) {
		this.organizationId = organizationId;
	}

	public String getOrganizationName() {
		return organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getUserName() {
		return userName;
	}

	private String organizationName;
	private String pass;
	private String status;
	private String emailId;
	private String mobileNo;
	private String roleName;
	
	public String toString()
	{
		return this.userName + " " + this.organizationId + " " + this.organizationName + " " + this.pass + " " + this.status + " " + this.emailId + " " + this.mobileNo + " " + this.roleName;
	}

	public void setUserName(String string) {
		// TODO Auto-generated method stub
		
	}
}
