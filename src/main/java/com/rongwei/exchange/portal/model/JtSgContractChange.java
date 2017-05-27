package com.rongwei.exchange.portal.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the jt_sg_contract_change database table.
 * 
 */
@Entity
@Table(name="jt_sg_contract_change")
@NamedQuery(name="JtSgContractChange.findAll", query="SELECT j FROM JtSgContractChange j")
public class JtSgContractChange implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int sgchangeid;

	private BigDecimal bghhtgq;

	private String bghtmc;

	private String bgrq;

	private String bgyy;

	private BigDecimal bgzjhte;

	private BigDecimal bgzjzzcdhte;

	private String cbghtid;

	private String chanegesyncstatus;

	private String chtid;

	private String htbz;

	private String orgunit;

	private String sfnrxq;

	private String zhtmc;

	private String zybgtk;
	
	private int sgcontractid;

	public JtSgContractChange() {
	}

	public int getSgchangeid() {
		return this.sgchangeid;
	}

	public void setSgchangeid(int sgchangeid) {
		this.sgchangeid = sgchangeid;
	}

	public BigDecimal getBghhtgq() {
		return this.bghhtgq;
	}

	public void setBghhtgq(BigDecimal bghhtgq) {
		this.bghhtgq = bghhtgq;
	}

	public String getBghtmc() {
		return this.bghtmc;
	}

	public void setBghtmc(String bghtmc) {
		this.bghtmc = bghtmc;
	}

	public String getBgrq() {
		return this.bgrq;
	}

	public void setBgrq(String bgrq) {
		this.bgrq = bgrq;
	}

	public String getBgyy() {
		return this.bgyy;
	}

	public void setBgyy(String bgyy) {
		this.bgyy = bgyy;
	}

	public BigDecimal getBgzjhte() {
		return this.bgzjhte;
	}

	public void setBgzjhte(BigDecimal bgzjhte) {
		this.bgzjhte = bgzjhte;
	}

	public BigDecimal getBgzjzzcdhte() {
		return this.bgzjzzcdhte;
	}

	public void setBgzjzzcdhte(BigDecimal bgzjzzcdhte) {
		this.bgzjzzcdhte = bgzjzzcdhte;
	}

	public String getCbghtid() {
		return this.cbghtid;
	}

	public void setCbghtid(String cbghtid) {
		this.cbghtid = cbghtid;
	}

	public String getChanegesyncstatus() {
		return this.chanegesyncstatus;
	}

	public void setChanegesyncstatus(String chanegesyncstatus) {
		this.chanegesyncstatus = chanegesyncstatus;
	}

	public String getChtid() {
		return this.chtid;
	}

	public void setChtid(String chtid) {
		this.chtid = chtid;
	}

	public String getHtbz() {
		return this.htbz;
	}

	public void setHtbz(String htbz) {
		this.htbz = htbz;
	}

	public String getOrgunit() {
		return this.orgunit;
	}

	public void setOrgunit(String orgunit) {
		this.orgunit = orgunit;
	}

	public String getSfnrxq() {
		return this.sfnrxq;
	}

	public void setSfnrxq(String sfnrxq) {
		this.sfnrxq = sfnrxq;
	}

	public String getZhtmc() {
		return this.zhtmc;
	}

	public void setZhtmc(String zhtmc) {
		this.zhtmc = zhtmc;
	}

	public String getZybgtk() {
		return this.zybgtk;
	}

	public void setZybgtk(String zybgtk) {
		this.zybgtk = zybgtk;
	}
	
	public int getSgcontractid() {
		return this.sgcontractid;
	}

	public void setSgcontractid(int sgcontractid) {
		this.sgcontractid = sgcontractid;
	}

}