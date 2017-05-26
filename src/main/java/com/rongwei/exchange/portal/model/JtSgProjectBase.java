package com.rongwei.exchange.portal.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the jt_sg_project_base database table.
 * 
 */
@Entity
@Table(name="jt_sg_project_base")
@NamedQuery(name="SgProjectBase.findAll", query="SELECT s FROM SgProjectBase s")
public class JtSgProjectBase implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int sgbaseid;

	private String bdmc;

	private String cxmid;

	@Column(name="ddckqk_hw")
	private Double ddckqkHw;

	private String gjhylb;

	private String htedw;

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

	private String sjdw;

	private String sjdwqt;

	private String ssyw;

	private String stdname;

	private String swbxmlx;

	private String synstatus;

	private String tsztyysm;

	private String tzly;

	private String xmhzfs;

	private String xmlx;

	private String xmmcyw;

	private String xmszd;

	private String xmtszt;

	private String yzdw;

	private String yzdwqt;

	private Double yztze;

	@Column(name="zgcfbl_hw")
	private Double zgcfblHw;

	private String zjhyflx;

	private String zjlydx;

	private String zygcnr;

	public JtSgProjectBase() {
	}

	public int getSgbaseid() {
		return this.sgbaseid;
	}

	public void setSgbaseid(int sgbaseid) {
		this.sgbaseid = sgbaseid;
	}

	public String getBdmc() {
		return this.bdmc;
	}

	public void setBdmc(String bdmc) {
		this.bdmc = bdmc;
	}

	public String getCxmid() {
		return this.cxmid;
	}

	public void setCxmid(String cxmid) {
		this.cxmid = cxmid;
	}

	public Double getDdckqkHw() {
		return this.ddckqkHw;
	}

	public void setDdckqkHw(Double ddckqkHw) {
		this.ddckqkHw = ddckqkHw;
	}

	public String getGjhylb() {
		return this.gjhylb;
	}

	public void setGjhylb(String gjhylb) {
		this.gjhylb = gjhylb;
	}

	public String getHtedw() {
		return this.htedw;
	}

	public void setHtedw(String htedw) {
		this.htedw = htedw;
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

	public String getSjdw() {
		return this.sjdw;
	}

	public void setSjdw(String sjdw) {
		this.sjdw = sjdw;
	}

	public String getSjdwqt() {
		return this.sjdwqt;
	}

	public void setSjdwqt(String sjdwqt) {
		this.sjdwqt = sjdwqt;
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

	public Double getYztze() {
		return this.yztze;
	}

	public void setYztze(Double yztze) {
		this.yztze = yztze;
	}

	public Double getZgcfblHw() {
		return this.zgcfblHw;
	}

	public void setZgcfblHw(Double zgcfblHw) {
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