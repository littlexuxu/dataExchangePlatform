
package cn.ccccltd.webservice.construction.contract;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ghscgzjzbzb complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ghscgzjzbzb"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://contract.construction.webservice.ccccltd.cn/}voSupport"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cqttbid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cxmid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dwmc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="jedw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mrecid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="recid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="recver" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="sfzb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sortorder" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="tbbj" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="tbdw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="zbe" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="zbzbfd" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ghscgzjzbzb", propOrder = {
    "cqttbid",
    "cxmid",
    "dwmc",
    "jedw",
    "mrecid",
    "recid",
    "recver",
    "sfzb",
    "sortorder",
    "tbbj",
    "tbdw",
    "zbe",
    "zbzbfd"
})
public class Ghscgzjzbzb
    extends VoSupport
{

    protected String cqttbid;
    protected String cxmid;
    protected String dwmc;
    protected String jedw;
    protected String mrecid;
    protected String recid;
    protected long recver;
    protected String sfzb;
    protected int sortorder;
    protected double tbbj;
    protected String tbdw;
    protected double zbe;
    protected double zbzbfd;

    /**
     * 获取cqttbid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCqttbid() {
        return cqttbid;
    }

    /**
     * 设置cqttbid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCqttbid(String value) {
        this.cqttbid = value;
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
     * 获取dwmc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDwmc() {
        return dwmc;
    }

    /**
     * 设置dwmc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDwmc(String value) {
        this.dwmc = value;
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
     * 获取mrecid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMrecid() {
        return mrecid;
    }

    /**
     * 设置mrecid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMrecid(String value) {
        this.mrecid = value;
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
    public long getRecver() {
        return recver;
    }

    /**
     * 设置recver属性的值。
     * 
     */
    public void setRecver(long value) {
        this.recver = value;
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
     * 获取tbdw属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTbdw() {
        return tbdw;
    }

    /**
     * 设置tbdw属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTbdw(String value) {
        this.tbdw = value;
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
     * 获取zbzbfd属性的值。
     * 
     */
    public double getZbzbfd() {
        return zbzbfd;
    }

    /**
     * 设置zbzbfd属性的值。
     * 
     */
    public void setZbzbfd(double value) {
        this.zbzbfd = value;
    }

}
