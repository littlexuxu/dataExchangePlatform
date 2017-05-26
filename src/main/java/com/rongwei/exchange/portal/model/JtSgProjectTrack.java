package com.rongwei.exchange.portal.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the jt_sg_project_track database table.
 * 
 */
@Entity
@Table(name="jt_sg_project_track")
@NamedQuery(name="SgProjectTrack.findAll", query="SELECT s FROM SgProjectTrack s")
public class JtSgProjectTrack implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int sgtrackid;

	private int baserecid;

	private String cscgzid;

	private int cxmid;

	private String dwmcb;

	private BigDecimal htermb;

	private String htqdfs;

	private String jedwb;

	private String jtrecid;

	@Temporal(TemporalType.DATE)
	private Date ksgzsj;

	@Column(name="nrxtgljsj_zb")
	private String nrxtgljsjZb;

	private String nssdwmc;

	private String nyqypp;

	private String nyqyzzmc;

	private String pimsid;

	private String qtdwmc;

	private String qtqyzb;

	private String qtsyb;

	private String recid;

	private String scjzqk;

	private String sfzb;

	private String sfzdgzxm;

	private String synstatus;

	private BigDecimal tbbj;

	private BigDecimal tbbjb;

	private String tbbjdw;

	@Temporal(TemporalType.DATE)
	private Date tbrq;

	private BigDecimal yjhte;

	private BigDecimal yjhtgq;

	private String zbdllxdh;

	private String zbdllxr;

	private String zbdlmc;

	private BigDecimal zbe;

	private BigDecimal zbeb;

	private String zbedw;

	@Temporal(TemporalType.DATE)
	private Date zbjzrq;

	@Temporal(TemporalType.DATE)
	private Date zbrq;

	@Temporal(TemporalType.DATE)
	private Date zbrqi;

	private String zbsm;

	private String zbxmmc;

	private String zsjg;

	@Temporal(TemporalType.DATE)
	private Date zsrq;

	private String zztbfs;

	public JtSgProjectTrack() {
	}

	public int getSgtrackid() {
		return this.sgtrackid;
	}

	public void setSgtrackid(int sgtrackid) {
		this.sgtrackid = sgtrackid;
	}

	public int getBaserecid() {
		return this.baserecid;
	}

	public void setBaserecid(int baserecid) {
		this.baserecid = baserecid;
	}

	public String getCscgzid() {
		return this.cscgzid;
	}

	public void setCscgzid(String cscgzid) {
		this.cscgzid = cscgzid;
	}

	public int getCxmid() {
		return this.cxmid;
	}

	public void setCxmid(int cxmid) {
		this.cxmid = cxmid;
	}

	public String getDwmcb() {
		return this.dwmcb;
	}

	public void setDwmcb(String dwmcb) {
		this.dwmcb = dwmcb;
	}

	public BigDecimal getHtermb() {
		return this.htermb;
	}

	public void setHtermb(BigDecimal htermb) {
		this.htermb = htermb;
	}

	public String getHtqdfs() {
		return this.htqdfs;
	}

	public void setHtqdfs(String htqdfs) {
		this.htqdfs = htqdfs;
	}

	public String getJedwb() {
		return this.jedwb;
	}

	public void setJedwb(String jedwb) {
		this.jedwb = jedwb;
	}

	public String getJtrecid() {
		return this.jtrecid;
	}

	public void setJtrecid(String jtrecid) {
		this.jtrecid = jtrecid;
	}

	public Date getKsgzsj() {
		return this.ksgzsj;
	}

	public void setKsgzsj(Date ksgzsj) {
		this.ksgzsj = ksgzsj;
	}

	public String getNrxtgljsjZb() {
		return this.nrxtgljsjZb;
	}

	public void setNrxtgljsjZb(String nrxtgljsjZb) {
		this.nrxtgljsjZb = nrxtgljsjZb;
	}

	public String getNssdwmc() {
		return this.nssdwmc;
	}

	public void setNssdwmc(String nssdwmc) {
		this.nssdwmc = nssdwmc;
	}

	public String getNyqypp() {
		return this.nyqypp;
	}

	public void setNyqypp(String nyqypp) {
		this.nyqypp = nyqypp;
	}

	public String getNyqyzzmc() {
		return this.nyqyzzmc;
	}

	public void setNyqyzzmc(String nyqyzzmc) {
		this.nyqyzzmc = nyqyzzmc;
	}

	public String getPimsid() {
		return this.pimsid;
	}

	public void setPimsid(String pimsid) {
		this.pimsid = pimsid;
	}

	public String getQtdwmc() {
		return this.qtdwmc;
	}

	public void setQtdwmc(String qtdwmc) {
		this.qtdwmc = qtdwmc;
	}

	public String getQtqyzb() {
		return this.qtqyzb;
	}

	public void setQtqyzb(String qtqyzb) {
		this.qtqyzb = qtqyzb;
	}

	public String getQtsyb() {
		return this.qtsyb;
	}

	public void setQtsyb(String qtsyb) {
		this.qtsyb = qtsyb;
	}

	public String getRecid() {
		return this.recid;
	}

	public void setRecid(String recid) {
		this.recid = recid;
	}

	public String getScjzqk() {
		return this.scjzqk;
	}

	public void setScjzqk(String scjzqk) {
		this.scjzqk = scjzqk;
	}

	public String getSfzb() {
		return this.sfzb;
	}

	public void setSfzb(String sfzb) {
		this.sfzb = sfzb;
	}

	public String getSfzdgzxm() {
		return this.sfzdgzxm;
	}

	public void setSfzdgzxm(String sfzdgzxm) {
		this.sfzdgzxm = sfzdgzxm;
	}

	public String getSynstatus() {
		return this.synstatus;
	}

	public void setSynstatus(String synstatus) {
		this.synstatus = synstatus;
	}

	public BigDecimal getTbbj() {
		return this.tbbj;
	}

	public void setTbbj(BigDecimal tbbj) {
		this.tbbj = tbbj;
	}

	public BigDecimal getTbbjb() {
		return this.tbbjb;
	}

	public void setTbbjb(BigDecimal tbbjb) {
		this.tbbjb = tbbjb;
	}

	public String getTbbjdw() {
		return this.tbbjdw;
	}

	public void setTbbjdw(String tbbjdw) {
		this.tbbjdw = tbbjdw;
	}

	public Date getTbrq() {
		return this.tbrq;
	}

	public void setTbrq(Date tbrq) {
		this.tbrq = tbrq;
	}

	public BigDecimal getYjhte() {
		return this.yjhte;
	}

	public void setYjhte(BigDecimal yjhte) {
		this.yjhte = yjhte;
	}

	public BigDecimal getYjhtgq() {
		return this.yjhtgq;
	}

	public void setYjhtgq(BigDecimal yjhtgq) {
		this.yjhtgq = yjhtgq;
	}

	public String getZbdllxdh() {
		return this.zbdllxdh;
	}

	public void setZbdllxdh(String zbdllxdh) {
		this.zbdllxdh = zbdllxdh;
	}

	public String getZbdllxr() {
		return this.zbdllxr;
	}

	public void setZbdllxr(String zbdllxr) {
		this.zbdllxr = zbdllxr;
	}

	public String getZbdlmc() {
		return this.zbdlmc;
	}

	public void setZbdlmc(String zbdlmc) {
		this.zbdlmc = zbdlmc;
	}

	public BigDecimal getZbe() {
		return this.zbe;
	}

	public void setZbe(BigDecimal zbe) {
		this.zbe = zbe;
	}

	public BigDecimal getZbeb() {
		return this.zbeb;
	}

	public void setZbeb(BigDecimal zbeb) {
		this.zbeb = zbeb;
	}

	public String getZbedw() {
		return this.zbedw;
	}

	public void setZbedw(String zbedw) {
		this.zbedw = zbedw;
	}

	public Date getZbjzrq() {
		return this.zbjzrq;
	}

	public void setZbjzrq(Date zbjzrq) {
		this.zbjzrq = zbjzrq;
	}

	public Date getZbrq() {
		return this.zbrq;
	}

	public void setZbrq(Date zbrq) {
		this.zbrq = zbrq;
	}

	public Date getZbrqi() {
		return this.zbrqi;
	}

	public void setZbrqi(Date zbrqi) {
		this.zbrqi = zbrqi;
	}

	public String getZbsm() {
		return this.zbsm;
	}

	public void setZbsm(String zbsm) {
		this.zbsm = zbsm;
	}

	public String getZbxmmc() {
		return this.zbxmmc;
	}

	public void setZbxmmc(String zbxmmc) {
		this.zbxmmc = zbxmmc;
	}

	public String getZsjg() {
		return this.zsjg;
	}

	public void setZsjg(String zsjg) {
		this.zsjg = zsjg;
	}

	public Date getZsrq() {
		return this.zsrq;
	}

	public void setZsrq(Date zsrq) {
		this.zsrq = zsrq;
	}

	public String getZztbfs() {
		return this.zztbfs;
	}

	public void setZztbfs(String zztbfs) {
		this.zztbfs = zztbfs;
	}

}