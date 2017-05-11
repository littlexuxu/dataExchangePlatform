package cn.ccccltd.webservice.construction.monthreport;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.8
 * 2017-04-17T09:29:10.092+08:00
 * Generated source version: 3.1.8
 * 
 */
@WebService(targetNamespace = "http://monthreport.construction.webservice.ccccltd.cn/", name = "GhxmzxfdWs")
@XmlSeeAlso({ObjectFactory.class})
public interface GhxmzxfdWs {

    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "queryMonthReportById", targetNamespace = "http://monthreport.construction.webservice.ccccltd.cn/", className = "cn.ccccltd.webservice.construction.monthreport.QueryMonthReportById")
    @WebMethod(action = "http://monthreport.construction.webservice.ccccltd.cn/queryMonthReportById")
    @ResponseWrapper(localName = "queryMonthReportByIdResponse", targetNamespace = "http://monthreport.construction.webservice.ccccltd.cn/", className = "cn.ccccltd.webservice.construction.monthreport.QueryMonthReportByIdResponse")
    public cn.ccccltd.webservice.construction.monthreport.ReturnMessage queryMonthReportById(
        @WebParam(name = "zzjg", targetNamespace = "")
        java.lang.String zzjg,
        @WebParam(name = "jtRevenueId", targetNamespace = "")
        java.lang.String jtRevenueId,
        @WebParam(name = "jtContractId", targetNamespace = "")
        java.lang.String jtContractId
    );

    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "addMonthReport", targetNamespace = "http://monthreport.construction.webservice.ccccltd.cn/", className = "cn.ccccltd.webservice.construction.monthreport.AddMonthReport")
    @WebMethod(action = "http://monthreport.construction.webservice.ccccltd.cn/addMonthReport")
    @ResponseWrapper(localName = "addMonthReportResponse", targetNamespace = "http://monthreport.construction.webservice.ccccltd.cn/", className = "cn.ccccltd.webservice.construction.monthreport.AddMonthReportResponse")
    public cn.ccccltd.webservice.construction.monthreport.ReturnMessage addMonthReport(
        @WebParam(name = "monthReportInfo", targetNamespace = "")
        cn.ccccltd.webservice.construction.monthreport.GhxmzxfdVO monthReportInfo
    );

    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "queryMonthReport", targetNamespace = "http://monthreport.construction.webservice.ccccltd.cn/", className = "cn.ccccltd.webservice.construction.monthreport.QueryMonthReport")
    @WebMethod(action = "http://monthreport.construction.webservice.ccccltd.cn/queryMonthReport")
    @ResponseWrapper(localName = "queryMonthReportResponse", targetNamespace = "http://monthreport.construction.webservice.ccccltd.cn/", className = "cn.ccccltd.webservice.construction.monthreport.QueryMonthReportResponse")
    public cn.ccccltd.webservice.construction.monthreport.ReturnMessage queryMonthReport(
        @WebParam(name = "zzjg", targetNamespace = "")
        java.lang.String zzjg,
        @WebParam(name = "datatime", targetNamespace = "")
        java.lang.String datatime
    );

    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "updateMonthReport", targetNamespace = "http://monthreport.construction.webservice.ccccltd.cn/", className = "cn.ccccltd.webservice.construction.monthreport.UpdateMonthReport")
    @WebMethod(action = "http://monthreport.construction.webservice.ccccltd.cn/updateMonthReport")
    @ResponseWrapper(localName = "updateMonthReportResponse", targetNamespace = "http://monthreport.construction.webservice.ccccltd.cn/", className = "cn.ccccltd.webservice.construction.monthreport.UpdateMonthReportResponse")
    public cn.ccccltd.webservice.construction.monthreport.ReturnMessage updateMonthReport(
        @WebParam(name = "monthReportInfo", targetNamespace = "")
        cn.ccccltd.webservice.construction.monthreport.GhxmzxfdVO monthReportInfo
    );
}