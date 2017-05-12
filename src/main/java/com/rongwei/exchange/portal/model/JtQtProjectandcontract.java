package com.rongwei.exchange.portal.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the jt_qt_projectandcontract database table.
 * 
 */
@Entity
@Table(name="jt_qt_projectandcontract")
@NamedQuery(name="JtQtProjectandcontract.findAll", query="SELECT j FROM JtQtProjectandcontract j")
public class JtQtProjectandcontract implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int otherid;

	private String cxmid;

	private String dwqypp;

	private String gjhylb;

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

	private String jedw;

	private String jtrecid;

	private String orgunit;

	private String pimsid;

	private String qyzzmc;

	private String recid;

	private String sffb;

	private String sftzxm;

	private String sfwqyyss;

	@Temporal(TemporalType.DATE)
	private Date sjkgrq;

	@Temporal(TemporalType.DATE)
	private Date sjwgrq;

	private String ssyw;

	private String stdname;

	private String synstatus;

	private String tjgsyf;

	private String tzly;

	private String xmbd;

	private String xmhzfs;

	private String xmlx;

	private String xmmcyw;

	private String xmszd;

	private String yzdw;

	private String yzzjly;

	private String zjhyfl;

	private BigDecimal zzcdhte;

	public JtQtProjectandcontract() {
	}

	public int getOtherid() {
		return this.otherid;
	}

	public void setOtherid(int otherid) {
		this.otherid = otherid;
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

	public String getGjhylb() {
		return this.gjhylb;
	}

	public void setGjhylb(String gjhylb) {
		this.gjhylb = gjhylb;
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

	public String getJedw() {
		return this.jedw;
	}

	public void setJedw(String jedw) {
		this.jedw = jedw;
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

	public String getQyzzmc() {
		return this.qyzzmc;
	}

	public void setQyzzmc(String qyzzmc) {
		this.qyzzmc = qyzzmc;
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

	public String getSftzxm() {
		return this.sftzxm;
	}

	public void setSftzxm(String sftzxm) {
		this.sftzxm = sftzxm;
	}

	public String getSfwqyyss() {
		return this.sfwqyyss;
	}

	public void setSfwqyyss(String sfwqyyss) {
		this.sfwqyyss = sfwqyyss;
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

	public String getSsyw() {
		return this.ssyw;
	}

	public void setSsyw(String ssyw) {
		this.ssyw = ssyw;
	}

	public String getStdname() {
		return this.stdname;
	}

	public void setStdname(String stdname) {
		this.stdname = stdname;
	}

	public String getSynstatus() {
		return this.synstatus;
	}

	public void setSynstatus(String synstatus) {
		this.synstatus = synstatus;
	}

	public String getTjgsyf() {
		return this.tjgsyf;
	}

	public void setTjgsyf(String tjgsyf) {
		this.tjgsyf = tjgsyf;
	}

	public String getTzly() {
		return this.tzly;
	}

	public void setTzly(String tzly) {
		this.tzly = tzly;
	}

	public String getXmbd() {
		return this.xmbd;
	}

	public void setXmbd(String xmbd) {
		this.xmbd = xmbd;
	}

	public String getXmhzfs() {
		return this.xmhzfs;
	}

	public void setXmhzfs(String xmhzfs) {
		this.xmhzfs = xmhzfs;
	}

	public String getXmlx() {
		return this.xmlx;
	}

	public void setXmlx(String xmlx) {
		this.xmlx = xmlx;
	}

	public String getXmmcyw() {
		return this.xmmcyw;
	}

	public void setXmmcyw(String xmmcyw) {
		this.xmmcyw = xmmcyw;
	}

	public String getXmszd() {
		return this.xmszd;
	}

	public void setXmszd(String xmszd) {
		this.xmszd = xmszd;
	}

	public String getYzdw() {
		return this.yzdw;
	}

	public void setYzdw(String yzdw) {
		this.yzdw = yzdw;
	}

	public String getYzzjly() {
		return this.yzzjly;
	}

	public void setYzzjly(String yzzjly) {
		this.yzzjly = yzzjly;
	}

	public String getZjhyfl() {
		return this.zjhyfl;
	}

	public void setZjhyfl(String zjhyfl) {
		this.zjhyfl = zjhyfl;
	}

	public BigDecimal getZzcdhte() {
		return this.zzcdhte;
	}

	public void setZzcdhte(BigDecimal zzcdhte) {
		this.zzcdhte = zzcdhte;
	}

}