
package cn.ccccltd.webservice.design.marketinfo;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cn.ccccltd.webservice.design.marketinfo package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddMarketInfo_QNAME = new QName("http://marketinfo.design.webservice.ccccltd.cn/", "addMarketInfo");
    private final static QName _AddMarketInfoResponse_QNAME = new QName("http://marketinfo.design.webservice.ccccltd.cn/", "addMarketInfoResponse");
    private final static QName _QueryMarketInfoById_QNAME = new QName("http://marketinfo.design.webservice.ccccltd.cn/", "queryMarketInfoById");
    private final static QName _QueryMarketInfoByIdResponse_QNAME = new QName("http://marketinfo.design.webservice.ccccltd.cn/", "queryMarketInfoByIdResponse");
    private final static QName _UpdateMarketInfo_QNAME = new QName("http://marketinfo.design.webservice.ccccltd.cn/", "updateMarketInfo");
    private final static QName _UpdateMarketInfoResponse_QNAME = new QName("http://marketinfo.design.webservice.ccccltd.cn/", "updateMarketInfoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cn.ccccltd.webservice.design.marketinfo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddMarketInfo }
     * 
     */
    public AddMarketInfo createAddMarketInfo() {
        return new AddMarketInfo();
    }

    /**
     * Create an instance of {@link AddMarketInfoResponse }
     * 
     */
    public AddMarketInfoResponse createAddMarketInfoResponse() {
        return new AddMarketInfoResponse();
    }

    /**
     * Create an instance of {@link QueryMarketInfoById }
     * 
     */
    public QueryMarketInfoById createQueryMarketInfoById() {
        return new QueryMarketInfoById();
    }

    /**
     * Create an instance of {@link QueryMarketInfoByIdResponse }
     * 
     */
    public QueryMarketInfoByIdResponse createQueryMarketInfoByIdResponse() {
        return new QueryMarketInfoByIdResponse();
    }

    /**
     * Create an instance of {@link UpdateMarketInfo }
     * 
     */
    public UpdateMarketInfo createUpdateMarketInfo() {
        return new UpdateMarketInfo();
    }

    /**
     * Create an instance of {@link UpdateMarketInfoResponse }
     * 
     */
    public UpdateMarketInfoResponse createUpdateMarketInfoResponse() {
        return new UpdateMarketInfoResponse();
    }

    /**
     * Create an instance of {@link ReturnMessage }
     * 
     */
    public ReturnMessage createReturnMessage() {
        return new ReturnMessage();
    }

    /**
     * Create an instance of {@link ViewDictonaryVO }
     * 
     */
    public ViewDictonaryVO createViewDictonaryVO() {
        return new ViewDictonaryVO();
    }

    /**
     * Create an instance of {@link GhxmjhtVO }
     * 
     */
    public GhxmjhtVO createGhxmjhtVO() {
        return new GhxmjhtVO();
    }

    /**
     * Create an instance of {@link HwxmbxVO }
     * 
     */
    public HwxmbxVO createHwxmbxVO() {
        return new HwxmbxVO();
    }

    /**
     * Create an instance of {@link SgbghtVO }
     * 
     */
    public SgbghtVO createSgbghtVO() {
        return new SgbghtVO();
    }

    /**
     * Create an instance of {@link GhscxxVO }
     * 
     */
    public GhscxxVO createGhscxxVO() {
        return new GhscxxVO();
    }

    /**
     * Create an instance of {@link Ghscgzjzbzb }
     * 
     */
    public Ghscgzjzbzb createGhscgzjzbzb() {
        return new Ghscgzjzbzb();
    }

    /**
     * Create an instance of {@link GhscgzjzbVO }
     * 
     */
    public GhscgzjzbVO createGhscgzjzbVO() {
        return new GhscgzjzbVO();
    }

    /**
     * Create an instance of {@link MdorgVO }
     * 
     */
    public MdorgVO createMdorgVO() {
        return new MdorgVO();
    }

    /**
     * Create an instance of {@link GhxmzxfdVO }
     * 
     */
    public GhxmzxfdVO createGhxmzxfdVO() {
        return new GhxmzxfdVO();
    }

    /**
     * Create an instance of {@link ScghybVO }
     * 
     */
    public ScghybVO createScghybVO() {
        return new ScghybVO();
    }

    /**
     * Create an instance of {@link SjxmzxfdVO }
     * 
     */
    public SjxmzxfdVO createSjxmzxfdVO() {
        return new SjxmzxfdVO();
    }

    /**
     * Create an instance of {@link ScsjybVO }
     * 
     */
    public ScsjybVO createScsjybVO() {
        return new ScsjybVO();
    }

    /**
     * Create an instance of {@link QtxmzxVO }
     * 
     */
    public QtxmzxVO createQtxmzxVO() {
        return new QtxmzxVO();
    }

    /**
     * Create an instance of {@link ScqtybVO }
     * 
     */
    public ScqtybVO createScqtybVO() {
        return new ScqtybVO();
    }

    /**
     * Create an instance of {@link ScghscxxVO }
     * 
     */
    public ScghscxxVO createScghscxxVO() {
        return new ScghscxxVO();
    }

    /**
     * Create an instance of {@link SjscxxVO }
     * 
     */
    public SjscxxVO createSjscxxVO() {
        return new SjscxxVO();
    }

    /**
     * Create an instance of {@link SjscgzjzbzbVO }
     * 
     */
    public SjscgzjzbzbVO createSjscgzjzbzbVO() {
        return new SjscgzjzbzbVO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMarketInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marketinfo.design.webservice.ccccltd.cn/", name = "addMarketInfo")
    public JAXBElement<AddMarketInfo> createAddMarketInfo(AddMarketInfo value) {
        return new JAXBElement<AddMarketInfo>(_AddMarketInfo_QNAME, AddMarketInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMarketInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marketinfo.design.webservice.ccccltd.cn/", name = "addMarketInfoResponse")
    public JAXBElement<AddMarketInfoResponse> createAddMarketInfoResponse(AddMarketInfoResponse value) {
        return new JAXBElement<AddMarketInfoResponse>(_AddMarketInfoResponse_QNAME, AddMarketInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryMarketInfoById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marketinfo.design.webservice.ccccltd.cn/", name = "queryMarketInfoById")
    public JAXBElement<QueryMarketInfoById> createQueryMarketInfoById(QueryMarketInfoById value) {
        return new JAXBElement<QueryMarketInfoById>(_QueryMarketInfoById_QNAME, QueryMarketInfoById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryMarketInfoByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marketinfo.design.webservice.ccccltd.cn/", name = "queryMarketInfoByIdResponse")
    public JAXBElement<QueryMarketInfoByIdResponse> createQueryMarketInfoByIdResponse(QueryMarketInfoByIdResponse value) {
        return new JAXBElement<QueryMarketInfoByIdResponse>(_QueryMarketInfoByIdResponse_QNAME, QueryMarketInfoByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateMarketInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marketinfo.design.webservice.ccccltd.cn/", name = "updateMarketInfo")
    public JAXBElement<UpdateMarketInfo> createUpdateMarketInfo(UpdateMarketInfo value) {
        return new JAXBElement<UpdateMarketInfo>(_UpdateMarketInfo_QNAME, UpdateMarketInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateMarketInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marketinfo.design.webservice.ccccltd.cn/", name = "updateMarketInfoResponse")
    public JAXBElement<UpdateMarketInfoResponse> createUpdateMarketInfoResponse(UpdateMarketInfoResponse value) {
        return new JAXBElement<UpdateMarketInfoResponse>(_UpdateMarketInfoResponse_QNAME, UpdateMarketInfoResponse.class, null, value);
    }

}
