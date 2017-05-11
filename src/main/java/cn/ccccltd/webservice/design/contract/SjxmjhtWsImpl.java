package cn.ccccltd.webservice.design.contract;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.8
 * 2017-04-22T14:53:24.390+08:00
 * Generated source version: 3.1.8
 * 
 */
@WebServiceClient(name = "sjxmjhtWsImpl", 
                  wsdlLocation = "http://192.168.0.161:8090/waf/ws/design_contractInfo?wsdl",
                  targetNamespace = "http://contract.design.webservice.ccccltd.cn/") 
public class SjxmjhtWsImpl extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://contract.design.webservice.ccccltd.cn/", "sjxmjhtWsImpl");
    public final static QName SjxmjhtWsImplPort = new QName("http://contract.design.webservice.ccccltd.cn/", "SjxmjhtWsImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://192.168.0.161:8090/waf/ws/design_contractInfo?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(SjxmjhtWsImpl.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://192.168.0.161:8090/waf/ws/design_contractInfo?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public SjxmjhtWsImpl(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SjxmjhtWsImpl(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SjxmjhtWsImpl() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public SjxmjhtWsImpl(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public SjxmjhtWsImpl(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public SjxmjhtWsImpl(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns SjxmjhtWs
     */
    @WebEndpoint(name = "SjxmjhtWsImplPort")
    public SjxmjhtWs getSjxmjhtWsImplPort() {
        return super.getPort(SjxmjhtWsImplPort, SjxmjhtWs.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SjxmjhtWs
     */
    @WebEndpoint(name = "SjxmjhtWsImplPort")
    public SjxmjhtWs getSjxmjhtWsImplPort(WebServiceFeature... features) {
        return super.getPort(SjxmjhtWsImplPort, SjxmjhtWs.class, features);
    }

}