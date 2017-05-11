package com.ajie.wechat.model;

public class GroupContractInfo {

	/**集团合同ID*/
	private String groupContractId;
	
	/**集团合同类型*/
	private String groupContractType;
	
	/**集团合同编号*/
	private String groupContractCode;
	
	/**集团合同名称*/
	private String groupContractName;
	
	/**集团项目ID*/
	private String groupProjectId;
	
	/**集团市场ID*/
	private String groupMarketId;

	public String getGroupContractId() {
		return groupContractId;
	}

	public void setGroupContractId(String groupContractId) {
		this.groupContractId = groupContractId;
	}

	public String getGroupContractType() {
		return groupContractType;
	}

	public void setGroupContractType(String groupContractType) {
		this.groupContractType = groupContractType;
	}

	public String getGroupContractCode() {
		return groupContractCode;
	}

	public void setGroupContractCode(String groupContractCode) {
		this.groupContractCode = groupContractCode;
	}

	public String getGroupContractName() {
		return groupContractName;
	}

	public void setGroupContractName(String groupContractName) {
		this.groupContractName = groupContractName;
	}

	public String getGroupProjectId() {
		return groupProjectId;
	}

	public void setGroupProjectId(String groupProjectId) {
		this.groupProjectId = groupProjectId;
	}

	public String getGroupMarketId() {
		return groupMarketId;
	}

	public void setGroupMarketId(String groupMarketId) {
		this.groupMarketId = groupMarketId;
	}

	@Override
	public String toString() {
		return "GroupContractInfo [集团合同ID=" + groupContractId
				+ ", 集团合同类型=" + groupContractType
				+ ", 集团合同编号=" + groupContractCode
				+ ", 集团合同名称=" + groupContractName
				+ ", 集团项目ID=" + groupProjectId + ", 集团市场ID="
				+ groupMarketId + "]";
	}
	
	
	
}
