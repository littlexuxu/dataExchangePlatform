
package cn.ccccltd.webservice.other.contractchange;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>addContractChange complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="addContractChange"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="qtbghtInfo" type="{http://contractchange.other.webservice.ccccltd.cn/}qtbghtVO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addContractChange", propOrder = {
    "qtbghtInfo"
})
public class AddContractChange {

    protected QtbghtVO qtbghtInfo;

    /**
     * 获取qtbghtInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link QtbghtVO }
     *     
     */
    public QtbghtVO getQtbghtInfo() {
        return qtbghtInfo;
    }

    /**
     * 设置qtbghtInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link QtbghtVO }
     *     
     */
    public void setQtbghtInfo(QtbghtVO value) {
        this.qtbghtInfo = value;
    }

}
