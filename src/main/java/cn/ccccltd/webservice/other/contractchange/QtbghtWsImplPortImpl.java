
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package cn.ccccltd.webservice.other.contractchange;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.8
 * 2017-03-17T17:52:41.769+08:00
 * Generated source version: 3.1.8
 * 
 */

@javax.jws.WebService(
                      serviceName = "QtbghtWsImpl",
                      portName = "QtbghtWsImplPort",
                      targetNamespace = "http://contractchange.other.webservice.ccccltd.cn/",
                      wsdlLocation = "http://10.17.16.33:7070/waf/ws/other_contractChange?wsdl",
                      endpointInterface = "cn.ccccltd.webservice.other.contractchange.QtbghtWs")
                      
public class QtbghtWsImplPortImpl implements QtbghtWs {

    private static final Logger LOG = Logger.getLogger(QtbghtWsImplPortImpl.class.getName());

    /* (non-Javadoc)
     * @see cn.ccccltd.webservice.other.contractchange.QtbghtWs#updateContractChange(cn.ccccltd.webservice.other.contractchange.QtbghtVO qtbghtInfo)*
     */
    public cn.ccccltd.webservice.other.contractchange.ReturnMessage updateContractChange(cn.ccccltd.webservice.other.contractchange.QtbghtVO qtbghtInfo) { 
        LOG.info("Executing operation updateContractChange");
        System.out.println(qtbghtInfo);
        try {
            cn.ccccltd.webservice.other.contractchange.ReturnMessage _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see cn.ccccltd.webservice.other.contractchange.QtbghtWs#addContractChange(cn.ccccltd.webservice.other.contractchange.QtbghtVO qtbghtInfo)*
     */
    public cn.ccccltd.webservice.other.contractchange.ReturnMessage addContractChange(cn.ccccltd.webservice.other.contractchange.QtbghtVO qtbghtInfo) { 
        LOG.info("Executing operation addContractChange");
        System.out.println(qtbghtInfo);
        try {
            cn.ccccltd.webservice.other.contractchange.ReturnMessage _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
