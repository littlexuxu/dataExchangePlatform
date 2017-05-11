package cn.ccccltd.webservice.construction.marketinfo;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.8
 * 2017-03-15T16:13:53.397+08:00
 * Generated source version: 3.1.8
 * 
 */
@WebService(targetNamespace = "http://marketinfo.construction.webservice.ccccltd.cn/", name = "GhscxxWs")
@XmlSeeAlso({ObjectFactory.class})
public interface GhscxxWs {

    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "updateMarketInfo", targetNamespace = "http://marketinfo.construction.webservice.ccccltd.cn/", className = "cn.ccccltd.webservice.construction.marketinfo.UpdateMarketInfo")
    @WebMethod(action = "http://marketinfo.construction.webservice.ccccltd.cn/updateMarketInfo")
    @ResponseWrapper(localName = "updateMarketInfoResponse", targetNamespace = "http://marketinfo.construction.webservice.ccccltd.cn/", className = "cn.ccccltd.webservice.construction.marketinfo.UpdateMarketInfoResponse")
    public cn.ccccltd.webservice.construction.marketinfo.ReturnMessage updateMarketInfo(
        @WebParam(name = "projectMarketInfo", targetNamespace = "")
        cn.ccccltd.webservice.construction.marketinfo.GhscxxVO projectMarketInfo
    );

    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "queryMarketInfoById", targetNamespace = "http://marketinfo.construction.webservice.ccccltd.cn/", className = "cn.ccccltd.webservice.construction.marketinfo.QueryMarketInfoById")
    @WebMethod(action = "http://marketinfo.construction.webservice.ccccltd.cn/queryMarketInfoById")
    @ResponseWrapper(localName = "queryMarketInfoByIdResponse", targetNamespace = "http://marketinfo.construction.webservice.ccccltd.cn/", className = "cn.ccccltd.webservice.construction.marketinfo.QueryMarketInfoByIdResponse")
    public cn.ccccltd.webservice.construction.marketinfo.ReturnMessage queryMarketInfoById(
        @WebParam(name = "zzjg", targetNamespace = "")
        java.lang.String zzjg,
        @WebParam(name = "recid", targetNamespace = "")
        java.lang.String recid
    );

    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "addMarketInfo", targetNamespace = "http://marketinfo.construction.webservice.ccccltd.cn/", className = "cn.ccccltd.webservice.construction.marketinfo.AddMarketInfo")
    @WebMethod(action = "http://marketinfo.construction.webservice.ccccltd.cn/addMarketInfo")
    @ResponseWrapper(localName = "addMarketInfoResponse", targetNamespace = "http://marketinfo.construction.webservice.ccccltd.cn/", className = "cn.ccccltd.webservice.construction.marketinfo.AddMarketInfoResponse")
    public cn.ccccltd.webservice.construction.marketinfo.ReturnMessage addMarketInfo(
        @WebParam(name = "projectMarketInfo", targetNamespace = "")
        cn.ccccltd.webservice.construction.marketinfo.GhscxxVO projectMarketInfo
    );
}