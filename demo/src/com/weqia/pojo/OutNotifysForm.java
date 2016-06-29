package com.weqia.pojo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnore;

/**  
 * 
 * @Description : 批量新增企业员工Form
 * @author sam    
 * @version 1.0  
 * @created Sep 9, 2014 4:59:04 PM
 * @fileName com.weqia.openapi.pojo.CompanyEmployeeAdd.java
 *
 */
public class OutNotifysForm implements Serializable {

	private static final long serialVersionUID = 1L;
	
	/**
	 * 可空，发送人openId
	 */
	private String fromId;
	
	/**
	 * 必填，接收人openIds数组
	 */
	private String[] toIds;
	
	/**
	 * 可空，标题(如：OA-审批)，默认为“外部消息”
	 */
	private String title;
	
	/**
	 * 必填，消息内容(如：王平，有个采购合同需要你审批，请登录OA审批~)
	 */
	private String content;		
	
	/**
	 * 可选，提醒类型，0：普通提醒(消息上有小圆点提醒) 1：重要提醒(消息上有数字标记)，2：不提醒; 默认为1
	 */
	private Byte warnType;
	
	/**
	 * 可选，声音提醒，1：有声音提醒 2：不声音提醒; 默认为1
	 */
	private Byte voiceType;
	
	/**
	 * 
	 * 可选，通知栏提醒内容 (如：你有一条采购单需要审批~)
	 * 
	 */
	private String warnContent;
	
	/**
	 * 可选，点击消息内容后跳转的URL
	 */
	private String clickUrl;	
	
	public String getClickUrl() {
		return clickUrl;
	}

	public void setClickUrl(String clickUrl) {
		this.clickUrl = clickUrl;
	}

	public String getFromId() {
		return fromId;
	}

	public void setFromId(String fromId) {
		this.fromId = fromId;
	}

	public String[] getToIds() {
		return toIds;
	}

	public void setToIds(String[] toIds) {
		this.toIds = toIds;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Byte getWarnType() {
		return warnType;
	}

	public void setWarnType(Byte warnType) {
		this.warnType = warnType;
	}

	public Byte getVoiceType() {
		return voiceType;
	}

	public void setVoiceType(Byte voiceType) {
		this.voiceType = voiceType;
	}

	public String getWarnContent() {
		return warnContent;
	}

	public void setWarnContent(String warnContent) {
		this.warnContent = warnContent;
	}	
	
	
}
