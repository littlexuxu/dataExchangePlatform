
package cn.ccccltd.webservice.design.monthreport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>updateMonthReport complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="updateMonthReport"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="monthReportInfo" type="{http://monthreport.design.webservice.ccccltd.cn/}sjxmzxfdVO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateMonthReport", propOrder = {
    "monthReportInfo"
})
public class UpdateMonthReport {

    protected SjxmzxfdVO monthReportInfo;

    /**
     * 获取monthReportInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SjxmzxfdVO }
     *     
     */
    public SjxmzxfdVO getMonthReportInfo() {
        return monthReportInfo;
    }

    /**
     * 设置monthReportInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SjxmzxfdVO }
     *     
     */
    public void setMonthReportInfo(SjxmzxfdVO value) {
        this.monthReportInfo = value;
    }

}
