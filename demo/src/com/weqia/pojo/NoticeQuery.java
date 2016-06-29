package com.weqia.pojo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnore;

/**  
 * 公告表分页查询Query
 * @author 
 * @version 1.0  
 * @created 2013-03-28 10:43:42
 */
public class NoticeQuery implements Serializable{
	
	/**
	 *
	 * 用于序列化标示
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 *
	 * 公告id,自增
	 *
	 */
	private Integer notice_id;

	/**
	 *
	 * 公告标题
	 *
	 */
	private String notice_title;
	/**
	 *
	 * 公告内容
	 *
	 */
	private String notice_content;
	/**
	 *
	 * 状态 1-正常 2-删除
	 *
	 */
	private Byte status;
	
	/**
	 * 公告ID数组
	 */
	private Integer[] notice_ids;
	
	/**
	 * 分类ID
	 */
	private Integer classify_id;
	
	private Integer view_cnt;

	public Integer getNotice_id() {
		return notice_id;
	}

	public void setNotice_id(Integer notice_id) {
		this.notice_id = notice_id;
	}

	public String getNotice_title() {
		return notice_title;
	}

	public void setNotice_title(String notice_title) {
		this.notice_title = notice_title;
	}

	public String getNotice_content() {
		return notice_content;
	}

	public void setNotice_content(String notice_content) {
		this.notice_content = notice_content;
	}

	public Byte getStatus() {
		return status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}

	public Integer[] getNotice_ids() {
		return notice_ids;
	}

	public void setNotice_ids(Integer[] notice_ids) {
		this.notice_ids = notice_ids;
	}

	public Integer getClassify_id() {
		return classify_id;
	}

	public void setClassify_id(Integer classify_id) {
		this.classify_id = classify_id;
	}

	public Integer getView_cnt() {
		return view_cnt;
	}

	public void setView_cnt(Integer view_cnt) {
		this.view_cnt = view_cnt;
	}
	
	
}
