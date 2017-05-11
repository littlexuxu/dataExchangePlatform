
package cn.ccccltd.webservice.other.contractchange;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>sgbghtVO complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="sgbghtVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://contractchange.other.webservice.ccccltd.cn/}voSupport"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bghhtgq" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="bghtmc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bgrq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bgyy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bgzjhte" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="bgzjzzcdhte" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="cbghtid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="chtid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="htbz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgunit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="recid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sfnrxq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stdname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "sgbghtVO", propOrder = {
    "bghhtgq",
    "bghtmc",
    "bgrq",
    "bgyy",
    "bgzjhte",
    "bgzjzzcdhte",
    "cbghtid",
    "chtid",
    "htbz",
    "orgunit",
    "recid",
    "sfnrxq",
    "stdname",
    "zhtmc",
    "zybgtk"
})
public class SgbghtVO
    extends VoSupport
{

    protected double bghhtgq;
    protected String bghtmc;
    protected String bgrq;
    protected String bgyy;
    protected double bgzjhte;
    protected double bgzjzzcdhte;
    protected String cbghtid;
    protected String chtid;
    protected String htbz;
    protected String orgunit;
    protected String recid;
    protected String sfnrxq;
    protected String stdname;
    protected String zhtmc;
    protected String zybgtk;

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
     * 获取cbghtid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCbghtid() {
        return cbghtid;
    }

    /**
     * 设置cbghtid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCbghtid(String value) {
        this.cbghtid = value;
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
