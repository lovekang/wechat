package com.weqia.pojo;


public enum NoticePubScopeEnums {
	FULL_COMPANY(1, "全公司"),
	APPIONT_SCOPE(2, "指定范围")
	;
	/**
	 * 状态值
	 */
	private int value;
	/**
	 * 状态的描述
	 */
	private String description;
	
	private NoticePubScopeEnums(int value, String description) {
		this.value = value;
		this.description = description;
	}
		
	public int value() {
		return value;
	}
	public String description() {
		return description;
	}
	
	// 把整数映射到枚举值
    public static NoticePubScopeEnums valueOf(int value) {
        for(NoticePubScopeEnums scopeEnum : NoticePubScopeEnums.values()) {
            if(scopeEnum.value() == value) {
                return scopeEnum;
            }
        }
        return null; 
    }
}
