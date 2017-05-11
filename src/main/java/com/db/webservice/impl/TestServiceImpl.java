package com.db.webservice.impl;

import javax.jws.WebService;
import com.db.webservice.TestService;
import com.db.webservice.test.User;

/**
 * desc: comment TestServiceImpl.java
 * 
 * @author Chaisson(chengshengwang)
 * @since May 13, 2011 11:41:38 AM
 * @vision 1.0
 */
@WebService(endpointInterface = "com.db.webservice.TestService", serviceName = "testServiceImpl")
public class TestServiceImpl implements TestService {
	public String sayHello(String myName) {
		System.out.println("Hello World! " + myName);
		return "SUCCESS";
	}
	
	@Override
	public String printMan(User user) {
		StringBuffer sb = new StringBuffer();
		if (user.getAge() >= 18 && user.getAge() < 60) {
			sb.append("He is a young man. ");
		} else if (user.getAge() >= 60) {
			sb.append("He is an old man. ");
		} else {
			sb.append("He is a little boy. ");
		}

		if (user.getName() != null) {
			sb.append(" His name is " + user.getName() + ". ");
		}
		if (user.getDesc() != null) {
			sb.append(" His description is that " + user.getDesc() + ". ");
		}
		return sb.toString();
	}

}