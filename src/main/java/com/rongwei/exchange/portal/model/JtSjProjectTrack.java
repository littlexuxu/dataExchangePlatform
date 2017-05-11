package com.rongwei.exchange.portal.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the jt_sj_project_track database table.
 * 
 */
@Entity
@Table(name="jt_sj_project_track")
@NamedQuery(name="JtSjProjectTrack.findAll", query="SELECT j FROM JtSjProjectTrack j")
public class JtSjProjectTrack implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int trackid;

	@Column(name="base_cxmid")
	private int baseCxmid;

	private String cscgzid;

	private String cxmid;

	private String gzjzqk;

	private String htqdfs;

	private String jtrecid;

	@Temporal(TemporalType.DATE)
	private Date ksgzsj;

	@Temporal(TemporalType.DATE)
	@Column(name="nrxtglsj_zb")
	private Date nrxtglsjZb;

	private String nssdwmc;

	private String nyqypp;

	private String nyqyzzmc;

	private String pimsid;

	private String qtdwmc;

	private String qtqyzb;

	private String qtsyb;

	private String recid;

	private String sfzb;

	private String sfzdgzxm;

	private String synstatus;

	private BigDecimal tbbj;

	private String tbbjbz;

	@Temporal(TemporalType.DATE)
	private Date tbrq;

	private BigDecimal yjhte;

	private BigDecimal yjhtgq;

	private BigDecimal zbe;

	private String zbebz;

	private String zbsm;

	private String zztbfs;

	public JtSjProjectTrack() {
	}

	public int getTrackid() {
		return this.trackid;
	}

	public void setTrackid(int trackid) {
		this.trackid = trackid;
	}

	public int getBaseCxmid() {
		return this.baseCxmid;
	}

	public void setBaseCxmid(int baseCxmid) {
		this.baseCxmid = baseCxmid;
	}

	public String getCscgzid() {
		return this.cscgzid;
	}

	public void setCscgzid(String cscgzid) {
		this.cscgzid = cscgzid;
	}

	public String getCxmid() {
		return this.cxmid;
	}

	public void setCxmid(String cxmid) {
		this.cxmid = cxmid;
	}

	public String getGzjzqk() {
		return this.gzjzqk;
	}

	public void setGzjzqk(String gzjzqk) {
		this.gzjzqk = gzjzqk;
	}

	public String getHtqdfs() {
		return this.htqdfs;
	}

	public void setHtqdfs(String htqdfs) {
		this.htqdfs = htqdfs;
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

	public Date getNrxtglsjZb() {
		return this.nrxtglsjZb;
	}

	public void setNrxtglsjZb(Date nrxtglsjZb) {
		this.nrxtglsjZb = nrxtglsjZb;
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

	public String getTbbjbz() {
		return this.tbbjbz;
	}

	public void setTbbjbz(String tbbjbz) {
		this.tbbjbz = tbbjbz;
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

	public BigDecimal getZbe() {
		return this.zbe;
	}

	public void setZbe(BigDecimal zbe) {
		this.zbe = zbe;
	}

	public String getZbebz() {
		return this.zbebz;
	}

	public void setZbebz(String zbebz) {
		this.zbebz = zbebz;
	}

	public String getZbsm() {
		return this.zbsm;
	}

	public void setZbsm(String zbsm) {
		this.zbsm = zbsm;
	}

	public String getZztbfs() {
		return this.zztbfs;
	}

	public void setZztbfs(String zztbfs) {
		this.zztbfs = zztbfs;
	}

}