package cn.ccccltd.webservice.construction.projectbaseinfo;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.8
 * 2017-04-26T13:09:40.345+08:00
 * Generated source version: 3.1.8
 * 
 */
@WebServiceClient(name = "ghscgzjzbWsImpl", 
                  wsdlLocation = "http://localhost:8060/waf/ws/invest_productBaseInfo?wsdl",
                  targetNamespace = "http://projectbaseinfo.construction.webservice.ccccltd.cn/") 
public class GhscgzjzbWsImpl extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://projectbaseinfo.construction.webservice.ccccltd.cn/", "ghscgzjzbWsImpl");
    public final static QName GhscgzjzbWsImplPort = new QName("http://projectbaseinfo.construction.webservice.ccccltd.cn/", "GhscgzjzbWsImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8060/waf/ws/invest_productBaseInfo?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(GhscgzjzbWsImpl.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8060/waf/ws/invest_productBaseInfo?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public GhscgzjzbWsImpl(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public GhscgzjzbWsImpl(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GhscgzjzbWsImpl() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public GhscgzjzbWsImpl(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public GhscgzjzbWsImpl(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public GhscgzjzbWsImpl(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns GhscgzjzbWs
     */
    @WebEndpoint(name = "GhscgzjzbWsImplPort")
    public GhscgzjzbWs getGhscgzjzbWsImplPort() {
        return super.getPort(GhscgzjzbWsImplPort, GhscgzjzbWs.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GhscgzjzbWs
     */
    @WebEndpoint(name = "GhscgzjzbWsImplPort")
    public GhscgzjzbWs getGhscgzjzbWsImplPort(WebServiceFeature... features) {
        return super.getPort(GhscgzjzbWsImplPort, GhscgzjzbWs.class, features);
    }

}