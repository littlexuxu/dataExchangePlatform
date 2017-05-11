
package cn.ccccltd.webservice.other.projectbaseinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>qtlxmVO complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="qtlxmVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://projectbaseinfo.other.webservice.ccccltd.cn/}voSupport"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="acctyear" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="basedatamarker" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="bghhtgq" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="bghzhte" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="bghzzcdhte" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="billcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="billdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="billdefine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="billtime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="creater" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="createtime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="createunit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="createuser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="createuserid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="creator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cxmid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="defineid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dwqypp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gddh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gddh1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gjhylb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="htbh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hte" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="htgq" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="htjf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="htjfnb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="htkgrq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="htmc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="htqdfs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="htqdrq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="htwgrq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="htyfid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="invalidtime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isdraft" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
 *         &lt;element name="isleaf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="jedw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="jedw_fz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="level_1" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="modifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="modifytime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="modifyuser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="modifyuserid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="objectid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgunit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="parents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="qyzx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="qyzzmc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="recid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="recver" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="resid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="schemeid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sffb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sfhw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sftzxm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sfwqyyss" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shortname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sjkgrq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sjwgrq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sortorder" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ssqy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ssyw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="startflag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stdcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stdname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="submittime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="submitunit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="submituser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="submituserid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tel1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tjgsyf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tzly" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="unitid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="validtime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="workflowstate" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="xmbd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="xmhzfs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="xmlx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="xmmcyw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="xmszd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="yzdw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="yzzjly" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="zjhyfl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="zzcdhte" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "qtlxmVO", propOrder = {
    "acctyear",
    "basedatamarker",
    "bghhtgq",
    "bghzhte",
    "bghzzcdhte",
    "billcode",
    "billdate",
    "billdefine",
    "billtime",
    "creater",
    "createtime",
    "createunit",
    "createuser",
    "createuserid",
    "creator",
    "cxmid",
    "defineid",
    "dwqypp",
    "gddh",
    "gddh1",
    "gjhylb",
    "htbh",
    "hte",
    "htgq",
    "htjf",
    "htjfnb",
    "htkgrq",
    "htmc",
    "htqdfs",
    "htqdrq",
    "htwgrq",
    "htyfid",
    "invalidtime",
    "isdraft",
    "isleaf",
    "jedw",
    "jedwFz",
    "level1",
    "modifier",
    "modifytime",
    "modifyuser",
    "modifyuserid",
    "objectid",
    "orgunit",
    "parents",
    "qyzx",
    "qyzzmc",
    "recid",
    "recver",
    "resid",
    "schemeid",
    "sffb",
    "sfhw",
    "sftzxm",
    "sfwqyyss",
    "shortname",
    "sjkgrq",
    "sjwgrq",
    "sortorder",
    "ssqy",
    "ssyw",
    "startflag",
    "stdcode",
    "stdname",
    "submittime",
    "submitunit",
    "submituser",
    "submituserid",
    "tel",
    "tel1",
    "tjgsyf",
    "tzly",
    "unitid",
    "validtime",
    "workflowstate",
    "xmbd",
    "xmhzfs",
    "xmlx",
    "xmmcyw",
    "xmszd",
    "yzdw",
    "yzzjly",
    "zjhyfl",
    "zzcdhte"
})
public class QtlxmVO
    extends VoSupport
{

    protected int acctyear;
    protected int basedatamarker;
    protected double bghhtgq;
    protected double bghzhte;
    protected double bghzzcdhte;
    protected String billcode;
    protected String billdate;
    protected String billdefine;
    protected String billtime;
    protected String creater;
    protected String createtime;
    protected String createunit;
    protected String createuser;
    protected String createuserid;
    protected String creator;
    protected String cxmid;
    protected String defineid;
    protected String dwqypp;
    protected String gddh;
    protected String gddh1;
    protected String gjhylb;
    protected String htbh;
    protected double hte;
    protected double htgq;
    protected String htjf;
    protected String htjfnb;
    protected String htkgrq;
    protected String htmc;
    protected String htqdfs;
    protected String htqdrq;
    protected String htwgrq;
    protected String htyfid;
    protected String invalidtime;
    protected byte isdraft;
    protected String isleaf;
    protected String jedw;
    @XmlElement(name = "jedw_fz")
    protected String jedwFz;
    @XmlElement(name = "level_1")
    protected int level1;
    protected String modifier;
    protected String modifytime;
    protected String modifyuser;
    protected String modifyuserid;
    protected String objectid;
    protected String orgunit;
    protected String parents;
    protected String qyzx;
    protected String qyzzmc;
    protected String recid;
    protected double recver;
    protected String resid;
    protected String schemeid;
    protected String sffb;
    protected String sfhw;
    protected String sftzxm;
    protected String sfwqyyss;
    protected String shortname;
    protected String sjkgrq;
    protected String sjwgrq;
    protected int sortorder;
    protected String ssqy;
    protected String ssyw;
    protected String startflag;
    protected String stdcode;
    protected String stdname;
    protected String submittime;
    protected String submitunit;
    protected String submituser;
    protected String submituserid;
    protected String tel;
    protected String tel1;
    protected String tjgsyf;
    protected String tzly;
    protected String unitid;
    protected String validtime;
    protected int workflowstate;
    protected String xmbd;
    protected String xmhzfs;
    protected String xmlx;
    protected String xmmcyw;
    protected String xmszd;
    protected String yzdw;
    protected String yzzjly;
    protected String zjhyfl;
    protected double zzcdhte;

    /**
     * 获取acctyear属性的值。
     * 
     */
    public int getAcctyear() {
        return acctyear;
    }

    /**
     * 设置acctyear属性的值。
     * 
     */
    public void setAcctyear(int value) {
        this.acctyear = value;
    }

    /**
     * 获取basedatamarker属性的值。
     * 
     */
    public int getBasedatamarker() {
        return basedatamarker;
    }

    /**
     * 设置basedatamarker属性的值。
     * 
     */
    public void setBasedatamarker(int value) {
        this.basedatamarker = value;
    }

    /**
     * 获取bghhtgq属性的值。
     * 
     */
    public double getBghhtgq() {
        return bghhtgq;
    }

    /**
     * 设置bghhtgq属性的值。
     * 
     */
    public void setBghhtgq(double value) {
        this.bghhtgq = value;
    }

    /**
     * 获取bghzhte属性的值。
     * 
     */
    public double getBghzhte() {
        return bghzhte;
    }

    /**
     * 设置bghzhte属性的值。
     * 
     */
    public void setBghzhte(double value) {
        this.bghzhte = value;
    }

    /**
     * 获取bghzzcdhte属性的值。
     * 
     */
    public double getBghzzcdhte() {
        return bghzzcdhte;
    }

    /**
     * 设置bghzzcdhte属性的值。
     * 
     */
    public void setBghzzcdhte(double value) {
        this.bghzzcdhte = value;
    }

    /**
     * 获取billcode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillcode() {
        return billcode;
    }

    /**
     * 设置billcode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillcode(String value) {
        this.billcode = value;
    }

    /**
     * 获取billdate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBilldate() {
        return billdate;
    }

    /**
     * 设置billdate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBilldate(String value) {
        this.billdate = value;
    }

    /**
     * 获取billdefine属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBilldefine() {
        return billdefine;
    }

    /**
     * 设置billdefine属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBilldefine(String value) {
        this.billdefine = value;
    }

    /**
     * 获取billtime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBilltime() {
        return billtime;
    }

    /**
     * 设置billtime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBilltime(String value) {
        this.billtime = value;
    }

    /**
     * 获取creater属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreater() {
        return creater;
    }

    /**
     * 设置creater属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreater(String value) {
        this.creater = value;
    }

    /**
     * 获取createtime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatetime() {
        return createtime;
    }

    /**
     * 设置createtime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatetime(String value) {
        this.createtime = value;
    }

    /**
     * 获取createunit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateunit() {
        return createunit;
    }

    /**
     * 设置createunit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateunit(String value) {
        this.createunit = value;
    }

    /**
     * 获取createuser属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateuser() {
        return createuser;
    }

    /**
     * 设置createuser属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateuser(String value) {
        this.createuser = value;
    }

    /**
     * 获取createuserid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateuserid() {
        return createuserid;
    }

    /**
     * 设置createuserid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateuserid(String value) {
        this.createuserid = value;
    }

    /**
     * 获取creator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreator() {
        return creator;
    }

    /**
     * 设置creator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreator(String value) {
        this.creator = value;
    }

    /**
     * 获取cxmid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCxmid() {
        return cxmid;
    }

    /**
     * 设置cxmid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCxmid(String value) {
        this.cxmid = value;
    }

    /**
     * 获取defineid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefineid() {
        return defineid;
    }

    /**
     * 设置defineid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefineid(String value) {
        this.defineid = value;
    }

    /**
     * 获取dwqypp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDwqypp() {
        return dwqypp;
    }

    /**
     * 设置dwqypp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDwqypp(String value) {
        this.dwqypp = value;
    }

    /**
     * 获取gddh属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGddh() {
        return gddh;
    }

    /**
     * 设置gddh属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGddh(String value) {
        this.gddh = value;
    }

    /**
     * 获取gddh1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGddh1() {
        return gddh1;
    }

    /**
     * 设置gddh1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGddh1(String value) {
        this.gddh1 = value;
    }

    /**
     * 获取gjhylb属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGjhylb() {
        return gjhylb;
    }

    /**
     * 设置gjhylb属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGjhylb(String value) {
        this.gjhylb = value;
    }

    /**
     * 获取htbh属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHtbh() {
        return htbh;
    }

    /**
     * 设置htbh属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHtbh(String value) {
        this.htbh = value;
    }

    /**
     * 获取hte属性的值。
     * 
     */
    public double getHte() {
        return hte;
    }

    /**
     * 设置hte属性的值。
     * 
     */
    public void setHte(double value) {
        this.hte = value;
    }

    /**
     * 获取htgq属性的值。
     * 
     */
    public double getHtgq() {
        return htgq;
    }

    /**
     * 设置htgq属性的值。
     * 
     */
    public void setHtgq(double value) {
        this.htgq = value;
    }

    /**
     * 获取htjf属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHtjf() {
        return htjf;
    }

    /**
     * 设置htjf属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHtjf(String value) {
        this.htjf = value;
    }

    /**
     * 获取htjfnb属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHtjfnb() {
        return htjfnb;
    }

    /**
     * 设置htjfnb属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHtjfnb(String value) {
        this.htjfnb = value;
    }

    /**
     * 获取htkgrq属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHtkgrq() {
        return htkgrq;
    }

    /**
     * 设置htkgrq属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHtkgrq(String value) {
        this.htkgrq = value;
    }

    /**
     * 获取htmc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHtmc() {
        return htmc;
    }

    /**
     * 设置htmc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHtmc(String value) {
        this.htmc = value;
    }

    /**
     * 获取htqdfs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHtqdfs() {
        return htqdfs;
    }

    /**
     * 设置htqdfs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHtqdfs(String value) {
        this.htqdfs = value;
    }

    /**
     * 获取htqdrq属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHtqdrq() {
        return htqdrq;
    }

    /**
     * 设置htqdrq属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHtqdrq(String value) {
        this.htqdrq = value;
    }

    /**
     * 获取htwgrq属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHtwgrq() {
        return htwgrq;
    }

    /**
     * 设置htwgrq属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHtwgrq(String value) {
        this.htwgrq = value;
    }

    /**
     * 获取htyfid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHtyfid() {
        return htyfid;
    }

    /**
     * 设置htyfid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHtyfid(String value) {
        this.htyfid = value;
    }

    /**
     * 获取invalidtime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvalidtime() {
        return invalidtime;
    }

    /**
     * 设置invalidtime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvalidtime(String value) {
        this.invalidtime = value;
    }

    /**
     * 获取isdraft属性的值。
     * 
     */
    public byte getIsdraft() {
        return isdraft;
    }

    /**
     * 设置isdraft属性的值。
     * 
     */
    public void setIsdraft(byte value) {
        this.isdraft = value;
    }

    /**
     * 获取isleaf属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsleaf() {
        return isleaf;
    }

    /**
     * 设置isleaf属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsleaf(String value) {
        this.isleaf = value;
    }

    /**
     * 获取jedw属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJedw() {
        return jedw;
    }

    /**
     * 设置jedw属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJedw(String value) {
        this.jedw = value;
    }

    /**
     * 获取jedwFz属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJedwFz() {
        return jedwFz;
    }

    /**
     * 设置jedwFz属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJedwFz(String value) {
        this.jedwFz = value;
    }

    /**
     * 获取level1属性的值。
     * 
     */
    public int getLevel1() {
        return level1;
    }

    /**
     * 设置level1属性的值。
     * 
     */
    public void setLevel1(int value) {
        this.level1 = value;
    }

    /**
     * 获取modifier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifier() {
        return modifier;
    }

    /**
     * 设置modifier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifier(String value) {
        this.modifier = value;
    }

    /**
     * 获取modifytime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifytime() {
        return modifytime;
    }

    /**
     * 设置modifytime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifytime(String value) {
        this.modifytime = value;
    }

    /**
     * 获取modifyuser属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifyuser() {
        return modifyuser;
    }

    /**
     * 设置modifyuser属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifyuser(String value) {
        this.modifyuser = value;
    }

    /**
     * 获取modifyuserid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifyuserid() {
        return modifyuserid;
    }

    /**
     * 设置modifyuserid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifyuserid(String value) {
        this.modifyuserid = value;
    }

    /**
     * 获取objectid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectid() {
        return objectid;
    }

    /**
     * 设置objectid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectid(String value) {
        this.objectid = value;
    }

    /**
     * 获取orgunit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgunit() {
        return orgunit;
    }

    /**
     * 设置orgunit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgunit(String value) {
        this.orgunit = value;
    }

    /**
     * 获取parents属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParents() {
        return parents;
    }

    /**
     * 设置parents属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParents(String value) {
        this.parents = value;
    }

    /**
     * 获取qyzx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQyzx() {
        return qyzx;
    }

    /**
     * 设置qyzx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQyzx(String value) {
        this.qyzx = value;
    }

    /**
     * 获取qyzzmc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQyzzmc() {
        return qyzzmc;
    }

    /**
     * 设置qyzzmc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQyzzmc(String value) {
        this.qyzzmc = value;
    }

    /**
     * 获取recid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecid() {
        return recid;
    }

    /**
     * 设置recid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecid(String value) {
        this.recid = value;
    }

    /**
     * 获取recver属性的值。
     * 
     */
    public double getRecver() {
        return recver;
    }

    /**
     * 设置recver属性的值。
     * 
     */
    public void setRecver(double value) {
        this.recver = value;
    }

    /**
     * 获取resid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResid() {
        return resid;
    }

    /**
     * 设置resid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResid(String value) {
        this.resid = value;
    }

    /**
     * 获取schemeid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemeid() {
        return schemeid;
    }

    /**
     * 设置schemeid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemeid(String value) {
        this.schemeid = value;
    }

    /**
     * 获取sffb属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSffb() {
        return sffb;
    }

    /**
     * 设置sffb属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSffb(String value) {
        this.sffb = value;
    }

    /**
     * 获取sfhw属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSfhw() {
        return sfhw;
    }

    /**
     * 设置sfhw属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSfhw(String value) {
        this.sfhw = value;
    }

    /**
     * 获取sftzxm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSftzxm() {
        return sftzxm;
    }

    /**
     * 设置sftzxm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSftzxm(String value) {
        this.sftzxm = value;
    }

    /**
     * 获取sfwqyyss属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSfwqyyss() {
        return sfwqyyss;
    }

    /**
     * 设置sfwqyyss属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSfwqyyss(String value) {
        this.sfwqyyss = value;
    }

    /**
     * 获取shortname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortname() {
        return shortname;
    }

    /**
     * 设置shortname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortname(String value) {
        this.shortname = value;
    }

    /**
     * 获取sjkgrq属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSjkgrq() {
        return sjkgrq;
    }

    /**
     * 设置sjkgrq属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSjkgrq(String value) {
        this.sjkgrq = value;
    }

    /**
     * 获取sjwgrq属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSjwgrq() {
        return sjwgrq;
    }

    /**
     * 设置sjwgrq属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSjwgrq(String value) {
        this.sjwgrq = value;
    }

    /**
     * 获取sortorder属性的值。
     * 
     */
    public int getSortorder() {
        return sortorder;
    }

    /**
     * 设置sortorder属性的值。
     * 
     */
    public void setSortorder(int value) {
        this.sortorder = value;
    }

    /**
     * 获取ssqy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsqy() {
        return ssqy;
    }

    /**
     * 设置ssqy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsqy(String value) {
        this.ssqy = value;
    }

    /**
     * 获取ssyw属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsyw() {
        return ssyw;
    }

    /**
     * 设置ssyw属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsyw(String value) {
        this.ssyw = value;
    }

    /**
     * 获取startflag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartflag() {
        return startflag;
    }

    /**
     * 设置startflag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartflag(String value) {
        this.startflag = value;
    }

    /**
     * 获取stdcode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStdcode() {
        return stdcode;
    }

    /**
     * 设置stdcode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStdcode(String value) {
        this.stdcode = value;
    }

    /**
     * 获取stdname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStdname() {
        return stdname;
    }

    /**
     * 设置stdname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStdname(String value) {
        this.stdname = value;
    }

    /**
     * 获取submittime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmittime() {
        return submittime;
    }

    /**
     * 设置submittime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmittime(String value) {
        this.submittime = value;
    }

    /**
     * 获取submitunit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmitunit() {
        return submitunit;
    }

    /**
     * 设置submitunit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmitunit(String value) {
        this.submitunit = value;
    }

    /**
     * 获取submituser属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmituser() {
        return submituser;
    }

    /**
     * 设置submituser属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmituser(String value) {
        this.submituser = value;
    }

    /**
     * 获取submituserid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmituserid() {
        return submituserid;
    }

    /**
     * 设置submituserid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmituserid(String value) {
        this.submituserid = value;
    }

    /**
     * 获取tel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTel() {
        return tel;
    }

    /**
     * 设置tel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTel(String value) {
        this.tel = value;
    }

    /**
     * 获取tel1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTel1() {
        return tel1;
    }

    /**
     * 设置tel1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTel1(String value) {
        this.tel1 = value;
    }

    /**
     * 获取tjgsyf属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTjgsyf() {
        return tjgsyf;
    }

    /**
     * 设置tjgsyf属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTjgsyf(String value) {
        this.tjgsyf = value;
    }

    /**
     * 获取tzly属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTzly() {
        return tzly;
    }

    /**
     * 设置tzly属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTzly(String value) {
        this.tzly = value;
    }

    /**
     * 获取unitid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitid() {
        return unitid;
    }

    /**
     * 设置unitid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitid(String value) {
        this.unitid = value;
    }

    /**
     * 获取validtime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidtime() {
        return validtime;
    }

    /**
     * 设置validtime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidtime(String value) {
        this.validtime = value;
    }

    /**
     * 获取workflowstate属性的值。
     * 
     */
    public int getWorkflowstate() {
        return workflowstate;
    }

    /**
     * 设置workflowstate属性的值。
     * 
     */
    public void setWorkflowstate(int value) {
        this.workflowstate = value;
    }

    /**
     * 获取xmbd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmbd() {
        return xmbd;
    }

    /**
     * 设置xmbd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmbd(String value) {
        this.xmbd = value;
    }

    /**
     * 获取xmhzfs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmhzfs() {
        return xmhzfs;
    }

    /**
     * 设置xmhzfs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmhzfs(String value) {
        this.xmhzfs = value;
    }

    /**
     * 获取xmlx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmlx() {
        return xmlx;
    }

    /**
     * 设置xmlx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmlx(String value) {
        this.xmlx = value;
    }

    /**
     * 获取xmmcyw属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmmcyw() {
        return xmmcyw;
    }

    /**
     * 设置xmmcyw属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmmcyw(String value) {
        this.xmmcyw = value;
    }

    /**
     * 获取xmszd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmszd() {
        return xmszd;
    }

    /**
     * 设置xmszd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmszd(String value) {
        this.xmszd = value;
    }

    /**
     * 获取yzdw属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYzdw() {
        return yzdw;
    }

    /**
     * 设置yzdw属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYzdw(String value) {
        this.yzdw = value;
    }

    /**
     * 获取yzzjly属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYzzjly() {
        return yzzjly;
    }

    /**
     * 设置yzzjly属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYzzjly(String value) {
        this.yzzjly = value;
    }

    /**
     * 获取zjhyfl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZjhyfl() {
        return zjhyfl;
    }

    /**
     * 设置zjhyfl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZjhyfl(String value) {
        this.zjhyfl = value;
    }

    /**
     * 获取zzcdhte属性的值。
     * 
     */
    public double getZzcdhte() {
        return zzcdhte;
    }

    /**
     * 设置zzcdhte属性的值。
     * 
     */
    public void setZzcdhte(double value) {
        this.zzcdhte = value;
    }

}
