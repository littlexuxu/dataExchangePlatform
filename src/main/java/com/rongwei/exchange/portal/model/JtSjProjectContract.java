package com.rongwei.exchange.portal.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the jt_sj_project_contract database table.
 * 
 */
@Entity
@Table(name="jt_sj_project_contract")
@NamedQuery(name="JtSjProjectContract.findAll", query="SELECT j FROM JtSjProjectContract j")
public class JtSjProjectContract implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="sj_contract_id")
	private int sjContractId;

	@Column(name="base_cxmid")
	private int baseCxmid;

	private String chtid;

	private String cxmid;

	private String dwqypp;

	private String gltzxmgs;

	private String gpszb;

	private String hetbz;

	private String htbh;

	private BigDecimal hte;

	private BigDecimal htgq;

	private String htjf;

	private String htjfnb;

	@Temporal(TemporalType.DATE)
	private Date htkgrq;

	private String htmc;

	private String htqdfs;

	@Temporal(TemporalType.DATE)
	private Date htqdrq;

	@Temporal(TemporalType.DATE)
	private Date htwgrq;

	private String htyfid;

	private String jtpp;

	private String jtrecid;

	private String orgunit;

	private String pimsid;

	private String recid;

	private String sffb;

	private String sfgltzxm;

	private String sjgf;

	@Temporal(TemporalType.DATE)
	private Date sjkgrq;

	@Temporal(TemporalType.DATE)
	private Date sjwgrq;

	private String ssdwmc;

	private String synstatus;

	@Temporal(TemporalType.DATE)
	private Date tjgsyf;

	private String tzxmlx;

	private String wqyyss;

	private String xmhtyy;

	private String xmjlyy;

	private String xmld;

	private BigDecimal xmyfk;

	private BigDecimal xmyfkbl;

	private BigDecimal ysjdkzfbl;

	private String yslybzfs;

	private BigDecimal yslybzje;

	private BigDecimal ysyfkbl;

	private BigDecimal yszbjbl;

	private BigDecimal yszbjqx;

	private String zbxmmc;

	private String zytkms;

	private String zyxmnr;

	private BigDecimal zzcdhte;

	public JtSjProjectContract() {
	}

	public int getSjContractId() {
		return this.sjContractId;
	}

	public void setSjContractId(int sjContractId) {
		this.sjContractId = sjContractId;
	}

	public int getBaseCxmid() {
		return this.baseCxmid;
	}

	public void setBaseCxmid(int baseCxmid) {
		this.baseCxmid = baseCxmid;
	}

	public String getChtid() {
		return this.chtid;
	}

	public void setChtid(String chtid) {
		this.chtid = chtid;
	}

	public String getCxmid() {
		return this.cxmid;
	}

	public void setCxmid(String cxmid) {
		this.cxmid = cxmid;
	}

	public String getDwqypp() {
		return this.dwqypp;
	}

	public void setDwqypp(String dwqypp) {
		this.dwqypp = dwqypp;
	}

	public String getGltzxmgs() {
		return this.gltzxmgs;
	}

	public void setGltzxmgs(String gltzxmgs) {
		this.gltzxmgs = gltzxmgs;
	}

	public String getGpszb() {
		return this.gpszb;
	}

	public void setGpszb(String gpszb) {
		this.gpszb = gpszb;
	}

	public String getHetbz() {
		return this.hetbz;
	}

	public void setHetbz(String hetbz) {
		this.hetbz = hetbz;
	}

	public String getHtbh() {
		return this.htbh;
	}

	public void setHtbh(String htbh) {
		this.htbh = htbh;
	}

	public BigDecimal getHte() {
		return this.hte;
	}

	public void setHte(BigDecimal hte) {
		this.hte = hte;
	}

	public BigDecimal getHtgq() {
		return this.htgq;
	}

	public void setHtgq(BigDecimal htgq) {
		this.htgq = htgq;
	}

	public String getHtjf() {
		return this.htjf;
	}

	public void setHtjf(String htjf) {
		this.htjf = htjf;
	}

	public String getHtjfnb() {
		return this.htjfnb;
	}

	public void setHtjfnb(String htjfnb) {
		this.htjfnb = htjfnb;
	}

	public Date getHtkgrq() {
		return this.htkgrq;
	}

	public void setHtkgrq(Date htkgrq) {
		this.htkgrq = htkgrq;
	}

	public String getHtmc() {
		return this.htmc;
	}

	public void setHtmc(String htmc) {
		this.htmc = htmc;
	}

	public String getHtqdfs() {
		return this.htqdfs;
	}

	public void setHtqdfs(String htqdfs) {
		this.htqdfs = htqdfs;
	}

	public Date getHtqdrq() {
		return this.htqdrq;
	}

	public void setHtqdrq(Date htqdrq) {
		this.htqdrq = htqdrq;
	}

	public Date getHtwgrq() {
		return this.htwgrq;
	}

	public void setHtwgrq(Date htwgrq) {
		this.htwgrq = htwgrq;
	}

	public String getHtyfid() {
		return this.htyfid;
	}

	public void setHtyfid(String htyfid) {
		this.htyfid = htyfid;
	}

	public String getJtpp() {
		return this.jtpp;
	}

	public void setJtpp(String jtpp) {
		this.jtpp = jtpp;
	}

	public String getJtrecid() {
		return this.jtrecid;
	}

	public void setJtrecid(String jtrecid) {
		this.jtrecid = jtrecid;
	}

	public String getOrgunit() {
		return this.orgunit;
	}

	public void setOrgunit(String orgunit) {
		this.orgunit = orgunit;
	}

	public String getPimsid() {
		return this.pimsid;
	}

	public void setPimsid(String pimsid) {
		this.pimsid = pimsid;
	}

	public String getRecid() {
		return this.recid;
	}

	public void setRecid(String recid) {
		this.recid = recid;
	}

	public String getSffb() {
		return this.sffb;
	}

	public void setSffb(String sffb) {
		this.sffb = sffb;
	}

	public String getSfgltzxm() {
		return this.sfgltzxm;
	}

	public void setSfgltzxm(String sfgltzxm) {
		this.sfgltzxm = sfgltzxm;
	}

	public String getSjgf() {
		return this.sjgf;
	}

	public void setSjgf(String sjgf) {
		this.sjgf = sjgf;
	}

	public Date getSjkgrq() {
		return this.sjkgrq;
	}

	public void setSjkgrq(Date sjkgrq) {
		this.sjkgrq = sjkgrq;
	}

	public Date getSjwgrq() {
		return this.sjwgrq;
	}

	public void setSjwgrq(Date sjwgrq) {
		this.sjwgrq = sjwgrq;
	}

	public String getSsdwmc() {
		return this.ssdwmc;
	}

	public void setSsdwmc(String ssdwmc) {
		this.ssdwmc = ssdwmc;
	}

	public String getSynstatus() {
		return this.synstatus;
	}

	public void setSynstatus(String synstatus) {
		this.synstatus = synstatus;
	}

	public Date getTjgsyf() {
		return this.tjgsyf;
	}

	public void setTjgsyf(Date tjgsyf) {
		this.tjgsyf = tjgsyf;
	}

	public String getTzxmlx() {
		return this.tzxmlx;
	}

	public void setTzxmlx(String tzxmlx) {
		this.tzxmlx = tzxmlx;
	}

	public String getWqyyss() {
		return this.wqyyss;
	}

	public void setWqyyss(String wqyyss) {
		this.wqyyss = wqyyss;
	}

	public String getXmhtyy() {
		return this.xmhtyy;
	}

	public void setXmhtyy(String xmhtyy) {
		this.xmhtyy = xmhtyy;
	}

	public String getXmjlyy() {
		return this.xmjlyy;
	}

	public void setXmjlyy(String xmjlyy) {
		this.xmjlyy = xmjlyy;
	}

	public String getXmld() {
		return this.xmld;
	}

	public void setXmld(String xmld) {
		this.xmld = xmld;
	}

	public BigDecimal getXmyfk() {
		return this.xmyfk;
	}

	public void setXmyfk(BigDecimal xmyfk) {
		this.xmyfk = xmyfk;
	}

	public BigDecimal getXmyfkbl() {
		return this.xmyfkbl;
	}

	public void setXmyfkbl(BigDecimal xmyfkbl) {
		this.xmyfkbl = xmyfkbl;
	}

	public BigDecimal getYsjdkzfbl() {
		return this.ysjdkzfbl;
	}

	public void setYsjdkzfbl(BigDecimal ysjdkzfbl) {
		this.ysjdkzfbl = ysjdkzfbl;
	}

	public String getYslybzfs() {
		return this.yslybzfs;
	}

	public void setYslybzfs(String yslybzfs) {
		this.yslybzfs = yslybzfs;
	}

	public BigDecimal getYslybzje() {
		return this.yslybzje;
	}

	public void setYslybzje(BigDecimal yslybzje) {
		this.yslybzje = yslybzje;
	}

	public BigDecimal getYsyfkbl() {
		return this.ysyfkbl;
	}

	public void setYsyfkbl(BigDecimal ysyfkbl) {
		this.ysyfkbl = ysyfkbl;
	}

	public BigDecimal getYszbjbl() {
		return this.yszbjbl;
	}

	public void setYszbjbl(BigDecimal yszbjbl) {
		this.yszbjbl = yszbjbl;
	}

	public BigDecimal getYszbjqx() {
		return this.yszbjqx;
	}

	public void setYszbjqx(BigDecimal yszbjqx) {
		this.yszbjqx = yszbjqx;
	}

	public String getZbxmmc() {
		return this.zbxmmc;
	}

	public void setZbxmmc(String zbxmmc) {
		this.zbxmmc = zbxmmc;
	}

	public String getZytkms() {
		return this.zytkms;
	}

	public void setZytkms(String zytkms) {
		this.zytkms = zytkms;
	}

	public String getZyxmnr() {
		return this.zyxmnr;
	}

	public void setZyxmnr(String zyxmnr) {
		this.zyxmnr = zyxmnr;
	}

	public BigDecimal getZzcdhte() {
		return this.zzcdhte;
	}

	public void setZzcdhte(BigDecimal zzcdhte) {
		this.zzcdhte = zzcdhte;
	}

}