package com.weqia.pojo;

import java.io.Serializable;
import java.util.Date;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;


/**  
 * 
 * @Description : 企业员工表  - 前台查询用
 * @author sam    
 * @version 1.0  
 * @created Apr 6, 2013 7:59:15 AM
 * @fileName com.weqia.site.company.pojo.EmployeeFront.java
 *
 */
public class Employee implements Serializable{

	private static final long serialVersionUID = 1L;
	
	/**
	 * 员工id
	 */
	private String openId;
	
	/**
	 * 员工姓名
	 */
	private String name;
	
	/**
	 * 帐号类型，1：手机号码，2：邮箱，3：微洽号
	 */
	private Byte accountType;
	
	/**
	 * 手机号码或邮箱或帐号(员工号或其他ID)，唯一
	 */
	private String account;
	
	/**
	 * 手机号码
	 */
	private String mobile;
	
	/**
	 * 邮箱
	 */
	private String email;
	
	/**
	 * 性别，1：男2：女，3：未填写
	 */
	private Byte sex;	

	/**
	 * 部门名称,支持多级，由”\”为分隔符; 例如: “研发中心\移动平台产品部\开发部”
	 */
	private String department;	
	
	/**
	 * 职位
	 */
	private String position;	
	
	/**
	 * 状态，1：正常，2：离职
	 */
	private Byte status;	
	
	/**
	 * 密码
	 */
	private String pwd;
	
	//短号
	private String short_code;
	//联系电话
	private String link_cele;
	//生日
	private Date birthday;
	//备注
	private String summary;
	//工号
	private String jobnumber;
	
	@JsonSerialize(include=Inclusion.NON_NULL)
	public String getJobnumber() {
		return jobnumber;
	}

	public void setJobnumber(String jobnumber) {
		this.jobnumber = jobnumber;
	}

	@JsonSerialize(include=Inclusion.NON_NULL)
	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@JsonSerialize(include=Inclusion.NON_NULL)
	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	@JsonSerialize(include=Inclusion.NON_NULL)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@JsonSerialize(include=Inclusion.NON_NULL)
	public Byte getAccountType() {
		return accountType;
	}

	public void setAccountType(Byte accountType) {
		this.accountType = accountType;
	}

	@JsonSerialize(include=Inclusion.NON_NULL)
	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	@JsonSerialize(include=Inclusion.NON_NULL)
	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@JsonSerialize(include=Inclusion.NON_NULL)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@JsonSerialize(include=Inclusion.NON_NULL)
	public Byte getSex() {
		return sex;
	}

	public void setSex(Byte sex) {
		this.sex = sex;
	}

	@JsonSerialize(include=Inclusion.NON_NULL)
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@JsonSerialize(include=Inclusion.NON_NULL)
	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@JsonSerialize(include=Inclusion.NON_NULL)
	public Byte getStatus() {
		return status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}
	@JsonSerialize(include=Inclusion.NON_NULL)
	public String getShort_code() {
		return short_code;
	}

	public void setShort_code(String short_code) {
		this.short_code = short_code;
	}
	@JsonSerialize(include=Inclusion.NON_NULL)
	public String getLink_cele() {
		return link_cele;
	}

	public void setLink_cele(String link_cele) {
		this.link_cele = link_cele;
	}

	@JsonSerialize(include=Inclusion.NON_NULL)
	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	@JsonSerialize(include=Inclusion.NON_NULL)
	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}	
		
	
}
