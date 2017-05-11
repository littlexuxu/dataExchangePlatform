package com.rongwei.exchange.portal.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the jt_sj_project_base database table.
 * 
 */
@Entity
@Table(name="jt_sj_project_base")
@NamedQuery(name="JtSjProjectBase.findAll", query="SELECT j FROM JtSjProjectBase j")
public class JtSjProjectBase implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int sjbaseid;

	private String cxmid;

	@Column(name="ddckqk_hw")
	private BigDecimal ddckqkHw;

	private String gjhylb;

	private String jtrecid;

	private String orgunit;

	private String pimsid;

	private String recid;

	private String sfcfwt;

	@Column(name="sfgjcnhzxm_hw")
	private String sfgjcnhzxmHw;

	@Column(name="sfwjhnxm_gh")
	private String sfwjhnxmGh;

	private String sfzdjkxm;

	private String ssyw;

	private String stdname;

	private String swbxmlx;

	private String synstatus;

	private String tsztyysm;

	private String tzly;

	private String xmbd;

	private String xmhzfs;

	private String xmlx;

	private String xmmcyw;

	private String xmszd;

	private String xmtszt;

	private String yjhtebz;

	private String yzdw;

	private String yzdwqt;

	private BigDecimal yztze;

	@Column(name="zgcfbl_hw")
	private BigDecimal zgcfblHw;

	private String zjhyflx;

	private String zjlydx;

	private String zygcnr;

	public JtSjProjectBase() {
	}

	public int getSjbaseid() {
		return this.sjbaseid;
	}

	public void setSjbaseid(int sjbaseid) {
		this.sjbaseid = sjbaseid;
	}

	public String getCxmid() {
		return this.cxmid;
	}

	public void setCxmid(String cxmid) {
		this.cxmid = cxmid;
	}

	public BigDecimal getDdckqkHw() {
		return this.ddckqkHw;
	}

	public void setDdckqkHw(BigDecimal ddckqkHw) {
		this.ddckqkHw = ddckqkHw;
	}

	public String getGjhylb() {
		return this.gjhylb;
	}

	public void setGjhylb(String gjhylb) {
		this.gjhylb = gjhylb;
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

	public String getSfcfwt() {
		return this.sfcfwt;
	}

	public void setSfcfwt(String sfcfwt) {
		this.sfcfwt = sfcfwt;
	}

	public String getSfgjcnhzxmHw() {
		return this.sfgjcnhzxmHw;
	}

	public void setSfgjcnhzxmHw(String sfgjcnhzxmHw) {
		this.sfgjcnhzxmHw = sfgjcnhzxmHw;
	}

	public String getSfwjhnxmGh() {
		return this.sfwjhnxmGh;
	}

	public void setSfwjhnxmGh(String sfwjhnxmGh) {
		this.sfwjhnxmGh = sfwjhnxmGh;
	}

	public String getSfzdjkxm() {
		return this.sfzdjkxm;
	}

	public void setSfzdjkxm(String sfzdjkxm) {
		this.sfzdjkxm = sfzdjkxm;
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

	public String getSwbxmlx() {
		return this.swbxmlx;
	}

	public void setSwbxmlx(String swbxmlx) {
		this.swbxmlx = swbxmlx;
	}

	public String getSynstatus() {
		return this.synstatus;
	}

	public void setSynstatus(String synstatus) {
		this.synstatus = synstatus;
	}

	public String getTsztyysm() {
		return this.tsztyysm;
	}

	public void setTsztyysm(String tsztyysm) {
		this.tsztyysm = tsztyysm;
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

	public String getXmtszt() {
		return this.xmtszt;
	}

	public void setXmtszt(String xmtszt) {
		this.xmtszt = xmtszt;
	}

	public String getYjhtebz() {
		return this.yjhtebz;
	}

	public void setYjhtebz(String yjhtebz) {
		this.yjhtebz = yjhtebz;
	}

	public String getYzdw() {
		return this.yzdw;
	}

	public void setYzdw(String yzdw) {
		this.yzdw = yzdw;
	}

	public String getYzdwqt() {
		return this.yzdwqt;
	}

	public void setYzdwqt(String yzdwqt) {
		this.yzdwqt = yzdwqt;
	}

	public BigDecimal getYztze() {
		return this.yztze;
	}

	public void setYztze(BigDecimal yztze) {
		this.yztze = yztze;
	}

	public BigDecimal getZgcfblHw() {
		return this.zgcfblHw;
	}

	public void setZgcfblHw(BigDecimal zgcfblHw) {
		this.zgcfblHw = zgcfblHw;
	}

	public String getZjhyflx() {
		return this.zjhyflx;
	}

	public void setZjhyflx(String zjhyflx) {
		this.zjhyflx = zjhyflx;
	}

	public String getZjlydx() {
		return this.zjlydx;
	}

	public void setZjlydx(String zjlydx) {
		this.zjlydx = zjlydx;
	}

	public String getZygcnr() {
		return this.zygcnr;
	}

	public void setZygcnr(String zygcnr) {
		this.zygcnr = zygcnr;
	}

}