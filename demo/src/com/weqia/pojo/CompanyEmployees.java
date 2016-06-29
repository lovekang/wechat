package com.weqia.pojo;

import java.io.Serializable;

/**  
 * 
 * @Description : 新增企业员工POJO
 * @author sam    
 * @version 1.0  
 * @created Sep 9, 2014 4:59:04 PM
 * @fileName com.weqia.openapi.pojo.CompanyEmployeeAdd.java
 *
 */
public class CompanyEmployees implements Serializable {

	private static final long serialVersionUID = 1L;
		
	/**
	 * 人员列表
	 */
	private Employee[] employees;
	/**
	 * 绑定手机 1不绑定 2绑定
	 */
	private Integer mobileBind;
	/**
	 * 绑定邮箱 1不绑定 2绑定
	 */
	private Integer emailBind;
	/**
	 * 覆盖 1不覆盖 2覆盖
	 */
	private Integer memberCopy;

	public Employee[] getEmployees() {
		return employees;
	}

	public void setEmployees(Employee[] employees) {
		this.employees = employees;
	}

	public Integer getMobileBind() {
		return mobileBind;
	}

	public void setMobileBind(Integer mobileBind) {
		this.mobileBind = mobileBind;
	}

	public Integer getEmailBind() {
		return emailBind;
	}

	public void setEmailBind(Integer emailBind) {
		this.emailBind = emailBind;
	}

	public Integer getMemberCopy() {
		return memberCopy;
	}

	public void setMemberCopy(Integer memberCopy) {
		this.memberCopy = memberCopy;
	}		
	
}
