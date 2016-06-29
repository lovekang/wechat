package com.weqia.pojo;


public class OpenNoticeListForm {
	private Integer noticeId;//公告ID
	private String openId;//会员ID
	private String noticetitle;//公告标题
	private Integer departmentid;//部门ID
	private Integer startRow;//分页开始
	private Integer endRow;//分页结束
	private Integer classifyid;//分类ID
	private String noticecontent;//内容
	private Integer prevId;//上翻
	private Integer nextId;//下翻
	private Integer pageSize;//页数
	
	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	
	public Integer getPrevId() {
		return prevId;
	}

	public void setPrevId(Integer prevId) {
		this.prevId = prevId;
	}

	public Integer getNextId() {
		return nextId;
	}

	public void setNextId(Integer nextId) {
		this.nextId = nextId;
	}

	public String getNoticecontent() {
		return noticecontent;
	}

	public void setNoticecontent(String noticecontent) {
		this.noticecontent = noticecontent;
	}

	public Integer getNoticeId() {
		return noticeId;
	}

	public void setNoticeId(Integer noticeId) {
		this.noticeId = noticeId;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getNoticetitle() {
		return noticetitle;
	}

	public void setNoticetitle(String noticetitle) {
		this.noticetitle = noticetitle;
	}

	public Integer getDepartmentid() {
		return departmentid;
	}

	public void setDepartmentid(Integer departmentid) {
		this.departmentid = departmentid;
	}

	public Integer getStartRow() {
		return startRow;
	}

	public void setStartRow(Integer startRow) {
		this.startRow = startRow;
	}

	public Integer getEndRow() {
		return endRow;
	}

	public void setEndRow(Integer endRow) {
		this.endRow = endRow;
	}

	public Integer getClassifyid() {
		return classifyid;
	}

	public void setClassifyid(Integer classifyid) {
		this.classifyid = classifyid;
	}
	
	
	
}
