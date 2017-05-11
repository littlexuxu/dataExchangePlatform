
package cn.ccccltd.webservice.design.projectbaseinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>sjscgzjzbVO complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="sjscgzjzbVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://projectbaseinfo.design.webservice.ccccltd.cn/}voSupport"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="acctyear" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="basedatamarker" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
 *         &lt;element name="ddckqk_hw" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="defineid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gjhylb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="invalidtime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isdraft" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isleaf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="level_1" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="modifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="modifytime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="modifyuser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="modifyuserid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="objectid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgunit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="parents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="qyzx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="recid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="recver" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="resid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="schemeid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sfcfwt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sfgjcnhzxm_hw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sfhw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sfwjhnxm_gh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sfzdjkxm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shortname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
 *         &lt;element name="swbxmlx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tsztyysm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tzly" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="unitid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="validtime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="workflowstate" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="xmbd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="xmhzfs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="xmlx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="xmmcyw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="xmszd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="xmtszt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="yjhtebz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "sjscgzjzbVO", propOrder = {
    "acctyear",
    "basedatamarker",
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
    "ddckqkHw",
    "defineid",
    "gjhylb",
    "invalidtime",
    "isdraft",
    "isleaf",
    "level1",
    "modifier",
    "modifytime",
    "modifyuser",
    "modifyuserid",
    "objectid",
    "orgunit",
    "parents",
    "qyzx",
    "recid",
    "recver",
    "resid",
    "schemeid",
    "sfcfwt",
    "sfgjcnhzxmHw",
    "sfhw",
    "sfwjhnxmGh",
    "sfzdjkxm",
    "shortname",
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
    "swbxmlx",
    "tsztyysm",
    "tzly",
    "unitid",
    "validtime",
    "workflowstate",
    "xmbd",
    "xmhzfs",
    "xmlx",
    "xmmcyw",
    "xmszd",
    "xmtszt",
    "yjhtebz",
    "yzdw",
    "yzdwqt",
    "yztze",
    "zgcfblHw",
    "zjhyflx",
    "zjlydx",
    "zygcnr"
})
public class SjscgzjzbVO
    extends VoSupport
{

    protected int acctyear;
    protected String basedatamarker;
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
    @XmlElement(name = "ddckqk_hw")
    protected double ddckqkHw;
    protected String defineid;
    protected String gjhylb;
    protected String invalidtime;
    protected String isdraft;
    protected String isleaf;
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
    protected String recid;
    protected double recver;
    protected String resid;
    protected String schemeid;
    protected String sfcfwt;
    @XmlElement(name = "sfgjcnhzxm_hw")
    protected String sfgjcnhzxmHw;
    protected String sfhw;
    @XmlElement(name = "sfwjhnxm_gh")
    protected String sfwjhnxmGh;
    protected String sfzdjkxm;
    protected String shortname;
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
    protected String swbxmlx;
    protected String tsztyysm;
    protected String tzly;
    protected String unitid;
    protected String validtime;
    protected int workflowstate;
    protected String xmbd;
    protected String xmhzfs;
    protected String xmlx;
    protected String xmmcyw;
    protected String xmszd;
    protected String xmtszt;
    protected String yjhtebz;
    protected String yzdw;
    protected String yzdwqt;
    protected double yztze;
    @XmlElement(name = "zgcfbl_hw")
    protected double zgcfblHw;
    protected String zjhyflx;
    protected String zjlydx;
    protected String zygcnr;

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
     * 获取yjhtebz属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYjhtebz() {
        return yjhtebz;
    }

    /**
     * 设置yjhtebz属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYjhtebz(String value) {
        this.yjhtebz = value;
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
