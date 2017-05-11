
package cn.ccccltd.webservice.design.marketinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>addMarketInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="addMarketInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="projectMarketInfo" type="{http://marketinfo.design.webservice.ccccltd.cn/}sjscxxVO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addMarketInfo", propOrder = {
    "projectMarketInfo"
})
public class AddMarketInfo {

    protected SjscxxVO projectMarketInfo;

    /**
     * 获取projectMarketInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SjscxxVO }
     *     
     */
    public SjscxxVO getProjectMarketInfo() {
        return projectMarketInfo;
    }

    /**
     * 设置projectMarketInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SjscxxVO }
     *     
     */
    public void setProjectMarketInfo(SjscxxVO value) {
        this.projectMarketInfo = value;
    }

}
