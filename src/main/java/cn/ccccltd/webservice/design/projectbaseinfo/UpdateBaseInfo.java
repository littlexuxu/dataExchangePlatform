
package cn.ccccltd.webservice.design.projectbaseinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>updateBaseInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="updateBaseInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="projectBaseInfo" type="{http://projectbaseinfo.design.webservice.ccccltd.cn/}sjscgzjzbVO" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateBaseInfo", propOrder = {
    "projectBaseInfo"
})
public class UpdateBaseInfo {

    protected SjscgzjzbVO projectBaseInfo;

    /**
     * 获取projectBaseInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SjscgzjzbVO }
     *     
     */
    public SjscgzjzbVO getProjectBaseInfo() {
        return projectBaseInfo;
    }

    /**
     * 设置projectBaseInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SjscgzjzbVO }
     *     
     */
    public void setProjectBaseInfo(SjscgzjzbVO value) {
        this.projectBaseInfo = value;
    }

}
