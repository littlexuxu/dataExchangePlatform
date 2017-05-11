
package cn.ccccltd.webservice.design.contractchange;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>sjbghtVO complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="sjbghtVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://contractchange.design.webservice.ccccltd.cn/}voSupport"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="acctyear" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="basedatamarker" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bghhtgq" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="bghtmc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bghzhte" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="bghzzcdhte" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="bgrq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bgyy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bgzjhte" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="bgzjzzcdhte" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="billcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="billdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="billdefine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="billtime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="chtbgid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="chtid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="creater" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="createtime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="createunit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="createuser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="createuserid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="creator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="defineid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gddh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gddh1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="htbz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="invalidtime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isdraft" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isleaf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="jedw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="level_1" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="modifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="modifytime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="modifyuser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="modifyuserid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="objectid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgunit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="parents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="recid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="recver" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="resid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="schemeid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sfnrxq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shortname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sortorder" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
 *         &lt;element name="unitid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="validtime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="workflowstate" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="yhte" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="yhtgq" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="yzzcdhte" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="zhtmc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="zybgtk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sjbghtVO", propOrder = {
    "acctyear",
    "basedatamarker",
    "bghhtgq",
    "bghtmc",
    "bghzhte",
    "bghzzcdhte",
    "bgrq",
    "bgyy",
    "bgzjhte",
    "bgzjzzcdhte",
    "billcode",
    "billdate",
    "billdefine",
    "billtime",
    "chtbgid",
    "chtid",
    "creater",
    "createtime",
    "createunit",
    "createuser",
    "createuserid",
    "creator",
    "defineid",
    "gddh",
    "gddh1",
    "htbz",
    "invalidtime",
    "isdraft",
    "isleaf",
    "jedw",
    "level1",
    "modifier",
    "modifytime",
    "modifyuser",
    "modifyuserid",
    "objectid",
    "orgunit",
    "parents",
    "recid",
    "recver",
    "resid",
    "schemeid",
    "sfnrxq",
    "shortname",
    "sortorder",
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
    "unitid",
    "validtime",
    "workflowstate",
    "yhte",
    "yhtgq",
    "yzzcdhte",
    "zhtmc",
    "zybgtk"
})
public class SjbghtVO
    extends VoSupport
{

    protected int acctyear;
    protected String basedatamarker;
    protected double bghhtgq;
    protected String bghtmc;
    protected double bghzhte;
    protected double bghzzcdhte;
    protected String bgrq;
    protected String bgyy;
    protected double bgzjhte;
    protected double bgzjzzcdhte;
    protected String billcode;
    protected String billdate;
    protected String billdefine;
    protected String billtime;
    protected String chtbgid;
    protected String chtid;
    protected String creater;
    protected String createtime;
    protected String createunit;
    protected String createuser;
    protected String createuserid;
    protected String creator;
    protected String defineid;
    protected String gddh;
    protected String gddh1;
    protected String htbz;
    protected String invalidtime;
    protected String isdraft;
    protected String isleaf;
    protected String jedw;
    @XmlElement(name = "level_1")
    protected int level1;
    protected String modifier;
    protected String modifytime;
    protected String modifyuser;
    protected String modifyuserid;
    protected String objectid;
    protected String orgunit;
    protected String parents;
    protected String recid;
    protected double recver;
    protected String resid;
    protected String schemeid;
    protected String sfnrxq;
    protected String shortname;
    protected int sortorder;
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
    protected String unitid;
    protected String validtime;
    protected int workflowstate;
    protected double yhte;
    protected double yhtgq;
    protected double yzzcdhte;
    protected String zhtmc;
    protected String zybgtk;

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
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasedatamarker() {
        return basedatamarker;
    }

    /**
     * 设置basedatamarker属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasedatamarker(String value) {
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
     * 获取bghtmc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBghtmc() {
        return bghtmc;
    }

    /**
     * 设置bghtmc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBghtmc(String value) {
        this.bghtmc = value;
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
     * 获取bgrq属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBgrq() {
        return bgrq;
    }

    /**
     * 设置bgrq属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBgrq(String value) {
        this.bgrq = value;
    }

    /**
     * 获取bgyy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBgyy() {
        return bgyy;
    }

    /**
     * 设置bgyy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBgyy(String value) {
        this.bgyy = value;
    }

    /**
     * 获取bgzjhte属性的值。
     * 
     */
    public double getBgzjhte() {
        return bgzjhte;
    }

    /**
     * 设置bgzjhte属性的值。
     * 
     */
    public void setBgzjhte(double value) {
        this.bgzjhte = value;
    }

    /**
     * 获取bgzjzzcdhte属性的值。
     * 
     */
    public double getBgzjzzcdhte() {
        return bgzjzzcdhte;
    }

    /**
     * 设置bgzjzzcdhte属性的值。
     * 
     */
    public void setBgzjzzcdhte(double value) {
        this.bgzjzzcdhte = value;
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
     * 获取chtbgid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChtbgid() {
        return chtbgid;
    }

    /**
     * 设置chtbgid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChtbgid(String value) {
        this.chtbgid = value;
    }

    /**
     * 获取chtid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChtid() {
        return chtid;
    }

    /**
     * 设置chtid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChtid(String value) {
        this.chtid = value;
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
     * 获取htbz属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHtbz() {
        return htbz;
    }

    /**
     * 设置htbz属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHtbz(String value) {
        this.htbz = value;
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
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsdraft() {
        return isdraft;
    }

    /**
     * 设置isdraft属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsdraft(String value) {
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
     * 获取sfnrxq属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSfnrxq() {
        return sfnrxq;
    }

    /**
     * 设置sfnrxq属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSfnrxq(String value) {
        this.sfnrxq = value;
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
     * 获取yhte属性的值。
     * 
     */
    public double getYhte() {
        return yhte;
    }

    /**
     * 设置yhte属性的值。
     * 
     */
    public void setYhte(double value) {
        this.yhte = value;
    }

    /**
     * 获取yhtgq属性的值。
     * 
     */
    public double getYhtgq() {
        return yhtgq;
    }

    /**
     * 设置yhtgq属性的值。
     * 
     */
    public void setYhtgq(double value) {
        this.yhtgq = value;
    }

    /**
     * 获取yzzcdhte属性的值。
     * 
     */
    public double getYzzcdhte() {
        return yzzcdhte;
    }

    /**
     * 设置yzzcdhte属性的值。
     * 
     */
    public void setYzzcdhte(double value) {
        this.yzzcdhte = value;
    }

    /**
     * 获取zhtmc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZhtmc() {
        return zhtmc;
    }

    /**
     * 设置zhtmc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZhtmc(String value) {
        this.zhtmc = value;
    }

    /**
     * 获取zybgtk属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZybgtk() {
        return zybgtk;
    }

    /**
     * 设置zybgtk属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZybgtk(String value) {
        this.zybgtk = value;
    }

}
