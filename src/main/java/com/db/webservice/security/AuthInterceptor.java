package com.db.webservice.security;

import java.util.List;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.headers.Header;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;

public class AuthInterceptor extends AbstractPhaseInterceptor<SoapMessage>{
	public AuthInterceptor() {  
        //拦截器在调用方法之前拦截SOAP消息  
        super(Phase.PRE_INVOKE);  
    }

	@Override
	public void handleMessage(SoapMessage msg) throws Fault {
		System.out.println("=====自定义拦截器=======");  
        //获取SOAP消息的Header  
        List<Header> headers = msg.getHeaders();  
        //如果没有Header  
        if(headers == null || headers.size() < 1) {  
            throw new Fault(new IllegalArgumentException("没有Header,拦截器实施拦截"));  
        } 
		
	}
	
	
}
