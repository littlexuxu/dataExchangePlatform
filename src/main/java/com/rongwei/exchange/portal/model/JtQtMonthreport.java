package com.rongwei.exchange.portal.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the jt_qt_monthreport database table.
 * 
 */
@Entity
@Table(name="jt_qt_monthreport")
@NamedQuery(name="JtQtMonthreport.findAll", query="SELECT j FROM JtQtMonthreport j")
public class JtQtMonthreport implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int qtmonthreportid;

	private String chtid;

	private String cybid;

	private String datatime;

	private BigDecimal qtxmzx001009f;

	private BigDecimal qtxmzx001016f;

	private BigDecimal qtxmzx001053f;

	private String qtxmzx001076f;

	private String recid;

	private String unitid;

	public JtQtMonthreport() {
	}

	public int getQtmonthreportid() {
		return this.qtmonthreportid;
	}

	public void setQtmonthreportid(int qtmonthreportid) {
		this.qtmonthreportid = qtmonthreportid;
	}

	public String getChtid() {
		return this.chtid;
	}

	public void setChtid(String chtid) {
		this.chtid = chtid;
	}

	public String getCybid() {
		return this.cybid;
	}

	public void setCybid(String cybid) {
		this.cybid = cybid;
	}

	public String getDatatime() {
		return this.datatime;
	}

	public void setDatatime(String datatime) {
		this.datatime = datatime;
	}

	public BigDecimal getQtxmzx001009f() {
		return this.qtxmzx001009f;
	}

	public void setQtxmzx001009f(BigDecimal qtxmzx001009f) {
		this.qtxmzx001009f = qtxmzx001009f;
	}

	public BigDecimal getQtxmzx001016f() {
		return this.qtxmzx001016f;
	}

	public void setQtxmzx001016f(BigDecimal qtxmzx001016f) {
		this.qtxmzx001016f = qtxmzx001016f;
	}

	public BigDecimal getQtxmzx001053f() {
		return this.qtxmzx001053f;
	}

	public void setQtxmzx001053f(BigDecimal qtxmzx001053f) {
		this.qtxmzx001053f = qtxmzx001053f;
	}

	public String getQtxmzx001076f() {
		return this.qtxmzx001076f;
	}

	public void setQtxmzx001076f(String qtxmzx001076f) {
		this.qtxmzx001076f = qtxmzx001076f;
	}

	public String getRecid() {
		return this.recid;
	}

	public void setRecid(String recid) {
		this.recid = recid;
	}

	public String getUnitid() {
		return this.unitid;
	}

	public void setUnitid(String unitid) {
		this.unitid = unitid;
	}

}