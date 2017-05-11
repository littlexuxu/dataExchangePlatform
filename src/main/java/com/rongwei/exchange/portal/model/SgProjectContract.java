package com.rongwei.exchange.portal.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the jt_sg_project_contract database table.
 * 
 */
@Entity
@Table(name="jt_sg_project_contract")
@NamedQuery(name="SgProjectContract.findAll", query="SELECT s FROM SgProjectContract s")
public class SgProjectContract implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int sgcontractid;

	private int baserecid;

	private BigDecimal bghhtgq;

	private String bgsdh;

	private String chtid;

	private String cxmid;

	private String dwqypp;

	private String gc;

	private String gltzxmgs;

	private String gpszb;

	private String hetdw;

	private String hntl;

	private String htbh;

	private BigDecimal htewy;

	private BigDecimal htgq;

	private String htjf;

	private String htjfnb;

	@Temporal(TemporalType.DATE)
	private Date htjgrq;

	@Temporal(TemporalType.DATE)
	private Date htkgrq;

	private String htmc;

	private String htqdfs;

	@Temporal(TemporalType.DATE)
	private Date htqdrq;

	private String htyfid;

	private String jldw;

	private String jldwlxdh;

	private String jldwlxr;

	private String jtpp;

	private String jtrecid;

	private String mc;

	private String orgunit;

	private String pimsid;

	private String qt;

	private String recid;

	private String sffb;

	private String sfgltzxm;

	private String sfl;

	private String sggf;

	private String sjgf;

	@Temporal(TemporalType.DATE)
	private Date sjkgrq;

	private String sn;

	private String ssdwmc;

	private String synstatus;

	private String tfl;

	@Temporal(TemporalType.DATE)
	private Date tjgsyf;

	private String tzxmlx;

	private String wqyyss;

	private String xmgkjgm;

	private String xmhtyy;

	private String xmjl;

	private String xmjldh;

	private String xmjlyy;

	private String xmld;

	private String xmxxtxdz;

	private BigDecimal xmyfk;

	private BigDecimal yfkbl;

	private BigDecimal ysjdkzfbl;

	private String yslybzfs;

	private BigDecimal yslybzje;

	private BigDecimal ysyfkbl;

	private BigDecimal yszbjbl;

	private BigDecimal yszbjqx;

	private String yzbm;

	private String zbxmmcn;

	private String zg;

	private String zglxdh;

	private String ztgcjg;

	private String zytkmsbz;

	private BigDecimal zzcdhte;

	public SgProjectContract() {
	}

	public int getSgcontractid() {
		return this.sgcontractid;
	}

	public void setSgcontractid(int sgcontractid) {
		this.sgcontractid = sgcontractid;
	}

	public int getBaserecid() {
		return this.baserecid;
	}

	public void setBaserecid(int baserecid) {
		this.baserecid = baserecid;
	}

	public BigDecimal getBghhtgq() {
		return this.bghhtgq;
	}

	public void setBghhtgq(BigDecimal bghhtgq) {
		this.bghhtgq = bghhtgq;
	}

	public String getBgsdh() {
		return this.bgsdh;
	}

	public void setBgsdh(String bgsdh) {
		this.bgsdh = bgsdh;
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

	public String getGc() {
		return this.gc;
	}

	public void setGc(String gc) {
		this.gc = gc;
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

	public String getHetdw() {
		return this.hetdw;
	}

	public void setHetdw(String hetdw) {
		this.hetdw = hetdw;
	}

	public String getHntl() {
		return this.hntl;
	}

	public void setHntl(String hntl) {
		this.hntl = hntl;
	}

	public String getHtbh() {
		return this.htbh;
	}

	public void setHtbh(String htbh) {
		this.htbh = htbh;
	}

	public BigDecimal getHtewy() {
		return this.htewy;
	}

	public void setHtewy(BigDecimal htewy) {
		this.htewy = htewy;
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

	public Date getHtjgrq() {
		return this.htjgrq;
	}

	public void setHtjgrq(Date htjgrq) {
		this.htjgrq = htjgrq;
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

	public String getHtyfid() {
		return this.htyfid;
	}

	public void setHtyfid(String htyfid) {
		this.htyfid = htyfid;
	}

	public String getJldw() {
		return this.jldw;
	}

	public void setJldw(String jldw) {
		this.jldw = jldw;
	}

	public String getJldwlxdh() {
		return this.jldwlxdh;
	}

	public void setJldwlxdh(String jldwlxdh) {
		this.jldwlxdh = jldwlxdh;
	}

	public String getJldwlxr() {
		return this.jldwlxr;
	}

	public void setJldwlxr(String jldwlxr) {
		this.jldwlxr = jldwlxr;
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

	public String getMc() {
		return this.mc;
	}

	public void setMc(String mc) {
		this.mc = mc;
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

	public String getQt() {
		return this.qt;
	}

	public void setQt(String qt) {
		this.qt = qt;
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

	public String getSfl() {
		return this.sfl;
	}

	public void setSfl(String sfl) {
		this.sfl = sfl;
	}

	public String getSggf() {
		return this.sggf;
	}

	public void setSggf(String sggf) {
		this.sggf = sggf;
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

	public String getSn() {
		return this.sn;
	}

	public void setSn(String sn) {
		this.sn = sn;
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

	public String getTfl() {
		return this.tfl;
	}

	public void setTfl(String tfl) {
		this.tfl = tfl;
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

	public String getXmgkjgm() {
		return this.xmgkjgm;
	}

	public void setXmgkjgm(String xmgkjgm) {
		this.xmgkjgm = xmgkjgm;
	}

	public String getXmhtyy() {
		return this.xmhtyy;
	}

	public void setXmhtyy(String xmhtyy) {
		this.xmhtyy = xmhtyy;
	}

	public String getXmjl() {
		return this.xmjl;
	}

	public void setXmjl(String xmjl) {
		this.xmjl = xmjl;
	}

	public String getXmjldh() {
		return this.xmjldh;
	}

	public void setXmjldh(String xmjldh) {
		this.xmjldh = xmjldh;
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

	public String getXmxxtxdz() {
		return this.xmxxtxdz;
	}

	public void setXmxxtxdz(String xmxxtxdz) {
		this.xmxxtxdz = xmxxtxdz;
	}

	public BigDecimal getXmyfk() {
		return this.xmyfk;
	}

	public void setXmyfk(BigDecimal xmyfk) {
		this.xmyfk = xmyfk;
	}

	public BigDecimal getYfkbl() {
		return this.yfkbl;
	}

	public void setYfkbl(BigDecimal yfkbl) {
		this.yfkbl = yfkbl;
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

	public String getYzbm() {
		return this.yzbm;
	}

	public void setYzbm(String yzbm) {
		this.yzbm = yzbm;
	}

	public String getZbxmmcn() {
		return this.zbxmmcn;
	}

	public void setZbxmmcn(String zbxmmcn) {
		this.zbxmmcn = zbxmmcn;
	}

	public String getZg() {
		return this.zg;
	}

	public void setZg(String zg) {
		this.zg = zg;
	}

	public String getZglxdh() {
		return this.zglxdh;
	}

	public void setZglxdh(String zglxdh) {
		this.zglxdh = zglxdh;
	}

	public String getZtgcjg() {
		return this.ztgcjg;
	}

	public void setZtgcjg(String ztgcjg) {
		this.ztgcjg = ztgcjg;
	}

	public String getZytkmsbz() {
		return this.zytkmsbz;
	}

	public void setZytkmsbz(String zytkmsbz) {
		this.zytkmsbz = zytkmsbz;
	}

	public BigDecimal getZzcdhte() {
		return this.zzcdhte;
	}

	public void setZzcdhte(BigDecimal zzcdhte) {
		this.zzcdhte = zzcdhte;
	}

}