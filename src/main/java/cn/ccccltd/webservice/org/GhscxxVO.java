
package cn.ccccltd.webservice.org;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ghscxxVO complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ghscxxVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://org.webservice.ccccltd.cn/}voSupport"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://org.webservice.ccccltd.cn/}otherbidInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="cscgzid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cxmid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dwmcb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="htedw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="htermb" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="htqdfs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="jedwb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ksgzsj" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nrxtglsj_zb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nssdwmc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nyqypp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nyqyzzmc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="qtdwmc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="qtqyzb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="qtsyb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="recid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="scjzqk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sfzb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sfzdgzxm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tbbj" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="tbbjb" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="tbbjdw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tbrq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="yjhte" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="yjhtgq" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="zbbz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="zbdllxdh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="zbdllxr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="zbdlmc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="zbe" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="zbeb" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="zbedw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="zbjzrq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="zbrq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="zbrqi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="zbsm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="zbxmmc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="zsjg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="zsrq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="zztbfs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ghscxxVO", propOrder = {
    "otherbidInfo",
    "cscgzid",
    "cxmid",
    "dwmcb",
    "htedw",
    "htermb",
    "htqdfs",
    "jedwb",
    "ksgzsj",
    "nrxtglsjZb",
    "nssdwmc",
    "nyqypp",
    "nyqyzzmc",
    "qtdwmc",
    "qtqyzb",
    "qtsyb",
    "recid",
    "scjzqk",
    "sfzb",
    "sfzdgzxm",
    "tbbj",
    "tbbjb",
    "tbbjdw",
    "tbrq",
    "yjhte",
    "yjhtgq",
    "zbbz",
    "zbdllxdh",
    "zbdllxr",
    "zbdlmc",
    "zbe",
    "zbeb",
    "zbedw",
    "zbjzrq",
    "zbrq",
    "zbrqi",
    "zbsm",
    "zbxmmc",
    "zsjg",
    "zsrq",
    "zztbfs"
})
public class GhscxxVO
    extends VoSupport
{

    @XmlElement(namespace = "http://org.webservice.ccccltd.cn/")
    protected List<Ghscgzjzbzb> otherbidInfo;
    protected String cscgzid;
    protected String cxmid;
    protected String dwmcb;
    protected String htedw;
    protected double htermb;
    protected String htqdfs;
    protected String jedwb;
    protected String ksgzsj;
    @XmlElement(name = "nrxtglsj_zb")
    protected String nrxtglsjZb;
    protected String nssdwmc;
    protected String nyqypp;
    protected String nyqyzzmc;
    protected String qtdwmc;
    protected String qtqyzb;
    protected String qtsyb;
    protected String recid;
    protected String scjzqk;
    protected String sfzb;
    protected String sfzdgzxm;
    protected double tbbj;
    protected double tbbjb;
    protected String tbbjdw;
    protected String tbrq;
    protected double yjhte;
    protected double yjhtgq;
    protected String zbbz;
    protected String zbdllxdh;
    protected String zbdllxr;
    protected String zbdlmc;
    protected double zbe;
    protected double zbeb;
    protected String zbedw;
    protected String zbjzrq;
    protected String zbrq;
    protected String zbrqi;
    protected String zbsm;
    protected String zbxmmc;
    protected String zsjg;
    protected String zsrq;
    protected String zztbfs;

    /**
     * Gets the value of the otherbidInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherbidInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherbidInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ghscgzjzbzb }
     * 
     * 
     */
    public List<Ghscgzjzbzb> getOtherbidInfo() {
        if (otherbidInfo == null) {
            otherbidInfo = new ArrayList<Ghscgzjzbzb>();
        }
        return this.otherbidInfo;
    }

    /**
     * 获取cscgzid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCscgzid() {
        return cscgzid;
    }

    /**
     * 设置cscgzid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCscgzid(String value) {
        this.cscgzid = value;
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
     * 获取dwmcb属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDwmcb() {
        return dwmcb;
    }

    /**
     * 设置dwmcb属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDwmcb(String value) {
        this.dwmcb = value;
    }

    /**
     * 获取htedw属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHtedw() {
        return htedw;
    }

    /**
     * 设置htedw属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHtedw(String value) {
        this.htedw = value;
    }

    /**
     * 获取htermb属性的值。
     * 
     */
    public double getHtermb() {
        return htermb;
    }

    /**
     * 设置htermb属性的值。
     * 
     */
    public void setHtermb(double value) {
        this.htermb = value;
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
     * 获取jedwb属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJedwb() {
        return jedwb;
    }

    /**
     * 设置jedwb属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJedwb(String value) {
        this.jedwb = value;
    }

    /**
     * 获取ksgzsj属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKsgzsj() {
        return ksgzsj;
    }

    /**
     * 设置ksgzsj属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKsgzsj(String value) {
        this.ksgzsj = value;
    }

    /**
     * 获取nrxtglsjZb属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrxtglsjZb() {
        return nrxtglsjZb;
    }

    /**
     * 设置nrxtglsjZb属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrxtglsjZb(String value) {
        this.nrxtglsjZb = value;
    }

    /**
     * 获取nssdwmc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNssdwmc() {
        return nssdwmc;
    }

    /**
     * 设置nssdwmc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNssdwmc(String value) {
        this.nssdwmc = value;
    }

    /**
     * 获取nyqypp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNyqypp() {
        return nyqypp;
    }

    /**
     * 设置nyqypp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNyqypp(String value) {
        this.nyqypp = value;
    }

    /**
     * 获取nyqyzzmc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNyqyzzmc() {
        return nyqyzzmc;
    }

    /**
     * 设置nyqyzzmc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNyqyzzmc(String value) {
        this.nyqyzzmc = value;
    }

    /**
     * 获取qtdwmc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQtdwmc() {
        return qtdwmc;
    }

    /**
     * 设置qtdwmc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQtdwmc(String value) {
        this.qtdwmc = value;
    }

    /**
     * 获取qtqyzb属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQtqyzb() {
        return qtqyzb;
    }

    /**
     * 设置qtqyzb属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQtqyzb(String value) {
        this.qtqyzb = value;
    }

    /**
     * 获取qtsyb属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQtsyb() {
        return qtsyb;
    }

    /**
     * 设置qtsyb属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQtsyb(String value) {
        this.qtsyb = value;
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
     * 获取scjzqk属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScjzqk() {
        return scjzqk;
    }

    /**
     * 设置scjzqk属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScjzqk(String value) {
        this.scjzqk = value;
    }

    /**
     * 获取sfzb属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSfzb() {
        return sfzb;
    }

    /**
     * 设置sfzb属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSfzb(String value) {
        this.sfzb = value;
    }

    /**
     * 获取sfzdgzxm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSfzdgzxm() {
        return sfzdgzxm;
    }

    /**
     * 设置sfzdgzxm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSfzdgzxm(String value) {
        this.sfzdgzxm = value;
    }

    /**
     * 获取tbbj属性的值。
     * 
     */
    public double getTbbj() {
        return tbbj;
    }

    /**
     * 设置tbbj属性的值。
     * 
     */
    public void setTbbj(double value) {
        this.tbbj = value;
    }

    /**
     * 获取tbbjb属性的值。
     * 
     */
    public double getTbbjb() {
        return tbbjb;
    }

    /**
     * 设置tbbjb属性的值。
     * 
     */
    public void setTbbjb(double value) {
        this.tbbjb = value;
    }

    /**
     * 获取tbbjdw属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTbbjdw() {
        return tbbjdw;
    }

    /**
     * 设置tbbjdw属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTbbjdw(String value) {
        this.tbbjdw = value;
    }

    /**
     * 获取tbrq属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTbrq() {
        return tbrq;
    }

    /**
     * 设置tbrq属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTbrq(String value) {
        this.tbrq = value;
    }

    /**
     * 获取yjhte属性的值。
     * 
     */
    public double getYjhte() {
        return yjhte;
    }

    /**
     * 设置yjhte属性的值。
     * 
     */
    public void setYjhte(double value) {
        this.yjhte = value;
    }

    /**
     * 获取yjhtgq属性的值。
     * 
     */
    public double getYjhtgq() {
        return yjhtgq;
    }

    /**
     * 设置yjhtgq属性的值。
     * 
     */
    public void setYjhtgq(double value) {
        this.yjhtgq = value;
    }

    /**
     * 获取zbbz属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZbbz() {
        return zbbz;
    }

    /**
     * 设置zbbz属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZbbz(String value) {
        this.zbbz = value;
    }

    /**
     * 获取zbdllxdh属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZbdllxdh() {
        return zbdllxdh;
    }

    /**
     * 设置zbdllxdh属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZbdllxdh(String value) {
        this.zbdllxdh = value;
    }

    /**
     * 获取zbdllxr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZbdllxr() {
        return zbdllxr;
    }

    /**
     * 设置zbdllxr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZbdllxr(String value) {
        this.zbdllxr = value;
    }

    /**
     * 获取zbdlmc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZbdlmc() {
        return zbdlmc;
    }

    /**
     * 设置zbdlmc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZbdlmc(String value) {
        this.zbdlmc = value;
    }

    /**
     * 获取zbe属性的值。
     * 
     */
    public double getZbe() {
        return zbe;
    }

    /**
     * 设置zbe属性的值。
     * 
     */
    public void setZbe(double value) {
        this.zbe = value;
    }

    /**
     * 获取zbeb属性的值。
     * 
     */
    public double getZbeb() {
        return zbeb;
    }

    /**
     * 设置zbeb属性的值。
     * 
     */
    public void setZbeb(double value) {
        this.zbeb = value;
    }

    /**
     * 获取zbedw属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZbedw() {
        return zbedw;
    }

    /**
     * 设置zbedw属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZbedw(String value) {
        this.zbedw = value;
    }

    /**
     * 获取zbjzrq属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZbjzrq() {
        return zbjzrq;
    }

    /**
     * 设置zbjzrq属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZbjzrq(String value) {
        this.zbjzrq = value;
    }

    /**
     * 获取zbrq属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZbrq() {
        return zbrq;
    }

    /**
     * 设置zbrq属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZbrq(String value) {
        this.zbrq = value;
    }

    /**
     * 获取zbrqi属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZbrqi() {
        return zbrqi;
    }

    /**
     * 设置zbrqi属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZbrqi(String value) {
        this.zbrqi = value;
    }

    /**
     * 获取zbsm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZbsm() {
        return zbsm;
    }

    /**
     * 设置zbsm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZbsm(String value) {
        this.zbsm = value;
    }

    /**
     * 获取zbxmmc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZbxmmc() {
        return zbxmmc;
    }

    /**
     * 设置zbxmmc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZbxmmc(String value) {
        this.zbxmmc = value;
    }

    /**
     * 获取zsjg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZsjg() {
        return zsjg;
    }

    /**
     * 设置zsjg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZsjg(String value) {
        this.zsjg = value;
    }

    /**
     * 获取zsrq属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZsrq() {
        return zsrq;
    }

    /**
     * 设置zsrq属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZsrq(String value) {
        this.zsrq = value;
    }

    /**
     * 获取zztbfs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZztbfs() {
        return zztbfs;
    }

    /**
     * 设置zztbfs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZztbfs(String value) {
        this.zztbfs = value;
    }

}
