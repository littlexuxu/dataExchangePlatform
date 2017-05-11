package cn.ccccltd.webservice.other.projectbaseinfo;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.8
 * 2017-04-26T13:12:45.486+08:00
 * Generated source version: 3.1.8
 * 
 */
@WebServiceClient(name = "qtlxmWsImpl", 
                  wsdlLocation = "http://localhost:8060/waf/ws/other_productBaseInfo?wsdl",
                  targetNamespace = "http://projectbaseinfo.other.webservice.ccccltd.cn/") 
public class QtlxmWsImpl extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://projectbaseinfo.other.webservice.ccccltd.cn/", "qtlxmWsImpl");
    public final static QName QtlxmWsImplPort = new QName("http://projectbaseinfo.other.webservice.ccccltd.cn/", "QtlxmWsImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8060/waf/ws/other_productBaseInfo?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(QtlxmWsImpl.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8060/waf/ws/other_productBaseInfo?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public QtlxmWsImpl(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public QtlxmWsImpl(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public QtlxmWsImpl() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public QtlxmWsImpl(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public QtlxmWsImpl(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public QtlxmWsImpl(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns QtlxmWs
     */
    @WebEndpoint(name = "QtlxmWsImplPort")
    public QtlxmWs getQtlxmWsImplPort() {
        return super.getPort(QtlxmWsImplPort, QtlxmWs.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns QtlxmWs
     */
    @WebEndpoint(name = "QtlxmWsImplPort")
    public QtlxmWs getQtlxmWsImplPort(WebServiceFeature... features) {
        return super.getPort(QtlxmWsImplPort, QtlxmWs.class, features);
    }

}