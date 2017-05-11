package com.rongwei.exchange.portal.model;

import java.io.Serializable;
import java.util.List;

public class TreeObject implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String id;
	
	private String text;
	
	private String pid;
	
	private String pname;

	private String state;
	
	List<TreeObject> children;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public List<TreeObject> getChildren() {
		return children;
	}

	public void setChildren(List<TreeObject> children) {
		this.children = children;
	}

	@Override
	public String toString() {
		return "TreeObject [id=" + id + ", text=" + text + ", pid=" + pid + ", pname=" + pname + ", state=" + state
				+ ", children length=" + children.size() + "]";
	}
	
	
}
