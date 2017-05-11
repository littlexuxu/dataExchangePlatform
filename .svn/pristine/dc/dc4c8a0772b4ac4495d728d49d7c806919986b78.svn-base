package com.db.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.db.webservice.test.User;

/**
 * desc: comment TestService.java
 * 
 * @author Chaisson(chengshengwang)
 * @since May 13, 2011 11:41:03 AM
 * @vision 1.0
 */
@WebService
public interface TestService {
	
	@WebMethod(action = "http://com.db.webservice/sayHello")
	public @WebResult(name = "myName") String sayHello(@WebParam(name = "myName") String name);

	@WebMethod(action = "http://com.db.webservice/printMan")
	public @WebResult(name = "user") String printMan(@WebParam(name = "user") User user);

}