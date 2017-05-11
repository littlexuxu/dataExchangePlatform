
package cn.ccccltd.webservice.design.contract;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>sjxmjhtVO complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�����ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="sjxmjhtVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://contract.design.webservice.ccccltd.cn/}voSupport"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="acctyear" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="basedatamarker" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
 *         &lt;element name="bghhte" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="bghhtgq" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="bghzzcdhte" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="bghzzcdhtermb" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="billcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="billdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="billdefine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="billtime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bxList" type="{http://contract.design.webservice.ccccltd.cn/}hwxmbcxxVO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="chtid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="creater" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="createtime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="createunit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="createuser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="createuserid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="creator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cxmid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="defineid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dqhl" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="dwqypp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gjhyfl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gltzxmgs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gpszb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hetbz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hghhtebz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="htbh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hte" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="htermb" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="htgq" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="htjf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="htjfnb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="htkgrq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="htmc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="htqdfs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="htqdrq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="htwgrq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="htyfid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hwzdjk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="invalidtime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isdraft" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
 *         &lt;element name="isleaf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="jtpp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
 *         &lt;element name="scsjhtbxList" type="{http://contract.design.webservice.ccccltd.cn/}scsjhtbxVO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="scsjxmjht" type="{http://contract.design.webservice.ccccltd.cn/}scsjxmjhtVO" minOccurs="0"/&gt;
 *         &lt;element name="sffb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sfgltzxm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sfhw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shortname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sjgf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sjkgrq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sjwgrq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sortorder" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ssdwmc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ssqy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ssyw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="startflag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stdcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stdname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="submittime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="submitunit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="submituser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="submituserid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tjgsyf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tzxmlx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="unitid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="validtime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="workflowstate" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="wqyyss" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="xmhtyy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="xmjlyy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="xmld" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="xmlx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="xmszd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="xmyfk" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="xmyfkbl" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="xmzt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ysjdkzfbl" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="yslybzfs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="yslybzje" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="ysyfkbl" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="yszbjbl" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="yszbjqx" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="yzdw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="zbxmmc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="zjhyflx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="zjlydx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="zytkms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="zyxmnr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "sjxmjhtVO", propOrder = {
    "acctyear",
    "basedatamarker",
    "bghhte",
    "bghhtgq",
    "bghzzcdhte",
    "bghzzcdhtermb",
    "billcode",
    "billdate",
    "billdefine",
    "billtime",
    "bxList",
    "chtid",
    "creater",
    "createtime",
    "createunit",
    "createuser",
    "createuserid",
    "creator",
    "cxmid",
    "defineid",
    "dqhl",
    "dwqypp",
    "gjhyfl",
    "gltzxmgs",
    "gpszb",
    "hetbz",
    "hghhtebz",
    "htbh",
    "hte",
    "htermb",
    "htgq",
    "htjf",
    "htjfnb",
    "htkgrq",
    "htmc",
    "htqdfs",
    "htqdrq",
    "htwgrq",
    "htyfid",
    "hwzdjk",
    "invalidtime",
    "isdraft",
    "isleaf",
    "jtpp",
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
    "scsjhtbxList",
    "scsjxmjht",
    "sffb",
    "sfgltzxm",
    "sfhw",
    "shortname",
    "sjgf",
    "sjkgrq",
    "sjwgrq",
    "sortorder",
    "ssdwmc",
    "ssqy",
    "ssyw",
    "startflag",
    "stdcode",
    "stdname",
    "submittime",
    "submitunit",
    "submituser",
    "submituserid",
    "tjgsyf",
    "tzxmlx",
    "unitid",
    "validtime",
    "workflowstate",
    "wqyyss",
    "xmhtyy",
    "xmjlyy",
    "xmld",
    "xmlx",
    "xmszd",
    "xmyfk",
    "xmyfkbl",
    "xmzt",
    "ysjdkzfbl",
    "yslybzfs",
    "yslybzje",
    "ysyfkbl",
    "yszbjbl",
    "yszbjqx",
    "yzdw",
    "zbxmmc",
    "zjhyflx",
    "zjlydx",
    "zytkms",
    "zyxmnr",
    "zzcdhte"
})
public class SjxmjhtVO
    extends VoSupport
{

    protected int acctyear;
    protected byte basedatamarker;
    protected double bghhte;
    protected double bghhtgq;
    protected double bghzzcdhte;
    protected double bghzzcdhtermb;
    protected String billcode;
    protected String billdate;
    protected String billdefine;
    protected String billtime;
    @XmlElement(nillable = true,name="hwxmbxInfo")
    protected List<HwxmbcxxVO> bxList;
    protected String chtid;
    protected String creater;
    protected String createtime;
    protected String createunit;
    protected String createuser;
    protected String createuserid;
    protected String creator;
    protected String cxmid;
    protected String defineid;
    protected double dqhl;
    protected String dwqypp;
    protected String gjhyfl;
    protected String gltzxmgs;
    protected String gpszb;
    protected String hetbz;
    protected String hghhtebz;
    protected String htbh;
    protected double hte;
    protected double htermb;
    protected double htgq;
    protected String htjf;
    protected String htjfnb;
    protected String htkgrq;
    protected String htmc;
    protected String htqdfs;
    protected String htqdrq;
    protected String htwgrq;
    protected String htyfid;
    protected String hwzdjk;
    protected String invalidtime;
    protected byte isdraft;
    protected String isleaf;
    protected String jtpp;
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
    @XmlElement(nillable = true)
    protected List<ScsjhtbxVO> scsjhtbxList;
    protected ScsjxmjhtVO scsjxmjht;
    protected String sffb;
    protected String sfgltzxm;
    protected String sfhw;
    protected String shortname;
    protected String sjgf;
    protected String sjkgrq;
    protected String sjwgrq;
    protected int sortorder;
    protected String ssdwmc;
    protected String ssqy;
    protected String ssyw;
    protected String startflag;
    protected String stdcode;
    protected String stdname;
    protected String submittime;
    protected String submitunit;
    protected String submituser;
    protected String submituserid;
    protected String tjgsyf;
    protected String tzxmlx;
    protected String unitid;
    protected String validtime;
    protected int workflowstate;
    protected String wqyyss;
    protected String xmhtyy;
    protected String xmjlyy;
    protected String xmld;
    protected String xmlx;
    protected String xmszd;
    protected double xmyfk;
    protected double xmyfkbl;
    protected String xmzt;
    protected double ysjdkzfbl;
    protected String yslybzfs;
    protected double yslybzje;
    protected double ysyfkbl;
    protected double yszbjbl;
    protected double yszbjqx;
    protected String yzdw;
    protected String zbxmmc;
    protected String zjhyflx;
    protected String zjlydx;
    protected String zytkms;
    protected String zyxmnr;
    protected double zzcdhte;

    /**
     * ��ȡacctyear���Ե�ֵ��
     * 
     */
    public int getAcctyear() {
        return acctyear;
    }

    /**
     * ����acctyear���Ե�ֵ��
     * 
     */
    public void setAcctyear(int value) {
        this.acctyear = value;
    }

    /**
     * ��ȡbasedatamarker���Ե�ֵ��
     * 
     */
    public byte getBasedatamarker() {
        return basedatamarker;
    }

    /**
     * ����basedatamarker���Ե�ֵ��
     * 
     */
    public void setBasedatamarker(byte value) {
        this.basedatamarker = value;
    }

    /**
     * ��ȡbghhte���Ե�ֵ��
     * 
     */
    public double getBghhte() {
        return bghhte;
    }

    /**
     * ����bghhte���Ե�ֵ��
     * 
     */
    public void setBghhte(double value) {
        this.bghhte = value;
    }

    /**
     * ��ȡbghhtgq���Ե�ֵ��
     * 
     */
    public double getBghhtgq() {
        return bghhtgq;
    }

    /**
     * ����bghhtgq���Ե�ֵ��
     * 
     */
    public void setBghhtgq(double value) {
        this.bghhtgq = value;
    }

    /**
     * ��ȡbghzzcdhte���Ե�ֵ��
     * 
     */
    public double getBghzzcdhte() {
        return bghzzcdhte;
    }

    /**
     * ����bghzzcdhte���Ե�ֵ��
     * 
     */
    public void setBghzzcdhte(double value) {
        this.bghzzcdhte = value;
    }

    /**
     * ��ȡbghzzcdhtermb���Ե�ֵ��
     * 
     */
    public double getBghzzcdhtermb() {
        return bghzzcdhtermb;
    }

    /**
     * ����bghzzcdhtermb���Ե�ֵ��
     * 
     */
    public void setBghzzcdhtermb(double value) {
        this.bghzzcdhtermb = value;
    }

    /**
     * ��ȡbillcode���Ե�ֵ��
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
     * ����billcode���Ե�ֵ��
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
     * ��ȡbilldate���Ե�ֵ��
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
     * ����billdate���Ե�ֵ��
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
     * ��ȡbilldefine���Ե�ֵ��
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
     * ����billdefine���Ե�ֵ��
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
     * ��ȡbilltime���Ե�ֵ��
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
     * ����billtime���Ե�ֵ��
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
     * Gets the value of the bxList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bxList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBxList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HwxmbcxxVO }
     * 
     * 
     */
    public List<HwxmbcxxVO> getBxList() {
        if (bxList == null) {
            bxList = new ArrayList<HwxmbcxxVO>();
        }
        return this.bxList;
    }
    
    public void setBxList(List<HwxmbcxxVO> bxList) {
        this.bxList = bxList;
    }

    /**
     * ��ȡchtid���Ե�ֵ��
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
     * ����chtid���Ե�ֵ��
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
     * ��ȡcreater���Ե�ֵ��
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
     * ����creater���Ե�ֵ��
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
     * ��ȡcreatetime���Ե�ֵ��
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
     * ����createtime���Ե�ֵ��
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
     * ��ȡcreateunit���Ե�ֵ��
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
     * ����createunit���Ե�ֵ��
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
     * ��ȡcreateuser���Ե�ֵ��
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
     * ����createuser���Ե�ֵ��
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
     * ��ȡcreateuserid���Ե�ֵ��
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
     * ����createuserid���Ե�ֵ��
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
     * ��ȡcreator���Ե�ֵ��
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
     * ����creator���Ե�ֵ��
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
     * ��ȡcxmid���Ե�ֵ��
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
     * ����cxmid���Ե�ֵ��
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
     * ��ȡdefineid���Ե�ֵ��
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
     * ����defineid���Ե�ֵ��
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
     * ��ȡdqhl���Ե�ֵ��
     * 
     */
    public double getDqhl() {
        return dqhl;
    }

    /**
     * ����dqhl���Ե�ֵ��
     * 
     */
    public void setDqhl(double value) {
        this.dqhl = value;
    }

    /**
     * ��ȡdwqypp���Ե�ֵ��
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
     * ����dwqypp���Ե�ֵ��
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
     * ��ȡgjhyfl���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGjhyfl() {
        return gjhyfl;
    }

    /**
     * ����gjhyfl���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGjhyfl(String value) {
        this.gjhyfl = value;
    }

    /**
     * ��ȡgltzxmgs���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGltzxmgs() {
        return gltzxmgs;
    }

    /**
     * ����gltzxmgs���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGltzxmgs(String value) {
        this.gltzxmgs = value;
    }

    /**
     * ��ȡgpszb���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGpszb() {
        return gpszb;
    }

    /**
     * ����gpszb���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGpszb(String value) {
        this.gpszb = value;
    }

    /**
     * ��ȡhetbz���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHetbz() {
        return hetbz;
    }

    /**
     * ����hetbz���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHetbz(String value) {
        this.hetbz = value;
    }

    /**
     * ��ȡhghhtebz���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHghhtebz() {
        return hghhtebz;
    }

    /**
     * ����hghhtebz���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHghhtebz(String value) {
        this.hghhtebz = value;
    }

    /**
     * ��ȡhtbh���Ե�ֵ��
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
     * ����htbh���Ե�ֵ��
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
     * ��ȡhte���Ե�ֵ��
     * 
     */
    public double getHte() {
        return hte;
    }

    /**
     * ����hte���Ե�ֵ��
     * 
     */
    public void setHte(double value) {
        this.hte = value;
    }

    /**
     * ��ȡhtermb���Ե�ֵ��
     * 
     */
    public double getHtermb() {
        return htermb;
    }

    /**
     * ����htermb���Ե�ֵ��
     * 
     */
    public void setHtermb(double value) {
        this.htermb = value;
    }

    /**
     * ��ȡhtgq���Ե�ֵ��
     * 
     */
    public double getHtgq() {
        return htgq;
    }

    /**
     * ����htgq���Ե�ֵ��
     * 
     */
    public void setHtgq(double value) {
        this.htgq = value;
    }

    /**
     * ��ȡhtjf���Ե�ֵ��
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
     * ����htjf���Ե�ֵ��
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
     * ��ȡhtjfnb���Ե�ֵ��
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
     * ����htjfnb���Ե�ֵ��
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
     * ��ȡhtkgrq���Ե�ֵ��
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
     * ����htkgrq���Ե�ֵ��
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
     * ��ȡhtmc���Ե�ֵ��
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
     * ����htmc���Ե�ֵ��
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
     * ��ȡhtqdfs���Ե�ֵ��
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
     * ����htqdfs���Ե�ֵ��
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
     * ��ȡhtqdrq���Ե�ֵ��
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
     * ����htqdrq���Ե�ֵ��
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
     * ��ȡhtwgrq���Ե�ֵ��
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
     * ����htwgrq���Ե�ֵ��
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
     * ��ȡhtyfid���Ե�ֵ��
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
     * ����htyfid���Ե�ֵ��
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
     * ��ȡhwzdjk���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHwzdjk() {
        return hwzdjk;
    }

    /**
     * ����hwzdjk���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHwzdjk(String value) {
        this.hwzdjk = value;
    }

    /**
     * ��ȡinvalidtime���Ե�ֵ��
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
     * ����invalidtime���Ե�ֵ��
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
     * ��ȡisdraft���Ե�ֵ��
     * 
     */
    public byte getIsdraft() {
        return isdraft;
    }

    /**
     * ����isdraft���Ե�ֵ��
     * 
     */
    public void setIsdraft(byte value) {
        this.isdraft = value;
    }

    /**
     * ��ȡisleaf���Ե�ֵ��
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
     * ����isleaf���Ե�ֵ��
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
     * ��ȡjtpp���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJtpp() {
        return jtpp;
    }

    /**
     * ����jtpp���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJtpp(String value) {
        this.jtpp = value;
    }

    /**
     * ��ȡlevel1���Ե�ֵ��
     * 
     */
    public int getLevel1() {
        return level1;
    }

    /**
     * ����level1���Ե�ֵ��
     * 
     */
    public void setLevel1(int value) {
        this.level1 = value;
    }

    /**
     * ��ȡmodifier���Ե�ֵ��
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
     * ����modifier���Ե�ֵ��
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
     * ��ȡmodifytime���Ե�ֵ��
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
     * ����modifytime���Ե�ֵ��
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
     * ��ȡmodifyuser���Ե�ֵ��
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
     * ����modifyuser���Ե�ֵ��
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
     * ��ȡmodifyuserid���Ե�ֵ��
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
     * ����modifyuserid���Ե�ֵ��
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
     * ��ȡobjectid���Ե�ֵ��
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
     * ����objectid���Ե�ֵ��
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
     * ��ȡorgunit���Ե�ֵ��
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
     * ����orgunit���Ե�ֵ��
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
     * ��ȡparents���Ե�ֵ��
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
     * ����parents���Ե�ֵ��
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
     * ��ȡqyzx���Ե�ֵ��
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
     * ����qyzx���Ե�ֵ��
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
     * ��ȡrecid���Ե�ֵ��
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
     * ����recid���Ե�ֵ��
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
     * ��ȡrecver���Ե�ֵ��
     * 
     */
    public double getRecver() {
        return recver;
    }

    /**
     * ����recver���Ե�ֵ��
     * 
     */
    public void setRecver(double value) {
        this.recver = value;
    }

    /**
     * ��ȡresid���Ե�ֵ��
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
     * ����resid���Ե�ֵ��
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
     * ��ȡschemeid���Ե�ֵ��
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
     * ����schemeid���Ե�ֵ��
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
     * Gets the value of the scsjhtbxList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scsjhtbxList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScsjhtbxList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScsjhtbxVO }
     * 
     * 
     */
    public List<ScsjhtbxVO> getScsjhtbxList() {
        if (scsjhtbxList == null) {
            scsjhtbxList = new ArrayList<ScsjhtbxVO>();
        }
        return this.scsjhtbxList;
    }
    
    public void setScsjhtbxList(List<ScsjhtbxVO> scsjhtbxList) {
        this.scsjhtbxList = scsjhtbxList;
    }

    /**
     * ��ȡscsjxmjht���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ScsjxmjhtVO }
     *     
     */
    public ScsjxmjhtVO getScsjxmjht() {
        return scsjxmjht;
    }

    /**
     * ����scsjxmjht���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ScsjxmjhtVO }
     *     
     */
    public void setScsjxmjht(ScsjxmjhtVO value) {
        this.scsjxmjht = value;
    }

    /**
     * ��ȡsffb���Ե�ֵ��
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
     * ����sffb���Ե�ֵ��
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
     * ��ȡsfgltzxm���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSfgltzxm() {
        return sfgltzxm;
    }

    /**
     * ����sfgltzxm���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSfgltzxm(String value) {
        this.sfgltzxm = value;
    }

    /**
     * ��ȡsfhw���Ե�ֵ��
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
     * ����sfhw���Ե�ֵ��
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
     * ��ȡshortname���Ե�ֵ��
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
     * ����shortname���Ե�ֵ��
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
     * ��ȡsjgf���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSjgf() {
        return sjgf;
    }

    /**
     * ����sjgf���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSjgf(String value) {
        this.sjgf = value;
    }

    /**
     * ��ȡsjkgrq���Ե�ֵ��
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
     * ����sjkgrq���Ե�ֵ��
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
     * ��ȡsjwgrq���Ե�ֵ��
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
     * ����sjwgrq���Ե�ֵ��
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
     * ��ȡsortorder���Ե�ֵ��
     * 
     */
    public int getSortorder() {
        return sortorder;
    }

    /**
     * ����sortorder���Ե�ֵ��
     * 
     */
    public void setSortorder(int value) {
        this.sortorder = value;
    }

    /**
     * ��ȡssdwmc���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsdwmc() {
        return ssdwmc;
    }

    /**
     * ����ssdwmc���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsdwmc(String value) {
        this.ssdwmc = value;
    }

    /**
     * ��ȡssqy���Ե�ֵ��
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
     * ����ssqy���Ե�ֵ��
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
     * ��ȡssyw���Ե�ֵ��
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
     * ����ssyw���Ե�ֵ��
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
     * ��ȡstartflag���Ե�ֵ��
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
     * ����startflag���Ե�ֵ��
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
     * ��ȡstdcode���Ե�ֵ��
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
     * ����stdcode���Ե�ֵ��
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
     * ��ȡstdname���Ե�ֵ��
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
     * ����stdname���Ե�ֵ��
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
     * ��ȡsubmittime���Ե�ֵ��
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
     * ����submittime���Ե�ֵ��
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
     * ��ȡsubmitunit���Ե�ֵ��
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
     * ����submitunit���Ե�ֵ��
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
     * ��ȡsubmituser���Ե�ֵ��
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
     * ����submituser���Ե�ֵ��
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
     * ��ȡsubmituserid���Ե�ֵ��
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
     * ����submituserid���Ե�ֵ��
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
     * ��ȡtjgsyf���Ե�ֵ��
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
     * ����tjgsyf���Ե�ֵ��
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
     * ��ȡtzxmlx���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTzxmlx() {
        return tzxmlx;
    }

    /**
     * ����tzxmlx���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTzxmlx(String value) {
        this.tzxmlx = value;
    }

    /**
     * ��ȡunitid���Ե�ֵ��
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
     * ����unitid���Ե�ֵ��
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
     * ��ȡvalidtime���Ե�ֵ��
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
     * ����validtime���Ե�ֵ��
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
     * ��ȡworkflowstate���Ե�ֵ��
     * 
     */
    public int getWorkflowstate() {
        return workflowstate;
    }

    /**
     * ����workflowstate���Ե�ֵ��
     * 
     */
    public void setWorkflowstate(int value) {
        this.workflowstate = value;
    }

    /**
     * ��ȡwqyyss���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWqyyss() {
        return wqyyss;
    }

    /**
     * ����wqyyss���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWqyyss(String value) {
        this.wqyyss = value;
    }

    /**
     * ��ȡxmhtyy���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmhtyy() {
        return xmhtyy;
    }

    /**
     * ����xmhtyy���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmhtyy(String value) {
        this.xmhtyy = value;
    }

    /**
     * ��ȡxmjlyy���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmjlyy() {
        return xmjlyy;
    }

    /**
     * ����xmjlyy���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmjlyy(String value) {
        this.xmjlyy = value;
    }

    /**
     * ��ȡxmld���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmld() {
        return xmld;
    }

    /**
     * ����xmld���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmld(String value) {
        this.xmld = value;
    }

    /**
     * ��ȡxmlx���Ե�ֵ��
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
     * ����xmlx���Ե�ֵ��
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
     * ��ȡxmszd���Ե�ֵ��
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
     * ����xmszd���Ե�ֵ��
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
     * ��ȡxmyfk���Ե�ֵ��
     * 
     */
    public double getXmyfk() {
        return xmyfk;
    }

    /**
     * ����xmyfk���Ե�ֵ��
     * 
     */
    public void setXmyfk(double value) {
        this.xmyfk = value;
    }

    /**
     * ��ȡxmyfkbl���Ե�ֵ��
     * 
     */
    public double getXmyfkbl() {
        return xmyfkbl;
    }

    /**
     * ����xmyfkbl���Ե�ֵ��
     * 
     */
    public void setXmyfkbl(double value) {
        this.xmyfkbl = value;
    }

    /**
     * ��ȡxmzt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmzt() {
        return xmzt;
    }

    /**
     * ����xmzt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmzt(String value) {
        this.xmzt = value;
    }

    /**
     * ��ȡysjdkzfbl���Ե�ֵ��
     * 
     */
    public double getYsjdkzfbl() {
        return ysjdkzfbl;
    }

    /**
     * ����ysjdkzfbl���Ե�ֵ��
     * 
     */
    public void setYsjdkzfbl(double value) {
        this.ysjdkzfbl = value;
    }

    /**
     * ��ȡyslybzfs���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYslybzfs() {
        return yslybzfs;
    }

    /**
     * ����yslybzfs���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYslybzfs(String value) {
        this.yslybzfs = value;
    }

    /**
     * ��ȡyslybzje���Ե�ֵ��
     * 
     */
    public double getYslybzje() {
        return yslybzje;
    }

    /**
     * ����yslybzje���Ե�ֵ��
     * 
     */
    public void setYslybzje(double value) {
        this.yslybzje = value;
    }

    /**
     * ��ȡysyfkbl���Ե�ֵ��
     * 
     */
    public double getYsyfkbl() {
        return ysyfkbl;
    }

    /**
     * ����ysyfkbl���Ե�ֵ��
     * 
     */
    public void setYsyfkbl(double value) {
        this.ysyfkbl = value;
    }

    /**
     * ��ȡyszbjbl���Ե�ֵ��
     * 
     */
    public double getYszbjbl() {
        return yszbjbl;
    }

    /**
     * ����yszbjbl���Ե�ֵ��
     * 
     */
    public void setYszbjbl(double value) {
        this.yszbjbl = value;
    }

    /**
     * ��ȡyszbjqx���Ե�ֵ��
     * 
     */
    public double getYszbjqx() {
        return yszbjqx;
    }

    /**
     * ����yszbjqx���Ե�ֵ��
     * 
     */
    public void setYszbjqx(double value) {
        this.yszbjqx = value;
    }

    /**
     * ��ȡyzdw���Ե�ֵ��
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
     * ����yzdw���Ե�ֵ��
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
     * ��ȡzbxmmc���Ե�ֵ��
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
     * ����zbxmmc���Ե�ֵ��
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
     * ��ȡzjhyflx���Ե�ֵ��
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
     * ����zjhyflx���Ե�ֵ��
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
     * ��ȡzjlydx���Ե�ֵ��
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
     * ����zjlydx���Ե�ֵ��
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
     * ��ȡzytkms���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZytkms() {
        return zytkms;
    }

    /**
     * ����zytkms���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZytkms(String value) {
        this.zytkms = value;
    }

    /**
     * ��ȡzyxmnr���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZyxmnr() {
        return zyxmnr;
    }

    /**
     * ����zyxmnr���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZyxmnr(String value) {
        this.zyxmnr = value;
    }

    /**
     * ��ȡzzcdhte���Ե�ֵ��
     * 
     */
    public double getZzcdhte() {
        return zzcdhte;
    }

    /**
     * ����zzcdhte���Ե�ֵ��
     * 
     */
    public void setZzcdhte(double value) {
        this.zzcdhte = value;
    }

}
