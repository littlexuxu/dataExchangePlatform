
package cn.ccccltd.webservice.construction.contractchange;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>updateContractChange complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="updateContractChange"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sgbghtInfo" type="{http://contractchange.construction.webservice.ccccltd.cn/}sgbghtVO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateContractChange", propOrder = {
    "sgbghtInfo"
})
public class UpdateContractChange {

    protected SgbghtVO sgbghtInfo;

    /**
     * 获取sgbghtInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SgbghtVO }
     *     
     */
    public SgbghtVO getSgbghtInfo() {
        return sgbghtInfo;
    }

    /**
     * 设置sgbghtInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SgbghtVO }
     *     
     */
    public void setSgbghtInfo(SgbghtVO value) {
        this.sgbghtInfo = value;
    }

}
