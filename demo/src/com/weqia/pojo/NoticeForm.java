package com.weqia.pojo;

import java.io.Serializable;
import java.util.Date;

public class NoticeForm implements Serializable{
	private static final long serialVersionUID = 1L;
	
	/**
	 * 公告ID
	 */
	private Integer noticeId;
	/**
	 * 会员ID
	 */
	private String mid;
	/**
	 * 公告标题
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
	 *
	 * 创建时间 
	 *
	 */
	private Date gmt_create;
	/**
	 *
	 * 最后修改时间 - 操作时间
	 *
	 */
	private Date gmt_modify;
	/**
	 *
	 * 记录创建人
	 *
	 */
	private String create_id;
	/**
	 *
	 * 记录修改人id
	 *
	 */
	private String modify_id;
	
	private String file_url;
	
	/**
	 * 发布范围 1-全公司 2-指定范围
	 */
	private Integer pub_scope;
	
	/**
	 * 分类ID
	 */
	private Integer classify_id;
	
	/**
	 * 公告附件ID
	 */
	private Integer[] file_ids;

	public Integer getNoticeId() {
		return noticeId;
	}

	public void setNoticeId(Integer noticeId) {
		this.noticeId = noticeId;
	}

	public String getMid() {
		return mid;
	}

	public void setMid(String mid) {
		this.mid = mid;
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

	public Date getGmt_create() {
		return gmt_create;
	}

	public void setGmt_create(Date gmt_create) {
		this.gmt_create = gmt_create;
	}

	public Date getGmt_modify() {
		return gmt_modify;
	}

	public void setGmt_modify(Date gmt_modify) {
		this.gmt_modify = gmt_modify;
	}

	public String getCreate_id() {
		return create_id;
	}

	public void setCreate_id(String create_id) {
		this.create_id = create_id;
	}

	public String getModify_id() {
		return modify_id;
	}

	public void setModify_id(String modify_id) {
		this.modify_id = modify_id;
	}

	public String getFile_url() {
		return file_url;
	}

	public void setFile_url(String file_url) {
		this.file_url = file_url;
	}

	public Integer getPub_scope() {
		return pub_scope;
	}

	public void setPub_scope(Integer pub_scope) {
		this.pub_scope = pub_scope;
	}

	public Integer getClassify_id() {
		return classify_id;
	}

	public void setClassify_id(Integer classify_id) {
		this.classify_id = classify_id;
	}

	public Integer[] getFile_ids() {
		return file_ids;
	}

	public void setFile_ids(Integer[] file_ids) {
		this.file_ids = file_ids;
	}
	
	
}
