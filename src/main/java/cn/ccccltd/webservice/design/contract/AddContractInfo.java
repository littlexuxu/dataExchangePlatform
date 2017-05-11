
package cn.ccccltd.webservice.design.contract;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>addContractInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="addContractInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contractInfo" type="{http://contract.design.webservice.ccccltd.cn/}sjxmjhtVO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addContractInfo", propOrder = {
    "contractInfo"
})
public class AddContractInfo {

    protected SjxmjhtVO contractInfo;

    /**
     * 获取contractInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SjxmjhtVO }
     *     
     */
    public SjxmjhtVO getContractInfo() {
        return contractInfo;
    }

    /**
     * 设置contractInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SjxmjhtVO }
     *     
     */
    public void setContractInfo(SjxmjhtVO value) {
        this.contractInfo = value;
    }

}
