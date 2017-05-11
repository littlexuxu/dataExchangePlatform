
package cn.ccccltd.webservice.org;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ghscgzjzbVO complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ghscgzjzbVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://org.webservice.ccccltd.cn/}voSupport"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bdmc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cxmid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ddckqk_hw" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="gjhylb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="htedw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgunit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="recid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sfcfwt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sfgjcnhzxm_hw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sfwjhnxm_gh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sfzdjkxm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sjdw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sjdwqt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ssyw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stdname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="swbxmlx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tsztyysm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tzly" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="xmhzfs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="xmlx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="xmmcyw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="xmszd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="xmtszt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="yzdw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="yzdwqt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="yztze" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="zgcfbl_hw" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="zjhyflx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="zjlydx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="zygcnr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ghscgzjzbVO", propOrder = {
    "bdmc",
    "cxmid",
    "ddckqkHw",
    "gjhylb",
    "htedw",
    "orgunit",
    "recid",
    "sfcfwt",
    "sfgjcnhzxmHw",
    "sfwjhnxmGh",
    "sfzdjkxm",
    "sjdw",
    "sjdwqt",
    "ssyw",
    "stdname",
    "swbxmlx",
    "tsztyysm",
    "tzly",
    "xmhzfs",
    "xmlx",
    "xmmcyw",
    "xmszd",
    "xmtszt",
    "yzdw",
    "yzdwqt",
    "yztze",
    "zgcfblHw",
    "zjhyflx",
    "zjlydx",
    "zygcnr"
})
public class GhscgzjzbVO
    extends VoSupport
{

    protected String bdmc;
    protected String cxmid;
    @XmlElement(name = "ddckqk_hw")
    protected double ddckqkHw;
    protected String gjhylb;
    protected String htedw;
    protected String orgunit;
    protected String recid;
    protected String sfcfwt;
    @XmlElement(name = "sfgjcnhzxm_hw")
    protected String sfgjcnhzxmHw;
    @XmlElement(name = "sfwjhnxm_gh")
    protected String sfwjhnxmGh;
    protected String sfzdjkxm;
    protected String sjdw;
    protected String sjdwqt;
    protected String ssyw;
    protected String stdname;
    protected String swbxmlx;
    protected String tsztyysm;
    protected String tzly;
    protected String xmhzfs;
    protected String xmlx;
    protected String xmmcyw;
    protected String xmszd;
    protected String xmtszt;
    protected String yzdw;
    protected String yzdwqt;
    protected double yztze;
    @XmlElement(name = "zgcfbl_hw")
    protected double zgcfblHw;
    protected String zjhyflx;
    protected String zjlydx;
    protected String zygcnr;

    /**
     * 获取bdmc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBdmc() {
        return bdmc;
    }

    /**
     * 设置bdmc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBdmc(String value) {
        this.bdmc = value;
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
     * 获取ddckqkHw属性的值。
     * 
     */
    public double getDdckqkHw() {
        return ddckqkHw;
    }

    /**
     * 设置ddckqkHw属性的值。
     * 
     */
    public void setDdckqkHw(double value) {
        this.ddckqkHw = value;
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
     * 获取sfcfwt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSfcfwt() {
        return sfcfwt;
    }

    /**
     * 设置sfcfwt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSfcfwt(String value) {
        this.sfcfwt = value;
    }

    /**
     * 获取sfgjcnhzxmHw属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSfgjcnhzxmHw() {
        return sfgjcnhzxmHw;
    }

    /**
     * 设置sfgjcnhzxmHw属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSfgjcnhzxmHw(String value) {
        this.sfgjcnhzxmHw = value;
    }

    /**
     * 获取sfwjhnxmGh属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSfwjhnxmGh() {
        return sfwjhnxmGh;
    }

    /**
     * 设置sfwjhnxmGh属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSfwjhnxmGh(String value) {
        this.sfwjhnxmGh = value;
    }

    /**
     * 获取sfzdjkxm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSfzdjkxm() {
        return sfzdjkxm;
    }

    /**
     * 设置sfzdjkxm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSfzdjkxm(String value) {
        this.sfzdjkxm = value;
    }

    /**
     * 获取sjdw属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSjdw() {
        return sjdw;
    }

    /**
     * 设置sjdw属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSjdw(String value) {
        this.sjdw = value;
    }

    /**
     * 获取sjdwqt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSjdwqt() {
        return sjdwqt;
    }

    /**
     * 设置sjdwqt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSjdwqt(String value) {
        this.sjdwqt = value;
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
     * 获取swbxmlx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwbxmlx() {
        return swbxmlx;
    }

    /**
     * 设置swbxmlx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwbxmlx(String value) {
        this.swbxmlx = value;
    }

    /**
     * 获取tsztyysm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTsztyysm() {
        return tsztyysm;
    }

    /**
     * 设置tsztyysm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTsztyysm(String value) {
        this.tsztyysm = value;
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
     * 获取xmtszt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmtszt() {
        return xmtszt;
    }

    /**
     * 设置xmtszt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmtszt(String value) {
        this.xmtszt = value;
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
     * 获取yzdwqt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYzdwqt() {
        return yzdwqt;
    }

    /**
     * 设置yzdwqt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYzdwqt(String value) {
        this.yzdwqt = value;
    }

    /**
     * 获取yztze属性的值。
     * 
     */
    public double getYztze() {
        return yztze;
    }

    /**
     * 设置yztze属性的值。
     * 
     */
    public void setYztze(double value) {
        this.yztze = value;
    }

    /**
     * 获取zgcfblHw属性的值。
     * 
     */
    public double getZgcfblHw() {
        return zgcfblHw;
    }

    /**
     * 设置zgcfblHw属性的值。
     * 
     */
    public void setZgcfblHw(double value) {
        this.zgcfblHw = value;
    }

    /**
     * 获取zjhyflx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZjhyflx() {
        return zjhyflx;
    }

    /**
     * 设置zjhyflx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZjhyflx(String value) {
        this.zjhyflx = value;
    }

    /**
     * 获取zjlydx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZjlydx() {
        return zjlydx;
    }

    /**
     * 设置zjlydx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZjlydx(String value) {
        this.zjlydx = value;
    }

    /**
     * 获取zygcnr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZygcnr() {
        return zygcnr;
    }

    /**
     * 设置zygcnr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZygcnr(String value) {
        this.zygcnr = value;
    }

}
