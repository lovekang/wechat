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
public class CompanyOpenIds implements Serializable {

	private static final long serialVersionUID = 1L;
		
	/**
	 * 人员列表
	 */
	private String[] openIds;

	public String[] getOpenIds() {
		return openIds;
	}

	public void setOpenIds(String[] openIds) {
		this.openIds = openIds;
	}	
	
}
